/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.estoque.medicamento;




public class MedicamentoRN {

    MedicamentoDAO dao = new MedicamentoDAO();

    public Medicamento pesquisarCodigo(short codigo) {
        return dao.pesquisarCodigo(codigo);
    }

    public boolean remove(Medicamento medicamento) {
        return dao.remover(medicamento);

    }

}
