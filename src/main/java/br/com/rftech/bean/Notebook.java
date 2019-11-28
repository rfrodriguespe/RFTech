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
package br.com.rftech.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Notebook extends Equipamentos {

    @Column
    private String tamanhoTela;
    @Column
    private String ram;
    @Column
    private String hd;

    public Notebook() {
    }

    public Notebook(ClientePf dono, EquipamentosTipo equipamentoTipo, Fabricante fabricante, String modelo, String serial,String tamanhoTela, String ram, String hd) {
        super(dono, equipamentoTipo, fabricante, modelo, serial);
        this.tamanhoTela = tamanhoTela;
        this.ram = ram;
        this.hd = hd;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Notebook{:"
                + " Id: " + getId()
                + ", Dono: " + getDono()
                + ", Fabricante: " + getFabricante().getNome()
                + ", Modelo: " + getModelo()
                + ", Serial: " + getSerial()
                + ", TamanhoTela: " + getTamanhoTela()
                + ", Ram: " + getRam()
                + ", Hd: " + getHd() + '}';
    }
}
