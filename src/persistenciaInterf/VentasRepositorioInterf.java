/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaInterf;

import modelo.ModeloVentas;

/**
 *
 * @author jhon.zuluaga
 */
public interface VentasRepositorioInterf {
    
    ModeloVentas BuscarPorCodigoRepositorio(ModeloVentas ventas);
    
    void actualizarInventarioRepositorio (ModeloVentas ventas);
    
    void IngresarVentasRepositorio (ModeloVentas ventas);
}
