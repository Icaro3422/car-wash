/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorImpl;

import controladorInterf.VentasControladorInterf;
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
        }
        if (ventasRepositorioImpl.actualizarInventarioRepositorio(ventas)) {
            respuesta = true;
            IngresarVentas(ventas);
        }
        return respuesta;
    }

    @Override
    public void IngresarVentas(ModeloVentas ventas) {
        consecutivoImpl = new ConsecutivoImpl();
        if(ventas != null){
            consecutivoImpl.consultarConsecutivo(ventas);
            ventasRepositorioImpl.IngresarVentasRepositorio(ventas);
        }
    }

}
