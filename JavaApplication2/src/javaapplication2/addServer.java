/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.Calendar;
import java.io.File;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import net.proteanit.sql.DbUtils;




/**
 *
 * @author Sergii.Marchuk
 */
public class addServer extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null; 

    /**
     * Creates new form addServer
     */
    public addServer() {
        initComponents();
        conn = db.java_db();
        
         Toolkit toolkit = getToolkit();
         Dimension size = toolkit.getScreenSize();
         setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
         setExtendedState(addServer.MAXIMIZED_BOTH);   
        
        Update_table();
        
        
        
    }
    
        private void Update_table() {
        try{
        String sql = "select * from tab_main_resp_server";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        table_allowance.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
        
            try{
                rs.close();
                pst.close();
        }
            catch(Exception e){
                
            }
    }
}
        
        
 





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_server_name = new javax.swing.JTextField();
        txt_first_resp_person = new javax.swing.JTextField();
        txt_second_resp_person = new javax.swing.JTextField();
        txt_system_name = new javax.swing.JTextField();
        txt_project_name = new javax.swing.JTextField();
        txt_operation_system = new javax.swing.JTextField();
        txt_platform_name = new javax.swing.JTextField();
        txt_addit_info = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_addit_info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_customer = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_allowance = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_find = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_project_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_nameActionPerformed(evt);
            }
        });

        txt_addit_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addit_infoActionPerformed(evt);
            }
        });

        jLabel1.setText("Server name");

        jLabel2.setText("First resp. person");

        jLabel3.setText("Second resp. person");

        jLabel4.setText("Customer Name");

        jLabel5.setText("System name");

        jLabel6.setText("Project name");

        jLabel7.setText("Operation system");

        jLabel8.setText("Platform name");

        lbl_addit_info.setText("Additional information");

        jButton1.setText("Add record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_customer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..", "Telenor", "Bluegarden" }));

        jButton2.setText("Update record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete record");

        table_allowance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_allowance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_allowanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_allowance);

        jLabel9.setText("Input server name");

        txt_find.setText("%");

        jButton4.setText("Find record");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("jLabel10");

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_addit_info)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_server_name, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_platform_name)
                                    .addComponent(txt_addit_info)
                                    .addComponent(txt_operation_system, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_project_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_system_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_second_resp_person, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_first_resp_person, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_find)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(79, 79, 79)
                .addComponent(jButton5)
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_server_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_first_resp_person, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_second_resp_person, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_system_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_project_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_operation_system, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_platform_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_addit_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_addit_info)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel9)
                    .addComponent(txt_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton5))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_project_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_project_nameActionPerformed

    private void txt_addit_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addit_infoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addit_infoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {                         
            String sql = "insert into tab_main_resp_server "
                    + "(server_name,first_resp_person,second_resp_person,"
                    + "customer,system_name,project_name,"
                    + "operation_system,platform_name,addit_info) values (?,?,?,?,?,?,?,?,?) ";
                    
            pst=conn.prepareStatement(sql);
            if (txt_server_name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter server name");
            }else
            pst.setString(1,txt_server_name.getText());
            //pst.setString(2,txt_first_resp_person.getText());
            //pst.setString(3,txt_second_resp_person.getText());
            if (txt_customer.getSelectedItem().toString() == "..") {
                JOptionPane.showMessageDialog(null, "Please choose customer.");
            }else{
                pst.setString(2,txt_first_resp_person.getText());
                pst.setString(3,txt_second_resp_person.getText());
                pst.setString(4,txt_customer.getSelectedItem().toString());
                pst.setString(5,txt_system_name.getText());
                pst.setString(6,txt_project_name.getText());
                pst.setString(7,txt_operation_system.getText());
                pst.setString(8,txt_platform_name.getText());
                pst.setString(9, txt_addit_info.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                 //  JOptionPane.showMessageDialog(null,e);
                }
             
               
         }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{

            if (txt_find.getText().equals("*"))  {
                //JOptionPane.showMessageDialog(null, "Please enter server name");
                String sql = "select * from tab_main_resp_server";
                pst = conn.prepareStatement(sql);

                pst.execute();

                rs = pst.executeQuery();
                table_allowance.setModel(DbUtils.resultSetToTableModel(rs));

            }
            //else if (txt_find.getText().equals("%"))  {
            else if (txt_find.getText().contains("%") )  {
                
                
          //      {
        //String alpha = "how, to, do, in, java";
        //String alpha = "howtodon%java";
        
        //Remove whitespace and split by comma
        //java.util.List<String> result = Arrays.asList(alpha.split("\\%"));
//        
        //{
        //    System.out.println(result.get(0));
    //}
      //    }
                
                String part = txt_find.getText();
                java.util.List<String> result = Arrays.asList(part.split("\\%"));               
                
                System.out.println(result.get(0));
                
                jLabel10.setText(result.get(0));

                //JOptionPane.showMessageDialog(null, "Please enter server name");
                //String sql = "select * from tab_main_resp_server";
                //String sql = "SELECT * FROM tab_main_resp_server WHERE server_name LIKE '%" + (result.get(1)) + "'";
                String sql = "SELECT DISTINCT \"server_name\" FROM \"tab_collect_statistic\" WHERE  \"server_name\"  like '" + result.get(0) + "%'";
                pst = conn.prepareStatement(sql);

                pst.execute();

                rs = pst.executeQuery();
                table_allowance.setModel(DbUtils.resultSetToTableModel(rs));

            }
            else  {
                String sql = "select * from tab_main_resp_server where server_name =?";
                pst = conn.prepareStatement(sql);

                pst.setString(1,txt_find.getText());
                pst.execute();

                rs = pst.executeQuery();
                table_allowance.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {

            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLabel10.setText(txt_find.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table_allowanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_allowanceMouseClicked
        // TODO add your handling code here:
        //int row = jTable1.getSelectedRow();  
        //txtus_id.setText(jTable1.getModel().getValueAt(row, 0).toString());     //us_id
        //txtuser_l.setText(jTable1.getModel().getValueAt(row, 1).toString());    //user_l
        //txtuser_f.setText(jTable1.getModel().getValueAt(row, 2).toString());    //user_f
        //txtdepartment.setText(jTable1.getModel().getValueAt(row, 3).toString());//department
        //txtregion.setText(jTable1.getModel().getValueAt(row, 4).toString());    //region
        //txtposition.setText(jTable1.getModel().getValueAt(row, 5).toString());  //position
        //txtstatus.setText(jTable1.getModel().getValueAt(row, 6).toString());    //status
        //txtpasswd.setText(jTable1.getModel().getValueAt(row, 7).toString());    //passwd
    }//GEN-LAST:event_table_allowanceMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_addit_info;
    private javax.swing.JTable table_allowance;
    private javax.swing.JTextField txt_addit_info;
    private javax.swing.JComboBox txt_customer;
    private javax.swing.JTextField txt_find;
    private javax.swing.JTextField txt_first_resp_person;
    private javax.swing.JTextField txt_operation_system;
    private javax.swing.JTextField txt_platform_name;
    private javax.swing.JTextField txt_project_name;
    private javax.swing.JTextField txt_second_resp_person;
    private javax.swing.JTextField txt_server_name;
    private javax.swing.JTextField txt_system_name;
    // End of variables declaration//GEN-END:variables
}
