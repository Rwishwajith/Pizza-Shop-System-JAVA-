/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleproject;

/**
 *
 * @author Bharatha Sachintha
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class shcu extends javax.swing.JFrame {

    /**
     * Creates new form shcu
     */
    public shcu() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,200));
        show_user();
    }
    public ArrayList<User> userList(){
        ArrayList<User> usersList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap","root","");
            String sql="SELECT * FROM customer";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("number"),rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("gender"),rs.getString("card"));
                usersList.add(user);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }
    public void show_user(){
        ArrayList<User> list=userList();
        DefaultTableModel model=(DefaultTableModel)tt1.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getnumber();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getphone();
            row[4]=list.get(i).getgender();
            row[5]=list.get(i).getcard();
            model.addRow(row);
        }
        
    }
    
    
    
    
    
    
    public ArrayList<User> userrList(){
        ArrayList<User> userrsList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap","root","");
            String sql="SELECT * FROM customer WHERE card='No Card' ";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("number"),rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("gender"),rs.getString("card"));
                userrsList.add(user);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return userrsList;
    }
    public void show_user1(){
        ArrayList<User> list=userrList();
        DefaultTableModel model=(DefaultTableModel)tt2.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getnumber();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getphone();
            row[4]=list.get(i).getgender();
            row[5]=list.get(i).getcard();
            model.addRow(row);
        }
        
    }
    
    
    
    
    
     public ArrayList<User> userrrList(){
        ArrayList<User> userrrsList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap","root","");
            String sql="SELECT * FROM customer WHERE card='Gold' ";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("number"),rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("gender"),rs.getString("card"));
                userrrsList.add(user);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return userrrsList;
    }
    public void show_user2(){
        ArrayList<User> list=userrrList();
        DefaultTableModel model=(DefaultTableModel)tt3.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getnumber();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getphone();
            row[4]=list.get(i).getgender();
            row[5]=list.get(i).getcard();
            model.addRow(row);
        }
        
    }
    
    
    
    
     public ArrayList<User> userrrrList(){
        ArrayList<User> userrrrsList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap","root","");
            String sql="SELECT * FROM customer WHERE card='Silver' ";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("number"),rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("gender"),rs.getString("card"));
                userrrrsList.add(user);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return userrrrsList;
    }
    public void show_user3(){
        ArrayList<User> list=userrrrList();
        DefaultTableModel model=(DefaultTableModel)tt4.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getnumber();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getphone();
            row[4]=list.get(i).getgender();
            row[5]=list.get(i).getcard();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tt4 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tt1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tt2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tt3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btncle = new javax.swing.JButton();
        btncash = new javax.swing.JButton();
        btnwait = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Hogwats Pizza Customer Show Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        btnexit.setBackground(new java.awt.Color(51, 255, 51));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit.setText("Home");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 110, 40));

        tt4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number", "name", "address", "phone", "gender", "card"
            }
        ));
        jScrollPane1.setViewportView(tt4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 390, 150));

        tt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number", "name", "address", "phone", "gender", "card"
            }
        ));
        jScrollPane2.setViewportView(tt1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1210, 150));

        tt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number", "name", "address", "phone", "gender", "card"
            }
        ));
        jScrollPane3.setViewportView(tt2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 410, 150));

        tt3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number", "name", "address", "phone", "gender", "card"
            }
        ));
        jScrollPane4.setViewportView(tt3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 390, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Silver Card holder:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("No Card Holder:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Gold Card Holder:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        btncle.setBackground(new java.awt.Color(0, 255, 0));
        btncle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncle.setText("Click This");
        btncle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleActionPerformed(evt);
            }
        });
        jPanel1.add(btncle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 100, -1));

        btncash.setBackground(new java.awt.Color(0, 255, 0));
        btncash.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncash.setText("Click This");
        btncash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncashActionPerformed(evt);
            }
        });
        jPanel1.add(btncash, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, -1));

        btnwait.setBackground(new java.awt.Color(0, 255, 0));
        btnwait.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnwait.setText("Click This");
        btnwait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwaitActionPerformed(evt);
            }
        });
        jPanel1.add(btnwait, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 490));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharatha Sachintha\\Downloads\\pic\\bh\\5801+mushroom+soup.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 240, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharatha Sachintha\\Downloads\\pic\\bh\\11145+patatas+bravos.jpg")); // NOI18N
        jLabel6.setText("jLabel5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -9, 500, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bharatha Sachintha\\Downloads\\pic\\bh\\11147+potato+salad.jpg")); // NOI18N
        jLabel8.setText("jLabel5");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        mpanel m=new mpanel();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btncleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleActionPerformed
        // TODO add your handling code here:
        show_user3();
    }//GEN-LAST:event_btncleActionPerformed

    private void btncashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncashActionPerformed
        // TODO add your handling code here:
        show_user1();
    }//GEN-LAST:event_btncashActionPerformed

    private void btnwaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwaitActionPerformed
        // TODO add your handling code here:
        show_user2();
    }//GEN-LAST:event_btnwaitActionPerformed

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
            java.util.logging.Logger.getLogger(shcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncash;
    private javax.swing.JButton btncle;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnwait;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tt1;
    private javax.swing.JTable tt2;
    private javax.swing.JTable tt3;
    private javax.swing.JTable tt4;
    // End of variables declaration//GEN-END:variables
}
