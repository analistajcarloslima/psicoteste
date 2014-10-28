/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.mortandade;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.lote.Lote;
import techpesc.tanquerede.TanqueRede;

@Entity
@Table(name = "Mortandade")
public class Mortandade {

    @Id
    @GeneratedValue
    private short idMortandade;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lote lote;

    @Column(length = 20, nullable = false)
    private Date dataMortandade;

    @Column(length = 150, nullable = false)
    private String nomeTanqueRede;

    @Column(length = 20, nullable = false)
    private int quantidadePeixesVinculados;
    
    @Column(length = 20, nullable = false)
    private int idTanqueRede;

    @Column(length = 20, nullable = false)
    private int mortandadeTanqueRede;

    /**
     * @return the idMortandade
     */
    public short getIdMortandade() {
        return idMortandade;
    }

    /**
     * @param idMortandade the idMortandade to set
     */
    public void setIdMortandade(short idMortandade) {
        this.idMortandade = idMortandade;
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
     * @return the dataMortandade
     */
    public Date getDataMortandade() {
        return dataMortandade;
    }

    /**
     * @param dataMortandade the dataMortandade to set
     */
    public void setDataMortandade(Date dataMortandade) {
        this.dataMortandade = dataMortandade;
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
     * @return the quantidadePeixesVinculados
     */
    public int getQuantidadePeixesVinculados() {
        return quantidadePeixesVinculados;
    }

    /**
     * @param quantidadePeixesVinculados the quantidadePeixesVinculados to set
     */
    public void setQuantidadePeixesVinculados(int quantidadePeixesVinculados) {
        this.quantidadePeixesVinculados = quantidadePeixesVinculados;
    }

    /**
     * @return the mortandadeTanqueRede
     */
    public int getMortandadeTanqueRede() {
        return mortandadeTanqueRede;
    }

    /**
     * @param mortandadeTanqueRede the mortandadeTanqueRede to set
     */
    public void setMortandadeTanqueRede(int mortandadeTanqueRede) {
        this.mortandadeTanqueRede = mortandadeTanqueRede;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.idMortandade;
        hash = 43 * hash + Objects.hashCode(this.lote);
        hash = 43 * hash + Objects.hashCode(this.dataMortandade);
        hash = 43 * hash + Objects.hashCode(this.nomeTanqueRede);
        hash = 43 * hash + this.quantidadePeixesVinculados;
        hash = 43 * hash + this.idTanqueRede;
        hash = 43 * hash + this.mortandadeTanqueRede;
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
        final Mortandade other = (Mortandade) obj;
        if (this.idMortandade != other.idMortandade) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.dataMortandade, other.dataMortandade)) {
            return false;
        }
        if (!Objects.equals(this.nomeTanqueRede, other.nomeTanqueRede)) {
            return false;
        }
        if (this.quantidadePeixesVinculados != other.quantidadePeixesVinculados) {
            return false;
        }
        if (this.idTanqueRede != other.idTanqueRede) {
            return false;
        }
        if (this.mortandadeTanqueRede != other.mortandadeTanqueRede) {
            return false;
        }
        return true;
    }

}
