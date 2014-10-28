/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.tanquerede;


/**
 *
 * @author PC
 */
public class TanqueRedeRN {

    TanqueRedeDAO dao = new TanqueRedeDAO();

    public TanqueRede pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(TanqueRede tanqueRede) {
        return dao.remover(tanqueRede);

    }

}
