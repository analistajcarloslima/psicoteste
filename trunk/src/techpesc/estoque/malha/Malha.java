/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.malha;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.estoque.Estoque;
import techpesc.fornecedor.Fornecedor;


@Entity
@Table(name = "Malha")
public class Malha extends Estoque{


    @Column(length = 15, nullable = false)
    private double tamanhoMalha;
    
    @Column(length = 15, nullable = false)
    private String faseMalha;

    /**
     * @return the tamanhoMalha
     */
    public double getTamanhoMalha() {
        return tamanhoMalha;
    }

    /**
     * @param tamanhoMalha the tamanhoMalha to set
     */
    public void setTamanhoMalha(double tamanhoMalha) {
        this.tamanhoMalha = tamanhoMalha;
    }

    /**
     * @return the faseMalha
     */
    public String getFaseMalha() {
        return faseMalha;
    }

    /**
     * @param faseMalha the faseMalha to set
     */
    public void setFaseMalha(String faseMalha) {
        this.faseMalha = faseMalha;
    }
    
}
