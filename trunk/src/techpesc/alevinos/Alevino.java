/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.alevinos;

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
import techpesc.fornecedor.Fornecedor;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "Alevino")
public class Alevino {

    @Id
    @GeneratedValue
    private short idEntradaAlevino;

    @Column(length = 8, nullable = false)
    private short qtdAlevino;
    
    
    @Column(nullable = false, columnDefinition = "boolean default true", insertable = false, updatable = true)
    private boolean situacaoEntradaAlevino;

    @Temporal(TemporalType.DATE)
    @Column(length = 20, nullable = false)
    private Date dataNascimentoAlevino;

    @Column(length = 4, nullable = false)
    private double pesoAlevino;

    @Column(length = 8, nullable = false)
    private double valorAlevino;

    @Temporal(TemporalType.DATE)
    @Column(length = 20, nullable = false)
    private Date dataEntrada;

    @OneToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedor;

    /**
     * @return the idEntradaAlevino
     */
    public short getIdEntradaAlevino() {
        return idEntradaAlevino;
    }

    /**
     * @param idEntradaAlevino the idEntradaAlevino to set
     */
    public void setIdEntradaAlevino(short idEntradaAlevino) {
        this.idEntradaAlevino = idEntradaAlevino;
    }

    /**
     * @return the qtdAlevino
     */
    public short getQtdAlevino() {
        return qtdAlevino;
    }

    /**
     * @param qtdAlevino the qtdAlevino to set
     */
    public void setQtdAlevino(short qtdAlevino) {
        this.qtdAlevino = qtdAlevino;
    }

    /**
     * @return the dataNascimentoAlevino
     */
    public Date getDataNascimentoAlevino() {
        return dataNascimentoAlevino;
    }

    /**
     * @param dataNascimentoAlevino the dataNascimentoAlevino to set
     */
    public void setDataNascimentoAlevino(Date dataNascimentoAlevino) {
        this.dataNascimentoAlevino = dataNascimentoAlevino;
    }

    /**
     * @return the pesoAlevino
     */
    public double getPesoAlevino() {
        return pesoAlevino;
    }

    /**
     * @param pesoAlevino the pesoAlevino to set
     */
    public void setPesoAlevino(double pesoAlevino) {
        this.pesoAlevino = pesoAlevino;
    }

    /**
     * @return the valorAlevino
     */
    public double getValorAlevino() {
        return valorAlevino;
    }

    /**
     * @param valorAlevino the valorAlevino to set
     */
    public void setValorAlevino(double valorAlevino) {
        this.valorAlevino = valorAlevino;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idEntradaAlevino;
        hash = 37 * hash + this.qtdAlevino;
        hash = 37 * hash + Objects.hashCode(this.dataNascimentoAlevino);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.pesoAlevino) ^ (Double.doubleToLongBits(this.pesoAlevino) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valorAlevino) ^ (Double.doubleToLongBits(this.valorAlevino) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.dataEntrada);
        hash = 37 * hash + Objects.hashCode(this.fornecedor);
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
        final Alevino other = (Alevino) obj;
        if (this.idEntradaAlevino != other.idEntradaAlevino) {
            return false;
        }
        if (this.qtdAlevino != other.qtdAlevino) {
            return false;
        }
        if (!Objects.equals(this.dataNascimentoAlevino, other.dataNascimentoAlevino)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pesoAlevino) != Double.doubleToLongBits(other.pesoAlevino)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorAlevino) != Double.doubleToLongBits(other.valorAlevino)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    }

    /**
     * @return the situacaoEntradaAlevino
     */
    public boolean isSituacaoEntradaAlevino() {
        return situacaoEntradaAlevino;
    }

    /**
     * @param situacaoEntradaAlevino the situacaoEntradaAlevino to set
     */
    public void setSituacaoEntradaAlevino(boolean situacaoEntradaAlevino) {
        this.situacaoEntradaAlevino = situacaoEntradaAlevino;
    }


}
