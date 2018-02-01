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
import persistenciaInterf.ConsecutivoRepositorioInterf;

/**
 *
 * @author jhon.zuluaga
 */
public class ConsecutivoRepositorioImpl implements ConsecutivoRepositorioInterf {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public ModeloVentas consultarConsecutivoRepositorio(ModeloVentas ventas) {
        String query = "(select* from CONSECUTIVO LIMIT 1) order by consecutivo desc ";
        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement(query);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                ventas.getConsecutivo().setConsecutivo(rs.getInt("consecutivo")); 
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad solicitada del producto no está disponible");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return ventas;
    }

    @Override
    public void IncrementarConsecutivoRepositorio() {
        conexion = new conexion();
        String query = "insert into ventas (consecutivoFactura,codigo,cantidad,precioUnidad,precioTotalProducto) values (?,?,?,?,?)";
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement(query);
            int i = 1;
            
            //ps.setInt(i++, ventas.getConsecutivo().getConsecutivo());
            //ps.setString(i++, ventas.getCodigo());
            
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Venta Realizada");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
