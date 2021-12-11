/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Archana Kumari
 */import java.sql.*;
 import javax.swing.*;
public class BILL_GENERATOR extends javax.swing.JFrame {
ImageIcon i=new ImageIcon("src/28.png");
public static int resn;
String user;
    /**
     * Creates new form BILL_GENERATOR
     */
    public BILL_GENERATOR() {
        initComponents();
        this.setResizable(false);
        l2.setText(MAIN_MENU.na);
        l2.setIcon(MAIN_MENU.sy);
    }
    public BILL_GENERATOR(String pass, String u) {
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
            
              String us=rs.getString(1);
              String nm1=rs.getString(2);
            String s=rs.getString(3);
            if(pass.equals(nm1) && u.equals(us)){
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
            }}
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
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(625, 250, 250, 175));
        setIconImage(i.getImage());

        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Mistral", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 115, 0));
        jLabel8.setText("GENERATE BILL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 150, 350, 60);

        t1.setBackground(new java.awt.Color(255, 204, 153));
        t1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(51, 51, 51));
        t1.setToolTipText("ENTER BOOKING NUMBER TO GET BILL");
        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(246, 93, 27)));
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
        t1.setBounds(100, 240, 400, 60);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GET BILL");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 340, 180, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24.png"))); // NOI18N
        jLabel1.setToolTipText("BACK TO MAIN MENU");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 60, 57);

        l3.setBackground(new java.awt.Color(204, 255, 255));
        l3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 153));
        l3.setText("*Please note that you will be Checked Out if you proceed to generate the bill");
        jPanel1.add(l3);
        l3.setBounds(10, 60, 570, 30);

        l2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(l2);
        l2.setBounds(240, 0, 340, 60);

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(0, 51, 102));
        t2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setToolTipText("");
        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 255)));
        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t2MouseMoved(evt);
            }
        });
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(0, -10, 650, 70);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 130, 420, 310);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 30, 630, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseMoved

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        resn=Integer.parseInt(t1.getText());
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM BOOKING WHERE RESERVATION_NO="+resn+";");
            int r=0;
            while(rs.next())
                r=rs.getInt(3);
            int z=st.executeUpdate("UPDATE STATUS SET STATUS=\"VACANT\" WHERE ROOM_NO="+r+";");
            con.close();
            st.close();
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        BILL b=new BILL();
        b.setVisible(true);
        t1.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1PropertyChange

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        String pass=l2.getText();
        new MAIN_MENU(pass,user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void t2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseMoved

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

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
            java.util.logging.Logger.getLogger(BILL_GENERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILL_GENERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILL_GENERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILL_GENERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILL_GENERATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
