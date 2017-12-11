package ALMACEN_PRINCIPAL;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Joshua
 */
public class JD_Cargo extends javax.swing.JDialog {
    
    JD_Cargos_Trabajador jdct;
    cConexion conexion=new cConexion();
    Connection con=conexion.getConnection();
    Statement st;   ResultSet rs, rs1, rs2, rs3, rs4;
    DefaultTableModel modelo;
            
    public JD_Cargo(JD_Cargos_Trabajador jdct, boolean modal) {
        super(jdct, modal);
        this.jdct=jdct;
        initComponents();
        
        modelo=(DefaultTableModel) jTable1.getModel();
        setLocationRelativeTo(this);
        
        cargarEntregado();
        cargarHerramientas();
        setCodigoCargo();
    }

    void cargarEntregado()
    {   try
        {   st=con.createStatement();
            rs4=st.executeQuery("SELECT CONCAT(P.`APELLIDOP`, ' ',P.`APELLIDOM`, ' ',P.`NOMBRES`) FROM Trabajador T INNER JOIN Persona P ON T.`DNI`=P.`DNI` ORDER BY CONCAT(P.`APELLIDOP`, ' ',P.`APELLIDOM`, ' ',P.`NOMBRES`) ;");
            while(rs4.next())
                jComboBox2.addItem(rs4.getString(1));
            jComboBox2.setSelectedItem("Ormachea Del Aguila Joshua");
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}
    }
    
    void cargarHerramientas()
    {   try
        {   st=con.createStatement();
            rs1=st.executeQuery("SELECT * FROM Herramienta Order By Herramienta;");
            jComboBox1.addItem("");
            while(rs1.next())
               jComboBox1.addItem(rs1.getString(2)+" "+nulosVacios(rs1.getString(3))+" "+nulosVacios(rs1.getString(4))+" "+nulosVacios(rs1.getString(5)));                
            
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}
    }
    
