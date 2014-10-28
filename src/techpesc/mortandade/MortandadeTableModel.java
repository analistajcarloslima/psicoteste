/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.mortandade;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class MortandadeTableModel extends AbstractTableModel {

    private List<Mortandade> mortandades = new ArrayList<>();
    String[] nomeColunas = {"Código", "Lote", "Tanque Rede", "P. Vivos", "P. Mortos", "Data"};

    public MortandadeTableModel(List<Mortandade> mortandades) {
        this.mortandades.clear();
        this.mortandades = mortandades;
    }

    @Override
    public int getRowCount() {
        return mortandades.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mortandade mortandade = mortandades.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mortandade.getIdMortandade();
            case 1:
                return mortandade.getLote().getNomeLote();
            case 2:
                return mortandade.getNomeTanqueRede();
            case 3:
                return mortandade.getQuantidadePeixesVinculados();
            case 4:
                return mortandade.getMortandadeTanqueRede();
            case 5:
                return mortandade.getDataMortandade();
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
            case 5:
                return nomeColunas[5];
        }
        return null;
    }

}
