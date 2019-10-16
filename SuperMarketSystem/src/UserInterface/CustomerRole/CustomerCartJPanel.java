/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Cart.Cart;
import Business.Cart.CartDirectory;
import Business.Customer.CustomerDirectory;
import Business.Network.City;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class CustomerCartJPanel extends javax.swing.JPanel {
    
    
    /**
     * Creates new form NewJPanel
     */
    private JPanel rightJPanel;
    private CustomerDirectory custDir;
    private City cityChoosen;
    private CartDirectory cartList;
    private SuperMarket superMarket;
    int total=0;
    private UserAccount user;
    public CustomerCartJPanel(JPanel rightJPanel,UserAccount user,CustomerDirectory custDir,SuperMarket superMarket, City cityChoosen, CartDirectory cartList) {
        initComponents();
        
        this.rightJPanel=rightJPanel;
        this.custDir=custDir;
        this.cityChoosen=cityChoosen;
        this.cartList=cartList;
        this.superMarket=superMarket;
        this.user=user;
        populateCartTable();
        
        
        
        
    }
    private void populateCartTable(){
        DefaultTableModel model = (DefaultTableModel) cartJTable.getModel();

        model.setRowCount(0);
        for (Cart cart : cartList.getCartList()) {
            Object[] row = new Object[3];
            row[0] = cart;
            row[1] = cart.getQuantity();
            row[2] = cart.getPrice();
            model.addRow(row);
            
        }
        totalPrice();
    }

    public void refreshTable()
    {
        int rowCount=cartJTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)cartJTable.getModel();
        for (int i = rowCount-1; i>=0; i-- ){
            model.removeRow(i);
        }
        
        for (Cart cart: cartList.getCartList()){
            Object row[]= new Object[3];
            row[0] = cart;
            row[1] = cart.getQuantity();
            row[2] = cart.getPrice();
            model.addRow(row);
        }
        totalPrice();
    }
    
    public void totalPrice()
    {
        
        for(int i = 0; i<cartJTable.getRowCount(); i++)
        {
            total = total + Integer.parseInt(cartJTable.getValueAt(i, 2).toString());
        }
        totalJLabel.setText(Integer.toString(total));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cartJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        CheckoutBtn = new javax.swing.JButton();
        totalJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 104, 80));

        cartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartJTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Cart!");

        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add Shopping Cart_50px.png"))); // NOI18N
        AddBtn.setText("Add Items");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Remove_50px.png"))); // NOI18N
        removeBtn.setText("Remove Items");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        CheckoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Checkout_50px.png"))); // NOI18N
        CheckoutBtn.setText("Proceed to Checkout");
        CheckoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutBtnActionPerformed(evt);
            }
        });

        totalJLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 3, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(AddBtn)
                        .addGap(172, 172, 172)
                        .addComponent(removeBtn)
                        .addGap(68, 68, 68)
                        .addComponent(CheckoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(totalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(removeBtn)
                    .addComponent(CheckoutBtn))
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        
        ChooseProductCategoryJPanel chooseProductCategory= new ChooseProductCategoryJPanel(rightJPanel,user,custDir,superMarket,cityChoosen,cartList);
        rightJPanel.add("Choose Product Category", chooseProductCategory);
         CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=cartJTable.getSelectedRow();
        if (selectedRow >= 0){
            int selectionButton= JOptionPane.YES_NO_OPTION;
            int selectionResult= JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION){
                Cart cart = (Cart)cartJTable.getValueAt(selectedRow, 0);
                cartList.removeProductfromCart(cart);
                refreshTable();
            }            
        }
        else{
                JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
        
    }//GEN-LAST:event_removeBtnActionPerformed

    private void CheckoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutBtnActionPerformed
        // TODO add your handling code here:
        
        CustomerCheckoutJPanel checkoutJPanel= new CustomerCheckoutJPanel(rightJPanel,user,custDir,superMarket,cityChoosen,cartList,total);
        rightJPanel.add("Checkout", checkoutJPanel);
         CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_CheckoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton CheckoutBtn;
    private javax.swing.JTable cartJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel totalJLabel;
    // End of variables declaration//GEN-END:variables
}