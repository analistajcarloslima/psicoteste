/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.cliente;

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
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private short idCliente;

    @Column(length = 150, nullable = false)
    private String nomeCliente;

    @Column(length = 150, nullable = false)
    private String cpfCliente;

    @Column(length = 20, nullable = false)
    private String contatoCliente;
    
    @Column(length = 100, nullable = false)
    private String enderecoCliente;
    
    @Column(length = 40, nullable = false)
    private String cidadeCliente;
    
    @Column(length = 30, nullable = false)
    private String cepCliente;
    
    @Column(length = 20, nullable = false)
    private String estadoCliente;

    /**
     * @return the idCliente
     */
    public short getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(short idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    /**
     * @return the contatoCliente
     */
    public String getContatoCliente() {
        return contatoCliente;
    }

    /**
     * @param contatoCliente the contatoCliente to set
     */
    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    /**
     * @return the enderecoCliente
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     * @param enderecoCliente the enderecoCliente to set
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     * @return the cidadeCliente
     */
    public String getCidadeCliente() {
        return cidadeCliente;
    }

    /**
     * @param cidadeCliente the cidadeCliente to set
     */
    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    /**
     * @return the cepCliente
     */
    public String getCepCliente() {
        return cepCliente;
    }

    /**
     * @param cepCliente the cepCliente to set
     */
    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    /**
     * @return the estadoCliente
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     * @param estadoCliente the estadoCliente to set
     */
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    
}
