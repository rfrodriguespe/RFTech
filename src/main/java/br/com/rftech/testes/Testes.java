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
 * furnished to do so,S subject to the following conditions:
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

import br.com.rftech.Dao.FuncionarioJpaDao;
import br.com.rftech.bean.Cargo;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.ClientePj;
import br.com.rftech.bean.Endereco;
import br.com.rftech.bean.Funcionario;
import br.com.rftech.util.Sha256;
import java.io.IOException;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class Testes {

    public static void main(String[] args) throws IOException {
        Endereco end = new Endereco("54410310", "rua rossini roosevelt de albuquerque", "1300", "apto 301", "piedade", "jaboatao", "pe");
        ClientePf cliPf = new ClientePf("01323197486", "Rodrigo Ferreira", "rodrigo2208@gmail.com", "81988557802", end);
        ClientePf cliPf2 = new ClientePf("29780622829", "Fabiana", "fabianabovo@gmail.com", "19993098039", end);
        ClientePf cliPf3 = new ClientePf("12345678900", "Lucas Bovo", "lucasbovo@gmail.com", "19993098039", end);
        ClientePj cliPj = new ClientePj("47379565006126", "Marlise", "Proxxi Tecnologia LTDA", "Proxxi", "contato@proxxi.com.br", "8134247878", end);
        Funcionario func = new Funcionario("12345678900", Cargo.Gerente, "Lucas Bovo", "tecnico@rftech.com.br", "8133613927", end);

        System.out.println(func);
        
        FuncionarioJpaDao.getInstance().create(func);
        //ClientePjJpaDao.getInstance().create(cliPj);

        //        System.out.println("CEP do cliente: "+ cliPf.getNome()+" é "+ cliPf.getEndereco().getCEP());
        //        
        //        String novoCEP = "54420160";
        //        System.out.println("Mudando CEP para: "+novoCEP);
        //        
        //        cliPf.getEndereco().setCEP(novoCEP);
        //        
        //        System.out.println("CEP do cliente: "+ cliPf.getNome()+" é "+ cliPf.getEndereco().getCEP());

        //ClientePfJpaDao.getInstance().create(cliPf3);
        //ClientePfJdbcDao daoJdbc = new ClientePfJdbcDao();
        //dao.create(cliPf2);

        //List<ClientePf> listaJdbc = daoJdbc.readAll();
        //        List<ClientePf> listaJpa = ClientePfJpaDao.getInstance().readAll();
        //        
        //        for (ClientePf clientePf : listaJpa) {
        //            System.out.println(clientePf);
        //        }
        //ClientePf cli = ClientePfJpaDao.getInstance().getById(3);

        //System.out.println(cli);

        //        cli.setId(2);
        //        
        //        ClientePfJpaDao.getInstance().update(cli);
        //        System.out.println("nome da classe: " +ClientePf.class.getName());
        //        System.out.println("nome da classe SIMPLE: " +ClientePf.class.getSimpleName()); 
        ;
    }

}
