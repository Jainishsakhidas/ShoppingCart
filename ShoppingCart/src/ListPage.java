/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaini
 */
import java.awt.*;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class ListPage extends javax.swing.JFrame {

    /**
     * Creates new form ListPage
     */
    int list_id;
    String list_name;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultListModel dm = new DefaultListModel(); 
    
    public ListPage() {
        initComponents();
        fill_id();
        fill_list();
    }
//    public ListPage(int l_id,String l_name ) {
//        initComponents();
////        fill_id();
//        list_id=l_id;
//        list_name=l_name;
////        fill_db();
//        fill_list();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 752, 516));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(752, 516));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(jLabel1);
        jLabel1.setText("Shopping Cart");
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(752, 516));
        jLabel1.setMinimumSize(new java.awt.Dimension(752, 516));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(752, 516));

        jList1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Add a List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete a List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DeleteList d=new DeleteList(null,true,this);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//          this.setVisible(false);
          AddList d=new AddList(null,true,this,list_id);
          d.setLocationRelativeTo(null);
          d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
        int index = jList1.getSelectedIndex();
        String l_name = jList1.getSelectedValue();
//        System.out.println("index: "+index);
//        System.out.println("name: "+l_name);
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/ShoppingCart","root","");
            String sql = "SELECT * FROM list where List_Name=?";
            pst=con.prepareStatement(sql);
            pst.setString(1,l_name);
            rs= pst.executeQuery();
            rs.next();
            int l_id=rs.getInt(1);
            con.close();
            this.setVisible(false);
            new ItemsPage(l_name,l_id).setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(ListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPage().setVisible(true);
            }
        });
    }
    
    public void fill_id(){
            try{
                int x=0;
                con = DriverManager.getConnection("jdbc:mysql://localhost/ShoppingCart","root","");
                String sql = "SELECT * FROM list";
                pst = con.prepareStatement(sql);
                rs= pst.executeQuery();
                if(rs==null){
                    this.list_id=0;
                }
                else{
                    while(rs.next()){
                        x = rs.getInt(1);
                    }
                    this.list_id=x;
                }
            con.close();
            }
            catch(SQLException e){
                
            }
    }
    
//    public void fill_db(){
//        
//        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost/ShoppingCart","root","");
//            String sql = "INSERT INTO list (`ID`, `List_name`) VALUES(?, ? );";
//            pst = con.prepareStatement(sql);
//            pst.setInt(1,list_id);
//            pst.setString(2,list_name);
//            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null,"Inserted Sucessfully ");
//            con.close();
//        }
//        catch(SQLException e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//    }
    
    public void fill_list(){
        try{
            dm.clear();
            dm.removeAllElements();
            con = DriverManager.getConnection("jdbc:mysql://localhost/ShoppingCart","root","");
            String sql = "SELECT * FROM list";
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String l_name=rs.getString(2);
                jList1.setModel(dm);
                dm.addElement(l_name);
            }
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
