/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.tanquerede;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class TanqueRedeDAO extends GenericDAO<TanqueRede> {

    public TanqueRedeDAO() {
        super(TanqueRede.class);
    }

    public void salvar(TanqueRede t) {
        if (t.getIdTanqueRede()== 0) {
            adicionar(t);
        } else {
            atualizar(t);
        }

    }

    public TanqueRede pesquisarCodigo(short codigo) {
        TanqueRede tanqueRede = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            tanqueRede = (TanqueRede) getSessao().createCriteria(TanqueRede.class).
                    add(Restrictions.eq("idTanqueRede", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return tanqueRede;
    }
    
        public List<TanqueRede> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<TanqueRede> tanques = sessao.createCriteria(TanqueRede.class).
                add(Restrictions.eq("situacaoTanqueRede", situacao
                )).list();
        sessao.close();
        return tanques;
    }

}
