/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.funcionario;

/**
 *
 * @author PC
 */
public class FuncionarioRN {

    FuncionarioDAO dao = new FuncionarioDAO(Funcionario.class);

    public Funcionario pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Funcionario funcionario) {
        return dao.remover(funcionario);

    }

}
