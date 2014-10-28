/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.malha;



public class MalhaRN {

    MalhaDAO dao = new MalhaDAO();

    public Malha pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Malha malha) {
        return dao.remover(malha);

    }

}
