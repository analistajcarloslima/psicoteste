/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import techpesc.fornecedor.Fornecedor;

/**
 *
 * @author PC
 */
@MappedSuperclass
@DiscriminatorValue("estoque")
public abstract class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private short idEstoque;

    @Column(length = 8, nullable = false)
    private int qtdEstoque;
    
    @Column(length = 20, nullable = false)
    private String tipoProduto;

    @Temporal(TemporalType.DATE)
    @Column(length = 20, nullable = true)
    private Date dataValidade;

    @Column(length = 8, nullable = false)
    private double valorCompra;

    @Temporal(TemporalType.DATE)
    @Column(length = 20, nullable = false)
    private Date dataEntrada;
    
    @Column(length = 200, nullable = true)
    private String descricaoOutros;

    @OneToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedor;

    /**
     * @return the idEstoque
     */
    public short getIdEstoque() {
        return idEstoque;
    }

    /**
     * @param idEstoque the idEstoque to set
     */
    public void setIdEstoque(short idEstoque) {
        this.idEstoque = idEstoque;
    }

    /**
     * @return the qtdEstoque
     */
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    /**
     * @param qtdEstoque the qtdEstoque to set
     */
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the dataValidade
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the valorCompra
     */
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
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
     * @return the descricaoOutros
     */
    public String getDescricaoOutros() {
        return descricaoOutros;
    }

    /**
     * @param descricaoOutros the descricaoOutros to set
     */
    public void setDescricaoOutros(String descricaoOutros) {
        this.descricaoOutros = descricaoOutros;
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
        hash = 97 * hash + this.idEstoque;
        hash = 97 * hash + this.qtdEstoque;
        hash = 97 * hash + Objects.hashCode(this.tipoProduto);
        hash = 97 * hash + Objects.hashCode(this.dataValidade);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valorCompra) ^ (Double.doubleToLongBits(this.valorCompra) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.dataEntrada);
        hash = 97 * hash + Objects.hashCode(this.descricaoOutros);
        hash = 97 * hash + Objects.hashCode(this.fornecedor);
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
        final Estoque other = (Estoque) obj;
        if (this.idEstoque != other.idEstoque) {
            return false;
        }
        if (this.qtdEstoque != other.qtdEstoque) {
            return false;
        }
        if (!Objects.equals(this.tipoProduto, other.tipoProduto)) {
            return false;
        }
        if (!Objects.equals(this.dataValidade, other.dataValidade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorCompra) != Double.doubleToLongBits(other.valorCompra)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.descricaoOutros, other.descricaoOutros)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    }
    
   

}
