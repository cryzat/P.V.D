/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.vistas;

/**
 *
 * @author Se quiere Se puede
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPVista = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCrearEliminarUsuarios = new javax.swing.JMenu();
        jMIListaUsuarios = new javax.swing.JMenuItem();
        jMICrearUsuarios = new javax.swing.JMenuItem();
        jMIEliminarUsuarios = new javax.swing.JMenuItem();
        jMIEstadoBloqueoUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPVistaLayout = new javax.swing.GroupLayout(jDPVista);
        jDPVista.setLayout(jDPVistaLayout);
        jDPVistaLayout.setHorizontalGroup(
            jDPVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jDPVistaLayout.setVerticalGroup(
            jDPVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        jMCrearEliminarUsuarios.setText("Usuarios");
        jMCrearEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCrearEliminarUsuariosActionPerformed(evt);
            }
        });

        jMIListaUsuarios.setText("Lista");
        jMIListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListaUsuariosActionPerformed(evt);
            }
        });
        jMCrearEliminarUsuarios.add(jMIListaUsuarios);

        jMICrearUsuarios.setText("Crear");
        jMICrearUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICrearUsuariosActionPerformed(evt);
            }
        });
        jMCrearEliminarUsuarios.add(jMICrearUsuarios);

        jMIEliminarUsuarios.setText("Eliminar");
        jMIEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEliminarUsuariosActionPerformed(evt);
            }
        });
        jMCrearEliminarUsuarios.add(jMIEliminarUsuarios);

        jMIEstadoBloqueoUsuarios.setText("Desbloquear / Bloquear");
        jMIEstadoBloqueoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEstadoBloqueoUsuariosActionPerformed(evt);
            }
        });
        jMCrearEliminarUsuarios.add(jMIEstadoBloqueoUsuarios);

        jMenuBar1.add(jMCrearEliminarUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPVista)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMCrearEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCrearEliminarUsuariosActionPerformed
        
    }//GEN-LAST:event_jMCrearEliminarUsuariosActionPerformed

    private void jMICrearUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICrearUsuariosActionPerformed
       jDPVista.add(new VentanaCrerarUsuarios(),0);
    }//GEN-LAST:event_jMICrearUsuariosActionPerformed

    private void jMIEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEliminarUsuariosActionPerformed
       jDPVista.add(new VentanaEliminarUsuarios(),0);
    }//GEN-LAST:event_jMIEliminarUsuariosActionPerformed

    private void jMIEstadoBloqueoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEstadoBloqueoUsuariosActionPerformed
        jDPVista.add(new VentanaEstadoBloqueoUsuarios(),0);
    }//GEN-LAST:event_jMIEstadoBloqueoUsuariosActionPerformed

    private void jMIListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListaUsuariosActionPerformed
        jDPVista.add(new VentanaListaUsuarios(),0);
    }//GEN-LAST:event_jMIListaUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPVista;
    private javax.swing.JMenu jMCrearEliminarUsuarios;
    private javax.swing.JMenuItem jMICrearUsuarios;
    private javax.swing.JMenuItem jMIEliminarUsuarios;
    private javax.swing.JMenuItem jMIEstadoBloqueoUsuarios;
    private javax.swing.JMenuItem jMIListaUsuarios;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
