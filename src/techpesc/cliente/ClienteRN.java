/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.cliente;

import techpesc.funcionario.*;

/**
 *
 * @author PC
 */
public class ClienteRN {

    ClienteDAO dao = new ClienteDAO();

    public Cliente pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Cliente cliente) {
        return dao.remover(cliente);

    }

}
