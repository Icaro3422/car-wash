/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorInterf;

import modelo.ModeloCompras;

/**
 *
 * @author jhon.zuluaga
 */
public interface ComprasControladorInterf {
    
    void IngresarCompras (ModeloCompras compras);
    
    ModeloCompras ConsultarCompra (ModeloCompras compras);
}
