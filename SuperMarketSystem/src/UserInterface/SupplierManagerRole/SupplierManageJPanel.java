/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import UserInterface.SupplierRole.SupplierLoginJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */

public class SupplierManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierManageJPanel
     */
    
    private JPanel rightJPanel;
    private SupplierOrganization supplierOrg;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private SupplierDirectory suppDir;
    private int flag;
    
    public SupplierManageJPanel(JPanel rightJPanel,UserAccount userAccount,SupplierOrganization supplierOrg,Enterprise enterprise) {
        initComponents();
        
        this.rightJPanel=rightJPanel;
        this.enterprise=enterprise;
        this.supplierOrg= supplierOrg;
        this.userAccount= userAccount;
        //populateSuppTable();
        
    }

    
    private void populateSuppTable()
    {
        DefaultTableModel model = (DefaultTableModel) suppTbl.getModel();
        
        model.setRowCount(0);
        
        for (Supplier supplier : enterprise.getSupplierDirectory().getSupplierList()){
            Object[] row = new Object[2];
            //System.out.println("supplier.getSupplierId(): "+supplier.getSupplierId());
            row[0] = supplier.getSupplierId();
            //System.out.println("supplier.getSupplierName(): "+supplier.getSupplierName());
            row[1] = supplier.getSupplierName();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        suppTbl = new javax.swing.JTable();
        SupplierNameTxt = new javax.swing.JTextField();
        SupplierIDTxt = new javax.swing.JTextField();
        SupplierPassTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddSupplierBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        supplierBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 104, 80));

        suppTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Supplier ID", "Supplier Name"
            }
        ));
        jScrollPane1.setViewportView(suppTbl);

        jLabel1.setText("Supplier Name");

        jLabel2.setText("Supplier ID");

        jLabel3.setText("Password");

        AddSupplierBtn.setText("Add Supplier");
        AddSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Supplier");

        supplierBtn.setText("Supplier");
        supplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(AddSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(supplierBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SupplierPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupplierIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupplierNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupplierNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SupplierIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SupplierPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierBtn)
                    .addComponent(AddSupplierBtn))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierBtnActionPerformed
//        String supplierName=SupplierNameTxt.getText();
//        int supplierID=Integer.parseInt(SupplierIDTxt.getText());
//        String pass=SupplierPassTxt.getText();
        
        flag=0;
        if(SupplierNameTxt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Supplier Name field cannot be empty");
            SupplierNameTxt.setText("");
            flag=1;
        }
        
        if(SupplierPassTxt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Supplier Password field cannot be empty");
            SupplierPassTxt.setText("");
            flag=1;
        }
        
        if (flag==0){             
            try{
                Integer.parseInt(SupplierIDTxt.getText());                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric value only for SupplierID field!!");
                return;
            }
            Supplier supp=enterprise.getSupplierDirectory().addSupplier();
            supp.setSupplierName(SupplierNameTxt.getText());
            supp.setSupplierId(Integer.parseInt(SupplierIDTxt.getText()));
            supp.setPassword(SupplierPassTxt.getText());
        
            JOptionPane.showMessageDialog(null, "Supplier Details added successfully");
            }
        else{
                JOptionPane.showMessageDialog(null, "Unable to add supplier details. Please enter correct values in fields!!");
        }
        populateSuppTable();
    }//GEN-LAST:event_AddSupplierBtnActionPerformed

    private void supplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierBtnActionPerformed
        SupplierLoginJPanel sljp= new SupplierLoginJPanel(rightJPanel,userAccount,supplierOrg,enterprise);
        rightJPanel.add("SupplierLoginJPanel", sljp);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel); 
    }//GEN-LAST:event_supplierBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSupplierBtn;
    private javax.swing.JTextField SupplierIDTxt;
    private javax.swing.JTextField SupplierNameTxt;
    private javax.swing.JTextField SupplierPassTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable suppTbl;
    private javax.swing.JButton supplierBtn;
    // End of variables declaration//GEN-END:variables
}