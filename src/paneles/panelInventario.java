
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
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class panelInventario extends javax.swing.JPanel {

     conexion conexion;
     PreparedStatement ps;
     ResultSet rs;
     TableRowSorter trs;
     
    
    public panelInventario() {
        initComponents();
        calendario();
        agregarTabla(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistros = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFiltroNombre = new javax.swing.JTextField();
        cbSeleccionarBusqueda = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(97, 212, 195));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1012, 674));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-portapapeles-comprobado.png"))); // NOI18N
        jLabel1.setText("Inventario");

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtPrecioCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proveedor");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio de compra");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha");

        btnBusqueda.setBackground(new java.awt.Color(97, 212, 195));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBusqueda.setText("Buscar");
        btnBusqueda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setOpaque(true);
        btnBusqueda.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBusqueda.setSelected(true);
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

        btnActualizar.setBackground(new java.awt.Color(97, 212, 195));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-actualizar.png"))); // NOI18N
        btnActualizar.setText("Update");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setOpaque(true);
        btnActualizar.setPreferredSize(new java.awt.Dimension(50, 50));
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

        tbRegistros.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tbRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        tbRegistros.setSelectionBackground(new java.awt.Color(36, 47, 65));
        tbRegistros.getTableHeader().setResizingAllowed(false);
        tbRegistros.getTableHeader().setReorderingAllowed(false);
        tbRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRegistros);

        btnEliminar.setBackground(new java.awt.Color(97, 212, 195));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setOpaque(true);
        btnEliminar.setPreferredSize(new java.awt.Dimension(50, 50));
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

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de venta");

        txtPrecioVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Filtrar por:");

        txtFiltroNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyTyped(evt);
            }
        });

        cbSeleccionarBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbSeleccionarBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Codigo", "Nombre", "Proveedor", "Fecha" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFiltroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(cbSeleccionarBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbSeleccionarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseEntered
     btnBusqueda.setBackground(new Color(36,47,65));
    }//GEN-LAST:event_btnBusquedaMouseEntered

    private void btnBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseExited
        btnBusqueda.setBackground(new Color(97,212,195));
    }//GEN-LAST:event_btnBusquedaMouseExited

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conexion = new conexion();
            try (Connection reg = conexion.getConnection()) {
                ps = reg.prepareStatement("UPDATE inventario SET nombre=?,proveedor=?,cantidad=?,precioCompra=? WHERE codigo=?");
                
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtProveedor.getText());
                ps.setInt(3, Integer.parseInt(txtCantidad.getText()));
                ps.setInt(4, Integer.parseInt(txtPrecioCompra.getText()));
                ps.setInt(5, Integer.parseInt(txtCodigo.getText()));

                int res = ps.executeUpdate();
                if (res > 0) {
                    
                    agregarTabla();
                    JOptionPane.showMessageDialog(null, "Producto modificado");
                    limpiarCajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El producto no ha podido ser modificado");
                    limpiarCajas();
                }
            }

        } catch (SQLException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null,"La conexión no se ha podido establecer con la base de datos");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(36,47,65));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(97,212,195));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        try {
           
            conexion = new conexion();
            Connection co = conexion.getConnection();
            ps = co.prepareStatement("SELECT * FROM inventario WHERE codigo=?");
            ps.setInt(1, Integer.parseInt(txtCodigo.getText()));
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtCodigo.setText(rs.getString("codigo"));
                txtNombre.setText(rs.getString("nombre"));
                txtProveedor.setText(rs.getString("proveedor"));
                txtCantidad.setText(rs.getString("cantidad"));
                txtPrecioCompra.setText(rs.getString("precioCompra"));
                txtPrecioVenta.setText(rs.getString("precioVenta"));
                txtFecha.setText(rs.getString("fecha"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe un registro con dicha clave");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"La conexión no se ha podido establecer con la base de datos");
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(36,47,65));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(97,212,195));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            conexion = new conexion();
            try (Connection reg = conexion.getConnection()) {
                ps = reg.prepareStatement("DELETE FROM inventario WHERE codigo=?");
                ps.setInt(1, Integer.parseInt(txtCodigo.getText()));

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

            JOptionPane.showMessageDialog(null,"La conexión no se ha podido establecer con la base de datos");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegistrosMouseClicked
        int seleccion = tbRegistros.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbRegistros.getValueAt(seleccion,0)));
        txtNombre.setText(String.valueOf(tbRegistros.getValueAt(seleccion,1)));
        txtProveedor.setText(String.valueOf(tbRegistros.getValueAt(seleccion,2)));
        txtCantidad.setText(String.valueOf(tbRegistros.getValueAt(seleccion,3)));
        txtPrecioCompra.setText(String.valueOf(tbRegistros.getValueAt(seleccion,4)));
        txtPrecioVenta.setText(String.valueOf(tbRegistros.getValueAt(seleccion,5)));
        txtFecha.setText(String.valueOf(tbRegistros.getValueAt(seleccion,6)));
    }//GEN-LAST:event_tbRegistrosMouseClicked

    private void txtFiltroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyTyped
        agregarTabla();  
    }//GEN-LAST:event_txtFiltroNombreKeyTyped

    
    
   private void agregarTabla(){
    
        conexion = new conexion();
        Connection co = conexion.getConnection();
   
        String sql = "SELECT * FROM inventario";
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 7; 
            }
        };
        
        
        
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("proveedor");
        modelo.addColumn("cantidad");
        modelo.addColumn("precioCompra");
        modelo.addColumn("precioVenta");
        modelo.addColumn("fecha");
        
        tbRegistros.setModel(modelo);
        txtFiltroNombre.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyReleased(KeyEvent ke){
                int filtro=0;
                
                if(cbSeleccionarBusqueda.getSelectedIndex()>0){
                    
                    switch(cbSeleccionarBusqueda.getSelectedIndex()){
                        case 1: filtro = 0; break;
                        case 2: filtro = 1; break;
                        case 3: filtro = 2; break;
                        case 4: filtro = 6; break;
                        default: filtro =1;
                    }
                    trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltroNombre.getText(), filtro));
                }
                
                
            }
        });
        
        
            
        trs = new TableRowSorter(modelo);
        tbRegistros.setRowSorter(trs);
  
        String[] dato = new String[7];
        
        try {
            st = co.createStatement();
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);
                modelo.addRow(dato);
             }
            
        } catch (SQLException ex) {
            System.out.println(ex);
            
        }
        
        
    }
    
    private void limpiarCajas() {

        txtCantidad.setText(null);
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtPrecioCompra.setText(null);
        txtProveedor.setText(null);
        
    }
    
      private void calendario(){
        
        Calendar calendario = new GregorianCalendar();
        String dia = Integer.toString(calendario.get(Calendar.DATE));
        String mes = Integer.toString(1);
        String annio = Integer.toString(calendario.get(Calendar.YEAR));
        txtFecha.setText(annio+"-"+ mes +"-"+dia);
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbRegistros;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFiltroNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
