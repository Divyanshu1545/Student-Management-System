
import java.sql.*;
import java.sql.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Update_Students extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;

    /**
     * Creates new form Update_Students
     */
    public Update_Students() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SNo");

        jLabel2.setText("Change");

        jComboBox1.setBackground(new java.awt.Color(153, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "DOB", "Address", "Phone No", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("To");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int sn=Integer.parseInt(jTextField1.getText());
    String obj="";
    String val=jTextField2.getText();
    if(jComboBox1.getSelectedIndex()==0){
          
    try{
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","123");
          String q="update students set First_Name=? where sno=?;";
          pst=conn.prepareStatement(q);
          
          
          pst.setString(1,val);
          pst.setInt(2,sn);
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data has been updated ");
         
          
           conn.close();
          
         
      }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      }
      }
    if(jComboBox1.getSelectedIndex()==1){
         
    try{
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","123");
          String q="update students set Last_Name=? where sno=?;";
          pst=conn.prepareStatement(q);
          
          
          pst.setString(1,val);
          pst.setInt(2,sn);
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data has been updated ");
         
          
           conn.close();
          
         
      }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      }
    }
    
    if(jComboBox1.getSelectedIndex()==2){
        
    try{
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","123");
          String q="update students set DOB=? where sno=?;";
          pst=conn.prepareStatement(q);
          
          
          pst.setString(1,val);
          pst.setInt(2,sn);
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data has been updated ");
         
          
           conn.close();
          
         
      }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      }
    }
    if(jComboBox1.getSelectedIndex()==3){
        
    try{
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","123");
           String q="update students set Address=? where sno=?;";
          pst=conn.prepareStatement(q);
          
          pst.setString(1,val);
          pst.setInt(2,sn);
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data has been updated ");
         
          
           conn.close();
          
         
      }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      }
    }
        
    
    
    
    
    if(jComboBox1.getSelectedIndex()==4){
          
    try{
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","123");
           String q="update students set Phone_no=? where sno=?;";
          pst=conn.prepareStatement(q);
          
          
          pst.setString(1,val);
          pst.setInt(2,sn);
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data has been updated ");
         
          
           conn.close();
          
         
      }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      }
    }
        
                                        

                                         

        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Update_Students().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
