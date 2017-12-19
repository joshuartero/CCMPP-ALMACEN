package ALMACEN_PRINCIPAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class JD_Detalle_Herramienta extends javax.swing.JDialog {

    JD_Lista_Detalle_Herramienta jdldh;
    cConexion conexion=new cConexion();
    Connection con=conexion.getConnection();
    Statement st;   ResultSet rs1, rs2;
    
    public JD_Detalle_Herramienta(JD_Lista_Detalle_Herramienta jdldh, boolean modal) {
        super(JOptionPane.getFrameForComponent(jdldh), modal);
        this.jdldh=jdldh;
        initComponents();
        
        setLocationRelativeTo(this);
        
        cargarMarca();
    }
    
    void cargarMarca()
    {   try
        {   st=con.createStatement();
            rs1=st.executeQuery("Select Marca From Marca");
            jComboBox1.addItem("");
            while(rs1.next())
                jComboBox1.addItem(rs1.getString(1));
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, "ERROR DEBIDO A : "+e.toString());}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Marca");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Modelo");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Serie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 243, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setText("Codigo : ");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setText("Equipo / Herramienta / Articulo / Otro : ");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel6.setText("Equipo / Herramienta / Articulo / Otro");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setText("Codigo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7))
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addContainerGap(111, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7))
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JD_Lista_Marca jdlm=new JD_Lista_Marca(this,true);        
        jdlm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    String buscarIDMarca(String marca)
    {   String codigo="";
        try
        {   rs1=st.executeQuery("Select ID From Marca Where Marca='"+marca+"'");
            if(rs1.next())
                codigo=rs1.getString(1);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, "ERROR DEBIDO A : "+e.toString());}
        return codigo;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JD_Lista_Modelo jdlm=new JD_Lista_Modelo(this,true);
        jdlm.jLabel3.setText(jComboBox1.getSelectedItem()+"");
        jdlm.jLabel5.setText(buscarIDMarca(""+jComboBox1.getSelectedItem()));
        jdlm.cargarModelos();
        jdlm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargarModelo();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        funcion();
    }//GEN-LAST:event_jButton3ActionPerformed

    void funcion()
    {   if(jButton3.getText().compareTo("Registrar")==0)
        {   if(!camposNoVacios())
            {   int opc=JOptionPane.showConfirmDialog(this, "Desea Registrar Estos Detalles de Herramienta?", "CONFIRMAR REGISTRO", JOptionPane.YES_NO_OPTION);
                if(opc==JOptionPane.YES_OPTION)
                   registrar();
            }   
        }
        if(jButton3.getText().compareTo("Modificar")==0)
        {   //JOptionPane.showMessageDialog(this, jButton1.getText());
            if(!camposNoVacios())
            {   int opc=JOptionPane.showConfirmDialog(this, "Desea Modificar Detalles de Herramienta?", "CONFIRMAR MODIFICACION", JOptionPane.YES_NO_OPTION);
                if(opc==JOptionPane.YES_OPTION)
                   modificar();
            } 
        }
    }
    
    void registrar()
    {   if(serieNoRepetida(jTextField1.getText()))
        {   try
            {   st.executeUpdate("INSERT INTO DETALLEHERRAMIENTA VALUES ('"+jLabel7.getText()+"',"
                    + "'"+idMarca(jComboBox1.getSelectedItem().toString())+"',"
                    + "'"+idModelo(jComboBox2.getSelectedItem().toString())+"',"
                    + "'"+jTextField1.getText()+"','E1');");
                JOptionPane.showMessageDialog(this, "Detalles de Herramienta Registrados !");
                dispose();
            }
            catch(SQLException e){  JOptionPane.showMessageDialog(this, "Error Debido a : "+e.toString());}
        }
        else 
        {   JOptionPane.showMessageDialog(this, "Ya Existe esa Serie, Porfavor ingrese otra serie");
            jTextField1.setText("");    jTextField1.requestFocus();
        }
    }
    
    void modificar()
    {   try
        {   st=con.createStatement();
            st.executeUpdate("UPDATE DETALLEHERRAMIENTA SET IDMARCA='"+idMarca(jComboBox1.getSelectedItem().toString())+"', "
                + "IDMODELO='"+idModelo(jComboBox2.getSelectedItem().toString())+"', "
                + "SERIE='"+jTextField1.getText()+"', IDESTADO='E1' WHERE CODHERRAMIENTA='"+jLabel7.getText()+"';");
            JOptionPane.showMessageDialog(this, "Datos Actualizados !");
            dispose();
        }
        catch(SQLException e){  JOptionPane.showMessageDialog(this, "Error Debido a : "+e.toString());}
    }
    
    boolean camposNoVacios()
    {   boolean vacios=false;
        if(jComboBox1.getSelectedItem().toString().length()==0)
        {   JOptionPane.showMessageDialog(this, "Porfavor Seleccione Marca");
            vacios=true;
        }
        return vacios;
    }
    
    boolean serieNoRepetida(String serie)
    {   boolean noRepetido=true;
        try
        {   rs1=st.executeQuery("SELECT Serie FROM DETALLEHERRAMIENTA");
            while(rs1.next())
            {   if(rs1.getString(1).toString().compareTo(serie)==0)
                    noRepetido=false;
            }
        }
        catch(SQLException e){  JOptionPane.showMessageDialog(this, "Error Debido a : "+e.toString());}
        return noRepetido;
    }
    
    String idMarca(String marca)
    {   String id="";
        try
        {   rs2=st.executeQuery("SELECT ID FROM MARCA WHERE MARCA='"+marca+"'");
            if(rs2.next())
                id=rs2.getString(1);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, "ERROR DEBIDO A : "+e.toString());}
        return id;
    }
    
    String idModelo(String modelo)
    {   String id="";
        try
        {   rs2=st.executeQuery("SELECT ID FROM MODELO WHERE MODELO='"+modelo+"'");
            if(rs2.next())
                id=rs2.getString(1);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, "ERROR DEBIDO A : "+e.toString());}
        return id;
    }
    
    void cargarModelo()
    {   try
        {   st=con.createStatement();
            rs2=st.executeQuery("Select MO.`MODELO` from Modelo MO INNER JOIN MARCA MA ON MO.`IDMARCA`=MA.`ID` WHERE MA.`MARCA`='"+jComboBox1.getSelectedItem()+"';");
            jComboBox2.removeAllItems();
            jComboBox2.addItem("");
            while(rs2.next())
                jComboBox2.addItem(rs2.getString(1));
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, "ERROR DEBIDO A : "+e.toString());}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
