/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.tanquerede;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class TanqueRedeTableModel extends AbstractTableModel {

    private List<TanqueRede> tanqueRedes = new ArrayList<>();
    String[] nomeColunas = {"Código", "Nome", "Limite", "P. Vivos", "P. Mortos", "Tipo T.R"};

    public TanqueRedeTableModel(List<TanqueRede> tanqueRede) {
        this.tanqueRedes.clear();
        this.tanqueRedes = tanqueRede;
    }

    @Override
    public int getRowCount() {
        return tanqueRedes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TanqueRede tanqueRede = tanqueRedes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tanqueRede.getIdTanqueRede();
            case 1:
                return tanqueRede.getNomeTanqueRede();
            case 2:
                return tanqueRede.getLimiteAlevinosTanqueRede();
            case 3:
                return tanqueRede.getQuantidadePeixesVinculados();
            case 4:
                return tanqueRede.getMortandadeTanqueRede();
            case 5:
                return tanqueRede.getEstadoPeixe();
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
