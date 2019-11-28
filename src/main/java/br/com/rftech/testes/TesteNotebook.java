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

import br.com.rftech.Dao.ClientePfJpaDao;
import br.com.rftech.Dao.ClientePjJpaDao;
import br.com.rftech.Dao.EquipamentosTipoJpaDao;
import br.com.rftech.Dao.FabricanteJpaDao;
import br.com.rftech.Dao.NotebookJpaDao;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.ClientePj;
import br.com.rftech.bean.EquipamentosTipo;
import br.com.rftech.bean.Fabricante;
import br.com.rftech.bean.Notebook;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteNotebook {
    
    public static void main(String[] args) {
        ClientePf rodrigo = ClientePfJpaDao.getInstance().getById(1);
        ClientePf fabiana = ClientePfJpaDao.getInstance().getById(2);
        ClientePf lucas = ClientePfJpaDao.getInstance().getById(3);
        Fabricante dell = FabricanteJpaDao.getInstance().getById(1);
        Fabricante lenovo = FabricanteJpaDao.getInstance().getById(2);
        Fabricante apple = FabricanteJpaDao.getInstance().getById(6);
        EquipamentosTipo tipoNote = EquipamentosTipoJpaDao.getInstance().getById(1);
        
        Notebook noteRodrigo = new Notebook(rodrigo,tipoNote, dell, "Vostro 5470", "abc123", "14", "8", "500");
        Notebook noteRodrigo2 = new Notebook(rodrigo,tipoNote, dell, "Latitude E6430", "h456kl", "14", "16", "500");
        Notebook noteFabiana = new Notebook(fabiana,tipoNote, lenovo, "Helix 3", "1la456", "15", "16", "1000");
        Notebook noteLucas = new Notebook(lucas,tipoNote, apple, "MacBook Pro", "690987", "17", "16", "1000");
        
        
        NotebookJpaDao.getInstance().create(noteRodrigo);
        NotebookJpaDao.getInstance().create(noteFabiana);
        NotebookJpaDao.getInstance().create(noteRodrigo2);
        NotebookJpaDao.getInstance().create(noteLucas);
        
    }
    
}
