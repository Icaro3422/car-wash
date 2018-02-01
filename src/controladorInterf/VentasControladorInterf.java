/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorInterf;

import modelo.ModeloVentas;

/**
 *
 * @author jhon.zuluaga
 */
public interface VentasControladorInterf {
    
    boolean BuscarPorCodigo (ModeloVentas ventas);
    
    void IngresarVentas (ModeloVentas ventas);
}
