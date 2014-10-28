/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.racao;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class RacaoDAO extends GenericDAO<Racao> {

    public RacaoDAO() {
        super(Racao.class);
    }

    public void salvar(Racao r) {
        if (r.getIdEstoque()== 0) {
            adicionar(r);
            JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
        } else {
            atualizar(r);
        }

    }

    public Racao pesquisarCodigo(short codigo) {
        Racao racao = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            racao = (Racao) getSessao().createCriteria(Racao.class).
                    add(Restrictions.eq("idEstoque", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return racao;
    }

}
