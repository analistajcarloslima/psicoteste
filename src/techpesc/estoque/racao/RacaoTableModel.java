/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.racao;

import techpesc.estoque.outros.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class RacaoTableModel extends AbstractTableModel {

    private List<Racao> racaos = new ArrayList<>();
    String[] nomeColunas = {"Código", "Produto", "Quantidade", "Validade", "Fornecedor", "Peso em Estoque", "Proteína %", "T. do P."};

    public RacaoTableModel(List<Racao> racaos) {
        this.racaos.clear();
        this.racaos = racaos;
    }

    @Override
    public int getRowCount() {
        return racaos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Racao racao = racaos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return racao.getIdEstoque();
            case 1:
                return racao.getTipoProduto();
            case 2:
                return racao.getQtdEstoque();
            case 3:
                return racao.getDataValidade();
            case 4:
                return racao.getFornecedor().getNomeFornecedor();
            case 5:
                return racao.getProteina();
            case 6:
                return racao.getPesoRacao();
            case 7:
                return racao.getFaseRacao();
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
            case 7:
                return nomeColunas[7];
        }
        return null;
    }

}
