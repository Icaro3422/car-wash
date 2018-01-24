package paneles;

import conexion.conexion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class panelVentas extends javax.swing.JPanel {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    TableRowSorter trs;

    public panelVentas() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResgistrosVentas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();

        setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartera.png"))); // NOI18N
        jLabel1.setText("Ventas");

        tbResgistrosVentas.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tbResgistrosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbResgistrosVentas.setGridColor(new java.awt.Color(255, 255, 255));
        tbResgistrosVentas.setSelectionBackground(new java.awt.Color(36, 47, 65));
        tbResgistrosVentas.getTableHeader().setResizingAllowed(false);
        tbResgistrosVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbResgistrosVentas);

        btnAgregar.setBackground(new java.awt.Color(97, 212, 195));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-nuevo-documento.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setName(""); // NOI18N
        btnAgregar.setOpaque(true);
        btnAgregar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAgregar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String codigo = txtClave.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        BuscarPorCodigo(codigo, cantidad);       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveKeyTyped
    
    public void BuscarPorCodigo (String codigo, int cantidadPedido){
       String nombre = "";
       int precioVenta = 0;
        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT codigo,nombre,proveedor,cantidad,precioVenta FROM inventario WHERE codigo=? and cantidad >= ?");
            ps.setString(1, codigo);
            ps.setInt(2, cantidadPedido);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombre  = (rs.getString("nombre"));
                precioVenta = (rs.getInt("precioVenta"));
                actualizarInventario(codigo, cantidadPedido);
            } else {  
                JOptionPane.showMessageDialog(null, "La cantidad solicitada del producto no está disponible");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    //public void insertFacturacion (int codigo, int cantidad, int precioVentaUnit, int precioTotal){}
    
    public void actualizarInventario (String codigo,int cantidad){
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("UPDATE inventario SET cantidad=cantidad-? WHERE codigo=?");
            ps.setInt(1, cantidad);
            ps.setString(2, codigo);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Venta Realizada");
                agregarTabla(codigo,cantidad);
            } else {
                JOptionPane.showMessageDialog(null, "Error: El Inventario no ha podido ser modificado");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void agregarTabla(String codigo,int cantidad) {
        conexion = new conexion();
        Connection co = conexion.getConnection();
        //String sql = "SELECT codigo,nombre,proveedor,cantidad,precioVenta FROM inventario WHERE codigo = ? and cantidad >= ?";
        //Statement st;
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5;
            }
        };

        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("proveedor");
        modelo.addColumn("cantidad");
        modelo.addColumn("precioVenta");
        
        tbResgistrosVentas.setModel(modelo);
        //////
        trs = new TableRowSorter(modelo);
        tbResgistrosVentas.setRowSorter(trs);

        String[] dato = new String[6];

        try {
            ps = co.prepareStatement("SELECT codigo,nombre,proveedor,cantidad,precioVenta FROM inventario WHERE codigo = ? and cantidad >= ?");
            ps.setString(1, codigo);
            ps.setInt(2, cantidad);
            //ResultSet result = st.executeQuery(sql);
              rs = ps.executeQuery();
            
            while (rs.next()) {

                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = String.valueOf(cantidad);
                dato[4] = rs.getString(5);
                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
           System.out.println(ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbResgistrosVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
