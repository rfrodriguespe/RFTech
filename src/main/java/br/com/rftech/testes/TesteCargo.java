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
import br.com.rftech.bean.Cargo;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TesteCargo {
    
    public static void main(String[] args) {
        String tecLab = "Tecnico de Laboratório";
        String tecCampo = "Tecnico de Campo";
        String helpdesk = "Helpdesk";
        String gerente = "Gerente";
        String rh = "Rh";

        Cargo profGerente = new Cargo(gerente);
        Cargo profRh = new Cargo(rh);
        Cargo profHelpdesk = new Cargo(helpdesk);
        Cargo profTecCampo = new Cargo(tecCampo);
        Cargo profTecLab = new Cargo(tecLab);
        
//        CargoJpaDao.getInstance().create(profGerente);
//        CargoJpaDao.getInstance().create(profRh);
//        CargoJpaDao.getInstance().create(profHelpdesk);
//        CargoJpaDao.getInstance().create(profTecCampo);
//        CargoJpaDao.getInstance().create(profTecLab);
        
        
//        System.out.println("Cargo retornada do nome: "+gerente+" é:");
//        System.out.println(CargoJpaDao.getInstance().getByName(gerente));
        
    }
    
}
