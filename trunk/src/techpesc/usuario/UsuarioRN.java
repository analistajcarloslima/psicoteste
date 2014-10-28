/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.usuario;

import javax.swing.JOptionPane;



/**
 *
 * @author PC
 */
public class UsuarioRN {

    UsuarioDAO dao = new UsuarioDAO();

    public Usuario pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Usuario usuario) {
        return dao.remover(usuario);

    }
    
    public boolean validaSenha(String senha, String confirmaSenha){
       if(senha.equals(confirmaSenha)){
           return true;
       }else
           return false;
    }

}
