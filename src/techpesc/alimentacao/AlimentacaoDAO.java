/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alimentacao;

import techpesc.mortandade.*;
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
public class AlimentacaoDAO extends GenericDAO<Alimentacao> {


    public AlimentacaoDAO() {
        super(Alimentacao.class);
    }
    

    public void salvar(Alimentacao a) {
        if (a.getIdAlimentacao()== 0) {
            adicionar(a);
        } else {
            atualizar(a);
        }

    }

    public Alimentacao pesquisarCodigo(short codigo) {
        Alimentacao alimentacao = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            alimentacao = (Alimentacao) getSessao().createCriteria(Alimentacao.class).
                    add(Restrictions.eq("idAlimentacao", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return alimentacao;
    }

    public List<Alimentacao> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Alimentacao> alimentacao = sessao.createCriteria(Alimentacao.class).
                add(Restrictions.eq("situacaoEntradaAlevino", situacao
                        )).list();
        sessao.close();
        return alimentacao;
    }


}
