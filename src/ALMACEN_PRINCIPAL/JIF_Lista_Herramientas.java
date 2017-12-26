package ALMACEN_PRINCIPAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joshua
 */
public class JIF_Lista_Herramientas extends javax.swing.JInternalFrame {
    
    cConexion conexion=new cConexion();
    Connection con=conexion.getConnection();
    Statement st;   ResultSet rs;
    DefaultTableModel modelo;
    
    public JIF_Lista_Herramientas() {
        initComponents();
        
        listarHerramientas();
    }
    
    void listarHerramientas()
    {   try
        {   st=con.createStatement();
            rs=st.executeQuery("SELECT DISTINCT(H.CODIGO), H.`HERRAMIENTA`, "
                + "(SELECT COUNT(*) FROM DETALLEHERRAMIENTA WHERE `CODHERRAMIENTA`=H.`CODIGO`) "
                + "FROM Herramienta H LEFT JOIN DETALLEHERRAMIENTA DH "
                + "ON H.`CODIGO`=DH.`CODHERRAMIENTA` ORDER BY H.`CODIGO`;");
            modelo=(DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {   Object rowData[]={rs.getString(1), rs.getString(2), rs.getString(3)};
                modelo.addRow(rowData);
            }
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField(8);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("LISTA DE HERRAMIENTAS");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Herramienta");

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Herramienta", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(400);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jButton2.setText("Detalles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JD_Registrar_Herramienta jdrh=new JD_Registrar_Herramienta(this,true);
        jdrh.setCodigo();
        jdrh.setVisible(true);
        if(jdrh.isVisible()==false)
        {   limpiarTabla();
            listarHerramientas();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void mostrarJD_Reg_Herr()
    {   JD_Registrar_Herramienta jdrh=new JD_Registrar_Herramienta(this,true);
        jdrh.jButton1.setText("Modificar");
        jdrh.setTitle("Modificar Herramienta");
        jdrh.jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"");
        jdrh.jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1)+"");
        jdrh.setVisible(true);
        if(jdrh.isVisible()==false)
        {   limpiarTabla();
            listarHerramientas();
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        try
        {   rs=st.executeQuery("SELECT * FROM Herramienta Where Herramienta Like '%"+jTextField1.getText()+"%'");
            limpiarTabla();
            modelo=(DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {   Object rowData[]={rs.getString(1), rs.getString(2)};
                modelo.addRow(rowData);
            }
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}
    }//GEN-LAST:event_jTextField1CaretUpdate

    void limpiarTabla()
    {   int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--)           
            modelo.removeRow(jTable1.getRowCount()-1);        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable1.getSelectedRow()>=0)
        {   JD_Lista_Detalle_Herramienta jldh=new JD_Lista_Detalle_Herramienta(this,true);
            jldh.jLabel3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"");
            jldh.jLabel4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1)+"");
            jldh.listarMarcaModeloSerie();
            jldh.setVisible(true);
            if(jldh.isVisible()==false)
            {   limpiarTabla();
                listarHerramientas();
            }  
        }
        else JOptionPane.showMessageDialog(this, "Porfavor seleccione una Herramienta");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2)
            mostrarJD_Reg_Herr();
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
