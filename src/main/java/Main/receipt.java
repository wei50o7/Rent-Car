package Main;

import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class receipt extends javax.swing.JFrame {

    public receipt() {
        initComponents();
        List info = Arrays.getReservationInfo(Integer.toString(3));
        jtxtareaReceipt.setText("---------------------------------------------------------\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"                                 Receipt\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"---------------------------------------------------------\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"\n");
        Date now = new Date();
        
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+now.toString());
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"\n\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Receipt ID: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Car Plate: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Customer Name: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Start Date: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"End Date: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Duration: "+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Deposit: RM"+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Total: RM"+"\n");
    }

    public receipt (int ID) {
        
        initComponents();
        List info = Arrays.getReservationInfo(Integer.toString(ID));
        jtxtareaReceipt.setText("---------------------------------------------------------\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"                                 Receipt\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"---------------------------------------------------------\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"\n");
        Date now = new Date();
        
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+now.toString());
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"\n\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Receipt ID:                  "+info.get(0)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Car Plate:                    "+info.get(1)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Customer Name:         "+info.get(2)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Start Date:                   "+info.get(3)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"End Date:                    "+info.get(4)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Duration:                    "+info.get(6)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"Deposit:                      RM"+info.get(7)+"\n\n\n\n\n\n\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"   ---------------------------------------------------\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"          Total:                          RM"+info.get(9)+"\n");
        jtxtareaReceipt.setText(jtxtareaReceipt.getText()+"   ---------------------------------------------------");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtareaReceipt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtxtareaReceipt.setEditable(false);
        jtxtareaReceipt.setColumns(20);
        jtxtareaReceipt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtxtareaReceipt.setRows(5);
        jtxtareaReceipt.setName(""); // NOI18N
        jScrollPane1.setViewportView(jtxtareaReceipt);
        jtxtareaReceipt.getAccessibleContext().setAccessibleName("");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jtxtareaReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtareaReceipt;
    // End of variables declaration//GEN-END:variables
}
