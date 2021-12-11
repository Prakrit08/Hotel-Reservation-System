/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Archana Kumari
 */

import java.sql.*;
import java.text.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class BOOKING extends javax.swing.JFrame {
String sex,user,days;
int rn=0;
int adv=0, chr=0;
int[] cr= new int[30];
int j=0,l=0;
ImageIcon i=new ImageIcon("src/28.png");
public static String na="";
public static Icon sy;
public static int resno;
    /**
     * Creates new form BOOKING
     */
    public BOOKING() {
        initComponents();
        this.setResizable(false);
        b2.setEnabled(false);
        b1.setEnabled(false);
        t4.setEditable(false);
        t5.setEditable(false);
        l2.setText(MAIN_MENU.na);
        l2.setIcon(MAIN_MENU.sy);
    }
    public BOOKING(String pass, String u) {
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
              if(pass.equals(nm1))
              {
                if(s.equals("MALE"))
                {
                    ImageIcon i=new ImageIcon("src/26.png");
                    l2.setIcon(i);
                    break;
                }
                else 
                {
                    ImageIcon E=new ImageIcon("src/25.png");
                    l2.setIcon(E);
                    break;
                }    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        t3 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        t18 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        d1 = new com.toedter.calendar.JDateChooser();
        d2 = new com.toedter.calendar.JDateChooser();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOKING PAGE");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(i.getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        t9.setEditable(false);
        t9.setBackground(new java.awt.Color(255, 255, 204));
        t9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setText("RESERVATION NO");
        t9.setBorder(null);
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
        t9.setBounds(530, 430, 290, 60);

        t10.setEditable(false);
        t10.setBackground(new java.awt.Color(255, 255, 204));
        t10.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t10.setText("CHARGES");
        t10.setBorder(null);
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
        t10.setBounds(30, 450, 110, 40);

        t11.setEditable(false);
        t11.setBackground(new java.awt.Color(255, 255, 204));
        t11.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t11.setText("NAME");
        t11.setBorder(null);
        t11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t11MouseMoved(evt);
            }
        });
        t11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t11MouseClicked(evt);
            }
        });
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(30, 130, 130, 40);

        t12.setEditable(false);
        t12.setBackground(new java.awt.Color(255, 255, 204));
        t12.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t12.setText("ADDRESS");
        t12.setBorder(null);
        t12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t12MouseMoved(evt);
            }
        });
        t12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t12MouseClicked(evt);
            }
        });
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        jPanel1.add(t12);
        t12.setBounds(30, 180, 110, 40);

        t13.setEditable(false);
        t13.setBackground(new java.awt.Color(255, 255, 204));
        t13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t13.setText("GENDER");
        t13.setBorder(null);
        t13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t13MouseMoved(evt);
            }
        });
        t13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t13MouseClicked(evt);
            }
        });
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        jPanel1.add(t13);
        t13.setBounds(30, 260, 100, 40);

        t14.setEditable(false);
        t14.setBackground(new java.awt.Color(255, 255, 204));
        t14.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t14.setText("ARRIVAL");
        t14.setBorder(null);
        t14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t14MouseMoved(evt);
            }
        });
        t14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t14MouseClicked(evt);
            }
        });
        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });
        jPanel1.add(t14);
        t14.setBounds(30, 350, 110, 40);

        t15.setEditable(false);
        t15.setBackground(new java.awt.Color(255, 255, 204));
        t15.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t15.setText("MOBILE No");
        t15.setBorder(null);
        t15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t15MouseMoved(evt);
            }
        });
        t15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t15MouseClicked(evt);
            }
        });
        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });
        jPanel1.add(t15);
        t15.setBounds(30, 300, 120, 40);

        t16.setEditable(false);
        t16.setBackground(new java.awt.Color(255, 255, 204));
        t16.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t16.setText("DEPARTURE");
        t16.setBorder(null);
        t16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                t16MouseMoved(evt);
            }
        });
        t16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t16MouseClicked(evt);
            }
        });
        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });
        jPanel1.add(t16);
        t16.setBounds(30, 400, 140, 40);

        t17.setEditable(false);
        t17.setBackground(new java.awt.Color(255, 255, 204));
        t17.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t17.setText("ADVANCE");
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
        t17.setBounds(30, 500, 130, 40);

        t5.setBackground(new java.awt.Color(255, 255, 204));
        t5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 0)));
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
        t5.setBounds(180, 450, 290, 40);

        t1.setBackground(new java.awt.Color(255, 255, 204));
        t1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 0)));
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
        t1.setBounds(180, 80, 280, 40);

        t2.setBackground(new java.awt.Color(255, 255, 204));
        t2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 0)));
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
        t2.setBounds(180, 130, 280, 40);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        r1.setForeground(new java.awt.Color(51, 51, 51));
        r1.setText("FEMALE");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(360, 260, 110, 30);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        r2.setForeground(new java.awt.Color(51, 51, 51));
        r2.setText("MALE");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(180, 260, 90, 33);

        t3.setBackground(new java.awt.Color(255, 255, 204));
        t3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 0)));
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
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(180, 300, 290, 40);

        l2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(l2);
        l2.setBounds(630, 0, 430, 60);

        t4.setBackground(new java.awt.Color(255, 255, 204));
        t4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        t4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 0)));
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
        t4.setBounds(180, 500, 290, 40);

        b1.setBackground(new java.awt.Color(102, 102, 0));
        b1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("BOOK");
        b1.setBorder(null);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                b1PropertyChange(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(900, 430, 100, 60);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        ta1.setBackground(new java.awt.Color(255, 255, 204));
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ta1.setRows(5);
        ta1.setBorder(null);
        ta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ta1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 180, 280, 70);

        t18.setEditable(false);
        t18.setBackground(new java.awt.Color(255, 255, 204));
        t18.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t18.setText("ROOM NO.");
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
        t18.setBounds(30, 80, 130, 40);

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
        jLabel1.setBounds(0, 0, 62, 60);

        l4.setBackground(new java.awt.Color(102, 102, 0));
        l4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 102));
        l4.setText("Please save your reservation no. for future reference.");
        jPanel1.add(l4);
        l4.setBounds(530, 390, 390, 20);

        l5.setBackground(new java.awt.Color(102, 102, 0));
        l5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 102));
        l5.setText("Advance amount is 50% cost of 1 day's stay.");
        jPanel1.add(l5);
        l5.setBounds(530, 350, 360, 20);

        l6.setBackground(new java.awt.Color(102, 102, 0));
        l6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 102));
        l6.setText("All rooms are AC types!!.");
        jPanel1.add(l6);
        l6.setBounds(530, 370, 360, 20);

        t7.setEditable(false);
        t7.setBackground(new java.awt.Color(0, 51, 102));
        t7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));
        t7.setToolTipText("");
        t7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 255)));
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
        t7.setBounds(-10, -10, 1080, 70);
        jPanel1.add(d1);
        d1.setBounds(180, 350, 290, 40);
        jPanel1.add(d2);
        d2.setBounds(180, 400, 290, 40);

        b3.setBackground(new java.awt.Color(102, 102, 0));
        b3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("GET RESERVATION NO.");
        b3.setBorder(null);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                b3PropertyChange(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(530, 500, 290, 50);

        b2.setBackground(new java.awt.Color(102, 102, 0));
        b2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("NEW BOOKING");
        b2.setBorder(null);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                b2PropertyChange(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(850, 500, 200, 50);

        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 102, 0)));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(-10, 40, 520, 540);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        T1.setAutoCreateRowSorter(true);
        T1.setBackground(new java.awt.Color(255, 255, 204));
        T1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Cost/day", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        T1.setGridColor(new java.awt.Color(102, 0, 153));
        T1.setIntercellSpacing(new java.awt.Dimension(1, 4));
        jScrollPane2.setViewportView(T1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(520, 80, 530, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, -10, 1080, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t9MouseMoved

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t9MouseClicked

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void t10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t10MouseMoved

    private void t10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t10MouseClicked

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void t11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t11MouseMoved

    private void t11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t11MouseClicked

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t12MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t12MouseMoved

    private void t12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t12MouseClicked

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void t13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t13MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t13MouseMoved

    private void t13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t13MouseClicked

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t14MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t14MouseMoved

    private void t14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t14MouseClicked

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t14ActionPerformed

    private void t15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t15MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t15MouseMoved

    private void t15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t15MouseClicked

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t15ActionPerformed

    private void t16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t16MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t16MouseMoved

    private void t16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t16MouseClicked

    private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t16ActionPerformed

    private void t17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t17MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t17MouseMoved

    private void t17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t17MouseClicked

    private void t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t17ActionPerformed

    private void t5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t5MouseMoved

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        // TODO add your handling code here:
        t5.setText("");
    }//GEN-LAST:event_t5MouseClicked

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t5ActionPerformed

    private void t1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseMoved

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_t1MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseMoved

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t2MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        sex="FEMALE";
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        sex="MALE";
    }//GEN-LAST:event_r2ActionPerformed

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
        t4.setText("");
    }//GEN-LAST:event_t4MouseClicked

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t4ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void ta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ta1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         // TODO add your handling code here:
        int rno=Integer.parseInt(t9.getText());
        int r=Integer.parseInt(t1.getText());
        String nm=t2.getText();
        String add=ta1.getText();
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
        String adate=df.format(d1.getDate());
        String ddate=df.format(d2.getDate());
        long mob=Long.parseLong(t3.getText());
        BOOK:
            try
            {
                SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
                java.util.Date ad=d1.getDate();
                java.util.Date dd=d2.getDate();
                long difms=Math.abs(dd.getTime()-ad.getTime());
                long diff=TimeUnit.DAYS.convert(difms, TimeUnit.MILLISECONDS);
                days=String.valueOf(diff);
                for(int k=0;k<30;k++)
                {
                    if(r==cr[k])
                    {
                        l++;
                        break BOOK;
                    } 
                }
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
                Statement st=con.createStatement();
                int z=st.executeUpdate("INSERT INTO Booking VALUES('"+user+"','"+rno+"','"+r+"','"+nm+"','"+add+"','"+sex+"','"+mob+"','"+adate+"','"+ddate+"','"+adv+"','"+chr+"','"+days+"');");
                resno=Integer.parseInt(t9.getText());
                for(int i=0;i<30;i++)
                    cr[i]=0;
                int y=st.executeUpdate("UPDATE STATUS SET STATUS=\"BOOKED\" WHERE ROOM_NO="+r+";");
                resno=Integer.parseInt(t9.getText());
                JOptionPane.showMessageDialog(null,"CONGRATS!! YOUR BOOKING HAS BEEN COMPLETED.");
                con.close();
                st.close();    
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(l>0)
            JOptionPane.showMessageDialog(null,"ROOM ALREADY BOOKED!!");
    }//GEN-LAST:event_b1ActionPerformed

    private void b1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_b1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_b1PropertyChange

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
        String adate=df.format(d1.getDate());
        String ay=adate.substring(2,4);
        String am=adate.substring(5,7);
        String ad=adate.substring(8,10);
        String rn=t1.getText();
        int[] cr= new int[30];
        int j=0;
        int rsv=Integer.parseInt(rn+ay+am+ad+"1");
        try
        {
          Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("Select * from Booking;");
                while(rs.next())
                {
                    int res=rs.getInt(1);
                    if (rsv==res)
                    rsv++;   
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM STATUS WHERE STATUS=\"BOOKED\"");
            while(rs.next())
            {
                cr[j]=rs.getInt(1);
                j++;
            }
            SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            java.util.Date adt=d1.getDate();
            java.util.Date ddt=d2.getDate();
            long difms=Math.abs(ddt.getTime()-adt.getTime());
            long diff=TimeUnit.DAYS.convert(difms, TimeUnit.MILLISECONDS);
            days=String.valueOf(diff);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
            Statement s=co.createStatement();
            rs=s.executeQuery("SELECT * FROM STATUS WHERE STATUS=\"VACANT\"");
                while(rs.next())
                {
                    int room=rs.getInt(1);
                    if(Integer.parseInt(rn)==room)
                    {
                        adv=rs.getInt(3)/2;
                        chr=rs.getInt(3)*Integer.parseInt(days);
                        t5.setText("$ "+ chr);
                        t4.setText("$ "+ adv);
                    }
                }
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
        if(!("".equals(adate) && "".equals(rn)))
        {
            t9.setText(rsv+"");
            b1.setEnabled(true);
            b2.setEnabled(true);
        }
        else
        JOptionPane.showMessageDialog(null,"PLEASE ENTER DATE OF ARRIVAL AND ROOM NO. TO GET RESERVATION NUMBER.");
        
        
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_b3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_b3PropertyChange

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel)T1.getModel();
        while(dm.getRowCount() > 0)
        {
            dm.removeRow(0);
        }
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st=con.createStatement();
          String q="Select * from STATUS WHERE STATUS=\"VACANT\";";
          ResultSet rs=st.executeQuery(q);
          while(rs.next())
          {
              int r=rs.getInt(1);
              String rt=rs.getString(2);
              int c=rs.getInt(3);
              String rst=rs.getString(4);
              dm.addRow(new Object[]{r, rt, c, rst});
          }
          con.close();
          st.close();
          rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t9.setText("RESERVATION NO");
        t1.setText("");
        t2.setText("");
        t3.setText("");
        ta1.setText("");
        d1.setCalendar(null);
        d2.setCalendar(null);
        t4.setText("");
        t5.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_b2ActionPerformed

    private void b2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_b2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_b2PropertyChange

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b2MouseClicked

    private void t18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t18MouseMoved

    private void t18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t18MouseClicked

    private void t18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t18ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        t1.setText("Enter Room No.");
        t2.setText("Enter Name Here");
        t3.setText("Enter Age Here");
        t4.setText("Enter Advanced Amt Here");
        t5.setText("Enter Total Charges Here");
        t9.setText("");
        ta1.setText("Enter Address");
        d1.setCalendar(null);
        d2.setCalendar(null);
        String pass=l2.getText();
        new MAIN_MENU(pass,user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t7MouseClicked

    private void t7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_t7MouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DefaultTableModel tm1=(DefaultTableModel)T1.getModel();
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/HOTEL","root","2327");
          Statement st=con.createStatement();
          String q="Select * from STATUS WHERE STATUS=\"VACANT\";";
          ResultSet rs=st.executeQuery(q);
          while(rs.next())
          {
              int r=rs.getInt(1);
              String rt=rs.getString(2);
              int c=rs.getInt(3);
              String rst=rs.getString(4);
              tm1.addRow(new Object[]{r, rt, c, rst});
          }
          con.close();
          st.close();
          rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t3KeyTyped

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
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOKING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t9;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
