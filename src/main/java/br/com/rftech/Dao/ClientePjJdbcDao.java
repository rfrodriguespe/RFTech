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

import br.com.rftech.bean.ClientePj;
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
public class ClientePjJdbcDao implements Dao {

    @Override
    public boolean create(Object arg0) {
        ClientePj clientePj = (ClientePj) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO clientepf (CPF, NOME, EMAIL, TELEFONE, CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clientePj.getCnpj());
            stmt.setString(2, clientePj.getNome());
            stmt.setString(3, clientePj.getEmail());
            stmt.setString(4, clientePj.getTelefone());
            stmt.setString(5, clientePj.getEndereco().getCEP());
            stmt.setString(6, clientePj.getEndereco().getLogradouro());
            stmt.setString(7, clientePj.getEndereco().getNumero());
            stmt.setString(8, clientePj.getEndereco().getComplemento());
            stmt.setString(9, clientePj.getEndereco().getBairro());
            stmt.setString(10, clientePj.getEndereco().getCidade());
            stmt.setString(11, clientePj.getEndereco().getUf());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
        }

    }

    @Override
    public List readAll() {
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaClientesPf = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM clientePj");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClientePj clientePj = new ClientePj();
                clientePj.setId(rs.getInt("id"));
                clientePj.setCnpj(rs.getString("Cnpj"));
                clientePj.setNome(rs.getString("Nome"));
                clientePj.setTelefone(rs.getString("Telefone"));
                clientePj.setEmail(rs.getString("Email"));
                //clientePj.getEndereco().setCEP(rs.getString("CEP"));
//                clientePj.getEndereco().setCEP(rs.getString(6));
//                clientePj.getEndereco().setBairro(rs.getString(7));
//                clientePj.getEndereco().setCidade(rs.getString(8));
//                clientePj.getEndereco().setComplemento(rs.getString(9));
//                clientePj.getEndereco().setLogradouro(rs.getString(10));
//                clientePj.getEndereco().setNumero(rs.getString(11));
//                clientePj.getEndereco().setUf(rs.getString(12));
                listaClientesPf.add(clientePj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar os dados" + ex);
        } finally {
            ConnectionUtil.closeConnection(conn, stmt, rs);
        }
        return listaClientesPf;
    }

    @Override
    public boolean update(Object arg0) {
        ClientePj clientePj = (ClientePj) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "UPDATE `clientePj` SET `clientePj`=?,`obs`=? WHERE cod=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clientePj.getCnpj());
            stmt.setString(2, clientePj.getNome());
            stmt.setString(3, clientePj.getEmail());
            stmt.setString(4, clientePj.getTelefone());
            stmt.setString(5, clientePj.getEndereco().getCEP());
            stmt.setString(6, clientePj.getEndereco().getLogradouro());
            stmt.setString(7, clientePj.getEndereco().getNumero());
            stmt.setString(8, clientePj.getEndereco().getComplemento());
            stmt.setString(9, clientePj.getEndereco().getBairro());
            stmt.setString(10, clientePj.getEndereco().getCidade());
            stmt.setString(11, clientePj.getEndereco().getUf());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
        }
    }

    @Override
    public boolean delete(Object arg0) {
        ClientePj clientePj = (ClientePj) arg0;
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE from clientePj WHERE cod=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, clientePj.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionUtil.closeConnection(conn, stmt);
        }
    }
}
