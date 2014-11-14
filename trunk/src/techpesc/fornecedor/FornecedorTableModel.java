/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.fornecedor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FornecedorTableModel extends AbstractTableModel {

    private List<Fornecedor> fornecedores = new ArrayList<>();
    String[] nomeColunas = {"Código", "Nome", "CPNJ", "CPF", "Contato",};

    public FornecedorTableModel(List<Fornecedor> fornecedores) {
        this.fornecedores.clear();
        this.fornecedores = fornecedores;
    }

    @Override
    public int getRowCount() {
        return fornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = fornecedores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return fornecedor.getIdFornecedor();
            case 1:
                return fornecedor.getNomeFornecedor();
            case 2:
                return fornecedor.getCnpjFornecedor();
            case 3:
                return fornecedor.getCpfFornecedor();
            case 4:
                return fornecedor.getContatoFornecedor();
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
