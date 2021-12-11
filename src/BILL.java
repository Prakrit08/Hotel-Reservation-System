/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Archana Kumari
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
public class BILL extends javax.swing.JFrame {
ImageIcon i=new ImageIcon("src/28.png");
SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");
String user;
    /**
     * Creates new form BILL
     */
        
    public BILL() {
        initComponents();
        this.setResizable(false);
        l2.setText(MAIN_MENU.na);
        l2.setIcon(MAIN_MENU.sy);
    }
    public BILL(String pass, String u) {
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
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        T30 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t23 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t24 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        setIconImage(i.getImage());
        setMinimumSize(new java.awt.Dimension(1058, 561));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 561));
        jPanel1.setLayout(null);

        l2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(l2);
        l2.setBounds(800, 0, 370, 60);

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

        T30.setEditable(false);
        T30.setBackground(new java.awt.Color(0, 51, 102));
        T30.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        T30.setForeground(new java.awt.Color(255, 255, 255));
        T30.setToolTipText("");
        T30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 255)));
        T30.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(T30);
        T30.setBounds(0, -10, 1220, 70);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        T1.setAutoCreateRowSorter(true);
        T1.setBackground(new java.awt.Color(255, 204, 255));
        T1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR NO.", "RESERVATIN NO.", "ROOM NO.", "FROM", "TO", "NO. OF DAYS", "ADVANCE", "TOTAL CHARGES"
            }
        ));
        T1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        T1.setGridColor(new java.awt.Color(102, 0, 153));
        T1.setIntercellSpacing(new java.awt.Dimension(1, 4));
        jScrollPane1.setViewportView(T1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 290, 970, 80);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 126, 215));
        jLabel4.setText("HOTEL PARADISE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 120, 460, 50);

        jLabel8.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("INVOICE");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 102)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 190, 120, 40);

        t23.setEditable(false);
        t23.setBackground(new java.awt.Color(255, 204, 255));
        t23.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t23.setText("TOTAL AMOUNT TO BE PAID - $");
        t23.setBorder(null);
        t23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t23MouseMoved(evt);
            }
        });
        t23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t23MouseClicked(evt);
            }
        });
        t23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t23ActionPerformed(evt);
            }
        });
        jPanel1.add(t23);
        t23.setBounds(510, 410, 330, 40);

        t5.setEditable(false);
        t5.setBackground(new java.awt.Color(255, 204, 255));
        t5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 0, 153)));
        t5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t5MouseMoved(evt);
            }
        });
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(850, 410, 210, 40);

        t6.setEditable(false);
        t6.setBackground(new java.awt.Color(255, 204, 255));
        t6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 0, 153)));
        t6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t6MouseMoved(evt);
            }
        });
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(850, 230, 210, 40);

        t24.setEditable(false);
        t24.setBackground(new java.awt.Color(255, 204, 255));
        t24.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t24.setText("DATE     -");
        t24.setBorder(null);
        t24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t24MouseMoved(evt);
            }
        });
        t24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t24MouseClicked(evt);
            }
        });
        t24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t24ActionPerformed(evt);
            }
        });
        jPanel1.add(t24);
        t24.setBounds(740, 230, 110, 40);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("MANAGER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 490, 120, 30);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 204, 255));
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(80, 110, 990, 420);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 40, 1190, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1190, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        String pass=l2.getText();
        new MAIN_MENU(pass,user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void t23MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t23MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t23MouseMoved

    private void t23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t23MouseClicked

    private void t23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t23ActionPerformed

    private void t5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t5MouseMoved

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t5MouseClicked

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t6MouseMoved

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t6MouseClicked

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t24MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t24MouseMoved

    private void t24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t24MouseClicked

    private void t24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t24ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DefaultTableModel tm1=(DefaultTableModel)T1.getModel();
        int ad,cr;
        Date date=new Date();
        t6.setText(df.format(date));
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st=con.createStatement();
          String q="Select *,1 as Sno from BOOKING;";
          ResultSet rs=st.executeQuery(q);
          while(rs.next())
          {
              int rno=rs.getInt(2);
              String r=rs.getString(3);
              String adate=rs.getString(8);
              String ddate=rs.getString(9);
              String days=rs.getString(12);
              String adv=rs.getString(10);
              String chr=rs.getString(11);
              String sno=rs.getString(13);
              ad=Integer.parseInt(adv);
              cr=Integer.parseInt(chr);
              if(BILL_GENERATOR.resn==rno)
              {
              t5.setText((cr-ad)+"");
              tm1.addRow(new Object[]{sno, rno, r, adate, ddate, days, adv, chr});
              }}
              con.close();
              st.close();
              rs.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JTextField T30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t24;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
