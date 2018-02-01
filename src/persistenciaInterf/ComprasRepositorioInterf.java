/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaInterf;

import modelo.ModeloCompras;

/**
 *
 * @author jhon.zuluaga
 */
public interface ComprasRepositorioInterf {
    
    void IngresarCompra (ModeloCompras compras);
    
    void VerificarSiExisteElProducto (ModeloCompras compras);
    
    void insertarInventario (ModeloCompras compras);
    
    void ActualizarTablaInventarioSiExiste (ModeloCompras compras);
    
    ModeloCompras ConsultarCompra (ModeloCompras compras);
}
