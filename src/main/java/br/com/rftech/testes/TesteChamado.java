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

import br.com.rftech.Dao.ChamadoJpaDao;
import br.com.rftech.Dao.ClientePfJpaDao;
import br.com.rftech.Dao.NotebookJpaDao;
import br.com.rftech.Dao.PecasJpaDao;
import br.com.rftech.bean.Chamado;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.Notebook;
import br.com.rftech.bean.Pecas;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteChamado {

    public static void main(String[] args) {
//        Chamado chamado = ChamadoJpaDao.getInstance().getById(5);
//        System.out.println(chamado);
//        System.out.println(chamado.getDataFechamento());

        ClientePf clientePf = ClientePfJpaDao.getInstance().getById(1);
        Notebook notebook = NotebookJpaDao.getInstance().getById(1);
        
        Chamado chamado = new Chamado(notebook, "Tela não funciona");
        //ChamadoJpaDao.getInstance().create(chamado);
        
        //Fechando chamado...
        Pecas tela = PecasJpaDao.getInstance().getById(1);
        Pecas carcaca = PecasJpaDao.getInstance().getById(4);
        
        List<Pecas> pecasUsadas = new ArrayList<>();
        pecasUsadas.add(tela);
        pecasUsadas.add(carcaca);
        
        
        Chamado ch = ChamadoJpaDao.getInstance().getById(1);
        
        ch.setDataFechamento(Calendar.getInstance().getTime());
        ch.setDefeitoRelatado("Tela trincada");
        ch.setDefeitoConstatado("Tela e carcaça trincadas");
        ch.setSolucao("Trocou a tela e o frame do lcd");
        ch.setPecasUsadas(pecasUsadas);
        
        ChamadoJpaDao.getInstance().update(ch);

            System.out.println(ch);

    }
}
