/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.vistas;

import co.edu.eam.avanzada1.controladores.ControladorEliminarUsuarios;
import co.edu.eam.avanzada1.entidades.Director;
import co.edu.eam.avanzada1.entidades.Docente;
import co.edu.eam.avanzada1.entidades.Estudiante;
import co.edu.eam.avanzada1.entidades.Persona;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Se quiere Se puede
 */
public class VentanaEliminarUsuarios extends javax.swing.JInternalFrame {

    private ControladorEliminarUsuarios controlador;

    /**
     * Creates new form VentanaCrerarEliminarUsuarios
     */
    public VentanaEliminarUsuarios() {
        initComponents();
        this.controlador = new ControladorEliminarUsuarios();
        setVisible(true);
        setResizable(false);
        setClosable(true);
        setIconifiable(true);
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
        jTFFiltroBusqueda = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();

        setTitle("Eliminar Usuarios");

        jLabel1.setText("Filtro de busqueda:");

        jTFFiltroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFiltroBusquedaKeyReleased(evt);
            }
        });

        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Cargo", "Nombre", "Apellido", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTFFiltroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jBEliminar)))
                .addGap(14, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jTFFiltroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jBEliminar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            if (jTUsuarios.getSelectedRow() >= 0) {
                long identificacion = (long) jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 0);
                String id = identificacion + "";
                int dato = JOptionPane.showConfirmDialog(null, "Desea eliminar el usuario con identificacion: " + id, "Eliminar Usuario",
                        0, JOptionPane.QUESTION_MESSAGE);
                if (dato == JOptionPane.YES_OPTION) {
                    controlador.elimnarUsuario(identificacion);
                    DefaultTableModel dtm = (DefaultTableModel) jTUsuarios.getModel();
                    dtm.removeRow(jTUsuarios.getSelectedRow());
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTFFiltroBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltroBusquedaKeyReleased
        listarUsuariosRegistrados(jTFFiltroBusqueda.getText());
    }//GEN-LAST:event_jTFFiltroBusquedaKeyReleased

    public void listarUsuariosRegistrados(String parametro) {
        try {
            List<Persona> usuarios = controlador.listarUsuarioRegistrados(parametro);
            DefaultTableModel tabla = (DefaultTableModel) jTUsuarios.getModel();
            tabla.setRowCount(0);
            for (Persona usuario : usuarios) {
                Object[] fila = new Object[5];
                fila[0] = usuario.getNumeroDocumento();
                fila[2] = usuario.getNombre();
                fila[3] = usuario.getApellido();
                if (usuario instanceof Estudiante) {
                    fila[1] = "Estudiante";
                } else if (usuario instanceof Docente) {
                    fila[1] = "Docente";
                } else if (usuario instanceof Director) {
                    fila[1] = "Director";
                }
                if(usuario.isBloqueado()){
                    fila[4]="Bloqueado";
                }else{
                    fila[4]="Desbloqueado";
                }
                tabla.addRow(fila);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltroBusqueda;
    private javax.swing.JTable jTUsuarios;
    // End of variables declaration//GEN-END:variables
}
