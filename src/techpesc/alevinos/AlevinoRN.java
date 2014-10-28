/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alevinos;




/**
 *
 * @author PC
 */
public class AlevinoRN {

    AlevinoDAO dao = new AlevinoDAO();

    public Alevino pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Alevino alevino) {
        return dao.remover(alevino);

    }

}
