/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.fornecedor;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class FornecedorDAO extends GenericDAO<Fornecedor> {

    public FornecedorDAO() {
        super(Fornecedor.class);
    }

    public void salvar(Fornecedor t) {
        if (t.getIdFornecedor()== 0) {
            adicionar(t);
        } else {
            atualizar(t);
        }

    }

    public Fornecedor pesquisarCodigo(short codigo) {
        Fornecedor fornecedor = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            fornecedor = (Fornecedor) getSessao().createCriteria(Fornecedor.class).
                    add(Restrictions.eq("idFornecedor", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return fornecedor;
    }

}
