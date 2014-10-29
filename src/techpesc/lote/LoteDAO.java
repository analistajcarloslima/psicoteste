/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.lote;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import techpesc.tanquerede.TanqueRede;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class LoteDAO extends GenericDAO<Lote> {

    public LoteDAO() {
        super(Lote.class);
    }

    public void salvar(Lote l) {
        if (l.getIdLote() == 0) {
            adicionar(l);
        } else {
            atualizar(l);
        }

    }

    public Lote pesquisarCodigo(short codigo) {
        Lote lote = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            lote = (Lote) getSessao().createCriteria(Lote.class).
                    add(Restrictions.eq("idLote", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return lote;
    }

       public List <Lote> pesquisaNome(String lote){
        setSessao(HibernateUtil.getSessionFactory().openSession());
        setTransacao(getSessao().beginTransaction());
        
        List <Lote> lotes = (List<Lote>) getSessao().createCriteria(Lote.class).
                add(Restrictions.ilike("nomeLote", lote, MatchMode.ANYWHERE)).list();
        
        getSessao().close();
        return lotes;
    }

}
