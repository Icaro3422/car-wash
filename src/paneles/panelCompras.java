package paneles;

import conexion.conexion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
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

public class panelCompras extends javax.swing.JPanel {

    conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    TableRowSorter trs;

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro-de-la-compra.png"))); // NOI18N
        jLabel1.setText("Compras");

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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        txtProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proveedor");

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        txtPrecioCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio de compra");

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setEnabled(false);

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");

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

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtrar por:");

        txtFiltroNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFiltroNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de venta");

        txtPrecioVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });

        cbSeleccionarBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbSeleccionarBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "ID", "Codigo", "Nombre", "Proveedor", "Fecha" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFiltroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(cbSeleccionarBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lblFecha)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSeleccionarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            if (txtClave.getText() != null) {
                ps = reg.prepareStatement("INSERT INTO compras (codigo,nombre,proveedor,cantidad,precioCompra,precioVenta,fecha) VALUES(?,?,?,?,?,?,?)");
                int i = 1;
                ps.setInt(i++, Integer.parseInt(txtClave.getText()));
                ps.setString(i++, txtNombre.getText());
                ps.setString(i++, txtProveedor.getText());
                ps.setInt(i++, Integer.parseInt(txtCantidad.getText()));
                ps.setInt(i++, Integer.parseInt(txtPrecioCompra.getText()));
                ps.setInt(i++, Integer.parseInt(txtPrecioVenta.getText()));
                ps.setDate(i++, Date.valueOf(txtFecha.getText()));

                int res = ps.executeUpdate();
                if (res > 0) {
                    VerificarSiExisteElProducto(Integer.parseInt(txtClave.getText()), txtNombre.getText(), txtProveedor.getText(), Integer.parseInt(txtCantidad.getText()), Integer.parseInt(txtPrecioCompra.getText()), Integer.parseInt(txtPrecioVenta.getText()));
                    agregarTabla();
                    limpiarCajas();

                } else {
                    JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser guardado");
                    limpiarCajas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar campos necesarios");
            }

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed

        try {
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT * FROM compras WHERE codigo=?");
            ps.setInt(1, Integer.parseInt(txtClave.getText()));
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

            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtProveedor.getText());
            ps.setInt(3, Integer.parseInt(txtCantidad.getText()));
            ps.setInt(4, Integer.parseInt(txtPrecioCompra.getText()));
            ps.setInt(5, Integer.parseInt(txtPrecioVenta.getText()));
            ps.setInt(6, Integer.parseInt(txtClave.getText()));

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
                ps.setInt(1, Integer.parseInt(txtClave.getText()));

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

    public void VerificarSiExisteElProducto(int identificadot, String nombre, String proveedor, int canidad, int precioCompra, int precioVenta) {
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("Select * from inventario where codigo = ?");
            ps.setInt(1, identificadot);
            boolean res = ps.execute();
            if (res) {
                insertarInventario(identificadot, nombre, proveedor, canidad, precioCompra, precioVenta);
            }

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, identificadot);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insertarInventario(int identificadot, String nombre, String proveedor, int canidad, int precioCompra, int precioVenta) {
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {

            ps = reg.prepareStatement("INSERT INTO inventario (codigo,nombre,proveedor,cantidad,precioCompra,precioVenta,fecha) VALUES(?,?,?,?,?,?,now())");
            int i = 1;
            ps.setInt(i++, identificadot);
            ps.setString(i++, nombre);
            ps.setString(i++, proveedor);
            ps.setInt(i++, canidad);
            ps.setInt(i++, precioCompra);
            ps.setInt(i++, precioVenta);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser guardado");
                limpiarCajas();
            }
        } catch (SQLException | NumberFormatException e) {
            ActualizarTablaInventarioSiExiste(identificadot, nombre, proveedor, canidad, precioCompra, precioVenta);
        }
    }

    public void ActualizarTablaInventarioSiExiste(int identificadot, String nombre, String proveedor, int canidad, int precioCompra, int precioVenta) {
        conexion = new conexion();
        try (Connection reg = conexion.getConnection()) {
            ps = reg.prepareStatement("UPDATE inventario SET nombre=?,proveedor=?,cantidad=?+cantidad,precioCompra=?,precioVenta=? WHERE codigo=?");

            ps.setString(1, nombre);
            ps.setString(2, proveedor);
            ps.setInt(3, canidad);
            ps.setInt(4, precioCompra);
            ps.setInt(5, precioVenta);
            ps.setInt(6, identificadot);

            int res = ps.executeUpdate();
            if (res > 0) {
                agregarTabla();
                JOptionPane.showMessageDialog(null, "Inventario modificado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error: El Inventario no ha podido ser modificado");
                limpiarCajas();
            }
        } catch (SQLException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, e);
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
