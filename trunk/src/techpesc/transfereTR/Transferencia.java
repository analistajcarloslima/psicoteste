/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.transfereTR;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.lote.Lote;
import techpesc.tanquerede.TanqueRede;

@Entity
@Table(name = "Transferencia")
public class Transferencia {

    @Id
    @GeneratedValue
    private short idTransferencia;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lote lote;

    @Column(length = 20, nullable = false)
    private Date dataTransferencia;

    @Column(length = 150, nullable = false)
    private String nomeTanqueRedeNovo;
    
    @Column(length = 50, nullable = false)
    private int idTanqueNovo;

    @Column(length = 150, nullable = false)
    private String nomeTanqueRedeAntigo;
    
    @Column(length = 50, nullable = false)
    private int idTanqueAntigo;

    /**
     * @return the idTransferencia
     */
    public short getIdTransferencia() {
        return idTransferencia;
    }

    /**
     * @param idTransferencia the idTransferencia to set
     */
    public void setIdTransferencia(short idTransferencia) {
        this.idTransferencia = idTransferencia;
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
     * @return the dataTransferencia
     */
    public Date getDataTransferencia() {
        return dataTransferencia;
    }

    /**
     * @param dataTransferencia the dataTransferencia to set
     */
    public void setDataTransferencia(Date dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    /**
     * @return the nomeTanqueRedeNovo
     */
    public String getNomeTanqueRedeNovo() {
        return nomeTanqueRedeNovo;
    }

    /**
     * @param nomeTanqueRedeNovo the nomeTanqueRedeNovo to set
     */
    public void setNomeTanqueRedeNovo(String nomeTanqueRedeNovo) {
        this.nomeTanqueRedeNovo = nomeTanqueRedeNovo;
    }

    /**
     * @return the idTanqueNovo
     */
    public int getIdTanqueNovo() {
        return idTanqueNovo;
    }

    /**
     * @param idTanqueNovo the idTanqueNovo to set
     */
    public void setIdTanqueNovo(int idTanqueNovo) {
        this.idTanqueNovo = idTanqueNovo;
    }

    /**
     * @return the nomeTanqueRedeAntigo
     */
    public String getNomeTanqueRedeAntigo() {
        return nomeTanqueRedeAntigo;
    }

    /**
     * @param nomeTanqueRedeAntigo the nomeTanqueRedeAntigo to set
     */
    public void setNomeTanqueRedeAntigo(String nomeTanqueRedeAntigo) {
        this.nomeTanqueRedeAntigo = nomeTanqueRedeAntigo;
    }

    /**
     * @return the idTanqueAntigo
     */
    public int getIdTanqueAntigo() {
        return idTanqueAntigo;
    }

    /**
     * @param idTanqueAntigo the idTanqueAntigo to set
     */
    public void setIdTanqueAntigo(int idTanqueAntigo) {
        this.idTanqueAntigo = idTanqueAntigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idTransferencia;
        hash = 37 * hash + Objects.hashCode(this.lote);
        hash = 37 * hash + Objects.hashCode(this.dataTransferencia);
        hash = 37 * hash + Objects.hashCode(this.nomeTanqueRedeNovo);
        hash = 37 * hash + this.idTanqueNovo;
        hash = 37 * hash + Objects.hashCode(this.nomeTanqueRedeAntigo);
        hash = 37 * hash + this.idTanqueAntigo;
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
        final Transferencia other = (Transferencia) obj;
        if (this.idTransferencia != other.idTransferencia) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.dataTransferencia, other.dataTransferencia)) {
            return false;
        }
        if (!Objects.equals(this.nomeTanqueRedeNovo, other.nomeTanqueRedeNovo)) {
            return false;
        }
        if (this.idTanqueNovo != other.idTanqueNovo) {
            return false;
        }
        if (!Objects.equals(this.nomeTanqueRedeAntigo, other.nomeTanqueRedeAntigo)) {
            return false;
        }
        if (this.idTanqueAntigo != other.idTanqueAntigo) {
            return false;
        }
        return true;
    }



}
