/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db1;

import java.sql.Connection;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class UserView extends javax.swing.JFrame {
    int n;
    int m;
    int[] ids = new int[100];
    int[] tempids = new int[100];
    String[] listStrings = new String[100];
    String[] temparr = new String[n];
    ArrayList<String> companiesList = new ArrayList<String>(m);
    ArrayList<String> names = new ArrayList<String>(n);
    String[] Ptype = new String[10];
    static UserView userviewref;
    public UserView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchTextField = new javax.swing.JTextField();
        LocalCheckBox = new javax.swing.JCheckBox();
        radio_name = new javax.swing.JRadioButton();
        radio_ID = new javax.swing.JRadioButton();
        radio_range = new javax.swing.JRadioButton();
        radio_category = new javax.swing.JRadioButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        setResizable(false);

        LocalCheckBox.setText("Local Products only");

        buttonGroup1.add(radio_name);
        radio_name.setText("By Product Name");

        buttonGroup1.add(radio_ID);
        radio_ID.setText("By Product Id");
        radio_ID.setAutoscrolls(true);

        buttonGroup1.add(radio_range);
        radio_range.setText("By Price Range");

        buttonGroup1.add(radio_category);
        radio_category.setText("By Product Category");

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

        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(radio_category)
                                    .addComponent(radio_range)
                                    .addComponent(radio_ID)
                                    .addComponent(radio_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LocalCheckBox))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(radio_name)
                    .addComponent(LocalCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_range)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_category)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        String[] empty_array_string = new String[] {""};
        searchList.setListData(empty_array_string);
        String username_email = signinForm.usernameText.getText();
        //System.out.println(username_email);
        String SearchedItem = searchTextField.getText();
         if (SearchedItem == null || SearchedItem.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter some thing to be searched");
                } else if (radio_name.isSelected() == false && radio_ID.isSelected() == false && radio_range.isSelected() == false && radio_category.isSelected() == false) {
                    JOptionPane.showMessageDialog(this, "Please select you want to search by product name or price or id or category");
                }
                else{}
         
         
        if (LocalCheckBox.isSelected() == false) {
            try {
                    if (radio_name.isSelected() == true) {
                        try {
                            
                            String productname = "select Name from product where Name like '%" + SearchedItem + "%'";
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
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Please enter the Right name of product don't enter numeric input");
                        }
                    } else if (radio_ID.isSelected() == true) {
                        try{
                        int prod_id = Integer.parseInt(SearchedItem);
                        String productname = "SELECT Name FROM product where Id ='" + prod_id + "%'";
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
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this, "Please enter the Right id of product don't enter Alphaptic input");
                        }}
                        else if (radio_range.isSelected() == true) {
                            try{
                        int pricerangeinput = Integer.parseInt(SearchedItem);
                        String price = String.format("select Name from product Inner join produce on product.Id = produce.PRODUCT_ID where Price between %s And %s", pricerangeinput - 50, 50 + pricerangeinput);
                        ResultSet rs = MysqlCon.ExcuteQuery(price);
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
                            catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(this, "Please enter the Right range of price don't enter Alphaptic input");
                            }}
                            else {
                        if (radio_category.isSelected() == true) {
                            try{
                            String type = SearchedItem;
                            String productname = "select Name from product where ProductType like '%" + type + "%'";
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
                            catch(Exception e){
                                JOptionPane.showMessageDialog(this, "Please enter the Right type of product don't enter numeric input");
                                
                            }
                            
                        }
                    }
                }
             catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (LocalCheckBox.isSelected() == true) {
            try {
           
                if (radio_name.isSelected() == true) {
                    try{
                    String name = searchTextField.getText();
//                    String productname = "select Name from product where name like '%" + name + "%' And Id IN (select ProductId from buy_sell,country where CountryId IN(select Id from country where Country_name IN(select localCountry from user where UserName = '" + username_email + "%'or Email='" + username_email + "%')))";
                    String productname = "select Name from product where name like '%"+name+"%' And Id in (select ProductId from buy_sell,country where CountryId in (select Id from country where Country_name in (select localCountry from user where Username='"+username_email+"' OR Email='"+username_email+"')))";
//                    System.out.println(productname);
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
    else if (radio_ID.isSelected() == true) {
        try{     
                    int prod_id = Integer.parseInt(searchTextField.getText());
                    String id = "select Name from product where Id in (select ProductId from buy_sell,country where CountryId in (select Id from country where Country_name in(select localCountry from user where Email='"+username_email+"' or UserName='"+username_email+"'))) And Id ='"+prod_id+"'";
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
    else if (radio_range.isSelected() == true) {
        try{
                    int pricerangeinput = Integer.parseInt(searchTextField.getText());
                    int max=50+pricerangeinput;
                    int min=pricerangeinput-50;
                    String price ="select Name from product where Id in (select ProductId from buy_sell,country where CountryId in(select Id from country where Country_name in( select localCountry from user where  Email='"+username_email+"' or UserName='"+username_email+"')))And Id in(select Id from product Inner join produce on product.Id = produce.PRODUCT_ID where Price between '"+min+"' and '"+max+"')";
                    ResultSet rs = MysqlCon.ExcuteQuery(price);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        searchTextField.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_searchListValueChanged
        // TODO add your handling code here:
        int myi;
        int counter1 = 0;
        int counter = 0;
        Connection con = MysqlCon.Connect();
        String Product_Name = searchList.getSelectedValue();
        searchList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        userviewref.setVisible(false);
        ProductForm.pf.setVisible(true);
        ProductForm.pf.NameLable.setText(Product_Name);
        try {
            java.sql.Statement stmt = con.createStatement();
            ResultSet type = stmt.executeQuery("select ProductType from product where Name ='" + Product_Name + "'");
            while (type.next()) {
                String TYPE = type.getString("ProductType");
                Ptype[counter1] = TYPE;
                counter1 = counter1 + 1;
            }
            ProductForm.pf.TypeLable.setText(Ptype[0]);
            ResultSet rs = stmt.executeQuery("select Id from product where Name ='" + Product_Name + "'");
            while (rs.next()) {
                int i = rs.getInt("Id");
                ids[counter] = i;
                counter = counter + 1;
            }
            ProductForm.pf.IDLable.setText(Integer.toString(ids[0]));
//    ResultSet campanies=stmt.executeQuery("select Company_name,price from company,produce where Id =(select COMPANY_ID from produce where PRODUCT_ID=(select Id from product where Name= '"+Product_Name+"%'))");
            ResultSet campanies = stmt.executeQuery(String.format("select Company_name,price from company inner join produce on Id = COMPANY_ID where PRODUCT_ID in (select Id from product where Name ='%s')", Product_Name));
            DefaultTableModel table_model = new DefaultTableModel();
            ProductForm.jTable1.setModel(table_model);
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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        MysqlCon.Connect();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                userviewref = new UserView();
                userviewref.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LocalCheckBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_ID;
    private javax.swing.JRadioButton radio_category;
    private javax.swing.JRadioButton radio_name;
    private javax.swing.JRadioButton radio_range;
    public static javax.swing.JList<String> searchList;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
