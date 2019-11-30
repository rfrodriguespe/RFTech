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
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
@Entity(name = "Chamado")
public class Chamado implements Serializable {

    public static final String ABERTO = "Aberto";
    public static final String FECHADO = "Fechado";
    public static final String AT = "At";
    //public static final String CANCELADO = "Cancelado";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Notebook notebook;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAbertura;
    @Column
    private String defeitoRelatado;
    @Column
    private String defeitoConstatado;
    @Column
    private String solucao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFechamento;
    @Column
    private String status;

    public Chamado() {
    }

    public Chamado(Notebook notebook, String defeitoRelatado) {
        this.dataAbertura = Calendar.getInstance().getTime();
        this.notebook = notebook;
        this.defeitoRelatado = defeitoRelatado;
        this.defeitoConstatado = "A analisar";
        this.solucao = "A analisar";
        this.status = Chamado.ABERTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDefeitoRelatado() {
        return defeitoRelatado;
    }

    public void setDefeitoRelatado(String defeitoRelatado) {
        this.defeitoRelatado = defeitoRelatado;
    }

    public String getDefeitoConstatado() {
        return defeitoConstatado;
    }

    public void setDefeitoConstatado(String defeitoConstatado) {
        this.defeitoConstatado = defeitoConstatado;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Chamado{"
                + "id=" + id
                + ", Dono (Nome)=" + getNotebook().getDono().getNome()
                + ", notebook (Serial)=" + getNotebook().getSerial()
                + ", dataAbertura=" + dataAbertura
                + ", defeitoRelatado=" + defeitoRelatado
                + ", defeitoConstatado=" + defeitoConstatado
                + ", solucao=" + solucao
                + ", dataFechamento=" + dataFechamento
                + ", status=" + status + '}';
    }

}
