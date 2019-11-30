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

import java.util.Enumeration;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
@Entity(name="Funcionario")
@PrimaryKeyJoinColumn(name="id")
public class Funcionario extends Pessoa {
    
    @Column
    private String Cpf;
    
    @Column
    private String nomeUsuario;
    
    @Column
    private String senha;
    
    @ManyToOne
    private Cargo cargo;
    
    public Funcionario() {
        this.senha = hashSenha();
    }

    public Funcionario(String Cpf, String nomeUsuario, Cargo cargo, String nome, String email, String telefone, Endereco endereco) {
        super(nome, email, telefone, endereco);
        this.Cpf = Cpf;
        this.nomeUsuario = nomeUsuario;
        this.senha = hashSenha();
        this.cargo = cargo;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    private String hashSenha() {
        String senha = null;
        Properties properties = new Properties();
        ResourceBundle rb = ResourceBundle.getBundle("Funcionario");
        for (@SuppressWarnings("rawtypes")
                Enumeration keys = rb.getKeys(); keys.hasMoreElements();) {
            final String key = (String) keys.nextElement();
            final String value = rb.getString(key);
            properties.put(key, value);
        }
        senha = properties.getProperty("hashPassWord");
        return senha;
    }
    
    

    @Override
    public String toString() {
        return "Id: " + super.getId()
                + ", Cpf: " + getCpf()
                + ", Nome de Usuário: " + getNomeUsuario()
                + ", Senha: " + getSenha()
                + ", Cargo: " + getCargo().getNome()
                + ", Nom: " + super.getNome()
                + ", Email: " + super.getEmail()
                + ", Telefon: " + super.getTelefone()
                + ", Endereco: {" + super.getEndereco() + "}.";
    }

    @Override
    public int hashCode() {
        return Cpf.hashCode();
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
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.Cpf, other.Cpf);
    }

}
