package paneles;

import conexion.conexion;
import controladorImpl.ComprasImpl;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.ModeloCompras;

public class panelCompras extends javax.swing.JPanel {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    TableRowSorter trs;
    private ModeloCompras compras;
    private ComprasImpl comprasImpl;

    public panelCompras() {
        initComponents();
        calendario();
        agregarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResgistrosCompras = new javax.swing.JTable();
        btnBusqueda = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFiltroNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        cbSeleccionarBusqueda = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(97, 212, 195));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro-de-la-compra.png"))); // NOI18N
        jLabel1.setText("Compras");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 653, -1));

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
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 144, 49, -1));

        btnActualizar.setBackground(new java.awt.Color(97, 212, 195));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-actualizar.png"))); // NOI18N
        btnActualizar.setText("Update");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setOpaque(true);
        btnActualizar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnActualizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 144, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 120, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 108, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 79, 80, -1));

        txtProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 108, 100, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proveedor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 79, 100, -1));

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 108, 100, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 79, -1, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });
        add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 108, 160, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio de compra");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 79, 160, -1));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setEnabled(false);
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 108, 100, 30));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");
        add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 79, 101, -1));

        tbResgistrosCompras.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tbResgistrosCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Clave", "Nombre", "Proveedor", "Cantidad", "Precio de compra", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResgistrosCompras.setGridColor(new java.awt.Color(255, 255, 255));
        tbResgistrosCompras.setSelectionBackground(new java.awt.Color(36, 47, 65));
        tbResgistrosCompras.getTableHeader().setResizingAllowed(false);
        tbResgistrosCompras.getTableHeader().setReorderingAllowed(false);
        tbResgistrosCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResgistrosComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResgistrosCompras);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 969, 318));

        btnBusqueda.setBackground(new java.awt.Color(97, 212, 195));
        btnBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBusqueda.setText("Buscar");
        btnBusqueda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setOpaque(true);
        btnBusqueda.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBusqueda.setSelected(true);
        btnBusqueda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBusqueda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseExited(evt);
            }
        });
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 144, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(97, 212, 195));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setOpaque(true);
        btnEliminar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 144, 59, -1));

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 100, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtrar por:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 562, 120, -1));

        txtFiltroNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFiltroNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyTyped(evt);
            }
        });
        add(txtFiltroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 594, 164, 32));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de venta");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 149, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });
        add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 108, 139, 30));

        cbSeleccionarBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbSeleccionarBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "ID", "Codigo", "Nombre", "Proveedor", "Fecha" }));
        add(cbSeleccionarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 563, 164, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        comprasImpl = new ComprasImpl();
        compras = new ModeloCompras();
        if (txtClave.getText() != null) {
            
            compras.setCodigo(txtClave.getText());           
            compras.setNombre(txtNombre.getText());
            compras.setProveedor(txtProveedor.getText());
            compras.setCantidad(Integer.parseInt(txtCantidad.getText()));
            compras.setPrecioCompra(Integer.parseInt(txtPrecioCompra.getText()));
            compras.setPrecioVenta(Integer.parseInt(txtPrecioVenta.getText()));
            
            comprasImpl.IngresarCompras(compras);
            
            agregarTabla();
            limpiarCajas();
        } else {
            limpiarCajas();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT * FROM compras WHERE codigo=?");
            int i = 1;
            ps.setInt(i++, Integer.parseInt(txtClave.getText()));
            rs = ps.executeQuery();

            if (rs.next()) {
                txtClave.setText(rs.getString("codigo"));
                txtNombre.setText(rs.getString("nombre"));
                txtProveedor.setText(rs.getString("proveedor"));
                txtCantidad.setText(rs.getString("cantidad"));
                txtPrecioCompra.setText(rs.getString("precioCompra"));
                txtPrecioVenta.setText(rs.getString("precioVenta"));
                txtFecha.setText(rs.getString("fecha"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un registro con dicha clave");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("UPDATE compras SET nombre=?,proveedor=?,cantidad=?,precioCompra=?,precioVenta=? WHERE codigo=?");
            int i = 1;
            ps.setString(i++, txtNombre.getText());
            ps.setString(i++, txtProveedor.getText());
            ps.setInt(i++, Integer.parseInt(txtCantidad.getText()));
            ps.setInt(i++, Integer.parseInt(txtPrecioCompra.getText()));
            ps.setInt(i++, Integer.parseInt(txtPrecioVenta.getText()));
            ps.setInt(i++, Integer.parseInt(txtClave.getText()));

            int res = ps.executeUpdate();
            if (res > 0) {
                agregarTabla();
                JOptionPane.showMessageDialog(null, "Producto modificado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser modificado");
                limpiarCajas();
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            conexion = new conexion();
            try (Connection reg = conexion.getConnection()) {
                ps = reg.prepareStatement("DELETE FROM compras WHERE codigo=?");
                int i = 1;
                ps.setInt(i++, Integer.parseInt(txtClave.getText()));

                int res = ps.executeUpdate();
                if (res > 0) {
                    agregarTabla();
                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                    limpiarCajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser eliminado");
                    limpiarCajas();
                }
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbResgistrosComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResgistrosComprasMouseClicked

        int seleccion = tbResgistrosCompras.rowAtPoint(evt.getPoint());
        txtClave.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 1)));
        txtNombre.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 2)));
        txtProveedor.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 3)));
        txtCantidad.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 4)));
        txtPrecioCompra.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 5)));
        txtPrecioVenta.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 6)));
        txtFecha.setText(String.valueOf(tbResgistrosCompras.getValueAt(seleccion, 7)));
    }//GEN-LAST:event_tbResgistrosComprasMouseClicked


    private void txtFiltroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyTyped
        agregarTabla();
    }//GEN-LAST:event_txtFiltroNombreKeyTyped

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseEntered
        btnBusqueda.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnBusquedaMouseEntered

    private void btnBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseExited
        btnBusqueda.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnBusquedaMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(36, 47, 65));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(97, 212, 195));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void limpiarCajas() {
        txtCantidad.setText(null);
        txtClave.setText(null);
        txtNombre.setText(null);
        txtPrecioCompra.setText(null);
        txtProveedor.setText(null);
        txtPrecioVenta.setText(null);
    }

    private void calendario() {
        Calendar calendario = new GregorianCalendar();
        String dia = Integer.toString(calendario.get(Calendar.DATE));
        String mes = Integer.toString(1);
        String annio = Integer.toString(calendario.get(Calendar.YEAR));
        txtFecha.setText(annio + "-" + mes + "-" + dia);
    }

    private void agregarTabla() {
        conexion = new conexion();
        Connection co = conexion.getConnection();

        String sql = "SELECT * FROM compras";
        Statement st;
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 8;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("proveedor");
        modelo.addColumn("cantidad");
        modelo.addColumn("precioCompra");
        modelo.addColumn("precioVenta");
        modelo.addColumn("fecha");

        tbResgistrosCompras.setModel(modelo);

        //Agregar filtro
        txtFiltroNombre.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                int filtro = 0;
                if (cbSeleccionarBusqueda.getSelectedIndex() > 0) {
                    switch (cbSeleccionarBusqueda.getSelectedIndex()) {
                        case 1:
                            filtro = 0;
                            break;
                        case 2:
                            filtro = 1;
                            break;
                        case 3:
                            filtro = 2;
                            break;
                        case 4:
                            filtro = 3;
                            break;
                        case 5:
                            filtro = 7;
                            break;
                        default:
                            filtro = 1;
                    }
                    trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltroNombre.getText(), filtro));
                }
            }
        });

        trs = new TableRowSorter(modelo);
        tbResgistrosCompras.setRowSorter(trs);
        /////////

        String[] dato = new String[8];

        try {
            st = co.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {

                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox cbSeleccionarBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTable tbResgistrosCompras;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFiltroNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
