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
package br.com.rftech.testes;

import br.com.rftech.Dao.ClientePfJdbcDao;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.Endereco;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteClientePfJdbc {
    
    public static void main(String[] args) {
        
        Endereco end = new Endereco("54420160", "rua TESTE", "151", "casa", "TESTE piedade", "jaboatão dos guararapes", "PE");
        ClientePf cli = new ClientePf("91793483868", "Antonio Rodrigues TESTE", "TESTE.antoniorodrigues@gmail.com", "81033613927", end);
        
        ClientePfJdbcDao cliDao = new ClientePfJdbcDao();
        //cliDao.create(cli);
        
        cliDao.delete(cliDao.getById(8));
        
//        for (Object clientePf : cliDao.readAll()) {
//            System.out.println(clientePf);
//        }
//        
//        ClientePf cli2 = cliDao.getById(5);
//        
//        System.out.println("resultado da busca pelo id 5: "+cli2);
//        
//        cli2.setTelefone("81033613927");
//        cli2.setEmail("claricebovo@gmail.com");
//        
//        cliDao.update(cli2);
//        
//        System.out.println("Cliente 5 atualizado : " + cli2);
        
    }
    
}