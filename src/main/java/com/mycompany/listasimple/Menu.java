/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.listasimple;

/**
 *
 * @author SCIS2-15
 */
public class Menu extends javax.swing.JFrame {

    Listasimple objlist = new Listasimple();
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CrearInicio = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        promedio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Insertarfinal = new javax.swing.JButton();
        InsertAfterName = new javax.swing.JButton();
        alfabeticamente = new javax.swing.JButton();
        eliminarnombre = new javax.swing.JButton();
        insertarposicion = new javax.swing.JButton();
        generarnombres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista simple");

        CrearInicio.setText("Crear lista inicio");
        CrearInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearInicioActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Promedio");

        Insertarfinal.setText("Insertar al Final");
        Insertarfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarfinalActionPerformed(evt);
            }
        });

        InsertAfterName.setText("Insertar Luego de un Nombre");
        InsertAfterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAfterNameActionPerformed(evt);
            }
        });

        alfabeticamente.setText("Ordenar alfabeticamente");
        alfabeticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabeticamenteActionPerformed(evt);
            }
        });

        eliminarnombre.setText("Eliminar por nombre");
        eliminarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarnombreActionPerformed(evt);
            }
        });

        insertarposicion.setText("Insertar por posicion");
        insertarposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarposicionActionPerformed(evt);
            }
        });

        generarnombres.setText("Generar nombres");
        generarnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarnombresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(insertarposicion)
                        .addGap(64, 64, 64)
                        .addComponent(eliminarnombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Insertarfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CrearInicio)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(219, 219, 219))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(InsertAfterName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(alfabeticamente)
                            .addGap(178, 178, 178)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(generarnombres)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearInicio)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insertarfinal)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(consultar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertAfterName)
                    .addComponent(alfabeticamente))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarposicion)
                    .addComponent(eliminarnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generarnombres)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearInicioActionPerformed
        
        objlist.insertarInicio(
                nombre.getText(),Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()));
    }//GEN-LAST:event_CrearInicioActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        objlist.consultar();
    }//GEN-LAST:event_consultarActionPerformed

    private void InsertarfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarfinalActionPerformed
        objlist.insertarFinal(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()));
    }//GEN-LAST:event_InsertarfinalActionPerformed

    private void InsertAfterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAfterNameActionPerformed
        objlist.insertareleccion(nombre.getText(), Integer.parseInt(edad.getText()), Float.parseFloat(promedio.getText()));
    }//GEN-LAST:event_InsertAfterNameActionPerformed

    private void alfabeticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabeticamenteActionPerformed
        objlist.ordenarPorNombreAscendente();
    }//GEN-LAST:event_alfabeticamenteActionPerformed

    private void eliminarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarnombreActionPerformed
        objlist.eliminarPorSeleccion();
    }//GEN-LAST:event_eliminarnombreActionPerformed

    private void insertarposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarposicionActionPerformed
        objlist.insertarEnPosicion(nombre.getText(), WIDTH, TOP_ALIGNMENT);
    }//GEN-LAST:event_insertarposicionActionPerformed

    private void generarnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarnombresActionPerformed
        objlist.generarNombresAleatorios();
    }//GEN-LAST:event_generarnombresActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearInicio;
    private javax.swing.JButton InsertAfterName;
    private javax.swing.JButton Insertarfinal;
    private javax.swing.JButton alfabeticamente;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminarnombre;
    private javax.swing.JButton generarnombres;
    private javax.swing.JButton insertarposicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField promedio;
    // End of variables declaration//GEN-END:variables
}
