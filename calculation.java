/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author user
 */
public class calculation extends javax.swing.JFrame {

    double firstNum;
    double secondNum;
    double result;
    String Operations;
    public calculation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDisplay = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jbDiv = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbMul = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbSum = new javax.swing.JButton();
        jbMol = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jbSub = new javax.swing.JButton();
        jbDeci = new javax.swing.JButton();
        jbclear = new javax.swing.JButton();
        jbEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setName("Calculator"); // NOI18N

        jTextDisplay.setBackground(new java.awt.Color(204, 204, 204));
        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextDisplay.setToolTipText("");
        jTextDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDisplayActionPerformed(evt);
            }
        });

        jb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jbDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbDiv.setText("/");
        jbDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivActionPerformed(evt);
            }
        });

        jb9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbMul.setText("*");
        jbMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMulActionPerformed(evt);
            }
        });

        jb7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jbSum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbSum.setText("+");
        jbSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumActionPerformed(evt);
            }
        });

        jbMol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbMol.setText("%");
        jbMol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMolActionPerformed(evt);
            }
        });

        jb4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jbSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbSub.setText("-");
        jbSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubActionPerformed(evt);
            }
        });

        jbDeci.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbDeci.setText(".");
        jbDeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeciActionPerformed(evt);
            }
        });

        jbclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbclear.setText("c");
        jbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclearActionPerformed(evt);
            }
        });

        jbEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbEqual.setText("=");
        jbEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextDisplay)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jbSum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jbSub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbMul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jbMol, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jbDeci, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbclear, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSub, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMol, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeci, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbclear, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jbEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivActionPerformed
        firstNum = Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        Operations = "/";
    }//GEN-LAST:event_jbDivActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb0.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb0ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
             String Enternumber = jTextDisplay.getText() + jb4.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb4ActionPerformed
   
    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
      String Enternumber = jTextDisplay.getText() + jb6.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb8ActionPerformed
    
    private void jbSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubActionPerformed
        firstNum = Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        Operations = "-";
    }//GEN-LAST:event_jbSubActionPerformed

    private void jbDeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeciActionPerformed
     String Enternumber = jTextDisplay.getText() + jbDeci.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbDeciActionPerformed
  
    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb2.getText();
     jTextDisplay.setText(Enternumber);       // TODO add your handling code here:
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb1.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb5.getText();
     jTextDisplay.setText(Enternumber);   
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb3.getText();
     jTextDisplay.setText(Enternumber);       
    }//GEN-LAST:event_jb3ActionPerformed

    private void jbSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumActionPerformed
        firstNum = Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        Operations = "+";
    }//GEN-LAST:event_jbSumActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb6.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb7.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
     String Enternumber = jTextDisplay.getText() + jb9.getText();
     jTextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jb9ActionPerformed

    private void jbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclearActionPerformed
      jTextDisplay.setText("");   
    }//GEN-LAST:event_jbclearActionPerformed

    private void jbMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMulActionPerformed
        firstNum = Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        Operations = "*";
    }//GEN-LAST:event_jbMulActionPerformed

    private void jbMolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMolActionPerformed
        firstNum = Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        Operations = "%";
    }//GEN-LAST:event_jbMolActionPerformed

    private void jbEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEqualActionPerformed
     String answer;
     secondNum = Double.parseDouble(jTextDisplay.getText());
     if(Operations == "+"){
         result = firstNum + secondNum;
         answer = String.format("%.2f", result);
         jTextDisplay.setText(answer);
     }else if(Operations == "-"){
         result = firstNum - secondNum;
         answer = String.format("%.2f", result);
         jTextDisplay.setText(answer);
     }else if(Operations == "*"){
         result = firstNum * secondNum;
         answer = String.format("%.2f", result);
         jTextDisplay.setText(answer);
     }else if(Operations == "/"){
         result = firstNum / secondNum;
         answer = String.format("%.0f", result);
         jTextDisplay.setText(answer);
     }else if(Operations == "%"){
         result = firstNum % secondNum;
         answer = String.format("%.2f", result);
         jTextDisplay.setText(answer);
     }
    }//GEN-LAST:event_jbEqualActionPerformed

    private void jTextDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbDeci;
    private javax.swing.JButton jbDiv;
    private javax.swing.JButton jbEqual;
    private javax.swing.JButton jbMol;
    private javax.swing.JButton jbMul;
    private javax.swing.JButton jbSub;
    private javax.swing.JButton jbSum;
    private javax.swing.JButton jbclear;
    // End of variables declaration//GEN-END:variables
}
