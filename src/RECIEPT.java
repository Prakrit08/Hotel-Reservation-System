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
 import javax.swing.*;
 import java.text.*;
 import java.util.*;
 
public class RECIEPT extends javax.swing.JFrame {
ImageIcon i=new ImageIcon("src/28.png");
String user;
SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");

    /**
     * Creates new form RECIEPT
     */
    
    public RECIEPT() {
        initComponents();
        this.setResizable(false);
        l2.setText(MAIN_MENU.na);
        l2.setIcon(MAIN_MENU.sy);
        }
    public RECIEPT(String pass, String u) {
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
        jLabel1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        T30 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        t19 = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        t21 = new javax.swing.JTextField();
        t22 = new javax.swing.JTextField();
        t23 = new javax.swing.JTextField();
        t24 = new javax.swing.JTextField();
        t25 = new javax.swing.JTextField();
        t26 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 125, 0, 0));
        setIconImage(i.getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

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

        l2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(l2);
        l2.setBounds(670, 0, 390, 60);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 126, 215));
        jLabel4.setText("HOTEL PARADISE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 80, 460, 50);

        jLabel8.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("RESERVATION SLIP");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 102)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 130, 260, 40);

        T30.setEditable(false);
        T30.setBackground(new java.awt.Color(0, 51, 102));
        T30.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        T30.setForeground(new java.awt.Color(255, 255, 255));
        T30.setToolTipText("");
        T30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 255)));
        T30.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(T30);
        T30.setBounds(0, -10, 1070, 70);

        t17.setEditable(false);
        t17.setBackground(new java.awt.Color(204, 255, 255));
        t17.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t17.setText("BOOKING NO-");
        t17.setBorder(null);
        t17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t17MouseMoved(evt);
            }
        });
        t17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t17MouseClicked(evt);
            }
        });
        t17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t17ActionPerformed(evt);
            }
        });
        jPanel1.add(t17);
        t17.setBounds(160, 190, 140, 40);

        t18.setEditable(false);
        t18.setBackground(new java.awt.Color(204, 255, 255));
        t18.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t18.setText("ROOM NO -");
        t18.setBorder(null);
        t18.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t18MouseMoved(evt);
            }
        });
        t18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t18MouseClicked(evt);
            }
        });
        t18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t18ActionPerformed(evt);
            }
        });
        jPanel1.add(t18);
        t18.setBounds(160, 240, 120, 40);

        t19.setEditable(false);
        t19.setBackground(new java.awt.Color(204, 255, 255));
        t19.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t19.setText("NAME  -");
        t19.setBorder(null);
        t19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t19MouseMoved(evt);
            }
        });
        t19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t19MouseClicked(evt);
            }
        });
        t19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t19ActionPerformed(evt);
            }
        });
        jPanel1.add(t19);
        t19.setBounds(510, 240, 110, 40);

        t20.setEditable(false);
        t20.setBackground(new java.awt.Color(204, 255, 255));
        t20.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t20.setText("MOBILE  -");
        t20.setBorder(null);
        t20.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t20MouseMoved(evt);
            }
        });
        t20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t20MouseClicked(evt);
            }
        });
        t20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t20ActionPerformed(evt);
            }
        });
        jPanel1.add(t20);
        t20.setBounds(510, 340, 110, 40);

        t21.setEditable(false);
        t21.setBackground(new java.awt.Color(204, 255, 255));
        t21.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t21.setText("ADVANCE- $");
        t21.setBorder(null);
        t21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t21MouseMoved(evt);
            }
        });
        t21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t21MouseClicked(evt);
            }
        });
        t21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t21ActionPerformed(evt);
            }
        });
        jPanel1.add(t21);
        t21.setBounds(160, 390, 130, 40);

        t22.setEditable(false);
        t22.setBackground(new java.awt.Color(204, 255, 255));
        t22.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t22.setText("FROM  -");
        t22.setBorder(null);
        t22.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t22MouseMoved(evt);
            }
        });
        t22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t22MouseClicked(evt);
            }
        });
        t22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t22ActionPerformed(evt);
            }
        });
        jPanel1.add(t22);
        t22.setBounds(160, 290, 120, 40);

        t23.setEditable(false);
        t23.setBackground(new java.awt.Color(204, 255, 255));
        t23.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t23.setText("DATE   -");
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
        t23.setBounds(520, 190, 100, 40);

        t24.setEditable(false);
        t24.setBackground(new java.awt.Color(204, 255, 255));
        t24.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t24.setText("TO    -");
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
        t24.setBounds(510, 290, 110, 40);

        t25.setEditable(false);
        t25.setBackground(new java.awt.Color(204, 255, 255));
        t25.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t25.setText("GENDER   -");
        t25.setBorder(null);
        t25.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t25MouseMoved(evt);
            }
        });
        t25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t25MouseClicked(evt);
            }
        });
        t25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t25ActionPerformed(evt);
            }
        });
        jPanel1.add(t25);
        t25.setBounds(170, 340, 120, 40);

        t26.setEditable(false);
        t26.setBackground(new java.awt.Color(204, 255, 255));
        t26.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t26.setText("CHARGES- $");
        t26.setBorder(null);
        t26.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t26MouseMoved(evt);
            }
        });
        t26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t26MouseClicked(evt);
            }
        });
        t26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t26ActionPerformed(evt);
            }
        });
        jPanel1.add(t26);
        t26.setBounds(490, 390, 130, 40);

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(204, 255, 255));
        t1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
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
        t1.setBounds(300, 190, 190, 40);

        t5.setEditable(false);
        t5.setBackground(new java.awt.Color(204, 255, 255));
        t5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
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
        t5.setBounds(620, 190, 210, 40);

        t6.setEditable(false);
        t6.setBackground(new java.awt.Color(204, 255, 255));
        t6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
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
        t6.setBounds(620, 240, 210, 40);

        t7.setEditable(false);
        t7.setBackground(new java.awt.Color(204, 255, 255));
        t7.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t7MouseMoved(evt);
            }
        });
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(620, 290, 210, 40);

        t8.setEditable(false);
        t8.setBackground(new java.awt.Color(204, 255, 255));
        t8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t8MouseMoved(evt);
            }
        });
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        jPanel1.add(t8);
        t8.setBounds(620, 340, 210, 40);

        t9.setEditable(false);
        t9.setBackground(new java.awt.Color(204, 255, 255));
        t9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t9MouseMoved(evt);
            }
        });
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel1.add(t9);
        t9.setBounds(620, 390, 210, 40);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("MANAGER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 490, 130, 50);

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(204, 255, 255));
        t2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        t2.setBounds(300, 240, 190, 40);

        t3.setEditable(false);
        t3.setBackground(new java.awt.Color(204, 255, 255));
        t3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t3MouseMoved(evt);
            }
        });
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(300, 290, 190, 40);

        t4.setEditable(false);
        t4.setBackground(new java.awt.Color(204, 255, 255));
        t4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t4MouseMoved(evt);
            }
        });
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(300, 340, 190, 40);

        t10.setEditable(false);
        t10.setBackground(new java.awt.Color(204, 255, 255));
        t10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        t10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t10MouseMoved(evt);
            }
        });
        t10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t10MouseClicked(evt);
            }
        });
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        jPanel1.add(t10);
        t10.setBounds(300, 390, 190, 40);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(204, 255, 255)));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 70, 730, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 50, 1080, 530);

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        String pass=l2.getText();
        new MAIN_MENU(pass, user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void t17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t17MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t17MouseMoved

    private void t17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t17MouseClicked

    private void t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t17ActionPerformed

    private void t18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t18MouseMoved

    private void t18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t18MouseClicked

    private void t18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t18ActionPerformed

    private void t19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t19MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t19MouseMoved

    private void t19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t19MouseClicked

    private void t19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t19ActionPerformed

    private void t20MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t20MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t20MouseMoved

    private void t20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t20MouseClicked

    private void t20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t20ActionPerformed

    private void t21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t21MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t21MouseMoved

    private void t21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t21MouseClicked

    private void t21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t21ActionPerformed

    private void t22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t22MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t22MouseMoved

    private void t22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t22MouseClicked

    private void t22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t22ActionPerformed

    private void t23MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t23MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t23MouseMoved

    private void t23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t23MouseClicked

    private void t23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t23ActionPerformed

    private void t24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t24MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t24MouseMoved

    private void t24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t24MouseClicked

    private void t24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t24ActionPerformed

    private void t25MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t25MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t25MouseMoved

    private void t25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t25MouseClicked

    private void t25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t25ActionPerformed

    private void t26MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t26MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t26MouseMoved

    private void t26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t26MouseClicked

    private void t26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t26ActionPerformed

    private void t1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseMoved

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked

    }//GEN-LAST:event_t1MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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

    private void t7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t7MouseMoved

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t7MouseClicked

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t8MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t8MouseMoved

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t8MouseClicked

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t9MouseMoved

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t9MouseClicked

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void t2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseMoved

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t3MouseMoved

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t3MouseClicked

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t4MouseMoved

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t4MouseClicked

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t10MouseMoved

    private void t10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t10MouseClicked

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date date=new Date();
        t5.setText(df.format(date));
        t1.setText(BOOKING.resno+"");
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st=con.createStatement();
          String q="Select * from BOOKING;";
          ResultSet rs=st.executeQuery(q);
          while(rs.next())
          {
              int rno1=rs.getInt(2);
              String r=rs.getString(3);
              String nm=rs.getString(4);
              String sex=rs.getString(6);
              String age=rs.getString(7);
              String adate=rs.getString(8);
              String ddate=rs.getString(9);
              String adv=rs.getString(10);
              String chr=rs.getString(11);
              if(SLIP_GENERATOR.resno==rno1)
              {
                t1.setText(rno1+"");
                t2.setText(r);
                t3.setText(adate);
                t4.setText(sex);
                t6.setText(nm);
                t7.setText(ddate);
                t8.setText(age);
                t9.setText(chr);
                t10.setText(adv);
                break;
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
            java.util.logging.Logger.getLogger(RECIEPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RECIEPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RECIEPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RECIEPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RECIEPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t24;
    private javax.swing.JTextField t25;
    private javax.swing.JTextField t26;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
