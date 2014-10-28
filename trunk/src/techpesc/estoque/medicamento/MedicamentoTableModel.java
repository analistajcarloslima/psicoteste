/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.medicamento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class MedicamentoTableModel extends AbstractTableModel {

    private List<Medicamento> medicamentos = new ArrayList<>();
    String[] nomeColunas = {"Código", "Produto", "Quantidade", "Validade", "Fornecedor", "Fase"};

    public MedicamentoTableModel(List<Medicamento> medicamentos) {
        this.medicamentos.clear();
        this.medicamentos = medicamentos;
    }

    @Override
    public int getRowCount() {
        return medicamentos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medicamento medicamento = medicamentos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return medicamento.getIdEstoque();
            case 1:
                return medicamento.getTipoProduto();
            case 2:
                return medicamento.getQtdEstoque();
            case 3:
                return medicamento.getDataValidade();
            case 4:
                return medicamento.getFornecedor().getNomeFornecedor();
            case 5:
                return medicamento.getTipoMedicamento();
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
