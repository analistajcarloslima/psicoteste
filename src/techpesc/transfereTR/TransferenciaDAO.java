/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.transfereTR;

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
public class TransferenciaDAO extends GenericDAO<Transferencia> {


    public TransferenciaDAO() {
        super(Transferencia.class);
    }
    

    public void salvar(Transferencia t) {
        if (t.getIdTransferencia()== 0) {
            adicionar(t);
        } else {
            atualizar(t);
        }

    }

    public Transferencia pesquisarCodigo(short codigo) {
        Transferencia transferencia = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            transferencia = (Transferencia) getSessao().createCriteria(Transferencia.class).
                    add(Restrictions.eq("idTransferencia", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return transferencia;
    }

    public List<Transferencia> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Transferencia> transferencia = sessao.createCriteria(Transferencia.class).
                add(Restrictions.eq("situacaoEntradaAlevino", situacao
                        )).list();
        sessao.close();
        return transferencia;
    }


}
