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
package br.com.rftech.Dao;

import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.Endereco;
import br.com.rftech.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ClientePfJdbcDao implements Dao {
    
    private static ClientePfJdbcDao instance = null;

    private ClientePfJdbcDao() {
    }

    public static ClientePfJdbcDao getInstance() {
        if (instance == null) {
            instance = new ClientePfJdbcDao();
        }
        return instance;
    }

    @Override
    public boolean create(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO clientepf (CPF, NOME, EMAIL, TELEFONE, CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clientePf.getCpf());
            stmt.setString(2, clientePf.getNome());
            stmt.setString(3, clientePf.getEmail());
            stmt.setString(4, clientePf.getTelefone());
            stmt.setString(5, clientePf.getEndereco().getCEP());
            stmt.setString(6, clientePf.getEndereco().getLogradouro());
            stmt.setString(7, clientePf.getEndereco().getNumero());
            stmt.setString(8, clientePf.getEndereco().getComplemento());
            stmt.setString(9, clientePf.getEndereco().getBairro());
            stmt.setString(10, clientePf.getEndereco().getCidade());
            stmt.setString(11, clientePf.getEndereco().getUf());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
            instance = null;
        }

    }

    @Override
    public List readAll() {
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaClientesPf = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM clientePf");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClientePf clientePf = new ClientePf();
                clientePf.setId(rs.getInt("ID"));
                clientePf.setCpf(rs.getString("CPF"));
                clientePf.setNome(rs.getString("NOME"));
                clientePf.setTelefone(rs.getString("TELEFONE"));
                clientePf.setEmail(rs.getString("EMAIL"));
                Endereco end = new Endereco();
                end.setCEP(rs.getString("CEP"));
                end.setLogradouro(rs.getString("LOGRADOURO"));
                end.setNumero(rs.getString("NUMERO"));
                end.setComplemento(rs.getString("COMPLEMENTO"));
                end.setBairro(rs.getString("BAIRRO"));
                end.setCidade(rs.getString("CIDADE"));
                end.setUf(rs.getString("UF"));
                clientePf.setEndereco(end);
                listaClientesPf.add(clientePf);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar os dados" + ex);
        } finally {
            ConnectionUtil.closeConnection(conn, stmt, rs);
            instance = null;
        }
        return listaClientesPf;
    }

    @Override
    public boolean update(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "UPDATE `clientepf` SET `CPF` = ?, `NOME` = ?, `TELEFONE` = ?, `EMAIL` = ?,"
                + "`CEP` = ?, `LOGRADOURO` = ?, `NUMERO` = ?, `COMPLEMENTO` = ?, `BAIRRO` = ?,"
                + "`CIDADE` = ?, `UF` = ? WHERE `clientepf`.`ID` = ?";
                
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clientePf.getCpf());
            stmt.setString(2, clientePf.getNome());
            stmt.setString(3, clientePf.getEmail());
            stmt.setString(4, clientePf.getTelefone());
            stmt.setString(5, clientePf.getEndereco().getCEP());
            stmt.setString(6, clientePf.getEndereco().getLogradouro());
            stmt.setString(7, clientePf.getEndereco().getNumero());
            stmt.setString(8, clientePf.getEndereco().getComplemento());
            stmt.setString(9, clientePf.getEndereco().getBairro());
            stmt.setString(10, clientePf.getEndereco().getCidade());
            stmt.setString(11, clientePf.getEndereco().getUf());
            stmt.setInt(12, clientePf.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
            instance = null;
        }
    }

    @Override
    public boolean delete(Object arg0) {
        ClientePf clientePf = (ClientePf) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM `clientepf` WHERE `clientepf`.`ID` = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, clientePf.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
            instance = null;
        }
    }

    public ClientePf getById(int id) {
        ClientePf clientePf = null;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM `clientepf` WHERE `ID` = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                clientePf = new ClientePf();
                clientePf.setId(rs.getInt("ID"));
                clientePf.setCpf(rs.getString("CPF"));
                clientePf.setNome(rs.getString("NOME"));
                clientePf.setTelefone(rs.getString("TELEFONE"));
                clientePf.setEmail(rs.getString("EMAIL"));
                Endereco end = new Endereco();
                end.setCEP(rs.getString("CEP"));
                end.setLogradouro(rs.getString("LOGRADOURO"));
                end.setNumero(rs.getString("NUMERO"));
                end.setComplemento(rs.getString("COMPLEMENTO"));
                end.setBairro(rs.getString("BAIRRO"));
                end.setCidade(rs.getString("CIDADE"));
                end.setUf(rs.getString("UF"));
                clientePf.setEndereco(end);
            }
            return clientePf;
        } catch (SQLException ex) {
            return null;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
            instance = null;
        }
    }
}
