/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atividade3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    
    int number, numberCompared, test, chances = 5;
    
    public Screen() {
        initComponents();
        jTextAletoryNumber.setEditable(false);
        jTextChances.setEditable(false);
        
        number = numberAleatory(number);
        jTextChances.setText("" + chances);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextAletoryNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextChances = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNumber = new javax.swing.JTextField();
        jButtonVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What number is this");

        jTextAletoryNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextAletoryNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAletoryNumber.setText("?");
        jTextAletoryNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Chances :");

        jTextChances.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextChances.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Number :");

        jTextNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonVerify.setText("Verify");
        jButtonVerify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextChances, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVerify, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextAletoryNumber))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAletoryNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextChances))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerifyActionPerformed
        numberCompared = Integer.parseInt(jTextNumber.getText());
        
        if(numberCompared == number){
            
            int resposta = JOptionPane.showConfirmDialog(
            this,
            "You Winner!!!, generating new number ? Will not close the program!",
            "Alert!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
            );

            if (resposta == JOptionPane.CLOSED_OPTION) {
                chances = 5;
                number = numberAleatory(number);
                jTextChances.setText("" + chances);
                jTextAletoryNumber.setText("" + number);
            } else if (resposta == JOptionPane.YES_OPTION) {
                chances = 5;
                number = numberAleatory(number);
                jTextChances.setText("" + chances);
                jTextAletoryNumber.setText("" + number);
            } else if (resposta == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
            
            
        }else{
            chances -= 1;
            jTextChances.setText("" + chances);
            
            int diferenca = Math.abs(number - numberCompared);
                if (diferenca <= 5) {
                    jTextAletoryNumber.setText("Você está muito perto!");
                } else if (diferenca <= 15) {
                    jTextAletoryNumber.setText("Você está perto!");
                } else {
                    jTextAletoryNumber.setText("Você está muito longe");
                }

        }
        
        if(chances == 0){
            
            jTextAletoryNumber.setText("" + number);
                   
            
            int resposta = JOptionPane.showConfirmDialog(
            this,
            "You lost, generating new number ? Will not close the program!",
            "Alert!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
            );

            if (resposta == JOptionPane.CLOSED_OPTION) {
                chances = 5;
                number = numberAleatory(number);
                jTextChances.setText("" + chances);
                jTextAletoryNumber.setText("?");
                jTextNumber.setText("");
            } else if (resposta == JOptionPane.YES_OPTION) {
                chances = 5;
                number = numberAleatory(number);
                jTextChances.setText("" + chances);
                jTextAletoryNumber.setText("?");
                jTextNumber.setText("");
            } else if (resposta == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
            
        }
    }//GEN-LAST:event_jButtonVerifyActionPerformed
    
    private int numberAleatory(int number){
        Random generator = new Random();
        number = generator.nextInt(100);
        return number;
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextAletoryNumber;
    private javax.swing.JTextField jTextChances;
    private javax.swing.JTextField jTextNumber;
    // End of variables declaration//GEN-END:variables
}
