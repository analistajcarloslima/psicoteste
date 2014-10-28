/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.venda;

import techpesc.transfereTR.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class VendaTableModel extends AbstractTableModel {

    private List<Venda> vendas = new ArrayList<>();
    String[] nomeColunas = {"Código", "Lote", "Valor da Venda"};

    public VendaTableModel(List<Venda> vendas) {
        this.vendas.clear();
        this.vendas = vendas;
    }

    @Override
    public int getRowCount() {
        return vendas.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda venda = vendas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return venda.getIdVenda();
            case 1:
                return venda.getLote().getNomeLote();
            case 2:
                return venda.getValorVendaTanqueRede();

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
        }
        return null;
    }

}
