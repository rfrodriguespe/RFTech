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
package br.com.rftech.controller;

import br.com.rftech.Dao.ClientePfJdbcDao;
import br.com.rftech.Dao.Dao;
import br.com.rftech.entities.ClientePf;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ClientePfController implements Dao{

    @Override
    public boolean create(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        ClientePfJdbcDao dao = new ClientePfJdbcDao();
        return dao.create(clientePf);
    }

    @Override
    public List readAll() {
        ClientePfJdbcDao dao = new ClientePfJdbcDao();
        return dao.readAll();
    }

    @Override
    public boolean update(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        ClientePfJdbcDao dao = new ClientePfJdbcDao();
        return dao.update(clientePf);
    }

    @Override
    public boolean delete(Object o) {
        ClientePf clientePf = (ClientePf) o;
        ClientePfJdbcDao dao = new ClientePfJdbcDao();
        return dao.delete(clientePf);
    }  
}
