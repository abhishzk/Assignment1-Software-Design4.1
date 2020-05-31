
package creditcardmanagementsystem;

import static creditcardmanagementsystem.AdminWorkspace.buildTableModel;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 * @author ${Abhishek Kumar}
 *
 *
 */
public class DisplayDetails extends javax.swing.JFrame {
    ViewDetailsLogin vdl;
    ResultSet rs;

    
    public DisplayDetails() {
        initComponents();
    }
    
    public DisplayDetails(ResultSet rs) {
        try {
            initComponents();
            this.rs=rs;
            JTable table = new JTable(buildTableModel(this.rs));
            table.setRowHeight(35);
            this.setLayout(new FlowLayout());
            this.add(table);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        ButtonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonLogout.setText("Logout");
        ButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(ButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(ButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        pack();
    }

    private void ButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogoutActionPerformed

        vdl = new ViewDetailsLogin();
        this.hide();
        vdl.show();        
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
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayDetails().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton ButtonLogout;
    
}
