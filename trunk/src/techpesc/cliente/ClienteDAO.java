/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.cliente;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author joão
 */
public class ClienteDAO extends GenericDAO<Cliente> {


    public ClienteDAO() {
        super(Cliente.class);
    }
    

    public void salvar(Cliente c) {
        if (c.getIdCliente()== 0) {
            adicionar(c);
        } else {
            atualizar(c);
        }

    }

    public Cliente pesquisarCodigo(short codigo) {
        Cliente cliente = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            cliente = (Cliente) getSessao().createCriteria(Cliente.class).
                    add(Restrictions.eq("idCliente", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return cliente;
    }


}
