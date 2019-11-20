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

import br.com.rftech.bean.ClientePf;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ClientePfJpaDao implements Dao {

    private static ClientePfJpaDao instance;
    protected EntityManager entityManager;

    public static ClientePfJpaDao getInstance() {
        if (instance == null) {
            instance = new ClientePfJpaDao();
        }

        return instance;
    }

    private ClientePfJpaDao() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory
                = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }

        return entityManager;
    }

    @Override
    public boolean create(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(clientePf);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List readAll() {
        return entityManager.createQuery("FROM "
                + ClientePf.class.getName()).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(clientePf);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean delete(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        try {
            entityManager.getTransaction().begin();
            clientePf = entityManager.find(ClientePf.class, clientePf.getId());
            entityManager.remove(clientePf);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }
    
    public ClientePf getById(final int id) {
        return entityManager.find(ClientePf.class, id);
    }

    public boolean removeById(final int id) {
        try {
            ClientePf clientePf = getById(id);
            delete(clientePf);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    

}
