/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.usuario;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public void salvar(Usuario u) {
        if (u.getIdUsuario() == 0) {
            adicionar(u);
        } else {
            atualizar(u);
        }

    }

    public Usuario pesquisarCodigo(short codigo) {
        Usuario usuario = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            usuario = (Usuario) getSessao().createCriteria(Usuario.class).
                    add(Restrictions.eq("idUsuario", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return usuario;
    }

    public Usuario pesquisarLogin(String login) {
        Usuario usuario = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(this.getSessao().beginTransaction());
            usuario = (Usuario) getSessao().createCriteria(Usuario.class)
                    .add(Restrictions.eq("login", login)).uniqueResult();
            this.getTransacao().commit();
        } catch (Throwable t) {
            System.out.println("Login não encontrado!");
        } finally {
            this.getSessao().close();
        }
        return usuario;
    }

    public boolean autenticar(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("senha", senha)).add(Restrictions.eq("login", login)).uniqueResult();
        sessao.close();
        if (usuario != null) {
            return true;
        }
        return false;
    }

}
