/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.malha;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.alevinos.Alevino;
import techpesc.alevinos.AlevinoDAO;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class MalhaDAO extends GenericDAO<Malha> {

    public MalhaDAO() {
        super(Malha.class);
    }

    public void salvar(Malha m) {
        if (m.getIdEstoque()== 0) {
            adicionar(m);
            JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
        } else {
            atualizar(m);
        }

    }

    public Malha pesquisarCodigo(short codigo) {
        Malha malha = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            malha = (Malha) getSessao().createCriteria(Malha.class).
                    add(Restrictions.eq("idEstoque", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return malha;
    }
    

}
