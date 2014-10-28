/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.outros;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class OutrosDAO extends GenericDAO<Outros> {

    public OutrosDAO() {
        super(Outros.class);
    }

    public void salvar(Outros outros) {
        if (outros.getIdEstoque()== 0) {
            adicionar(outros);
            JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
        } else {
            atualizar(outros);
        }

    }

    public Outros pesquisarCodigo(short codigo) {
        Outros out = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            out = (Outros) getSessao().createCriteria(Outros.class).
                    add(Restrictions.eq("idEstoque", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return out;
    }

}
