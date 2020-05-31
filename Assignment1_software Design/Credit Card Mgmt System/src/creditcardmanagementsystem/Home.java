
package creditcardmanagementsystem;
import java.sql.*;
import javax.swing.*;


/**
 * @author ${Abhishek Kumar}
 *
 *
 */
public class Home extends javax.swing.JFrame {

    AdminLogin al;
    ViewDetailsLogin vdl;
    ItemPurchase ip;
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    public Home() {
        initComponents();
        this.setSize(1280, 720);
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ButtonViewDetails = new javax.swing.JButton();
        ButtonHomeCustomer = new javax.swing.JButton();
        ButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Credit Card Management System");

        ButtonViewDetails.setText("Login as customer");
        ButtonViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewDetailsActionPerformed(evt);
            }
        });

        ButtonHomeCustomer.setText("Purchase Item");
        ButtonHomeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHomeCustomerActionPerformed(evt);
            }
        });

        ButtonAdmin.setText("Login as admin");
        ButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHomeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(ButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(ButtonViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(ButtonHomeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        jLabel1.getAccessibleContext().setAccessibleName("as");

        pack();
    }

    private void ButtonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewDetailsActionPerformed

        vdl = new ViewDetailsLogin();
        this.hide();
        vdl.show();
    }

    private void ButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdminActionPerformed

        
        conn=MySqlConnect.ConnectDB();
        try
        {
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        al = new AdminLogin();
        this.hide();
        al.show();

    }

    private void ButtonHomeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHomeCustomerActionPerformed

        ip = new ItemPurchase();
        this.hide();
        ip.show();
    }

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton ButtonAdmin;
    private javax.swing.JButton ButtonHomeCustomer;
    private javax.swing.JButton ButtonViewDetails;
    private javax.swing.JLabel jLabel1;
    
}
