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
import modelo.ModeloCompras;
import persistenciaInterf.ComprasRepositorioInterf;

/**
 *
 * @author jhon.zuluaga
 */
public class ComprasRepositorioImpl implements ComprasRepositorioInterf {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void IngresarCompra(ModeloCompras compras) {
        conexion = new conexion();
        String query = "INSERT INTO compras (codigo,nombre,proveedor,cantidad,precioCompra,precioVenta,fecha) VALUES(?,?,?,?,?,?,now())";
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement(query);
            int i = 1;
            ps.setString(i++, compras.getCodigo());
            ps.setString(i++, compras.getNombre());
            ps.setString(i++, compras.getProveedor());
            ps.setInt(i++, compras.getCantidad());
            ps.setInt(i++, compras.getPrecioCompra());
            ps.setInt(i++, compras.getPrecioVenta());

            int res = ps.executeUpdate();
            if (res > 0) {
                VerificarSiExisteElProducto(compras);
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @Override
    public ModeloCompras ConsultarCompra (ModeloCompras compras){
        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT * FROM compras WHERE codigo=?");
            int i = 1;
            ps.setString(i++, compras.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                compras.setCodigo(rs.getString("codigo"));
                compras.setNombre(rs.getString("nombre"));
                compras.setProveedor(rs.getString("proveedor"));
                compras.setCantidad(rs.getInt("cantidad"));
                compras.setPrecioCompra(rs.getInt("precioCompra"));
                compras.setPrecioVenta(rs.getInt("precioVenta"));
                compras.setFechaString(rs.getString("fecha"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un registro con dicha clave");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return compras;
    }

    @Override
    public void VerificarSiExisteElProducto(ModeloCompras compras) {
        conexion = new conexion();
        String query = "Select * from inventario where codigo = ?";
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement(query);
            int i = 1;
            ps.setString(i++, compras.getCodigo());
            boolean res = ps.execute();
            if (res) {
                insertarInventario(compras);
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void insertarInventario(ModeloCompras compras) {
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("INSERT INTO inventario (codigo,nombre,proveedor,cantidad,precioVenta,fecha) VALUES(?,?,?,?,?,now())");
            int i = 1;
            ps.setString(i++, compras.getCodigo());
            ps.setString(i++, compras.getNombre());
            ps.setString(i++, compras.getProveedor());
            ps.setInt(i++, compras.getCantidad());
            ps.setInt(i++, compras.getPrecioVenta());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser guardado");

            }
        } catch (SQLException | NumberFormatException e) {
            ActualizarTablaInventarioSiExiste(compras);
        }
    }

    @Override
    public void ActualizarTablaInventarioSiExiste(ModeloCompras compras) {
        conexion = new conexion();
        String query = "UPDATE inventario SET nombre=?,proveedor=?,cantidad=?+cantidad,precioVenta=? WHERE codigo=?";
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement(query);
            int i = 1;
            ps.setString(i++, compras.getNombre());
            ps.setString(i++, compras.getProveedor());
            ps.setInt(i++, compras.getCantidad());
            ps.setInt(i++, compras.getPrecioVenta());
            ps.setString(i++, compras.getCodigo());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Inventario modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Error: El Inventario no ha podido ser modificado");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
