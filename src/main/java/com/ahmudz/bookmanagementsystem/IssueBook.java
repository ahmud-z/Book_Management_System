/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ahmudz.bookmanagementsystem;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Mahmud
 */
public class IssueBook extends javax.swing.JFrame {

    public IssueBook() {
        initComponents();

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        String[][] books = BookManager.getBooks();

        model.addElement("-- Select Book --");

        for (int i = 0; i < books.length; i++) {
            if (books[i][0] == null) {
                break;
            }
            model.addElement(books[i][0]);
        }

        selectBook.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isuueStatus = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        selectBook = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputStudentName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        issueStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        isuueStatus.setBackground(new java.awt.Color(3, 87, 98));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student ID");

        selectBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBookActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Book");

        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount");

        inputAmount.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student name");

        inputStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStudentNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("max...2");

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        issueStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        issueStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        issueStatusLabel.setText("Status");

        javax.swing.GroupLayout isuueStatusLayout = new javax.swing.GroupLayout(isuueStatus);
        isuueStatus.setLayout(isuueStatusLayout);
        isuueStatusLayout.setHorizontalGroup(
            isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isuueStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnter)
                .addGap(145, 145, 145))
            .addGroup(isuueStatusLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(isuueStatusLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(issueStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputId)
                    .addComponent(selectBook, 0, 170, Short.MAX_VALUE)
                    .addComponent(inputAmount)
                    .addComponent(inputStudentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addComponent(jLabel5))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        isuueStatusLayout.setVerticalGroup(
            isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isuueStatusLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnEnter)
                .addGap(18, 18, 18)
                .addComponent(issueStatusLabel)
                .addGap(30, 30, 30)
                .addGroup(isuueStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(btnBack))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isuueStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isuueStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainWindow mWin = new MainWindow();
        this.setVisible(false);
        mWin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void selectBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBookActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        boolean isValid = true;

        String amount = inputAmount.getText();
        int amountNum = Integer.parseInt(amount);
        String id = inputId.getText();
        String name = inputStudentName.getText();
        String book = selectBook.getSelectedItem().toString();

        if (name.equals("") || id.equals("") || amount.equals("")) {
            isValid = false;
        }

        // TODO: Check if amount between 1 - 2
        if (amountNum <= 0 || amountNum > 2) {
            isValid = false;
        }

        if (book.equals("-- Select Book --")) {
            isValid = false;
        }

        if (!isValid) {
            issueStatusLabel.setText("Invalid input.");
            issueStatusLabel.setForeground(Color.red);
        } else {
            StateManager.addIssueBook(id, book, amount);
            BookManager.reduceStock(book, amountNum);

            issueStatusLabel.setText("Book issued successfully .");
            issueStatusLabel.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void inputStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStudentNameActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputAmount;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputStudentName;
    private javax.swing.JLabel issueStatusLabel;
    private javax.swing.JPanel isuueStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> selectBook;
    // End of variables declaration//GEN-END:variables
}
