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
package br.com.rftech.model;

import java.util.Objects;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ClientePF extends Pessoas {
    
    private String CPF;

    public ClientePF(String CPF) {
        this.CPF = CPF;
    }

    public ClientePF() {
    }

    public ClientePF(String CPF, String nome, String email, String telefone, Endereco endereco) {
        super(nome, email, telefone, endereco);
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "CPF=" + CPF + ", "
                + "Id=" + super.getId()
                + ", Nome= " + super.getNome()
                + ", Email= " + super.getEmail()
                + ", Telefone= " + super.getTelefone()
                + ", Endereco: {" + super.getEndereco() + ".";
    }

    @Override
    public int hashCode() {
        return CPF.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClientePF other = (ClientePF) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }

    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
}
