/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.fornecedor;



/**
 *
 * @author PC
 */
public class FornecedorRN {

    FornecedorDAO dao = new FornecedorDAO();

    public Fornecedor pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Fornecedor fornecedor) {
        return dao.remover(fornecedor);

    }

}
