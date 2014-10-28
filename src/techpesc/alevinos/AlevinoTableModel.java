/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alevinos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class AlevinoTableModel extends AbstractTableModel {

    private List<Alevino> alevinos = new ArrayList<>();
    String[] nomeColunas = {"Código", "Qtd. Alevino", "Peso", "Valor", "Data Nasci.", "Data Entrada", "Fornecedor"};

    public AlevinoTableModel(List<Alevino> alevinos) {
        this.alevinos.clear();
        this.alevinos = alevinos;
    }

    @Override
    public int getRowCount() {
        return alevinos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alevino alevino = alevinos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alevino.getIdEntradaAlevino();
            case 1:
                return alevino.getQtdAlevino();
            case 2:
                return alevino.getPesoAlevino();
            case 3:
                return alevino.getValorAlevino();
            case 4:
                return alevino.getDataNascimentoAlevino();
            case 5:
                return alevino.getDataEntrada();
            case 6:
                return alevino.getFornecedor().getNomeFornecedor();

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
            case 6:
                return nomeColunas[6];
        }
        return null;
    }

}
