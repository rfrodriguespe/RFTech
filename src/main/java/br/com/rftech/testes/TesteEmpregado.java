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

import br.com.rftech.Dao.EmpregadoJpaDao;
import br.com.rftech.Dao.ProfissaoJpaDao;
import br.com.rftech.bean.Empregado;
import br.com.rftech.bean.Endereco;
import br.com.rftech.bean.Profissao;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        Endereco end = new Endereco("54410310", "rua rossini", "1200", "apto 301", "piedade", "jaboatao", "pe");
        Profissao rh = ProfissaoJpaDao.getInstance().getById(2);
        Empregado emp = new Empregado("29780622829", "fbovo", "teste", rh, "Fabiana Bovo", "rodrigo2208@gmail.com", "81988557802", end);
        
        //System.out.println(emp);
        
        //EmpregadoJpaDao.getInstance().create(emp);
        
        List<Empregado> lista = EmpregadoJpaDao.getInstance().readAll();
        
        lista.forEach((empregado) -> {
            System.out.println(empregado);
        });
    }
    
}
