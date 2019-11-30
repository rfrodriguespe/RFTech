package br.com.rftech.bean;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo
 */
public class NotebookTableModel extends AbstractTableModel {

    private ArrayList<Notebook> dados = new ArrayList<>();
    private String[] colunas = {"Id Equipamento", "Dono", "Tipo de Equipamento",
        "Fabricante", "Modelo", "Serial", "Tela", "Ram", "Hd"};

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
                return dados.get(linha).getDono();
            case 2:
                return dados.get(linha).getEquipamentoTipo();
            case 3:
                return dados.get(linha).getFabricante();
            case 4:
                return dados.get(linha).getModelo();
            case 5:
                return dados.get(linha).getSerial();
            case 6:
                return dados.get(linha).getTamanhoTela();
            case 7:
                return dados.get(linha).getRam();
            case 8:
                return dados.get(linha).getHd();
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
                dados.get(linha).setDono((ClientePf) valor);
            case 4:
                dados.get(linha).getEquipamentoTipo().setTipo((String) valor);
            case 5:
                dados.get(linha).getFabricante().setNome((String) valor);
            case 6:
                dados.get(linha).setModelo((String) valor);
            case 7:
                dados.get(linha).setSerial((String) valor);
            case 8:
                dados.get(linha).setTamanhoTela((String) valor);
            case 9:
                dados.get(linha).setRam((String) valor);
            case 10:
                dados.get(linha).setHd((String) valor);
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Notebook notebook) {
        this.dados.add(notebook);
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