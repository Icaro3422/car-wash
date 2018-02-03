package paneles;

import conexion.conexion;
import controladorImpl.VentasImpl;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.ModeloVentas;

/**
 *
 * @author pc
 */
public class panelVentas extends javax.swing.JPanel {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    TableRowSorter trs;
    private ModeloVentas ventas;
    private VentasImpl ventasImpl;

    DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 5;
        }
    };

    public panelVentas() {
        initComponents();

        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("proveedor");
        modelo.addColumn("cantidad");
        modelo.addColumn("precioVenta");

        tbResgistrosVentas.setModel(modelo);

        trs = new TableRowSorter(modelo);
        tbResgistrosVentas.setRowSorter(trs);
        txtManoObra.setText("0");
        txtImporte.setText("0");
        //mientras realizamos los descuentos mejores
        lbDescuento.setVisible(false);
        cbDescuento.setVisible(false);
        lbDescuentoTot.setVisible(false);
        lbRalla.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        txtManoObra = new javax.swing.JTextField();
        cbDescuento = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbDescuentoTot = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbRalla = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbSubTotal = new javax.swing.JLabel();
        lbManoObra = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        lbIva = new javax.swing.JLabel();
        lbCambio = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        btn_Devolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(97, 212, 195));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartera.png"))); // NOI18N
        jLabel1.setText("Ventas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 653, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 969, 238));

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
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 154, 49, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 120, -1));

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 115, 100, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 86, -1, -1));

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 100, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mano de obra");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 85, -1, -1));

        txtManoObra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtManoObra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtManoObraKeyTyped(evt);
            }
        });
        add(txtManoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 115, 127, 30));

        cbDescuento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "0%", "5%", "10%", "15%" }));
        add(cbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 114, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Subtotal ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 496, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Mano de obra");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 523, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setText("TOTAL");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 605, -1, -1));

        lbDescuentoTot.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbDescuentoTot.setText("Descuento");
        add(lbDescuentoTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 551, 92, -1));

        jLabel11.setText("----------------------------");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 498, 123, 19));

        lbRalla.setText("----------------------------");
        add(lbRalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 553, 122, 19));

        jLabel14.setText("----------------------------");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 525, -1, 19));

        lbSubTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(lbSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 496, 198, 21));

        lbManoObra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(lbManoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 523, 198, 21));

        lbDescuento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 551, 200, 21));

        lbIva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(lbIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 200, 21));

        lbCambio.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbCambio.setForeground(new java.awt.Color(255, 0, 0));
        lbCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCambio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbCambio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        add(lbCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 221, 39));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel17.setText("Cambio");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setText("Importe");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        txtImporte.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 220, 40));

        lbTotal.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 642, 221, 39));

        btn_Devolver.setBackground(new java.awt.Color(40, 48, 71));
        btn_Devolver.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Devolver.setForeground(new java.awt.Color(255, 255, 255));
        btn_Devolver.setText("Devolver");
        btn_Devolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Devolver.setIconTextGap(0);
        btn_Devolver.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btn_Devolver.setSelected(true);
        btn_Devolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DevolverMouseClicked(evt);
            }
        });
        add(btn_Devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ventasImpl = new VentasImpl();
        ventas = new ModeloVentas();
        if (txtClave.getText() != null) {
            ventas.setCodigo(txtClave.getText());
            ventas.setCantidad(Integer.parseInt(txtCantidad.getText()));
            if (ventasImpl.BuscarPorCodigo(ventas)) {
                agregarTabla(ventas);
                limpiarCajas();
            }
            else{
                limpiarCajas();
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtManoObraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManoObraKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtManoObraKeyTyped

    private void btn_DevolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DevolverMouseClicked
        cambio();
    }//GEN-LAST:event_btn_DevolverMouseClicked
    /*
    public void BuscarPorCodigo(String codigo, int cantidadPedido) {
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
                nombre = (rs.getString("nombre"));
                precioVenta = (rs.getInt("precioVenta"));
                actualizarInventario(codigo, cantidadPedido);
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad solicitada del producto no está disponible");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void insertFacturacion (int codigo, int cantidad, int precioVentaUnit, int precioTotal){
        conexion = new conexion();
        
    }
     
    public void actualizarInventario(String codigo, int cantidad) {
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("UPDATE inventario SET cantidad=cantidad-? WHERE codigo=?");
            ps.setInt(1, cantidad);
            ps.setString(2, codigo);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Venta Realizada");
                agregarTabla(ventas);
                limpiarCajas();
                subTotalVenta();
            } else {
                JOptionPane.showMessageDialog(null, "Error: El Inventario no ha podido ser modificado");
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     */
    private void agregarTabla(ModeloVentas ventas) {
        conexion = new conexion();
        Connection co = conexion.getConnection();
        String[] dato = new String[6];
        String query = "SELECT codigo,nombre,proveedor,cantidad,precioVenta FROM inventario WHERE codigo = ? and cantidad >= ?";
        try {
            ps = co.prepareStatement(query);
            int i = 1;
            ps.setString(i++, ventas.getCodigo());
            ps.setInt(i++, ventas.getCantidad());

            rs = ps.executeQuery();

            while (rs.next()) {

                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = String.valueOf(ventas.getCantidad());
                dato[4] = rs.getString(5);
                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void subTotalVenta() {
        DecimalFormat formato = new DecimalFormat("###,###");
        int subtotal = 0;

        for (int i = 0; i < tbResgistrosVentas.getRowCount(); i++) {

            subtotal = subtotal + (Integer.valueOf((String) modelo.getValueAt(i, 4)) * Integer.valueOf((String) modelo.getValueAt(i, 3)));

        }
        String manoObra = txtManoObra.getText();
        int total;


            total = subtotal + Integer.valueOf(manoObra);
            


        lbSubTotal.setText(String.valueOf(formato.format(subtotal)));

        lbManoObra.setText(formato.format(Integer.valueOf(manoObra)));
        lbTotal.setText(String.valueOf(formato.format(total)));


            lbManoObra.setText(formato.format(Integer.valueOf(manoObra)));
            
            /*por realizar descuento
            double descuento;
            switch(cbDescuento.getSelectedIndex()){
                case 1: descuento = total *0;
                lbDescuento.setText(String.valueOf(formato.format(descuento)));
                break;
                case 2: descuento = total * 0.05;
                lbDescuento.setText(String.valueOf(formato.format(descuento)));
                break;
                case 3: descuento = total * 0.10;
                lbDescuento.setText(String.valueOf(formato.format(descuento)));
                break;
                case 4: descuento = total * 0.15;
                lbDescuento.setText(String.valueOf(formato.format(descuento)));
                break;
                default: descuento=0;
                    lbDescuento.setText(String.valueOf(formato.format(descuento)));    
            }
                    */
            lbTotal.setText(String.valueOf(formato.format(total)));
            
            
                    
        

    }

    private void cambio() {
        DecimalFormat formato = new DecimalFormat("###,###");
        int importe = Integer.valueOf(txtImporte.getText());
        String total = lbTotal.getText();
        String cadenaA, cadenaB;
        String ultraTotal = "";
        for (int i = 0; i < total.length(); i++) {

            if (total.charAt(i) == '.') {
                cadenaA = total.substring(0, i);

                cadenaB = total.substring(i+1, total.length());
                
                ultraTotal = cadenaA+cadenaB;
            }  

        }
        System.out.println(ultraTotal);
        int cambio = importe - Integer.valueOf(ultraTotal);
        lbCambio.setText(String.valueOf(formato.format(cambio)));

    }

    private void limpiarCajas() {
        txtClave.setText(null);
        txtCantidad.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btn_Devolver;
    private javax.swing.JComboBox cbDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCambio;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbDescuentoTot;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbManoObra;
    private javax.swing.JLabel lbRalla;
    private javax.swing.JLabel lbSubTotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbResgistrosVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtManoObra;
    // End of variables declaration//GEN-END:variables
}
