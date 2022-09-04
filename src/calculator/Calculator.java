package Calculator;

import java.awt.Color;
import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculator extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
 
    
    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperation = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        btn_mode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_equal = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_pct = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_pct1 = new javax.swing.JButton();
        btn_pct2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperation.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 316, 50));

        txtResult.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 316, 50));

        btn_mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lightmode.png"))); // NOI18N
        btn_mode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("•");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_equal.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_equal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_equal.png"))); // NOI18N
        btn_equal.setText("=");
        btn_equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_equal.png"))); // NOI18N
        btn_equal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_equalpress.png"))); // NOI18N
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });
        jPanel2.add(btn_equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn_9.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_ce.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_ce.setText("CE");
        btn_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_pct.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_pct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct.setText("%");
        btn_pct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pct.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_pct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pctActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pct, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_divide.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_divide.setText("÷");
        btn_divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_divide.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_divide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });
        jPanel2.add(btn_divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_multiply.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_multiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_multiply.setText("×");
        btn_multiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiply.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_multiply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_sub.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_sub.setText("−");
        btn_sub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sub.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_sub.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btn_add.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_add.setText("+");
        btn_add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_add.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_c.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_c.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_c.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_cpress.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_dot.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_dot.setText(".");
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        btn_8.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn_7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        jButton13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        jButton13.setText("C");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn_1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn_5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn_2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn_3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn_0.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_num.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nu.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_nupress.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_pct1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_pct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct1.setText("%");
        btn_pct1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pct1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_pct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pct1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_pct2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_pct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct2.setText("%");
        btn_pct2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pct2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1.png"))); // NOI18N
        btn_pct2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn1_pressed.png"))); // NOI18N
        btn_pct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pct2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperation.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_equal.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
        String text = txtOperation.getText().substring(0,txtOperation.getText().length()-1);
        txtOperation.setText(text);
        btn_equal.doClick();
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_pctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pctActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_pctActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        addNumber("/");
        
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        addNumber("*");
        
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        try{
            String result = se.eval(txtOperation.getText()).toString();
            txtResult.setText(result);
        } catch (Exception e) {
            btn_c.doClick();
        }
        

    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    boolean nightMode = false;
    
    private void btn_modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modeActionPerformed
        if(!nightMode){
        jPanel1.setBackground(new Color(33, 43, 65));
        jPanel2.setBackground(new Color(46, 57, 81));
        txtOperation.setForeground(new Color(13, 179, 135));
        txtResult.setForeground(new Color(13, 179, 135));
        
        btn_1.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_1.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_1.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_1.setForeground(new Color(150, 168, 160));
        
        btn_2.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_2.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_2.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_2.setForeground(new Color(150, 168, 160));
        
        btn_3.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_3.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_3.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_3.setForeground(new Color(150, 168, 160));
        
        btn_4.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_4.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_4.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_4.setForeground(new Color(150, 168, 160));
        
        btn_5.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_5.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_5.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_5.setForeground(new Color(150, 168, 160));
        
        btn_6.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_6.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_6.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_6.setForeground(new Color(150, 168, 160));
        
        btn_7.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_7.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_7.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_7.setForeground(new Color(150, 168, 160));
        
        btn_8.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_8.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_8.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_8.setForeground(new Color(150, 168, 160));
        
        btn_9.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_9.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_9.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_9.setForeground(new Color(150, 168, 160));
               
        btn_0.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_0.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_0.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_0.setForeground(new Color(150, 168, 160)); 
        
        btn_dot.setIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_dot.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_dot.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_press_dark.png")));
        btn_dot.setForeground(new Color(150, 168, 160));
        
        btn_add.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_add.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_add.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_add.setForeground(Color.white);
        
        btn_sub.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_sub.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_sub.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_sub.setForeground(Color.white);
                
        btn_multiply.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_multiply.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_multiply.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_multiply.setForeground(Color.white);
                
        btn_divide.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_divide.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_divide.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_divide.setForeground(Color.white);
               
        btn_pct.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_pct.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_pct.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_pct.setForeground(Color.white);
                
        btn_ce.setIcon(new ImageIcon(getClass().getResource("/image/btn_2dark.png")));
        btn_ce.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_dark.png")));
        btn_ce.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_2press_dark.png")));
        btn_ce.setForeground(Color.white);
                
        btn_c.setIcon(new ImageIcon(getClass().getResource("/image/btn_equaldark.png")));
        btn_c.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_equaldark.png")));
        btn_c.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_equaldarkpress.png")));
        btn_c.setForeground(Color.white);
           
        btn_equal.setIcon(new ImageIcon(getClass().getResource("/image/btn_equaldark.png")));
        btn_equal.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn_equaldark.png")));
        btn_equal.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn_equaldarkpress.png")));
        btn_equal.setForeground(Color.white);
        
        btn_mode.setIcon(new ImageIcon(getClass().getResource("/image/darkmode.png")));
        
        
        
        nightMode = true;
        } else{
            Calculator frame = new Calculator();
            this.dispose();
            frame.setVisible(true);
        }
        
        

    }//GEN-LAST:event_btn_modeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_pct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pct1ActionPerformed

    private void btn_pct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pct2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digit) {
        txtOperation.setText(txtOperation.getText()+digit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_mode;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_pct;
    private javax.swing.JButton btn_pct1;
    private javax.swing.JButton btn_pct2;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperation;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}
