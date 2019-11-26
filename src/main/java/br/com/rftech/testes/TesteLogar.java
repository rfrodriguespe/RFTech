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

import br.com.rftech.Dao.FuncionarioJpaDao;
import br.com.rftech.bean.Cargo;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.ClientePj;
import br.com.rftech.bean.Endereco;
import br.com.rftech.bean.Funcionario;
import br.com.rftech.bean.Sessao;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteLogar {

    public static void main(String[] args) {
        Endereco end = new Endereco("54410310", "rua rossini roosevelt de albuquerque", "1300", "apto 301", "piedade", "jaboatao", "pe");
        ClientePf cliPf = new ClientePf("01323197486", "Rodrigo Ferreira", "rodrigo2208@gmail.com", "81988557802", end);
        ClientePf cliPf2 = new ClientePf("29780622829", "Fabiana", "fabianabovo@gmail.com", "19993098039", end);
        ClientePf cliPf3 = new ClientePf("12345678900", "Lucas Bovo", "lucasbovo@gmail.com", "19993098039", end);
        ClientePj cliPj = new ClientePj("47379565006126", "Marlise", "Proxxi Tecnologia LTDA", "Proxxi", "contato@proxxi.com.br", "8134247878", end);
        Funcionario func = new Funcionario("01323197486", "rfrodrigues", Cargo.Gerente, "Rodrigo Ferreira", "tecnico@rftech.com.br", "8133613927", end);

        
        System.out.println("Usuario da sessão antes do login: " + Sessao.getInstance().getFuncionario() );
        
        String nomeUsuario = "lucasb";
        String password = "teste";

        System.out.println("Autenticando: " + nomeUsuario);

        //Funcionario achei = FuncionarioJpaDao.getInstance().auth(nomeUsuario);
        Funcionario logou = null;
        logou = FuncionarioJpaDao.getInstance().getByUserName(nomeUsuario);
        if (logou != null) {
            String nome = logou.getNomeUsuario();
            System.out.println("Usuário " + logou.getNomeUsuario() + " existe, vamos comparar as senhas");
            if (FuncionarioJpaDao.getInstance().auth(nomeUsuario, password)) {
                System.out.println("Conseguiu autenticar com o usuario: " + logou.getNomeUsuario());
            } else {
                System.out.println("Não logou, senha errada para " + nome);
            }
        } else {
            System.out.println("Usuário não existe");
        }
        
        System.out.println("Usuario da sessão APOS do login: " + Sessao.getInstance().getFuncionario() );

    }

}
