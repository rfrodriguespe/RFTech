package br.com.rftech.bean;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo
 */
public class ClientePfTableModel extends AbstractTableModel {

    private ArrayList<ClientePf> dados = new ArrayList<>();
    private String[] colunas = {"Id", "Cpf", "Nome", "Email", "Telefone", "Cep", "logradouro",
        "Numero", "Complemento", "Bairro", "Cidade", "Uf"};

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
                return dados.get(linha).getCPF();
            case 2:
                return dados.get(linha).getNome();
            case 3:
                return dados.get(linha).getEmail();
            case 4:
                return dados.get(linha).getTelefone();
            case 5:
                return dados.get(linha).getEndereco().getCEP();
            case 6:
                return dados.get(linha).getEndereco().getLogradouro();
            case 7:
                return dados.get(linha).getEndereco().getNumero();
            case 8:
                return dados.get(linha).getEndereco().getComplemento();
            case 9:
                return dados.get(linha).getEndereco().getBairro();
            case 10:
                return dados.get(linha).getEndereco().getCidade();
            case 11:
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
                dados.get(linha).setCPF((String) valor);
            case 2:
                dados.get(linha).setNome((String) valor);
            case 3:
                dados.get(linha).setEmail((String) valor);
            case 4:
                dados.get(linha).setTelefone((String) valor);
            case 5:
                dados.get(linha).getEndereco().setCEP((String) valor);
            case 6:
                dados.get(linha).getEndereco().setLogradouro((String) valor);
            case 7:
                dados.get(linha).getEndereco().setNumero((String) valor);
            case 8:
                dados.get(linha).getEndereco().setComplemento((String) valor);
            case 9:
                dados.get(linha).getEndereco().setBairro((String) valor);;
            case 10:
                dados.get(linha).getEndereco().setCidade((String) valor);
            case 11:
                dados.get(linha).getEndereco().setUf((String) valor);
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(ClientePf clientePf) {
        this.dados.add(clientePf);
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
