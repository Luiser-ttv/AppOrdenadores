package codigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rioja
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    GestorConexion gestor = new GestorConexion();

    public VentanaPrincipal() {
        initComponents();
        BotonApagar.setEnabled(false);
        BotonFecha.setEnabled(false);
        BotonFechaBorrar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoColor = new javax.swing.JPanel();
        darkMode = new javax.swing.JToggleButton();
        BotonApagar = new javax.swing.JButton();
        BotonEncender = new javax.swing.JButton();
        BotonFecha = new javax.swing.JButton();
        BotonFechaBorrar = new javax.swing.JButton();
        BotonDatpsAlbum = new javax.swing.JButton();
        insertarDatos = new javax.swing.JLabel();
        nombreCancion = new javax.swing.JLabel();
        nombreAutor = new javax.swing.JLabel();
        insertarFecha = new javax.swing.JLabel();
        nombreCancionField = new javax.swing.JTextField();
        nombreAutorField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoColor.setBackground(new java.awt.Color(102, 102, 102));

        darkMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/light_16.png"))); // NOI18N
        darkMode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        darkMode.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/dark_16.png"))); // NOI18N
        darkMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                darkModeMousePressed(evt);
            }
        });
        darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkModeActionPerformed(evt);
            }
        });

        BotonApagar.setBackground(new java.awt.Color(0, 0, 0));
        BotonApagar.setForeground(new java.awt.Color(204, 204, 204));
        BotonApagar.setText("Apagar");
        BotonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApagarActionPerformed(evt);
            }
        });

        BotonEncender.setBackground(new java.awt.Color(0, 0, 0));
        BotonEncender.setForeground(new java.awt.Color(204, 204, 204));
        BotonEncender.setText("Encender/Actualizar");
        BotonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEncenderActionPerformed(evt);
            }
        });

        BotonFecha.setBackground(new java.awt.Color(0, 0, 0));
        BotonFecha.setForeground(new java.awt.Color(204, 204, 204));
        BotonFecha.setText("Añadir fecha");
        BotonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFechaActionPerformed(evt);
            }
        });

        BotonFechaBorrar.setBackground(new java.awt.Color(0, 0, 0));
        BotonFechaBorrar.setForeground(new java.awt.Color(204, 204, 204));
        BotonFechaBorrar.setText("Borrar fecha");
        BotonFechaBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFechaBorrarActionPerformed(evt);
            }
        });

        BotonDatpsAlbum.setBackground(new java.awt.Color(0, 0, 0));
        BotonDatpsAlbum.setForeground(new java.awt.Color(204, 204, 204));
        BotonDatpsAlbum.setText("OK");

        insertarDatos.setBackground(new java.awt.Color(0, 0, 0));
        insertarDatos.setForeground(new java.awt.Color(204, 204, 204));
        insertarDatos.setText("Insertar Datos en Album");
        insertarDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarDatos.setOpaque(true);

        nombreCancion.setText("Cancion:");

        nombreAutor.setText("Autor:");

        insertarFecha.setBackground(new java.awt.Color(0, 0, 0));
        insertarFecha.setForeground(new java.awt.Color(204, 204, 204));
        insertarFecha.setText("Añadir/Borrar fecha");
        insertarFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarFecha.setOpaque(true);

        nombreCancionField.setBackground(new java.awt.Color(0, 0, 0));
        nombreCancionField.setForeground(new java.awt.Color(204, 204, 204));
        nombreCancionField.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        nombreAutorField.setBackground(new java.awt.Color(0, 0, 0));
        nombreAutorField.setForeground(new java.awt.Color(204, 204, 204));
        nombreAutorField.setCaretColor(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fondoColorLayout = new javax.swing.GroupLayout(fondoColor);
        fondoColor.setLayout(fondoColorLayout);
        fondoColorLayout.setHorizontalGroup(
            fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEncender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoColorLayout.createSequentialGroup()
                        .addComponent(BotonFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonFechaBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoColorLayout.createSequentialGroup()
                            .addComponent(BotonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(darkMode))
                        .addGroup(fondoColorLayout.createSequentialGroup()
                            .addComponent(nombreCancion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreCancionField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreAutor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreAutorField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotonDatpsAlbum))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        fondoColorLayout.setVerticalGroup(
            fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEncender)
                    .addComponent(BotonApagar)
                    .addComponent(darkMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFecha)
                    .addComponent(BotonFechaBorrar))
                .addGap(21, 21, 21)
                .addGroup(fondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCancionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCancion)
                    .addComponent(nombreAutor)
                    .addComponent(nombreAutorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDatpsAlbum))
                .addContainerGap(426, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEncenderActionPerformed
        gestor.iniciarConexion();
        if (gestor.iniciarConexion() == 0) {
            System.out.println("Conectado a la discografica");
            BotonEncender.setEnabled(false);
            BotonApagar.setEnabled(true);
            BotonFecha.setEnabled(true);
            BotonFechaBorrar.setEnabled(false);
        } else {
            System.out.println("Error en la conexion de la BBDD");

        }


    }//GEN-LAST:event_BotonEncenderActionPerformed

    private void BotonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApagarActionPerformed
        gestor.cerrarConexion();
        if (gestor.cerrarConexion() == 0) {
            System.out.println("Conexion cerrada correctamente");
            BotonApagar.setEnabled(false);
            BotonEncender.setEnabled(true);
            BotonFecha.setEnabled(false);
            BotonFechaBorrar.setEnabled(false);
        } else {
            System.out.println("Error al cerrar la discorafica");
        }
    }//GEN-LAST:event_BotonApagarActionPerformed

    private void BotonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFechaActionPerformed
        gestor.aniadirColumna();
        BotonFecha.setEnabled(false);
        BotonFechaBorrar.setEnabled(true);

    }//GEN-LAST:event_BotonFechaActionPerformed

    private void BotonFechaBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFechaBorrarActionPerformed
        gestor.borrarColumna();
        BotonFechaBorrar.setEnabled(false);
        BotonFecha.setEnabled(true);


    }//GEN-LAST:event_BotonFechaBorrarActionPerformed

    private void darkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkModeActionPerformed
       
    }//GEN-LAST:event_darkModeActionPerformed

    private void darkModeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkModeMousePressed
        if (darkMode.isSelected()) {
            BotonEncender.setBackground(new java.awt.Color(204, 204, 204));
            BotonEncender.setForeground(new java.awt.Color(0, 0, 0));
        } else {
            BotonEncender.setBackground(new java.awt.Color(0, 0, 0));
            BotonEncender.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_darkModeMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonApagar;
    private javax.swing.JButton BotonDatpsAlbum;
    private javax.swing.JButton BotonEncender;
    private javax.swing.JButton BotonFecha;
    private javax.swing.JButton BotonFechaBorrar;
    private javax.swing.JToggleButton darkMode;
    private javax.swing.JPanel fondoColor;
    private javax.swing.JLabel insertarDatos;
    private javax.swing.JLabel insertarFecha;
    private javax.swing.JLabel nombreAutor;
    private javax.swing.JTextField nombreAutorField;
    private javax.swing.JLabel nombreCancion;
    private javax.swing.JTextField nombreCancionField;
    // End of variables declaration//GEN-END:variables
}
