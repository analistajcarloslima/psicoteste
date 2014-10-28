/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.outros;

import techpesc.estoque.medicamento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class OutrosTableModel extends AbstractTableModel {

    private List<Outros> outros = new ArrayList<>();
    String[] nomeColunas = {"Código", "Produto", "Quantidade", "Validade", "Fornecedor", "Descrição"};

    public OutrosTableModel(List<Outros> outros) {
        this.outros.clear();
        this.outros = outros;
    }

    @Override
    public int getRowCount() {
        return outros.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Outros outro = outros.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return outro.getIdEstoque();
            case 1:
                return outro.getTipoProduto();
            case 2:
                return outro.getQtdEstoque();
            case 3:
                return outro.getDataValidade();
            case 4:
                return outro.getFornecedor().getNomeFornecedor();
            case 5:
                return outro.getDescricaoOutros();
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
