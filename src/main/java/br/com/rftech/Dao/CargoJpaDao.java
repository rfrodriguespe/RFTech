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

import br.com.rftech.bean.Cargo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class CargoJpaDao implements Dao {

    private static CargoJpaDao instance;
    protected EntityManager entityManager;

    public static CargoJpaDao getInstance() {
        if (instance == null) {
            instance = new CargoJpaDao();
        }
        return instance;
    }

    private CargoJpaDao() {
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
        Cargo cargo = (Cargo) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cargo);
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
        return entityManager.createQuery("SELECT c FROM Cargo c", Cargo.class).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        Cargo cargo = (Cargo) arg0;
        try {
            entityManager.getTransaction().begin();
            cargo = entityManager.find(Cargo.class, cargo.getId());
            entityManager.merge(cargo);
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
        Cargo cargo = (Cargo) arg0;
        try {
            entityManager.getTransaction().begin();
            cargo = entityManager.find(Cargo.class, cargo.getId());
            entityManager.remove(cargo);
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

    public Cargo getById(final int id) {
        return entityManager.find(Cargo.class, id);
    }

    public boolean removeById(final int id) {
        try {
            Cargo cargo = getById(id);
            delete(cargo);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Cargo getByName(String nome) {
        try {
            Query query = entityManager.createQuery("Select c FROM Cargo c WHERE c.nome = :nome");
            query.setParameter("nome", nome);
            return (Cargo) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
