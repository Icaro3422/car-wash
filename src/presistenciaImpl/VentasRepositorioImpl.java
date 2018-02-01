/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presistenciaImpl;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloVentas;
import persistenciaInterf.VentasRepositorioInterf;

/**
 *
 * @author jhon.zuluaga
 */
public class VentasRepositorioImpl implements VentasRepositorioInterf{
    
    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public ModeloVentas BuscarPorCodigoRepositorio(ModeloVentas ventas) {
        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT codigo,nombre,proveedor,cantidad,precioVenta FROM inventario WHERE codigo=? and cantidad >= ?");
            int i = 1;
            ps.setString(i++, ventas.getCodigo());
            ps.setInt(i++, ventas.getCantidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                ventas.setPrecioUnidad(rs.getInt("precioVenta"));
                ventas.setNombre(rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad solicitada del producto no está disponible");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return ventas;
    }

    @Override
    public boolean actualizarInventarioRepositorio (ModeloVentas ventas) {
        conexion = new conexion();
        boolean respuesta = false;
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("UPDATE inventario SET cantidad=cantidad-? WHERE codigo=?");
            ps.setInt(1, ventas.getCantidad());
            ps.setString(2, ventas.getCodigo());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Venta Realizada");
                respuesta = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error: El Inventario no ha podido ser modificado");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return respuesta;
    }

    @Override
    public void IngresarVentasRepositorio(ModeloVentas ventas) {
        conexion = new conexion();
        String query = "insert into ventas (consecutivoFactura,codigo,cantidad,precioUnidad,precioTotalProducto) values (?,?,?,?,?)";
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement(query);
            int i = 1;
            ps.setInt(i++, ventas.getConsecutivo().getConsecutivo());
            ps.setString(i++, ventas.getCodigo());
            ps.setInt(i++, ventas.getCantidad());
            ps.setInt(i++, ventas.getPrecioUnidad());
            ps.setInt(i++, ventas.getCantidad()*ventas.getPrecioUnidad());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Venta Realizada");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
}
