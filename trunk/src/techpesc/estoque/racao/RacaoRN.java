/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.racao;

import techpesc.estoque.outros.*;





public class RacaoRN {

    RacaoDAO dao = new RacaoDAO();

    public Racao pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Racao racao) {
        return dao.remover(racao);

    }

}
