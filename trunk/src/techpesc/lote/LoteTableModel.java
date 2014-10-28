/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.lote;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class LoteTableModel extends AbstractTableModel {

    private List<Lote> lotes = new ArrayList<>();
    String[] nomeColunas = {"N° Lote", "Nome do Lote", "Previsão Abate", "Fornecedor"};

    public LoteTableModel(List<Lote> lotes) {
        this.lotes.clear();
        this.lotes = lotes;
    }

    @Override
    public int getRowCount() {
        return lotes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lote lote = lotes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lote.getIdLote();
            case 1:
                return lote.getNomeLote();
            case 2:
                return lote.getPrevisaoAbate();
            case 3:
                return lote.getAlevino().getFornecedor().getNomeFornecedor();
            case 4:
                return lote.getAlevino().getDataEntrada();

        }
        return null;

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return nomeColunas[0];
            case 1:
                return nomeColunas[1];
            case 2:
                return nomeColunas[2];
            case 3:
                return nomeColunas[3];
            case 4:
                return nomeColunas[4];
        }
        return null;
    }

}
