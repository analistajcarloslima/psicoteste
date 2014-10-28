/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.malha;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class MalhaTableModel extends AbstractTableModel {

    private List<Malha> malhas = new ArrayList<>();
    String[] nomeColunas = {"Código", "Produto", "Quantidade", "Validade", "Fornecedor", "Fase"};

    public MalhaTableModel(List<Malha> malhas) {
        this.malhas.clear();
        this.malhas = malhas;
    }

    @Override
    public int getRowCount() {
        return malhas.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Malha malha = malhas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return malha.getIdEstoque();
            case 1:
                return malha.getTipoProduto();
            case 2:
                return malha.getQtdEstoque();
            case 3:
                return malha.getDataValidade();
            case 4:
                return malha.getFornecedor().getNomeFornecedor();
            case 5:
                return malha.getFaseMalha();
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
