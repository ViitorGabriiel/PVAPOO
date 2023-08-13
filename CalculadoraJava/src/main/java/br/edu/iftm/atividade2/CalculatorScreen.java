package br.edu.iftm.atividade2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JTextField;

public class CalculatorScreen extends javax.swing.JFrame {

    private ControlCalculator controlCalculator;
    private EnumOperation lastOperation;
    
    public CalculatorScreen() {
        initComponents();
        controlCalculator = new ControlCalculator();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtAc = new javax.swing.JButton();
        jBtNeg = new javax.swing.JButton();
        jBtPercent = new javax.swing.JButton();
        jBtDivision = new javax.swing.JButton();
        jBt7 = new javax.swing.JButton();
        jBt8 = new javax.swing.JButton();
        jBt9 = new javax.swing.JButton();
        jBtMulti = new javax.swing.JButton();
        jBt4 = new javax.swing.JButton();
        jBt5 = new javax.swing.JButton();
        jBt6 = new javax.swing.JButton();
        jBtSub = new javax.swing.JButton();
        jBt1 = new javax.swing.JButton();
        jBt2 = new javax.swing.JButton();
        jBt3 = new javax.swing.JButton();
        jBtAdd = new javax.swing.JButton();
        jBt0 = new javax.swing.JButton();
        jBtPoint = new javax.swing.JButton();
        jBtExit = new javax.swing.JButton();
        jBtEqual = new javax.swing.JButton();
        jBtElevetion = new javax.swing.JButton();
        jBtRoot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jTextField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField.setText("0.00");
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(6, 4));

