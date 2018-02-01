/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jhon.zuluaga
 */
public class ModeloVentas {
    
    public ModeloVentas(){
        this.consecutivo = new ModeloConsecutivo();
    }
    
    private int consecutivoFactura;
    private String codigo;
    private int cantidad;
    private int precioUnidad;
    private int precioTotalProducto;
    private String nombre;
    private ModeloConsecutivo consecutivo;

    public int getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public void setConsecutivoFactura(int consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getPrecioTotalProducto() {
        return precioTotalProducto;
    }

    public void setPrecioTotalProducto(int precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ModeloConsecutivo getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(ModeloConsecutivo consecutivo) {
        this.consecutivo = consecutivo;
    }
}
