/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.tanquerede;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.lote.Lote;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "TanqueRede")
public class TanqueRede {

    @Id
    @GeneratedValue
    private short idTanqueRede;

    @Column(length = 150, nullable = false)
    private String nomeTanqueRede;
    
    @Column(length = 10, nullable = false)
    private double areaTanqueRede;

    @Column(length = 5, nullable = false)
    private int limiteAlevinosTanqueRede;

    @Column(length = 15, nullable = false)
    private String estadoPeixe;
    
    @Column(nullable = false, columnDefinition = "boolean default true", insertable = false, updatable = true)
    private boolean situacaoTanqueRede;
    
    @Column(nullable = false, columnDefinition = "int default 0", insertable = false, updatable = true)
    private int quantidadePeixesVinculados;
    
    @Column(nullable = false, columnDefinition = "int default 0", insertable = false, updatable = true)
    private int mortandadeTanqueRede;

    /**
     * @return the idTanqueRede
     */
    public short getIdTanqueRede() {
        return idTanqueRede;
    }

    /**
     * @param idTanqueRede the idTanqueRede to set
     */
    public void setIdTanqueRede(short idTanqueRede) {
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
     * @return the areaTanqueRede
     */
    public double getAreaTanqueRede() {
        return areaTanqueRede;
    }

    /**
     * @param areaTanqueRede the areaTanqueRede to set
     */
    public void setAreaTanqueRede(double areaTanqueRede) {
        this.areaTanqueRede = areaTanqueRede;
    }

    /**
     * @return the limiteAlevinosTanqueRede
     */
    public int getLimiteAlevinosTanqueRede() {
        return limiteAlevinosTanqueRede;
    }

    /**
     * @param limiteAlevinosTanqueRede the limiteAlevinosTanqueRede to set
     */
    public void setLimiteAlevinosTanqueRede(int limiteAlevinosTanqueRede) {
        this.limiteAlevinosTanqueRede = limiteAlevinosTanqueRede;
    }

    /**
     * @return the estadoPeixe
     */
    public String getEstadoPeixe() {
        return estadoPeixe;
    }

    /**
     * @param estadoPeixe the estadoPeixe to set
     */
    public void setEstadoPeixe(String estadoPeixe) {
        this.estadoPeixe = estadoPeixe;
    }

    /**
     * @return the situacaoTanqueRede
     */
    public boolean isSituacaoTanqueRede() {
        return situacaoTanqueRede;
    }

    /**
     * @param situacaoTanqueRede the situacaoTanqueRede to set
     */
    public void setSituacaoTanqueRede(boolean situacaoTanqueRede) {
        this.situacaoTanqueRede = situacaoTanqueRede;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idTanqueRede;
        hash = 79 * hash + Objects.hashCode(this.nomeTanqueRede);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.areaTanqueRede) ^ (Double.doubleToLongBits(this.areaTanqueRede) >>> 32));
        hash = 79 * hash + this.limiteAlevinosTanqueRede;
        hash = 79 * hash + Objects.hashCode(this.estadoPeixe);
        hash = 79 * hash + (this.situacaoTanqueRede ? 1 : 0);
        hash = 79 * hash + this.quantidadePeixesVinculados;
        hash = 79 * hash + this.mortandadeTanqueRede;
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
        final TanqueRede other = (TanqueRede) obj;
        if (this.idTanqueRede != other.idTanqueRede) {
            return false;
        }
        if (!Objects.equals(this.nomeTanqueRede, other.nomeTanqueRede)) {
            return false;
        }
        if (Double.doubleToLongBits(this.areaTanqueRede) != Double.doubleToLongBits(other.areaTanqueRede)) {
            return false;
        }
        if (this.limiteAlevinosTanqueRede != other.limiteAlevinosTanqueRede) {
            return false;
        }
        if (!Objects.equals(this.estadoPeixe, other.estadoPeixe)) {
            return false;
        }
        if (this.situacaoTanqueRede != other.situacaoTanqueRede) {
            return false;
        }
        if (this.quantidadePeixesVinculados != other.quantidadePeixesVinculados) {
            return false;
        }
        if (this.mortandadeTanqueRede != other.mortandadeTanqueRede) {
            return false;
        }
        return true;
    }




}
