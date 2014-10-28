/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.mortandade;

import techpesc.alevinos.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.funcionario.Funcionario;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class MortandadeDAO extends GenericDAO<Mortandade> {


    public MortandadeDAO() {
        super(Mortandade.class);
    }
    

    public void salvar(Mortandade m) {
        if (m.getIdMortandade() == 0) {
            adicionar(m);
        } else {
            atualizar(m);
        }

    }

    public Mortandade pesquisarCodigo(short codigo) {
        Mortandade mortandade = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            mortandade = (Mortandade) getSessao().createCriteria(Mortandade.class).
                    add(Restrictions.eq("idMortandade", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return mortandade;
    }

    public List<Mortandade> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Mortandade> mortandade = sessao.createCriteria(Mortandade.class).
                add(Restrictions.eq("situacaoEntradaAlevino", situacao
                        )).list();
        sessao.close();
        return mortandade;
    }


}
