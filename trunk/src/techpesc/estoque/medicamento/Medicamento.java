/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.medicamento;

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
import techpesc.estoque.Estoque;
import techpesc.fornecedor.Fornecedor;

@Entity
@Table(name = "Medicamento")
public class Medicamento extends Estoque {


    @Column(length = 15, nullable = false)
    private String tipoMedicamento;

    /**
     * @return the tipoMedicamento
     */
    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    /**
     * @param tipoMedicamento the tipoMedicamento to set
     */
    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }


}
