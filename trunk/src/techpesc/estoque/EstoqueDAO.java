/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import techpesc.util.GenericDAO;
import techpesc.util.HibernateUtil;

/**
 *
 * @author PC
 */
public class EstoqueDAO extends GenericDAO<Estoque> {

    public EstoqueDAO() {
        super(Estoque.class);
    }

    public void salvar(Estoque e) {
        if(e.getIdEstoque()==0){
            adicionar(e);
            JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
        } else {
            atualizar(e);
        }
        
    }

}
