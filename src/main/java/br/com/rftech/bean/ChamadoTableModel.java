package br.com.rftech.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo
 */
public class ChamadoTableModel extends AbstractTableModel {

    private List<Chamado> dados = new ArrayList<>();
    private String[] colunas = {"Id Chamado", "Detalhes do Equipamento",
        "Data de Abertura", "Defeito Relatado", "Defeito Constatado", "Solução", "Data do fechamento","Status", "peças Usadas"};

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
                return dados.get(linha).getNotebook();
            case 2:
                return dados.get(linha).getDataAbertura();
            case 3:
                return dados.get(linha).getDefeitoRelatado();
            case 4:
                return dados.get(linha).getDefeitoConstatado();
            case 5:
                return dados.get(linha).getSolucao();
            case 6:
                return dados.get(linha).getDataFechamento();
            case 7:
                return dados.get(linha).getStatus();
            case 8:
                return dados.get(linha).getPecasUsadas();
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
                dados.get(linha).setNotebook((Notebook) valor);
            case 2:
                dados.get(linha).setDataAbertura((Date) valor);
            case 3:
                dados.get(linha).setDefeitoRelatado((String) valor);
            case 4:
                dados.get(linha).setDefeitoConstatado((String) valor);
            case 5:
                dados.get(linha).setSolucao((String) valor);
            case 6:
                dados.get(linha).setDataFechamento((Date) valor);
            case 7:
                dados.get(linha).setSolucao((String) valor);
            case 8:
                dados.get(linha).setPecasUsadas((List<Pecas>) valor);
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Chamado chamado) {
        this.dados.add(chamado);
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