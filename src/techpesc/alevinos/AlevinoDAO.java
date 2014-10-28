/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alevinos;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.tanquerede.TanqueRede;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class AlevinoDAO extends GenericDAO<Alevino> {

    public AlevinoDAO() {
        super(Alevino.class);
    }

    public void salvar(Alevino a) {
        if (a.getIdEntradaAlevino()== 0) {
            adicionar(a);
        } else {
            atualizar(a);
        }

    }

    public Alevino pesquisarCodigo(short codigo) {
        Alevino alevino = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            alevino = (Alevino) getSessao().createCriteria(Alevino.class).
                    add(Restrictions.eq("idEntradaAlevino", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return alevino;
    }
    
           public List<Alevino> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Alevino> alevino = sessao.createCriteria(Alevino.class).
                add(Restrictions.eq("situacaoEntradaAlevino", situacao
                )).list();
        sessao.close();
        return alevino;
    }

}
