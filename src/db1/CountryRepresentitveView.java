/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db1;

import static db1.UserView.searchList;
import static db1.UserView.userviewref;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amll
 */

public class CountryRepresentitveView extends javax.swing.JFrame {
    static CountryRepresentitveView CountryRepFrame;
    public static CountryRepresentitveView RV = new CountryRepresentitveView();
     int n;
    int m;
     int [] ids =new int[100];
     int[] tempids=new int[100];
    String [] listStrings = new String[100];
      String [] temparr = new String[n];
      ArrayList<String> companiesList = new ArrayList<String>(m);
      ArrayList<String> names = new ArrayList<String>(n);
      String [] Ptype = new String [10];
    /**
     * Creates new form CountryRepresentitveView
     */
    static CountryRepresentitveView userviewref;
    public CountryRepresentitveView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchTextField = new javax.swing.JTextField();
        LocalCheckBox = new javax.swing.JCheckBox();
        radio_company_name = new javax.swing.JRadioButton();
        radio_companyID = new javax.swing.JRadioButton();
        radio_country_name = new javax.swing.JRadioButton();
        radio_productID = new javax.swing.JRadioButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        setResizable(false);

        LocalCheckBox.setText("Local Products only");
        LocalCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalCheckBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_company_name);
        radio_company_name.setText("By Company Name");
        radio_company_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_company_nameActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_companyID);
        radio_companyID.setText("By Company Id");
        radio_companyID.setAutoscrolls(true);
        radio_companyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_companyIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_country_name);
        radio_country_name.setText("By Country Name");
        radio_country_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_country_nameActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_productID);
        radio_productID.setText("By Product Id");
        radio_productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_productIDActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        searchList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        searchList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                searchListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(searchList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_productID)
                            .addComponent(radio_country_name)
                            .addComponent(radio_companyID)
                            .addComponent(radio_company_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LocalCheckBox)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_company_name)
                    .addComponent(LocalCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_companyID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_country_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_productID)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
         String username_email=signinForm.usernameText.getText();
        System.out.println(username_email);
    if(LocalCheckBox.isSelected()==false)
    {
    try{
         String SearchedItem= searchTextField.getText();
         if(SearchedItem==null||SearchedItem.isEmpty())
         {
             JOptionPane.showMessageDialog(this, "Please enter some thing to be searched");
         }
         else if(radio_company_name.isSelected()==false&&radio_companyID.isSelected()==false&&radio_country_name.isSelected()==false&&radio_productID.isSelected()==false){
             JOptionPane.showMessageDialog(this, "Please select you want to search by product name or price or id or category");
         }
         else{
        if(radio_company_name.isSelected()==true)
        {    
        try{ 
            String type= SearchedItem;
        String productname = "select Name from product where Id in (select PRODUCT_ID from produce as p inner join company as c on p.COMPANY_ID = c.Id where Company_name like '%"+type+"%')" ;
        ResultSet rs = MysqlCon.ExcuteQuery(productname);
       
        while(rs.next())
        {String pname=rs.getString("Name");
            names.add(pname);
            n=n+1;}
        String[] namearray = new String[n] ;
        for(int i = 0 ; i < n ; i++)
           namearray[i]=names.get(i);
        searchList.setListData(namearray);
        }
        catch(Exception e){
        }}
        else if(radio_companyID.isSelected()==true)
        { int company_id= Integer.parseInt(SearchedItem);
           
            String productname = "select Name from product where Id in(select PRODUCT_ID from produce where COMPANY_ID ='"+ company_id+"%' )";
             ResultSet rs = MysqlCon.ExcuteQuery(productname);
          
        while(rs.next())
        {String pname=rs.getString("Name");
            names.add(pname);
            n=n+1;}
        String[] namearray = new String[n] ;
        for(int i = 0 ; i < n ; i++)
           namearray[i]=names.get(i);
        searchList.setListData(namearray);
        
        }
        
        else if(radio_country_name.isSelected()==true)
        {
            String type= SearchedItem;
        
        String productname = "select Name from product where Id in (select PRODUCT_ID from produce as p inner join interactwith as i \n on p.COMPANY_ID = i.CompanyId where CountryID in(select Id from country where Country_name like '%"+type+"%'))" ; 
        ResultSet rs = MysqlCon.ExcuteQuery(productname);
        while(rs.next())
        {String pname=rs.getString("Name");
            names.add(pname);
            n=n+1;}
        String[] namearray = new String[n] ;
        for(int i = 0 ; i < n ; i++)
           namearray[i]=names.get(i);
        searchList.setListData(namearray);
        }
        else{
              if(radio_productID.isSelected()==true)
        {     int prod_id= Integer.parseInt(SearchedItem);
       
        String productname = "SELECT Name FROM product where Id ='"+ prod_id+"%'"; 
        ResultSet rs = MysqlCon.ExcuteQuery(productname);
        while(rs.next())
        {String pname=rs.getString("Name");
            names.add(pname);
            n=n+1;}
        String[] namearray = new String[n] ;
        for(int i = 0 ; i < n ; i++)
           namearray[i]=names.get(i);
        searchList.setListData(namearray);
        }}}}
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
            }}
    
    if (LocalCheckBox.isSelected() == true) {
            try {
           
                if (radio_company_name.isSelected() == true) {
                    try{
                    String companyname = searchTextField.getText();

            String productname="select Name from product where Id in(select PRODUCT_ID from produce where COMPANY_ID in (select Id from company where Company_name in (select Company_name from company where Company_name like %'"+companyname+"'% And Id in(select CompanyId from interactwith where CountryId in (select Id from country where Country_name in (select localCountry from user where Email='"+username_email+"' or UserName ='"+username_email+"'))))))";
                    ResultSet rs = MysqlCon.ExcuteQuery(productname);
                    while (rs.next()) {
                        String pname = rs.getString("Name");
                        names.add(pname);
                        n = n + 1;
                    }
                    String[] namearray = new String[n];
                    for (int i = 0; i < n; i++) {
                        namearray[i] = names.get(i);
                    }
                    searchList.setListData(namearray);
                } 
                catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Please enter the Right name of product don't enter numeric input");
                        }}
    else if (radio_productID.isSelected() == true) {
        try{     
                    int prod_id = Integer.parseInt(searchTextField.getText());
                    String id = "select Name from product where Id ='"+prod_id+"' And Id in (select PRODUCT_ID from produce where COMPANY_ID in(select CompanyId from interactwith where CountryId inlect Id from country where Country_name in(select localCountry from user where Email='"+username_email+"' or UserName ='"+username_email+"'))))";
                    ResultSet IDRS = MysqlCon.ExcuteQuery(id);
                    while(IDRS.next())
                    {
                        String pname = IDRS.getString("Name");
                        
                        names.add(pname);
                        n = n + 1;}
                    String[] namearray = new String[n];
                    for (int i = 0; i < n; i++) {
                        namearray[i] = names.get(i);
                    }
                    searchList.setListData(namearray);}
        catch(Exception e)
                       {
                            JOptionPane.showMessageDialog(this, "Please enter the Right id of product don't enter Alphaptic input");
                        }}
    else if (radio_companyID.isSelected() == true) {
        try{
                    int company_id = Integer.parseInt(searchTextField.getText());
                    
                    String companyId="select Name from product where Id in(select Id from company where Id = '"+company_id+"' And Id in(select CompanyId from interactwith where CountryId in(select Id from country where Country_name in(select localCountry from user where Email='"+username_email+"' or UserName ='"+username_email+"')))))";
                    ResultSet rs = MysqlCon.ExcuteQuery(companyId);
                    while (rs.next()) {
                        String pname = rs.getString("Name");
                        names.add(pname);
                        n = n + 1;
                    }
                    String[] namearray = new String[n];
                    for (int i = 0; i < n; i++) {
                        namearray[i] = names.get(i);
                    }
                    searchList.setListData(namearray);
                } catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(this, "Please enter the Right range of price don't enter Alphaptic input");
                            }}
    else {
        try{
                    String type = searchTextField.getText();
                    String productType="select Name from product where Id in (select ProductId from buy_sell,country where CountryId in(select Id from country where Country_name in( select localCountry from user where  Email='"+username_email+"'or UserName='"+username_email+"'))) And ProductType   like '%" + type + "%'";
            
                    ResultSet rs = MysqlCon.ExcuteQuery(productType);
                    while (rs.next()) {
                        String pname = rs.getString("Name");
                        names.add(pname);
                        n = n + 1;
                    }
                    String[] namearray = new String[n];
                    for (int i = 0; i < n; i++) {
                        namearray[i] = names.get(i);
                    }
                    searchList.setListData(namearray);
                    
                }
                 catch(Exception e){
                                JOptionPane.showMessageDialog(this, "Please enter the Right type of product don't enter numeric input");
                                
                            }}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
      
    
    
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void LocalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalCheckBoxActionPerformed
        // TODO add your handling code here:
        if (LocalCheckBox.isSelected()==true)
            radio_country_name.setVisible(false);
        else
            radio_country_name.setVisible(true);
    }//GEN-LAST:event_LocalCheckBoxActionPerformed

    private void radio_country_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_country_nameActionPerformed
           LocalCheckBox.setEnabled(false);
    }//GEN-LAST:event_radio_country_nameActionPerformed

    private void radio_company_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_company_nameActionPerformed
