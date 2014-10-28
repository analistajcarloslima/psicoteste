/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.racao;

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
@Table(name = "Racao")
public class Racao extends Estoque{


    @Column(length = 15, nullable = false)
    private double proteina;
    
    @Column(length = 15, nullable = false)
    private String faseRacao;
    
    @Column(length = 15, nullable = false)
    private double pesoRacao;

    /**
     * @return the proteina
     */
    public double getProteina() {
        return proteina;
    }

    /**
     * @param proteina the proteina to set
     */
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    /**
     * @return the faseRacao
     */
    public String getFaseRacao() {
        return faseRacao;
    }

    /**
     * @param faseRacao the faseRacao to set
     */
    public void setFaseRacao(String faseRacao) {
        this.faseRacao = faseRacao;
    }

    /**
     * @return the pesoRacao
     */
    public double getPesoRacao() {
        return pesoRacao;
    }

    /**
     * @param pesoRacao the pesoRacao to set
     */
    public void setPesoRacao(double pesoRacao) {
        this.pesoRacao = pesoRacao;
    }
}