    void setCodigoCargo()
    {   Calendar c = new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));
        if(dia.length()==1)
            dia="0"+dia;
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        if(mes.length()==1)
            mes="0"+mes;
        String annio = Integer.toString(c.get(Calendar.YEAR));
            annio=annio.substring(2, 4);
        String hora =c.get(Calendar.HOUR_OF_DAY)+"";
        if(hora.length()==1)
            hora="0"+hora;
        String minutos = c.get(Calendar.MINUTE)+"";
        if(minutos.length()==1)
            minutos="0"+minutos;
        String segundos = c.get(Calendar.SECOND)+"";
        if(segundos.length()==1)
            segundos="0"+segundos;
        jLabel8.setText("CCMPP"+annio+mes+dia+hora+minutos+segundos);
    }
    
    String nulosVacios(Object valor)
    {   String nulo="";
        if(valor==null)
            nulo="";
        return nulo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "RECIBIDO"));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Codigo DE TRABAJADOR : ");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos y Nombres : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Equipo / Herramienta / Articulo / Otros");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Stock :");

        jButton1.setText("Asignar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner1.setMaximumSize(new java.awt.Dimension(0, 32767));

        jButton4.setText("Quitar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo");

        jTextField1.setEnabled(false);

        jLabel10.setText("Serie");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "EQUIPOS / HERRAMIENTAS / ARTICULOS / OTROS"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Herramienta", "Marca", "Modelo", "Serie", "Cant."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setText("Codigo DE CARGO : ");

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "ENTREGADO"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        codigoStock();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    void codigoStock()
    {   try
        {   st=con.createStatement();
            rs2=st.executeQuery("SELECT Codigo, Cantidad FROM Herramienta WHERE Herramienta='"+jComboBox1.getSelectedItem()+"';");
            if(rs2.next())
            {   jTextField1.setText(rs2.getString(1));                
                jLabel6.setText(rs2.getString(2));
            }
            else
            {   jTextField1.setText("");                
                jLabel6.setText("");                
            }
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if( !vacios() )
        {   if( Integer.parseInt(jSpinner1.getValue().toString())<=Integer.parseInt(jLabel6.getText()) )
            {   if(!buscarCodigoEnTabla(jTextField1.getText()))
                {   Object[] rowData=buscarInformacion(jTextField1.getText()+"", (int) jSpinner1.getValue());
                    modelo.addRow(rowData);   jTextField2.setText("");
                }
                else JOptionPane.showMessageDialog(this, "Elemento ya asignado");
            }
            else JOptionPane.showMessageDialog(this, "No se tiene el Stock Suficiente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    boolean vacios()
    {   boolean vacio=false;
        if(jComboBox1.getSelectedItem().toString().length()==0)
        {   vacio=true;
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un Equipo / Herramienta / Articulo / Otros");
        }
        else if(jTextField1.getText().length()==0)
        {   vacio=true;
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un Equipo / Herramienta / Articulo / Otros");
        }
        else if(jLabel6.getText().length()==0)
        {   vacio=true;
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un Equipo / Herramienta / Articulo / Otros");
        }
        return vacio;
    }
    
    Object[] buscarInformacion(String codigo, int cantidad)
    {   Object[] row={};
        try
        {   st=con.createStatement();
            rs3=st.executeQuery("Select * From Herramienta Where Codigo='"+codigo+"'");
            if(rs3.next())
            {   Object[] rowData={codigo, rs3.getString(2), rs3.getString(3), rs3.getString(4), jTextField2.getText(), cantidad};
                row=rowData;
            }
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());}
        return row;
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTable1.getSelectedRow()>=0)
            modelo.removeRow(jTable1.getSelectedRow());
        else JOptionPane.showMessageDialog(this, "Porfavor seleccione un elemento de la tabla");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable1.getRowCount()!=0)
        {   int opc=JOptionPane.showConfirmDialog(this, "Desea registrar este cargo ? ","CONFIRMAR REGISTRO DE CARGO",JOptionPane.YES_NO_OPTION);
            if(opc==JOptionPane.YES_OPTION)
            {   if(guardarEnBD())
                {   String rutaArchivo=crearPDF();
                    enviarPorCorreo(rutaArchivo);
                    JOptionPane.showMessageDialog(this, "Cargo Registrado y Enviado Por Correo");
                    dispose();
                }
            }
        }
        else JOptionPane.showMessageDialog(this, "Porfavor asigne almenos un Equipo / Herramienta / Articulo / Otros");
    }//GEN-LAST:event_jButton2ActionPerformed

    boolean guardarEnBD()
    {   boolean ok=false;
        try
        {   st.executeUpdate("INSERT INTO Cargo VALUES ('"+jLabel8.getText()+"','"+codigoTrabajador(jComboBox2.getSelectedItem()+"")+"','"+jLabel1.getText().substring(23, 27)+"',CURDATE())");
            for(int i=0; i<jTable1.getRowCount(); i++)
                st.executeUpdate("INSERT INTO CARGO_HERRAMIENTA VALUES ('"+jLabel8.getText()+"','"+jTable1.getValueAt(i, 0)+"','"+jTable1.getValueAt(i, 5)+"','"+jTable1.getValueAt(i, 4)+"');"); 
            JOptionPane.showMessageDialog(this, "CARGO REGISTRADO CON EXITO");
            jSpinner1.setValue(1);    limpiarTabla();
            ok=true;
            dispose();
        }
        catch(SQLException e)   
        {   ok=false;
            JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());
        }
        return ok;
    }
    
    String codigoTrabajador(String apellidosNombres)
    {   String codigoTrabajador="";
        try
        {   rs=st.executeQuery("SELECT T.`CODIGO` FROM Trabajador T INNER JOIN Persona P ON T.`DNI`=P.`DNI` WHERE CONCAT(P.`APELLIDOP`, ' ',P.`APELLIDOM`, ' ',P.`NOMBRES`) ='"+apellidosNombres+"';");
            if(rs.next())
                codigoTrabajador=rs.getString(1);
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());    }
        return codigoTrabajador;
    }
    
    public String crearPDF(){
        JasperReport jasperReport;
        JasperPrint jasperPrint;
        String rutaArchivo="";
        try
        {
          URL in=this.getClass().getResource( "/REPORTES/report2.jasper" ); 
          jasperReport=(JasperReport)JRLoader.loadObject(in);
          Map parametros = new HashMap(); 
                parametros.clear(); 
                parametros.put( "codigoCargo", jLabel8.getText() );
                parametros.put( "codigoTrabajador", jLabel1.getText().substring(23, 27) );
                parametros.put( "apellidosNombres", jLabel2.getText().substring(22) );
          jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, con);
          URL  in2=this.getClass().getResource( "/REPORTES/");
          File f = new File(in2.getPath());
          rutaArchivo=f.getAbsolutePath()+"\\"+jLabel8.getText()+".pdf";
          JasperExportManager.exportReportToPdfFile( jasperPrint, rutaArchivo);
//          JOptionPane.showMessageDialog(this,"PDF Creado");
        }
        catch (JRException ex)
        {   JOptionPane.showMessageDialog(this,"Error iReport: " + ex.getMessage() );
        }
        return rutaArchivo;
  }
    
    void enviarPorCorreo(String rutaArchivo)
    {   JavaMail jm=new JavaMail();
        destinatarios(correoTrabajador(jLabel2.getText().substring(22)), jm);
        jm.enviar("logisticaccmpp@gmail.com", mensaje(jComboBox2.getSelectedItem()+""), rutaArchivo, nombreArchivo(), 
                correoTrabajador(jLabel2.getText().substring(22)), asunto(), "ccmpp2017");
    }
    
    String correoTrabajador(String nombresApellidos)
    {   String correoEnvia="";
        try
        {   rs=st.executeQuery("SELECT T.Correo FROM Trabajador T INNER JOIN Persona P ON T.`DNI`=P.`DNI`WHERE CONCAT(P.`APELLIDOP`, ' ',P.`APELLIDOM`, ' ',P.`NOMBRES`)='"+nombresApellidos+"';");
            if(rs.next())
                correoEnvia=rs.getString(1);
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());    }
        return correoEnvia;      
    }
    
    void destinatarios(String correoDestinatario, JavaMail jm)
    {   if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("ALUMBRADO PUBLICO")==0)
        {   jm.setTamañoDestinatarios(1);
//            jm.destinatarios[0]=correoDestinatario;
//            jm.destinatarios[1]="jynoquio@procesosproductivos.com";
//            jm.destinatarios[2]="jcsergen2016@gmail.com";
//            jm.destinatarios[3]="ecuray@procesosproductivos.com";
//            jm.destinatarios[4]="elitano@procesosproductivos.com";
//            jm.destinatarios[5]="pverastegui@procesosproductivos.com";
            jm.destinatarios[0]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("BAJA TENSION")==0)
        {   jm.setTamañoDestinatarios(6);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="tcayetano@procesosproductivos.com";  
            jm.destinatarios[2]="ltorres@procesosproductivos.com";
            jm.destinatarios[3]="elitano@procesosproductivos.com";
            jm.destinatarios[4]="pverastegui@procesosproductivos.com";
            jm.destinatarios[5]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("CALIDAD DE PRODUCTO")==0)
        {   jm.setTamañoDestinatarios(6);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="jhuamanchumo@procesosproductivos.com"; 
            jm.destinatarios[2]="gnavarro@procesosproductivos.com";
            jm.destinatarios[3]="elitano@procesosproductivos.com";
            jm.destinatarios[4]="pverastegui@procesosproductivos.com";
            jm.destinatarios[5]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("EMERGENCIAS")==0)
        {   jm.setTamañoDestinatarios(12);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="eyaipen@procesosproductivos.com";
            jm.destinatarios[2]="ringa@procesosproductivos.com";            
            jm.destinatarios[3]="ycornejo@procesosproductivos.com";            
            jm.destinatarios[4]="ccoronado@procesosproductivos.com";            
            jm.destinatarios[5]="rsuarez@procesosproductivos.com";
            jm.destinatarios[6]="vcorrea@procesosproductivos.com";
            jm.destinatarios[7]="jgalvez@procesosproductivos.com";
            jm.destinatarios[8]="cnavarro@procesosproductivos.com";
            jm.destinatarios[9]="elitano@procesosproductivos.com";
            jm.destinatarios[10]="pverastegui@procesosproductivos.com";
            jm.destinatarios[11]="jormachea@procesosproductivos.com";
        }        
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("MEDIA TENSION")==0)
        {   jm.setTamañoDestinatarios(1);
//            jm.destinatarios[0]=correoDestinatario;
//            jm.destinatarios[1]="dminope@procesosproductivos.com";
//            jm.destinatarios[2]="eelera@procesosproductivos.com";
//            jm.destinatarios[3]="lagurto@procesosproductivos.com";
//            jm.destinatarios[4]="elitano@procesosproductivos.com";
//            jm.destinatarios[5]="pverastegui@procesosproductivos.com";
            jm.destinatarios[0]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("PODAS")==0)
        {   jm.setTamañoDestinatarios(5);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="dminope@procesosproductivos.com";
            jm.destinatarios[2]="elitano@procesosproductivos.com";
            jm.destinatarios[3]="pverastegui@procesosproductivos.com";
            jm.destinatarios[4]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("LOGISTICA")==0)
        {   jm.setTamañoDestinatarios(4);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="jormachea@procesosproductivos.com";
            jm.destinatarios[2]="elitano@procesosproductivos.com";
            jm.destinatarios[3]="pverastegui@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("SEGURIDAD")==0)
        {   jm.setTamañoDestinatarios(5);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="jlramos@procesosproductivos.com";
            jm.destinatarios[2]="elitano@procesosproductivos.com";
            jm.destinatarios[3]="pverastegui@procesosproductivos.com";
            jm.destinatarios[4]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("TODAS")==0)
        {   jm.setTamañoDestinatarios(4);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="elitano@procesosproductivos.com";
            jm.destinatarios[2]="pverastegui@procesosproductivos.com";
            jm.destinatarios[3]="jormachea@procesosproductivos.com";
        }
        if(areaTrabajador(jLabel2.getText().substring(22)).compareTo("TERMOGRAFIA")==0)
        {   jm.setTamañoDestinatarios(5);
            jm.destinatarios[0]=correoDestinatario;
            jm.destinatarios[1]="eyarleque@procesosproductivos.com";
            jm.destinatarios[2]="elitano@procesosproductivos.com";
            jm.destinatarios[3]="pverastegui@procesosproductivos.com";
            jm.destinatarios[4]="jormachea@procesosproductivos.com";
        }
    }   
    
    String areaTrabajador(String nombresApellidos)
    {   String area="";
        try
        {   rs=st.executeQuery("SELECT A.`AREA` FROM Trabajador T INNER JOIN Persona P ON T.`DNI`=P.`DNI` INNER JOIN AREA A ON T.`IDAREA`=A.`ID` WHERE CONCAT(P.`APELLIDOP`, ' ',P.`APELLIDOM`, ' ',P.`NOMBRES`)='"+nombresApellidos+"';");
            if(rs.next())
                area=rs.getString(1);
        }
        catch(SQLException e)   {   JOptionPane.showMessageDialog(this,"Error debido a: "+e.toString());    }
        return area;      
    }
    
    String mensaje(String entregado)
    {   return "<h4>Estimado Percy</h4>"+
                "<h3>Para informar que, con fecha "+getFecha()+"</h3>Se hizo entrega de Equipo(s) / Herramientas(s) / Articulo(s) / Otros"
                + "con detalles en CARGO ADJUNTO, a:</h3>"+
                "<h3>"+jLabel2.getText().substring(22)+"</h3>"+
                "<h4>Saludos</h4>"+
                "<h4>Atte.</h4>"+
                "<h4>"+entregado+"</h4>";
    }
    
    String getFecha()
    {   String fechaHora="";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fechaHora=sdf.format(dt);
        return fechaHora;
    }
    
    String nombreArchivo()
    {   return jLabel8.getText()+".pdf";
    }
    
    String asunto()
    {   return "Cargo : "+jLabel8.getText();
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    boolean buscarCodigoEnTabla(String codigo)
    {   boolean encontrado=false;
        for(int i=0; i<jTable1.getRowCount(); i++)
        {   if(jTable1.getValueAt(i, 0).toString().compareTo(codigo)==0)            
                encontrado=true;
        }
        return encontrado;
    }
    
    void limpiarTabla()
    {   int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--)           
            modelo.removeRow(jTable1.getRowCount()-1);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
