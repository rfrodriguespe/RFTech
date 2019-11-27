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

import br.com.rftech.bean.Empregado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class EmpregadoJpaDao implements Dao {

    private static EmpregadoJpaDao instance;
    protected EntityManager entityManager;

    public static EmpregadoJpaDao getInstance() {
        if (instance == null) {
            instance = new EmpregadoJpaDao();
        }
        return instance;
    }

    private EmpregadoJpaDao() {
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
        Empregado empregado = (Empregado) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(empregado);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List readAll() {
        return entityManager.createQuery("SELECT e FROM Empregado e", Empregado.class).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        Empregado empregado = (Empregado) arg0;
        try {
            entityManager.getTransaction().begin();
            empregado = entityManager.find(Empregado.class, empregado.getId());
            entityManager.merge(empregado);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean delete(Object arg0) {
        Empregado empregado = (Empregado) arg0;
        try {
            entityManager.getTransaction().begin();
            empregado = entityManager.find(Empregado.class, empregado.getId());
            entityManager.remove(empregado);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    public Empregado getById(final int id) {
        return entityManager.find(Empregado.class, id);
    }

    public boolean removeById(final int id) {
        try {
            Empregado empregado = getById(id);
            delete(empregado);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
