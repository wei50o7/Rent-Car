package Main;

import java.awt.print.PrinterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class generateReport extends javax.swing.JFrame {

    public generateReport() {
        initComponents();
        ArrayList reservation = Arrays.getAllReservationRecord();
        List list;
        double total = 0;
        int j = 0;
        
        jtxtareaReport.setText("--------------------------------------------------------------------------------------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"\t\t\tREPORT\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"Report From "+" to "+"\n\n\n\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"ID\tStart Date\t     EndDate\t       Total\t\tName\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n");
        
        for (int i = 0; i < reservation.size()/10; i++) {
            try {
                list = reservation.subList(j, j+10);
                String startDate = list.get(3).toString();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
                total += Double.parseDouble(list.get(9).toString());
                
                jtxtareaReport.setText(jtxtareaReport.getText()+list.get(0)+"\t");
                jtxtareaReport.setText(jtxtareaReport.getText()+list.get(3)+"\t     ");
                jtxtareaReport.setText(jtxtareaReport.getText()+list.get(4)+"\t       RM");
                jtxtareaReport.setText(jtxtareaReport.getText()+list.get(9)+"\t\t");
                jtxtareaReport.setText(jtxtareaReport.getText()+list.get(2)+"\n");
                
                j+=10;
            } catch (ParseException ex) {
                Logger.getLogger(generateReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jtxtareaReport.setText(jtxtareaReport.getText()+"\n\n\t\t \t \t     ----------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"\t\t \t \t \t  RM"+total);
        jtxtareaReport.setText(jtxtareaReport.getText()+"\n\t\t \t \t     ----------------------------------------\n");
    }
    
    public generateReport(Date startDate, Date endDate) {
        initComponents();
        ArrayList reservation = Arrays.getAllReservationRecord();
        List list;
        double total = 0;
        int j = 0;
        
        jtxtareaReport.setText("--------------------------------------------------------------------------------------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"\t\t\tREPORT\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"Report From\n"+startDate+"\n\tto\n"+endDate+"\n\n\n\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"ID\tStart Date\t     EndDate\t       Total\t\tName\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"--------------------------------------------------------------------------------------------------------------------\n");
        
        for (int i = 0; i < reservation.size()/10; i++) {
            try {
                list = reservation.subList(j, j+10);
                String startDateString = list.get(3).toString();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);
                
                if (date.after(startDate) && date.before(endDate)) {
                    total += Double.parseDouble(list.get(9).toString());
                    
                    jtxtareaReport.setText(jtxtareaReport.getText()+list.get(0)+"\t");
                    jtxtareaReport.setText(jtxtareaReport.getText()+list.get(3)+"\t     ");
                    jtxtareaReport.setText(jtxtareaReport.getText()+list.get(4)+"\t       RM");
                    jtxtareaReport.setText(jtxtareaReport.getText()+list.get(9)+"\t\t");
                    jtxtareaReport.setText(jtxtareaReport.getText()+list.get(2)+"\n");
                    
                }
                
                j+=10;
            } catch (ParseException ex) {
                Logger.getLogger(generateReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jtxtareaReport.setText(jtxtareaReport.getText()+"\n\n\t\t \t \t     ----------------------------------------\n");
        jtxtareaReport.setText(jtxtareaReport.getText()+"\t\t \t \t \t  RM"+total);
        jtxtareaReport.setText(jtxtareaReport.getText()+"\n\t\t \t \t     ----------------------------------------\n");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtareaReport = new javax.swing.JTextArea();
        jbtnPrint = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtxtareaReport.setColumns(20);
        jtxtareaReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtxtareaReport.setRows(5);
        jScrollPane1.setViewportView(jtxtareaReport);

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jbtnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        new report().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        try {
            jtxtareaReport.print();
        } catch (PrinterException ex) {
            Logger.getLogger(generateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(generateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JTextArea jtxtareaReport;
    // End of variables declaration//GEN-END:variables
}
