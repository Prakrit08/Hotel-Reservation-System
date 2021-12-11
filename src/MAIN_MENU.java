
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.net.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Archana Kumari
 */
public class MAIN_MENU extends javax.swing.JFrame {
ImageIcon i=new ImageIcon("src/28.png");
String sex, user;
public static String na="";
public static Icon sy;
    /**
     * Creates new form MAIN_MENU
     */
    public MAIN_MENU() {
        
        initComponents();
        this.setResizable(false);
    }

   public MAIN_MENU(String pass, String u){
      initComponents();
try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st=con.createStatement();
          String q="Select * from Login;";
          ResultSet rs=st.executeQuery(q);
          while(rs.next())
          {
            String nm1=rs.getString(2);
            String s=rs.getString(3);
              if(pass.equals(nm1) && s.equals("MALE"))
              {
                ImageIcon i=new ImageIcon("src/26.png");
                l2.setIcon(i);
                break;
              }
              else 
              {
                  ImageIcon E=new ImageIcon("src/25.png");
                  l2.setIcon(E);
              }    
          }
              con.close();
              st.close();
              rs.close();
        }
              catch(Exception e)
              {
                  System.out.println(e);
                      }   
       l2.setText(pass);
       user=u;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN MENU");
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        setIconImage(i.getImage());
        setMaximumSize(new java.awt.Dimension(1058, 561));

        jPanel1.setLayout(null);

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.png"))); // NOI18N
        jButton3.setText("MAKE BOOKING");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 150, 450, 190);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/23.png"))); // NOI18N
        jButton4.setText("BOOKING SLIP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 350, 450, 190);

        jButton5.setBackground(new java.awt.Color(204, 255, 0));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/31.png"))); // NOI18N
        jButton5.setText("BILL/CHECKOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(590, 150, 440, 190);

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/17.png"))); // NOI18N
        jButton6.setText("      LOGOUT    ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(590, 350, 440, 190);

        l2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.add(l2);
        l2.setBounds(700, 0, 360, 70);

        l4.setBackground(new java.awt.Color(153, 255, 255));
        l4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 204));
        l4.setText("Please update your details at the link provided for verification:");
        jPanel1.add(l4);
        l4.setBounds(0, 70, 460, 30);

        l3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(204, 255, 255));
        l3.setText("https://forms.gle/yT6386U55wEasz5F6");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l3MouseExited(evt);
            }
        });
        jPanel1.add(l3);
        l3.setBounds(470, 70, 300, 30);

        jLabel8.setFont(new java.awt.Font("Mistral", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("MAIN MENU");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 10, 280, 60);

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(0, 51, 102));
        t1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setToolTipText("");
        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(204, 204, 255)));
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t1MouseMoved(evt);
            }
        });
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(-10, 0, 1080, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LOGIN l=new LOGIN();
        l.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       na=l2.getText();
       this.sy = l2.getIcon();
       BOOKING b=new BOOKING(na, user);
       b.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseMoved

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       na=l2.getText();
       this.sy = l2.getIcon();
       BILL_GENERATOR b=new BILL_GENERATOR();
       b.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       na=l2.getText();
       this.sy = l2.getIcon();
       SLIP_GENERATOR s=new SLIP_GENERATOR();
       s.setVisible(true);
       this.setVisible(false); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        try
        {
            Desktop.getDesktop().browse(new URI("https://forms.gle/ZhK9MVPivQzB4fYz5"));
        } 
        catch (URISyntaxException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException ex) 
        {
        Logger.getLogger(MAIN_MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_l3MouseClicked

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_l3MouseEntered

    private void l3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_l3MouseExited

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
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
