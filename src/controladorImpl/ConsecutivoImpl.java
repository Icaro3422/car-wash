/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorImpl;

import controladorInterf.ConsecutivoControladorInterf;
import modelo.ModeloVentas;
import presistenciaImpl.ConsecutivoRepositorioImpl;

/**
 *
 * @author jhon.zuluaga
 */
public class ConsecutivoImpl implements ConsecutivoControladorInterf {

    private ConsecutivoRepositorioImpl consecutivoRepositorioImpl;
    
    @Override
    public ModeloVentas consultarConsecutivo(ModeloVentas ventas) {
        consecutivoRepositorioImpl.consultarConsecutivoRepositorio(ventas);
        return ventas;
    }

    @Override
    public void IncrementarConsecutivo() {
        consecutivoRepositorioImpl.IncrementarConsecutivoRepositorio();
    }
    
}
