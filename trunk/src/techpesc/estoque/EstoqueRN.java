/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque;

import techpesc.estoque.malha.*;



public class EstoqueRN {

    EstoqueDAO dao = new EstoqueDAO();

    public boolean remove(Estoque estoque) {
        return dao.remover(estoque);

    }

}
