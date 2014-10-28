/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.transfereTR;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class TransferenciaTableModel extends AbstractTableModel {

    private List<Transferencia> transferencias = new ArrayList<>();
    String[] nomeColunas = {"Código", "Lote", "T.R Antigo", "T.R Novo", "Data"};

    public TransferenciaTableModel(List<Transferencia> transferencias) {
        this.transferencias.clear();
        this.transferencias = transferencias;
    }

    @Override
    public int getRowCount() {
        return transferencias.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transferencia transferencia = transferencias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return transferencia.getIdTransferencia();
            case 1:
                return transferencia.getLote().getNomeLote();
            case 2:
                return transferencia.getNomeTanqueRedeAntigo();
            case 3:
                return transferencia.getNomeTanqueRedeNovo();
            case 4:
                return transferencia.getDataTransferencia();
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
