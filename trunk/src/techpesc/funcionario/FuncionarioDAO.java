/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.funcionario;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public FuncionarioDAO(Class classe) {
        super(Funcionario.class);
    }

    public void salvar(Funcionario u) {
        if (u.getIdFuncionario() == 0) {
            adicionar(u);
        } else {
            atualizar(u);
        }

    }

    public Funcionario pesquisarCodigo(short codigo) {
        Funcionario funcionario = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            funcionario = (Funcionario) getSessao().createCriteria(Funcionario.class).
                    add(Restrictions.eq("idFuncionario", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return funcionario;
    }

}
