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

import br.com.rftech.Dao.CargoJpaDao;
import br.com.rftech.Dao.FuncionarioJpaDao;
import br.com.rftech.bean.Cargo;
import br.com.rftech.bean.Endereco;
import br.com.rftech.bean.Funcionario;
import java.util.List;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        Endereco end = new Endereco("54", "rua", "151", "casa", "bairro", "recife", "AC");
        Cargo cargo = CargoJpaDao.getInstance().getByName("Gerente");
        Funcionario func1 = new Funcionario("01323197486", "rfrodrigues", cargo, "Rodrigo Ferreira Rodrigues", "rodrigo2208@gmail.com", "81988557802", end);
        
//        System.out.println("CEP: "+ func1.getEndereco().getCEP());
//        func1.getEndereco().setCEP("12345678");
//        System.out.println("mudei, agora é...");
//        System.out.println("CEP: "+ func1.getEndereco().getCEP());
        
        FuncionarioJpaDao.getInstance().create(func1);
        
        List<Funcionario> listaFunc = FuncionarioJpaDao.getInstance().readAll();
        
        listaFunc.forEach((funcionario) -> {
            System.out.println(funcionario);
        });
        
        FuncionarioJpaDao.getInstance().create(func1);
        
        listaFunc = FuncionarioJpaDao.getInstance().readAll();
        
        listaFunc.forEach((funcionario) -> {
            System.out.println(funcionario);
        });
    }
    
}
