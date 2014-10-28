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

    @Column(length = 18, nullable = false)
    private String cnpjFornecedor;

    @Column(length = 15, nullable = false)
    private String contatoFornecedor;

    @Column(length = 20, nullable = false)
    private String produtoFornecedor;
    

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

    /**
     * @param cnpjFornecedor the cnpjFornecedor to set
     */
    public void setCnpjFornecedor(double cnpjFornecedor) {
        this.setCnpjFornecedor(cnpjFornecedor);
    }

    /**
     * @return the contatoFornecedor
     */


    /**
     * @param produtoFornecedor the produtoFornecedor to set
     */
    public void setProdutoFornecedor(String produtoFornecedor) {
        this.produtoFornecedor = produtoFornecedor;
    }

    /**
     * @return the produtoFornecedor
     */
    public String getProdutoFornecedor() {
        return produtoFornecedor;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.idFornecedor;
        hash = 47 * hash + Objects.hashCode(this.nomeFornecedor);
        hash = 47 * hash + Objects.hashCode(this.cnpjFornecedor);
        hash = 47 * hash + Objects.hashCode(this.contatoFornecedor);
        hash = 47 * hash + Objects.hashCode(this.produtoFornecedor);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.idFornecedor != other.idFornecedor) {
            return false;
        }
        if (!Objects.equals(this.nomeFornecedor, other.nomeFornecedor)) {
            return false;
        }
        if (!Objects.equals(this.cnpjFornecedor, other.cnpjFornecedor)) {
            return false;
        }
        if (!Objects.equals(this.contatoFornecedor, other.contatoFornecedor)) {
            return false;
        }
        if (!Objects.equals(this.produtoFornecedor, other.produtoFornecedor)) {
            return false;
        }
        return true;
    }
    
    

}
