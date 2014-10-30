/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.venda;


import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.tanquerede.TanqueRede;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class VendaDAO extends GenericDAO<Venda> {


    public VendaDAO() {
        super(Venda.class);
    }
    

    public void salvar(Venda v) {
        if (v.getIdVenda()== 0) {
            adicionar(v);
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } else {
            atualizar(v);
            JOptionPane.showMessageDialog(null, "Venda editada realizada com sucesso!");
        }

    }

    public Venda pesquisarCodigo(short codigo) {
        Venda venda = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            venda = (Venda) getSessao().createCriteria(Venda.class).
                    add(Restrictions.eq("idVenda", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return venda;
    }
    


    public List<Venda> pesquisaNome(boolean situacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Venda> venda = sessao.createCriteria(Venda.class).
                add(Restrictions.eq("idVenda", situacao
                        )).list();
        sessao.close();
        return venda;
    }


}
