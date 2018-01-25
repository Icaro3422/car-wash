
package home;


import paneles.panelVentas;
import paneles.panelProveedor;
import paneles.panelInventario;
import paneles.panelHome;
import paneles.panelCompras;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import principal.principal;




public class home extends javax.swing.JFrame {

    
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        btn_home.setVisible(false);
        btn_proveedores.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_compras = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_invetario = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_proveedores = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Auto estéreo la 47");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        btn_compras.setBackground(new java.awt.Color(40, 48, 71));
        btn_compras.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_compras.setForeground(new java.awt.Color(255, 255, 255));
        btn_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro-de-la-compra.png"))); // NOI18N
        btn_compras.setText("Compras");
        btn_compras.setIconTextGap(15);
        btn_compras.setMargin(new java.awt.Insets(2, 0, 2, 30));
        btn_compras.setOpaque(false);
        btn_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprasActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(40, 48, 71));
        btn_home.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa-en-esquema (1).png"))); // NOI18N
        btn_home.setText("HOME");
        btn_home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_home.setIconTextGap(15);
        btn_home.setMargin(new java.awt.Insets(2, 0, 2, 50));
        btn_home.setSelected(true);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_invetario.setBackground(new java.awt.Color(40, 48, 71));
        btn_invetario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_invetario.setForeground(new java.awt.Color(255, 255, 255));
        btn_invetario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-portapapeles-comprobado.png"))); // NOI18N
        btn_invetario.setText("Inventario");
        btn_invetario.setIconTextGap(15);
        btn_invetario.setMargin(new java.awt.Insets(2, 0, 2, 20));
        btn_invetario.setOpaque(false);
        btn_invetario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invetarioActionPerformed(evt);
            }
        });

        btn_ventas.setBackground(new java.awt.Color(40, 48, 71));
        btn_ventas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartera.png"))); // NOI18N
        btn_ventas.setText("Ventas");
        btn_ventas.setIconTextGap(15);
        btn_ventas.setMargin(new java.awt.Insets(2, 0, 2, 50));
        btn_ventas.setOpaque(false);
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(40, 48, 71));
        btn_salir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.setOpaque(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(36, 45, 67));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AUTO ESTÉREO LA 47");

        btn_proveedores.setBackground(new java.awt.Color(40, 48, 71));
        btn_proveedores.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        btn_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unidades-de-red.png"))); // NOI18N
        btn_proveedores.setText("Proveedores");
        btn_proveedores.setIconTextGap(15);
        btn_proveedores.setOpaque(false);
        btn_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(btn_compras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_invetario, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(btn_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_invetario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        panelPrincipal.setBackground(new java.awt.Color(97, 212, 195));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprasActionPerformed
        panelCompras pc = new panelCompras();
        pc.setSize(1000, 692);
        pc.setLocation(60, 7);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(pc, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }//GEN-LAST:event_btn_comprasActionPerformed

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        panelVentas pv = new panelVentas();
        pv.setSize(1000, 692);
        pv.setLocation( 60, 7);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(pv, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btn_ventasActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        panelHome ph = new panelHome();
        ph.setSize(1000, 692);
        ph.setLocation(60,7);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(ph, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
        this.setVisible(false);
        
        principal pal = new principal();
        pal.setVisible(true);
        
       
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_invetarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invetarioActionPerformed
        panelInventario pi = new panelInventario();
        pi.setSize(1000, 692);
        pi.setLocation(60,7);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(pi, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btn_invetarioActionPerformed

    private void btn_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedoresActionPerformed
        panelProveedor pp = new panelProveedor();
        pp.setSize(1000, 692);
        pp.setLocation(60,7);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(pp, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btn_proveedoresActionPerformed

    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_compras;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_invetario;
    private javax.swing.JButton btn_proveedores;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables


    @Override
    public Image getIconImage(){
        
        Image imagen = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono-app.png"));
        return imagen;
    }

}
