/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorImpl;

import controladorInterf.VentasControladorInterf;
import javax.swing.JOptionPane;
import modelo.ModeloVentas;
import presistenciaImpl.VentasRepositorioImpl;

/**
 *
 * @author jhon.zuluaga
 */
public class VentasImpl implements VentasControladorInterf {

    private VentasRepositorioImpl ventasRepositorioImpl;
    private ConsecutivoImpl consecutivoImpl;

    @Override
    public boolean BuscarPorCodigo(ModeloVentas ventas) {
        ventasRepositorioImpl = new VentasRepositorioImpl();
        boolean respuesta = false;
        if (ventas.getCantidad() > 0) {
            ventasRepositorioImpl.BuscarPorCodigoRepositorio(ventas);
            if (ActualizarInventario(ventas)) {
                respuesta = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "La cantidad solicitada del producto no está disponible");
            }
        }
        return respuesta;
    }
    
    @Override
    public boolean ActualizarInventario(ModeloVentas ventas){
        boolean respuesta = false;
        if (ventas.getCantidad() > 0){
            ventasRepositorioImpl.actualizarInventarioRepositorio(ventas);
            IngresarVentas(ventas);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public void IngresarVentas(ModeloVentas ventas) {
        consecutivoImpl = new ConsecutivoImpl();
        if (ventas != null) {
            ventasRepositorioImpl.IngresarVentasRepositorio(ventas);
        }
    }

}
