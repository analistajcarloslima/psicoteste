/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.cliente;

import techpesc.mortandade.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ClienteTableModel extends AbstractTableModel {

    private List<Cliente> clientes = new ArrayList<>();
    String[] nomeColunas = {"Código", "Nome", "CPF", "CPNJ", "Endereço", "Cidade", "Contato"};

    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes.clear();
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getIdCliente();
            case 1:
                return cliente.getNomeCliente();
            case 2:
                return cliente.getCpfCliente();
            case 3:
                return cliente.getCnpjCliente();
            case 4:
                return cliente.getEnderecoCliente();
            case 5:
                return cliente.getCidadeCliente();
            case 6:
                return cliente.getContatoCliente();
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
