/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorImpl;

import modelo.ModeloCompras;
import controladorInterf.ComprasControladorInterf;
import javax.swing.JOptionPane;
import presistenciaImpl.ComprasPersistenciaImpl;

/**
 *
 * @author jhon.zuluaga
 */
public class ComprasImpl implements ComprasControladorInterf {

    private ComprasPersistenciaImpl comprasPersistenciaImpl;

    @Override
    public void IngresarCompras(ModeloCompras compras) {
        comprasPersistenciaImpl = new ComprasPersistenciaImpl();
        if (compras.getCodigo() != null && compras.getCantidad() > 0
                && compras.getPrecioCompra() > 0 && compras.getPrecioVenta() > 0) {
            comprasPersistenciaImpl.IngresarCompra(compras);
        } else {
            JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser guardado");
        }
    }
    
    @Override 
    public ModeloCompras ConsultarCompra (ModeloCompras compras){
        if(compras.getCodigo() != null){
            comprasPersistenciaImpl.ConsultarCompra(compras);
        }else{
            JOptionPane.showMessageDialog(null, "Error: Debe escoger un producto");
        }
        return compras;
    }
}
