/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alimentacao;

import techpesc.mortandade.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class AlimentacaoTableModel extends AbstractTableModel {

    private List<Alimentacao> alimentacoes = new ArrayList<>();
    String[] nomeColunas = {"Código", "Lote", "Tanque Rede", "Ração", "Qtd. Alim.", "Data"};

    public AlimentacaoTableModel(List<Alimentacao> alimentacoes) {
        this.alimentacoes.clear();
        this.alimentacoes = alimentacoes;
    }

    @Override
    public int getRowCount() {
        return alimentacoes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alimentacao alimentacao = alimentacoes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alimentacao.getIdAlimentacao();
            case 1:
                return alimentacao.getLote().getNomeLote();
            case 2:
                return alimentacao.getNomeTanqueRede();
            case 3:
                return alimentacao.getRacao().getDescricaoOutros();
            case 4:
                return alimentacao.getQuantidadeAlimentacao();
            case 5:
                return alimentacao.getDataAlimentacao();
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
