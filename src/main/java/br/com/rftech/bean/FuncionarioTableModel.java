package br.com.rftech.bean;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private ArrayList<Funcionario> dados = new ArrayList<>();
    private String[] colunas = {"Id", "Cpf", "Nome", "Nome de Usuário", /*"Senha",*/ "Cargo", "Telefone",
        "E-mail", "Cep", "logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Uf"};

    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getCpf();
            case 2:
                return dados.get(linha).getNome();
            case 3:
                return dados.get(linha).getNomeUsuario();
//            case 4:
//                return dados.get(linha).getSenha();
            case 4:
                return dados.get(linha).getCargo().getNome();
            case 5:
                return dados.get(linha).getTelefone();
            case 6:
                return dados.get(linha).getEmail();
            case 7:
                return dados.get(linha).getEndereco().getCEP();
            case 8:
                return dados.get(linha).getEndereco().getLogradouro();
            case 9:
                return dados.get(linha).getEndereco().getNumero();
            case 10:
                return dados.get(linha).getEndereco().getComplemento();
            case 11:
                return dados.get(linha).getEndereco().getBairro();
            case 12:
                return dados.get(linha).getEndereco().getCidade();
            case 13:
                return dados.get(linha).getEndereco().getUf();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setId((int) valor);
            case 1:
                dados.get(linha).setCpf((String) valor);
            case 2:
                dados.get(linha).setNome((String) valor);
            case 3:
                dados.get(linha).setNomeUsuario((String) valor);
//            case 4:
//                dados.get(linha).setSenha((String) valor);
            case 4:
                dados.get(linha).setCargo((Cargo) valor);
            case 5:
                dados.get(linha).setTelefone((String) valor);
            case 6:
                dados.get(linha).setEmail((String) valor);
            case 7:
                dados.get(linha).getEndereco().setCEP((String) valor);
            case 8:
                dados.get(linha).getEndereco().setLogradouro((String) valor);
            case 9:
                dados.get(linha).getEndereco().setNumero((String) valor);
            case 10:
                dados.get(linha).getEndereco().setComplemento((String) valor);
            case 11:
                dados.get(linha).getEndereco().setBairro((String) valor);
            case 12:
                dados.get(linha).getEndereco().setCidade((String) valor);
            case 13:
                dados.get(linha).getEndereco().setUf((String) valor);
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Funcionario funcionario) {
        this.dados.add(funcionario);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public void limpaTabela() {
        dados.clear();
        fireTableDataChanged();
    }
}
