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

import br.com.rftech.bean.Funcionario;
import br.com.rftech.bean.Sessao;
import br.com.rftech.util.Sha256;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class FuncionarioJpaDao implements Dao {

    private static FuncionarioJpaDao instance;
    protected EntityManager entityManager;

    public static FuncionarioJpaDao getInstance() {
        if (instance == null) {
            instance = new FuncionarioJpaDao();
        }
        return instance;
    }

    private FuncionarioJpaDao() {
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
        Funcionario funcionario = (Funcionario) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(funcionario);
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
        return entityManager.createQuery("SELECT funcionario FROM Funcionario funcionario", Funcionario.class).getResultList();
    }

    @Override
    public boolean update(Object arg0) {
        Funcionario funcionario = (Funcionario) arg0;
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(funcionario);
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
        Funcionario funcionario = (Funcionario) arg0;
        try {
            entityManager.getTransaction().begin();
            funcionario = entityManager.find(Funcionario.class, funcionario.getId());
            entityManager.remove(funcionario);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }

    public Funcionario getById(final int id) {
        return entityManager.find(Funcionario.class, id);
    }

    public boolean removeById(final int id) {
        try {
            Funcionario funcionario = getById(id);
            delete(funcionario);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Funcionario findByUserName(String userName) {
        try {
            Query query = entityManager.createQuery("Select f FROM Funcionario f WHERE f.nomeUsuario = :nomeUsuario");
            query.setParameter("nomeUsuario", userName);
            return (Funcionario) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean auth(String userName, String password) {
        Funcionario funcionario = null;
        try {
            funcionario = findByUserName(userName);
            String hashPassword = Sha256.getInstance().getSHA256Hash(password);
            if (funcionario != null && hashPassword.equals(funcionario.getSenha())) {
                Sessao.getInstance().setFuncionario(funcionario);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
