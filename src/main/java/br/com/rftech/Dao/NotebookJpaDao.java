/*
 * The MIT License
 *
 * Copyright 2019 Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.rftech.Dao;

import br.com.rftech.bean.Notebook;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class NotebookJpaDao implements Dao {

    private static NotebookJpaDao instance;
    protected EntityManager entityManager;

    public static NotebookJpaDao getInstance() {
        if (instance == null) {
            instance = new NotebookJpaDao();
        }
        return instance;
    }

    private NotebookJpaDao() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistencerftech");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    @Override
    public boolean create(Object arg0) {
        Notebook notebook = (Notebook) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(notebook);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
            instance = null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List readAll() {
        return entityManager.createQuery("SELECT n FROM Notebook n", Notebook.class).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        Notebook notebook = (Notebook) arg0;
        try {
            entityManager.getTransaction().begin();
            notebook = entityManager.find(Notebook.class, notebook.getId());
            entityManager.merge(notebook);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
            instance = null;
        }
    }

    @Override
    public boolean delete(Object arg0) {
        Notebook notebook = (Notebook) arg0;
        try {
            entityManager.getTransaction().begin();
            notebook = entityManager.find(Notebook.class, notebook.getId());
            entityManager.remove(notebook);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
            instance = null;
        }
    }

    public Notebook getById(final int id) {
        return entityManager.find(Notebook.class, id);
    }

    public boolean removeById(final int id) {
        try {
            Notebook notebook = getById(id);
            delete(notebook);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Notebook getBySerial(String serial) {
        try {
            Query query = entityManager.createQuery("Select n FROM Notebook n WHERE n.serial = :serial");
            query.setParameter("serial", serial);
            return (Notebook) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Notebook> getAllByIdDono(int idDono) {
        try {
            Query query = entityManager.createQuery("Select n FROM Notebook n WHERE n.dono.id = :idDono");
            query.setParameter("idDono", idDono);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}
