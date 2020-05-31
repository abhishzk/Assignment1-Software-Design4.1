
package creditcardmanagementsystem;

import javax.swing.JOptionPane;


/**
 * @author ${Abhishek Kumar}
 *
 *
 */
public class ItemPurchase extends javax.swing.JFrame {
    PaymentDetails pd;
    Home h;
    Double cost=0.0;
    String s="";

   
    public ItemPurchase() {
        initComponents();
        this.setSize(1280, 720);
        ListItem.removeAllItems();
        ListItem.addItem("Shoes $40");
        ListItem.addItem("Shirt $50");
        ListItem.addItem("Pant $75");
        ListItem.addItem("Mobile $175");
        ListItem.addItem("Pendrive $22");
        ListItem.addItem("charger $15");
        ListItem.addItem("Earphone $10");
        ListItem.addItem("Belt $60");
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListItem = new javax.swing.JComboBox<>();
        ButtonAddToCart = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        TextQuantity = new javax.swing.JTextField();
        ButtonProceed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextItem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Items");

        jLabel1.setText("Item");

        ListItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonAddToCart.setText("Add to cart");
        ButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddToCartActionPerformed(evt);
            }
        });

        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        TextQuantity.setText("0");

        ButtonProceed.setText("Proceed");
        ButtonProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProceedActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ListItem, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ButtonProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListItem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TextItem.setColumns(20);
        TextItem.setRows(5);
        jScrollPane1.setViewportView(TextItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(223, 223, 223))
        );

        pack();
    }

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed

        h=new Home();
        this.hide();
        h.show();
    }
    private void ButtonProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProceedActionPerformed

        pd=new PaymentDetails(s,cost);
        this.hide();
        pd.show();
    }

    private void ButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddToCartActionPerformed

        if(ListItem.getSelectedIndex()==0)
        {
            try {
                cost += (40 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==1)
        {
            try {
                cost += (50 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==2)
        {
            try {
                cost += (75 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==3)
        {
            try {
                cost += (175 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==4)
        {
            try {
                cost += (22 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==5)
        {
            try {
                cost += (15 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==6)
        {
            try {
                cost += (10 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        if(ListItem.getSelectedIndex()==7)
        {
            try {
                cost += (60 * Integer.parseInt(TextQuantity.getText()));
                s+="\n=>nNew item purchased \n   Total cost : $"+cost;
                TextItem.setText(s);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }            
        }
          
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
            java.util.logging.Logger.getLogger(ItemPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemPurchase().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton ButtonAddToCart;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonProceed;
    private javax.swing.JComboBox<String> ListItem;
    private javax.swing.JTextArea TextItem;
    private javax.swing.JTextField TextQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
   
}