        jBtAc.setText("AC");
        jBtAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAcActionPerformed(evt);
            }
        });
        jPanel1.add(jBtAc);

        jBtNeg.setText("+ / -");
        jBtNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtNegActionPerformed(evt);
            }
        });
        jPanel1.add(jBtNeg);

        jBtPercent.setText("%");
        jBtPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPercentActionPerformed(evt);
            }
        });
        jPanel1.add(jBtPercent);

        jBtDivision.setText("/");
        jBtDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtDivision);

        jBt7.setText("7");
        jBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt7ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt7);

        jBt8.setText("8");
        jBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt8ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt8);

        jBt9.setText("9");
        jBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt9ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt9);

        jBtMulti.setText("*");
        jBtMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtMultiActionPerformed(evt);
            }
        });
        jPanel1.add(jBtMulti);

        jBt4.setText("4");
        jBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt4ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt4);

        jBt5.setText("5");
        jBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt5ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt5);

        jBt6.setText("6");
        jBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt6ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt6);

        jBtSub.setText("-");
        jBtSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubActionPerformed(evt);
            }
        });
        jPanel1.add(jBtSub);

        jBt1.setText("1");
        jBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt1);

        jBt2.setText("2");
        jBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt2);

        jBt3.setText("3");
        jBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt3ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt3);

        jBtAdd.setText("+");
        jBtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtAdd);

        jBt0.setText("0");
        jBt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt0ActionPerformed(evt);
            }
        });
        jPanel1.add(jBt0);

        jBtPoint.setText(".");
        jBtPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPointActionPerformed(evt);
            }
        });
        jPanel1.add(jBtPoint);

        jBtExit.setText("Exit");
        jBtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExitActionPerformed(evt);
            }
        });
        jPanel1.add(jBtExit);

        jBtEqual.setText("=");
        jBtEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEqualActionPerformed(evt);
            }
        });
        jPanel1.add(jBtEqual);

        jBtElevetion.setText("X^");
        jBtElevetion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtElevetionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtElevetion);

        jBtRoot.setText("√");
        jBtRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRootActionPerformed(evt);
            }
        });
        jPanel1.add(jBtRoot);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAcActionPerformed
        limpa();
        controlCalculator.zerar();
    }//GEN-LAST:event_jBtAcActionPerformed

    private void jBt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt0ActionPerformed
        // TODO add your handling code here:
        digita("0");
    }//GEN-LAST:event_jBt0ActionPerformed

    private void jBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt1ActionPerformed
        // TODO add your handling code here:
        digita("1");
    }//GEN-LAST:event_jBt1ActionPerformed

    private void jBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt2ActionPerformed
        // TODO add your handling code here:
        digita("2");
    }//GEN-LAST:event_jBt2ActionPerformed

    private void jBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt3ActionPerformed
        // TODO add your handling code here:
        digita("3");
    }//GEN-LAST:event_jBt3ActionPerformed

    private void jBt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt4ActionPerformed
        // TODO add your handling code here:
        digita("4");
    }//GEN-LAST:event_jBt4ActionPerformed

    private void jBt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt5ActionPerformed
        // TODO add your handling code here:
        digita("5");
    }//GEN-LAST:event_jBt5ActionPerformed

    private void jBt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt6ActionPerformed
        // TODO add your handling code here:
        digita("6");
    }//GEN-LAST:event_jBt6ActionPerformed

    private void jBt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt7ActionPerformed
        // TODO add your handling code here:
        digita("7");
    }//GEN-LAST:event_jBt7ActionPerformed

    private void jBt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt8ActionPerformed
        // TODO add your handling code here:
        digita("8");
    }//GEN-LAST:event_jBt8ActionPerformed

    private void jBt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt9ActionPerformed
        // TODO add your handling code here:
        digita("9");
    }//GEN-LAST:event_jBt9ActionPerformed

    private void jBtPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPointActionPerformed
        // TODO add your handling code here:
        digita(".");
    }//GEN-LAST:event_jBtPointActionPerformed

    private void jBtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtExitActionPerformed

    private void jBtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddActionPerformed
        controlCalculator.realizaOperation(EnumOperation.add, Double.valueOf(jTextField.getText()));
        lastOperation = EnumOperation.add;
        limpa();
    }//GEN-LAST:event_jBtAddActionPerformed

    private void jBtSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubActionPerformed
        controlCalculator.realizaOperation(EnumOperation.subtraction, Double.valueOf(jTextField.getText())                                        );
        lastOperation = EnumOperation.subtraction;
        limpa();
    }//GEN-LAST:event_jBtSubActionPerformed

    private void jBtMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtMultiActionPerformed
        controlCalculator.realizaOperation(EnumOperation.multiplication, Double.parseDouble(jTextField.getText()));
        lastOperation = EnumOperation.multiplication;
        limpa();
    }//GEN-LAST:event_jBtMultiActionPerformed

    private void jBtDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDivisionActionPerformed
        controlCalculator.realizaOperation(EnumOperation.division, Double.valueOf(jTextField.getText()));
        lastOperation = EnumOperation.division;
        limpa();
    }//GEN-LAST:event_jBtDivisionActionPerformed

    private void jBtEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEqualActionPerformed
        controlCalculator.realizaOperation(lastOperation, Double.parseDouble(jTextField.getText()));
        jTextField.setText(DoubleToString(controlCalculator.getTotal()));
        controlCalculator.zerar();
    }//GEN-LAST:event_jBtEqualActionPerformed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jBtNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtNegActionPerformed
        Double value = Double.valueOf(jTextField.getText());
        value = value * (-1);
        jTextField.setText("" + value);
    }//GEN-LAST:event_jBtNegActionPerformed

    private void jBtPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPercentActionPerformed
        Double value = Double.valueOf(jTextField.getText());
        value = value / 100;
        jTextField.setText("" + value);
        controlCalculator.zerar();
    }//GEN-LAST:event_jBtPercentActionPerformed

    private void jBtElevetionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtElevetionActionPerformed
        controlCalculator.realizaOperation(EnumOperation.elevation, Double.valueOf(jTextField.getText()));
        lastOperation = EnumOperation.elevation;
        limpa();
    }//GEN-LAST:event_jBtElevetionActionPerformed

    private void jBtRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtRootActionPerformed
        Double value = Double.valueOf(jTextField.getText());
        value = Math.sqrt(value);
        
        
        if(!temParteDecimal(value)){
            jTextField.setText("" + value);
        }else{
            jTextField.setText("Impossible value");
        }
        controlCalculator.zerar();
    }//GEN-LAST:event_jBtRootActionPerformed
    
    public static boolean temParteDecimal(double numero) {
        return numero != Math.floor(numero);
    }
    
    private String DoubleToString(Double number){
        if(number != null){
            DecimalFormat formato = new DecimalFormat("#.##");
            formato.setParseBigDecimal(true);
            return formato.format(number);
        }
        return "";
    }
    
private Double stringToDouble(String number){
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        
        try{
            dv = nf.parse(number).doubleValue();
        }catch (ParseException ex){
        }
        return dv;
    }
    
    private void digita(String caractere){
        if(jTextField.getText().equals("0.00")){
            jTextField.setText(caractere);
        }else{
            if(caractere.equals(".") && jTextField.getText().contains(".")){
            }else{
                jTextField.setText(jTextField.getText().concat(caractere));
            }
        }
    }
    
    private void limpa(){
        jTextField.setText("0.00");
    }
    
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
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt0;
    private javax.swing.JButton jBt1;
    private javax.swing.JButton jBt2;
    private javax.swing.JButton jBt3;
    private javax.swing.JButton jBt4;
    private javax.swing.JButton jBt5;
    private javax.swing.JButton jBt6;
    private javax.swing.JButton jBt7;
    private javax.swing.JButton jBt8;
    private javax.swing.JButton jBt9;
    private javax.swing.JButton jBtAc;
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtDivision;
    private javax.swing.JButton jBtElevetion;
    private javax.swing.JButton jBtEqual;
    private javax.swing.JButton jBtExit;
    private javax.swing.JButton jBtMulti;
    private javax.swing.JButton jBtNeg;
    private javax.swing.JButton jBtPercent;
    private javax.swing.JButton jBtPoint;
    private javax.swing.JButton jBtRoot;
    private javax.swing.JButton jBtSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
