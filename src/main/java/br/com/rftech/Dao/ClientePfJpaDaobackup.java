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

import br.com.rftech.entities.ClientePf;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ClientePfJpaDaobackup implements Dao {

    EntityManagerFactory emf;
    EntityManager em;

    public ClientePfJpaDaobackup() {
        emf = Persistence.createEntityManagerFactory("SaveDb");
        em = emf.createEntityManager();
    }

    @Override
    public boolean create(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        try {
            em.getTransaction().begin();
            em.merge(clientePf);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List readAll() {
        return em.createQuery("FROM " + ClientePf.class.getName()).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        try {
            em.getTransaction().begin();
            clientePf = em.find(ClientePf.class, clientePf.getId());
            em.remove(clientePf);
            em.getTransaction().commit();
            return true;
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            return false;
         }
    }
}
