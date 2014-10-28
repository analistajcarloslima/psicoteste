/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alimentacao;

import techpesc.mortandade.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.estoque.racao.Racao;
import techpesc.lote.Lote;
import techpesc.tanquerede.TanqueRede;

@Entity
@Table(name = "Alimentacao")
public class Alimentacao {

    @Id
    @GeneratedValue
    private short idAlimentacao;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lote lote;

    @Column(length = 20, nullable = false)
    private Date dataAlimentacao;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Racao racao;
    
    @Column(length = 20, nullable = false)
    private int idTanqueRede;
    
    @Column(length = 100, nullable = false)
    private String nomeTanqueRede;
    
    @Column(length = 15, nullable = false)
    private double quantidadeAlimentacao;

    /**
     * @return the idAlimentacao
     */
    public short getIdAlimentacao() {
        return idAlimentacao;
    }

    /**
     * @param idAlimentacao the idAlimentacao to set
     */
    public void setIdAlimentacao(short idAlimentacao) {
        this.idAlimentacao = idAlimentacao;
    }

    /**
     * @return the lote
     */
    public Lote getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    /**
     * @return the dataAlimentacao
     */
    public Date getDataAlimentacao() {
        return dataAlimentacao;
    }

    /**
     * @param dataAlimentacao the dataAlimentacao to set
     */
    public void setDataAlimentacao(Date dataAlimentacao) {
        this.dataAlimentacao = dataAlimentacao;
    }

    /**
     * @return the racao
     */
    public Racao getRacao() {
        return racao;
    }

    /**
     * @param racao the racao to set
     */
    public void setRacao(Racao racao) {
        this.racao = racao;
    }

    /**
     * @return the idTanqueRede
     */
    public int getIdTanqueRede() {
        return idTanqueRede;
    }

    /**
     * @param idTanqueRede the idTanqueRede to set
     */
    public void setIdTanqueRede(int idTanqueRede) {
        this.idTanqueRede = idTanqueRede;
    }

    /**
     * @return the nomeTanqueRede
     */
    public String getNomeTanqueRede() {
        return nomeTanqueRede;
    }

    /**
     * @param nomeTanqueRede the nomeTanqueRede to set
     */
    public void setNomeTanqueRede(String nomeTanqueRede) {
        this.nomeTanqueRede = nomeTanqueRede;
    }

    /**
     * @return the quantidadeAlimentacao
     */
    public double getQuantidadeAlimentacao() {
        return quantidadeAlimentacao;
    }

    /**
     * @param quantidadeAlimentacao the quantidadeAlimentacao to set
     */
    public void setQuantidadeAlimentacao(double quantidadeAlimentacao) {
        this.quantidadeAlimentacao = quantidadeAlimentacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idAlimentacao;
        hash = 71 * hash + Objects.hashCode(this.lote);
        hash = 71 * hash + Objects.hashCode(this.dataAlimentacao);
        hash = 71 * hash + Objects.hashCode(this.racao);
        hash = 71 * hash + this.idTanqueRede;
        hash = 71 * hash + Objects.hashCode(this.nomeTanqueRede);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.quantidadeAlimentacao) ^ (Double.doubleToLongBits(this.quantidadeAlimentacao) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alimentacao other = (Alimentacao) obj;
        if (this.idAlimentacao != other.idAlimentacao) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.dataAlimentacao, other.dataAlimentacao)) {
            return false;
        }
        if (!Objects.equals(this.racao, other.racao)) {
            return false;
        }
        if (this.idTanqueRede != other.idTanqueRede) {
            return false;
        }
        if (!Objects.equals(this.nomeTanqueRede, other.nomeTanqueRede)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantidadeAlimentacao) != Double.doubleToLongBits(other.quantidadeAlimentacao)) {
            return false;
        }
        return true;
    }




}
