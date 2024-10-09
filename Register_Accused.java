
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OWNER
 */
public class Register_Accused extends javax.swing.JFrame {

    /**
     * Creates new form Criminal
     */
    public Register_Accused() {
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

        Accused_ID = new javax.swing.JLabel();
        Accused_Name = new javax.swing.JLabel();
        Accused_Address = new javax.swing.JLabel();
        Accused_Phone = new javax.swing.JLabel();
        Accused_FIR_ID = new javax.swing.JLabel();
        Accused_ID_Field = new javax.swing.JTextField();
        Accused_Name_Field = new javax.swing.JTextField();
        Accused_Address_Field = new javax.swing.JTextField();
        Accused_Phone_Field = new javax.swing.JTextField();
        Accused_FIR_ID_Field = new javax.swing.JTextField();
        Accused_Insert_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Accused_Return_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Accused_ID.setText("Accused_ID");

        Accused_Name.setText("Accused_Name");

        Accused_Address.setText("Accused_Address");

        Accused_Phone.setText("Accused_Phone");

        Accused_FIR_ID.setText("FIR_ID");

        Accused_ID_Field.setToolTipText("yyyy-mm-dd");
        Accused_ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_ID_FieldActionPerformed(evt);
            }
        });

        Accused_Address_Field.setToolTipText("int");
        Accused_Address_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_Address_FieldActionPerformed(evt);
            }
        });

        Accused_FIR_ID_Field.setToolTipText("yyyy-mm-dd");
        Accused_FIR_ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_FIR_ID_FieldActionPerformed(evt);
            }
        });

        Accused_Insert_Button.setText("Insert");
        Accused_Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_Insert_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCUSED REGISTRATION FORM");

        Accused_Return_Button.setText("Return");
        Accused_Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_Return_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Accused_ID)
                            .addComponent(Accused_Name)
                            .addComponent(Accused_Address)
                            .addComponent(Accused_Phone)
                            .addComponent(Accused_FIR_ID))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Accused_Phone_Field)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Accused_Insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Accused_Return_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Accused_Name_Field)
                            .addComponent(Accused_Address_Field)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Accused_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Accused_FIR_ID_Field))
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Accused_ID)
                    .addComponent(Accused_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_Name)
                    .addComponent(Accused_Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_Address)
                    .addComponent(Accused_Address_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_Phone)
                    .addComponent(Accused_Phone_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_FIR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accused_FIR_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_Insert_Button)
                    .addComponent(Accused_Return_Button))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String url="jdbc:sqlserver://localhost:1433;databaseName=CrimeRecordManagementSystem;user=MurtazaDatabase;password=murtaza123";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
       
    private void Accused_Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_Insert_ButtonActionPerformed
        
        try
        {
            
            if(Accused_Address_Field.getText().trim().isEmpty() || 
               Accused_FIR_ID_Field.getText().trim().isEmpty() ||  
               Accused_ID_Field.getText().trim().isEmpty() || 
               Accused_Name_Field.getText().trim().isEmpty() ||
               Accused_Phone_Field.getText().trim().isEmpty()  )
            {
                JOptionPane.showMessageDialog(this, "Fields Should Not Be Null");
                
            }

            else
            {
            
                Class.forName(driver);
                Connection connection= DriverManager.getConnection(url);

                String SQL="insert into Accused"
                        + "(Accused_Id, Accused_name, Accused_address, Accused_ph, Fir_id)"
                        +"values(?, ?, ?, ?, ?)";

                PreparedStatement pst = connection.prepareStatement(SQL);

                pst.setString(1, Accused_ID_Field.getText());
                pst.setString(2, Accused_Name_Field.getText());
                pst.setString(3, Accused_Address_Field.getText());
                pst.setString(4, Accused_Phone_Field.getText());
                pst.setString(5, Accused_FIR_ID_Field.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Accused Person Register Successfully");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
           
        }
        
        
        
        
    }//GEN-LAST:event_Accused_Insert_ButtonActionPerformed

    private void Accused_ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Accused_ID_FieldActionPerformed

    private void Accused_FIR_ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_FIR_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Accused_FIR_ID_FieldActionPerformed

    private void Accused_Address_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_Address_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Accused_Address_FieldActionPerformed

    private void Accused_Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_Return_ButtonActionPerformed
        Main_Page main_Page = new Main_Page();
        main_Page.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_Accused_Return_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Accused().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accused_Address;
    private javax.swing.JTextField Accused_Address_Field;
    private javax.swing.JLabel Accused_FIR_ID;
    private javax.swing.JTextField Accused_FIR_ID_Field;
    private javax.swing.JLabel Accused_ID;
    private javax.swing.JTextField Accused_ID_Field;
    private javax.swing.JButton Accused_Insert_Button;
    private javax.swing.JLabel Accused_Name;
    private javax.swing.JTextField Accused_Name_Field;
    private javax.swing.JLabel Accused_Phone;
    private javax.swing.JTextField Accused_Phone_Field;
    private javax.swing.JButton Accused_Return_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
