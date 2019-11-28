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
import br.com.rftech.Dao.NotebookJpaDao;
import br.com.rftech.bean.Chamado;
import br.com.rftech.bean.Notebook;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteDateTime {

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formataData = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));
        agora.format(formataData); //08/04/14 10:02
        
        Notebook note = NotebookJpaDao.getInstance().getById(1);
        
        Chamado ch = new Chamado(note, "HD emitindo ruído");
        
        System.out.println(ch);
        
        //ChamadoJpaDao.getInstance().create(ch);

    }

}
