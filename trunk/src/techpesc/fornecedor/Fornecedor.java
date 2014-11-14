/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.fornecedor;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import techpesc.lote.Lote;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "Fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue
    private short idFornecedor;

    @Column(length = 150, nullable = false)
    private String nomeFornecedor;

    @Column(length = 18, nullable = true)
    private String cnpjFornecedor;
    
    @Column(length = 18, nullable = true)
    private String cpfFornecedor;

    @Column(length = 15, nullable = false)
    private String contatoFornecedor;

    /**
     * @return the idFornecedor
     */
    public short getIdFornecedor() {
        return idFornecedor;
    }

    /**
     * @param idFornecedor the idFornecedor to set
     */
    public void setIdFornecedor(short idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the cnpjFornecedor
     */
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    /**
     * @param cnpjFornecedor the cnpjFornecedor to set
     */
    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    /**
     * @return the contatoFornecedor
     */
    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    /**
     * @param contatoFornecedor the contatoFornecedor to set
     */
    public void setContatoFornecedor(String contatoFornecedor) {
        this.contatoFornecedor = contatoFornecedor;
    }

    /**
     * @return the cpfFornecedor
     */
    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    /**
     * @param cpfFornecedor the cpfFornecedor to set
     */
    public void setCpfFornecedor(String cpfFornecedor) {
        this.cpfFornecedor = cpfFornecedor;
    }

    

}
