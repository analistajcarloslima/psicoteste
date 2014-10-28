/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.medicamento;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class MedicamentoDAO extends GenericDAO<Medicamento> {

    public MedicamentoDAO() {
        super(Medicamento.class);
    }

    public void salvar(Medicamento m) {
        if (m.getIdEstoque()== 0) {
            adicionar(m);
            JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
        } else {
            atualizar(m);
        }

    }

    public Medicamento pesquisarCodigo(short codigo) {
        Medicamento medicamento = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            medicamento = (Medicamento) getSessao().createCriteria(Medicamento.class).
                    add(Restrictions.eq("idEstoque", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return medicamento;
    }

}
