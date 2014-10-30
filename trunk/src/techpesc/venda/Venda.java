/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.venda;

import groovy.lang.Lazy;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import techpesc.cliente.Cliente;
import techpesc.lote.Lote;
import techpesc.tanquerede.TanqueRede;

@Entity
@Table(name = "Venda")
public class Venda {

    @Id
    @GeneratedValue
    private short idVenda;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lote lote;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SELECT)
    private Cliente cliente;

    @Column(length = 20, nullable = false)
    private Date dataVenda;

    @Column(length = 500, nullable = false)
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name = "vendaTanqueRede",
            joinColumns
            = @JoinColumn(name = "idVenda"),
            inverseJoinColumns
            = @JoinColumn(name = "idTanqueRede"))
    private List<TanqueRede> tanquesVendidos;

    @Column(length = 50, nullable = false)
    private double valorVendaTanqueRede;

    /**
     * @return the idVenda
     */
    public short getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(short idVenda) {
        this.idVenda = idVenda;
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
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the tanquesVendidos
     */
    public List<TanqueRede> getTanquesVendidos() {
        return tanquesVendidos;
    }

    /**
     * @param tanquesVendidos the tanquesVendidos to set
     */
    public void setTanquesVendidos(List<TanqueRede> tanquesVendidos) {
        this.tanquesVendidos = tanquesVendidos;
    }

    /**
     * @return the valorVendaTanqueRede
     */
    public double getValorVendaTanqueRede() {
        return valorVendaTanqueRede;
    }

    /**
     * @param valorVendaTanqueRede the valorVendaTanqueRede to set
     */
    public void setValorVendaTanqueRede(double valorVendaTanqueRede) {
        this.valorVendaTanqueRede = valorVendaTanqueRede;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idVenda;
        hash = 97 * hash + Objects.hashCode(this.lote);
        hash = 97 * hash + Objects.hashCode(this.dataVenda);
        hash = 97 * hash + Objects.hashCode(this.tanquesVendidos);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valorVendaTanqueRede) ^ (Double.doubleToLongBits(this.valorVendaTanqueRede) >>> 32));
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
        final Venda other = (Venda) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        if (!Objects.equals(this.lote, other.lote)) {
            return false;
        }
        if (!Objects.equals(this.dataVenda, other.dataVenda)) {
            return false;
        }
        if (!Objects.equals(this.tanquesVendidos, other.tanquesVendidos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorVendaTanqueRede) != Double.doubleToLongBits(other.valorVendaTanqueRede)) {
            return false;
        }
        return true;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
