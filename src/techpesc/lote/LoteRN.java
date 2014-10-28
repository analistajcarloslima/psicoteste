/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.lote;



/**
 *
 * @author PC
 */
public class LoteRN {

    LoteDAO dao = new LoteDAO();

    public Lote pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Lote lote) {
        return dao.remover(lote);

    }

}
