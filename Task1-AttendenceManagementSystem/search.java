
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    void reset()
     { name.setText(""); 
       room.setText("");
       occ.setText("");
       add.setText("");
       adh.setText("");
       phone.setText("");
       gname.setText("");
       dob.setText("");
       doa.setText(""); 
       search.setText("");
     }
    public search() {
        initComponents();
         setSize(740, 570);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        doa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        occ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        adh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Full Name                 :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 140, 140, 26);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(160, 140, 390, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Phone No                :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 180, 140, 26);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(160, 180, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("                DOB  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 180, 110, 26);

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        getContentPane().add(dob);
        dob.setBounds(420, 180, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Guardian  Name       :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 230, 140, 26);

        gname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnameActionPerformed(evt);
            }
        });
        getContentPane().add(gname);
        gname.setBounds(160, 230, 279, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Permanent Address  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 140, 26);

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 280, 390, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Date Of Admission    :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 350, 140, 26);

        doa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doaActionPerformed(evt);
            }
        });
        getContentPane().add(doa);
        doa.setBounds(160, 350, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("   Occupation  :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 350, 100, 26);

        occ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occActionPerformed(evt);
            }
        });
        getContentPane().add(occ);
        occ.setBounds(420, 350, 127, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText(" Aadhar Number       :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 410, 140, 26);

        adh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adhActionPerformed(evt);
            }
        });
        getContentPane().add(adh);
        adh.setBounds(160, 410, 152, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("      Room No  :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 410, 100, 26);

        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        getContentPane().add(room);
        room.setBounds(420, 410, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 80, 114, 34);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("SEARCH");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(264, 19, 149, 42);
        getContentPane().add(search);
        search.setBounds(230, 80, 200, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 480, 80, 39);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 480, 89, 39);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 480, 89, 39);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\Icons\\home-icon (1).png")); // NOI18N
        jButton4.setText("Home");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(550, 10, 110, 39);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search new.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 80, 50, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\pink sunset.jpg")); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(4, 0, 2550, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void gnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gnameActionPerformed

    private void doaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doaActionPerformed

    private void occActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occActionPerformed

    private void adhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
           PreparedStatement ps=c.prepareStatement("update details set Name='"+name.getText()+"',Phone_No="+Integer.parseInt(phone.getText())+",DOB='"+dob.getText()+"',Guardian='"+gname.getText()+"',Permanent_Address='"+add.getText()+"',Date_of_Admission='"+doa.getText()+"',Occupation='"+occ.getText()+"',Aadhar_No="+Integer.parseInt(adh.getText())+",Room_No="+Integer.parseInt(room.getText())+" where Name='"+search.getText()+"'");
           // PreparedStatement ps=c.prepareStatement("update details set Name='"+name.getText()+"' where Name='"+search.getText()+"'");
 ps.executeUpdate();
         //  ps.executeQuery();
            
            
            JOptionPane.showMessageDialog(null,"Updated successfullly");
            reset();
       }   
       catch(Exception e){

       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
reset();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
home h=new home();
h.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            PreparedStatement ps=c.prepareStatement("select * from details where Name='"+search.getText()+"'");
            ResultSet rs=ps.executeQuery();
           ResultSet rp=rs;
           rs.last();
            int count =rs.getRow();
            rs.beforeFirst();
                       
         if(count>0)
          {
              while(rs.next())
              {
                name.setText(rs.getString(1));
                phone.setText(rs.getInt(2)+"");
                dob.setText(rs.getString(3));
                gname.setText(rs.getString(4));
                add.setText(rs.getString(5));
                doa.setText(rs.getString(6));
                occ.setText(rs.getString(7));
                adh.setText(rs.getInt(8)+"");
                room.setText(rs.getInt(9)+"");
              }
          }
          else
              JOptionPane.showMessageDialog(null,"Record not found");
            
       }
       catch(Exception e){

       }                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            
            PreparedStatement ps=c.prepareStatement("delete from details where Name='"+search.getText()+"'");
            ps.executeUpdate();
          // reset();
           
          JOptionPane.showMessageDialog(null,"Deleted Successfully");
           PreparedStatement p= c.prepareStatement("update beds set Vacant_beds=Vacant_beds+1, Occupied_beds=Occupied_beds-1 where Room_No="+Integer.parseInt(room.getText())+"");
            p.executeUpdate();
          newadmission n=new newadmission();
            n.setVisible(true);
            dispose();
          
       }
       catch(Exception e){

       }                
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JTextField adh;
    private javax.swing.JTextField doa;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField occ;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField room;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
