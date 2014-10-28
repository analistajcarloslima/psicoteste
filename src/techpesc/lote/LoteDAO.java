/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.lote;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
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
        if (l.getIdLote()== 0) {
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
    
    

}