LocalCheckBox.setEnabled(true);
    }//GEN-LAST:event_radio_company_nameActionPerformed

    private void radio_companyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_companyIDActionPerformed
LocalCheckBox.setEnabled(true);
    }//GEN-LAST:event_radio_companyIDActionPerformed

    private void radio_productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_productIDActionPerformed
LocalCheckBox.setEnabled(true);
    }//GEN-LAST:event_radio_productIDActionPerformed

    private void searchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_searchListValueChanged
        // TODO add your handling code here:
      int myi;
        int counter1 = 0;
        int counter = 0;
        Connection con = MysqlCon.Connect();
        String Product_Name = searchList.getSelectedValue();
        searchList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        RV.setVisible(false);
        representiveProductForm.RFORM.setVisible(true);
       representiveProductForm.RFORM.NameLable.setText(Product_Name);
        try {
            java.sql.Statement stmt = con.createStatement();
            ResultSet type = stmt.executeQuery("select ProductType from product where Name ='" + Product_Name + "'");
            while (type.next()) {
                String TYPE = type.getString("ProductType");
                Ptype[counter1] = TYPE;
                counter1 = counter1 + 1;
            }
            representiveProductForm.RFORM.TypeLable.setText(Ptype[0]);
            ResultSet rs = stmt.executeQuery("select Id from product where Name ='" + Product_Name + "'");
            while (rs.next()) {
                int i = rs.getInt("Id");
                ids[counter] = i;
                counter = counter + 1;
            }
            representiveProductForm.RFORM.IDLable.setText(Integer.toString(ids[0]));
//    ResultSet campanies=stmt.executeQuery("select Company_name,price from company,produce where Id =(select COMPANY_ID from produce where PRODUCT_ID=(select Id from product where Name= '"+Product_Name+"%'))");
            ResultSet campanies = stmt.executeQuery(String.format("select Company_name,price from company inner join produce on Id = COMPANY_ID where PRODUCT_ID in (select Id from product where Name ='%s')", Product_Name));
            ResultSet country = stmt.executeQuery(String.format("select Country_name,Quantity from ccountry inner join buy_sell on Id = CountryId where PRODUCT_ID in (select Id from product where Name ='%s')", Product_Name));
            DefaultTableModel table_model = new DefaultTableModel();
             DefaultTableModel table_model2 = new DefaultTableModel();
            representiveProductForm.RFORM.jTable1.setModel(table_model);
            representiveProductForm.RFORM.jTable3.setModel(table_model2); 
            table_model2.addColumn("country");
             table_model2.addColumn("country quantity");
            table_model.addColumn("Campany");
            table_model.addColumn("Price");
           
            while (campanies.next()) {
                String company_name = campanies.getString("Company_name");
                String price = campanies.getString("price");
                Vector row = new Vector();
                row.add(company_name);
                row.add(price);
                table_model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_searchListValueChanged

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
            java.util.logging.Logger.getLogger(CountryRepresentitveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountryRepresentitveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountryRepresentitveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountryRepresentitveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                userviewref = new CountryRepresentitveView();
                userviewref.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LocalCheckBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_companyID;
    private javax.swing.JRadioButton radio_company_name;
    private javax.swing.JRadioButton radio_country_name;
    private javax.swing.JRadioButton radio_productID;
    private javax.swing.JList<String> searchList;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}