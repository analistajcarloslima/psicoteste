/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.outros;





public class OutrosRN {

    OutrosDAO dao = new OutrosDAO();

    public Outros pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Outros outros) {
        return dao.remover(outros);

    }

}
