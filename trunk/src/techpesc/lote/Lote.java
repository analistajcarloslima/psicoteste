/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.lote;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NaturalId;
import techpesc.alevinos.Alevino;
import techpesc.fornecedor.Fornecedor;
import techpesc.tanquerede.TanqueRede;

/**
 *
 * @author joão
 */
@Entity
@Table(name = "Lote")
public class Lote {

    @Id
    @GeneratedValue
    private short idLote;
   
    @NaturalId(mutable = true)
    @Column(length = 50, nullable = false)
    private String nomeLote;
    
    @Temporal(TemporalType.DATE)
    @Column(length = 20, nullable = false)
    private Date previsaoAbate;
    
    @Column(length = 20, nullable = false)
    private double lucroEstimado;
    
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<TanqueRede> tanquesRede;
    
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Alevino alevino;

    /**
     * @return the idLote
     */
    public short getIdLote() {
        return idLote;
    }

    /**
     * @param idLote the idLote to set
     */
    public void setIdLote(short idLote) {
        this.idLote = idLote;
    }

    /**
     * @return the nomeLote
     */
    public String getNomeLote() {
        return nomeLote;
    }

    /**
     * @param nomeLote the nomeLote to set
     */
    public void setNomeLote(String nomeLote) {
        this.nomeLote = nomeLote;
    }

    /**
     * @return the previsaoAbate
     */
    public Date getPrevisaoAbate() {
        return previsaoAbate;
    }

    /**
     * @param previsaoAbate the previsaoAbate to set
     */
    public void setPrevisaoAbate(Date previsaoAbate) {
        this.previsaoAbate = previsaoAbate;
    }

    /**
     * @return the lucroEstimado
     */
    public double getLucroEstimado() {
        return lucroEstimado;
    }

    /**
     * @param lucroEstimado the lucroEstimado to set
     */
    public void setLucroEstimado(double lucroEstimado) {
        this.lucroEstimado = lucroEstimado;
    }

    /**
     * @return the tanquesRede
     */
    public List<TanqueRede> getTanquesRede() {
        return tanquesRede;
    }

    /**
     * @param tanquesRede the tanquesRede to set
     */
    public void setTanquesRede(List<TanqueRede> tanquesRede) {
        this.tanquesRede = tanquesRede;
    }

    /**
     * @return the alevino
     */
    public Alevino getAlevino() {
        return alevino;
    }

    /**
     * @param alevino the alevino to set
     */
    public void setAlevino(Alevino alevino) {
        this.alevino = alevino;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idLote;
        hash = 97 * hash + Objects.hashCode(this.nomeLote);
        hash = 97 * hash + Objects.hashCode(this.previsaoAbate);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lucroEstimado) ^ (Double.doubleToLongBits(this.lucroEstimado) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.tanquesRede);
        hash = 97 * hash + Objects.hashCode(this.alevino);
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
        final Lote other = (Lote) obj;
        if (this.idLote != other.idLote) {
            return false;
        }
        if (!Objects.equals(this.nomeLote, other.nomeLote)) {
            return false;
        }
        if (!Objects.equals(this.previsaoAbate, other.previsaoAbate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lucroEstimado) != Double.doubleToLongBits(other.lucroEstimado)) {
            return false;
        }
        if (!Objects.equals(this.tanquesRede, other.tanquesRede)) {
            return false;
        }
        if (!Objects.equals(this.alevino, other.alevino)) {
            return false;
        }
        return true;
    }





    
}
