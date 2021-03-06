package Main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class manageCar extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    public void initTable() {
        
        model = (DefaultTableModel) jtableCar.getModel();
        model.setRowCount(0);
        ArrayList cars = Arrays.getAllCarRecord();
        int j = 0;
        
        for (int i = 0; i < cars.size()/10; i++) {
            model.insertRow(model.getRowCount(), new Object[] {
                cars.subList(j, j+10).get(0), cars.subList(j, j+10).get(1), cars.subList(j, j+10).get(2), cars.subList(j, j+10).get(3), cars.subList(j, j+10).get(4), cars.subList(j, j+10).get(5), cars.subList(j, j+10).get(6), cars.subList(j, j+10).get(7), cars.subList(j, j+10).get(8), cars.subList(j, j+10).get(9)
            });
            j+=10;
        }
    }
    
    public void reset() {
        jtxtID.setText(Integer.toString(Arrays.getNewCarId()));
        jtxtMake.setText(null);
        jtxtModel.setText(null);
        jtxtYear.setText(null);
        jtxtPlate.setText(null);
        jcmbTransmission.setSelectedIndex(0);
        jtxtRate.setText(null);
        jtxtColor.setText(null);
        jcmbType.setSelectedIndex(0);
    }
    
    private boolean validateInput() {
        boolean boo = true;
        if (jtxtMake.getText().equals("")||jtxtModel.getText().equals("")||jtxtYear.getText().equals("")||jtxtPlate.getText().equals("")||jtxtRate.getText().equals("")||jtxtColor.getText().equals("")) {
            boo = false;
        }
        return boo;
    }
    
    public manageCar() {
        initComponents();
        initTable();
        jtxtID.setText(Integer.toString(Arrays.getNewCarId()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblID = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jlblID1 = new javax.swing.JLabel();
        jtxtMake = new javax.swing.JTextField();
        jlblID2 = new javax.swing.JLabel();
        jtxtModel = new javax.swing.JTextField();
        jlblID3 = new javax.swing.JLabel();
        jtxtYear = new javax.swing.JTextField();
        jlblID4 = new javax.swing.JLabel();
        jlblID5 = new javax.swing.JLabel();
        jlblID6 = new javax.swing.JLabel();
        jtxtRate = new javax.swing.JTextField();
        jlblID7 = new javax.swing.JLabel();
        jtxtColor = new javax.swing.JTextField();
        jlblID8 = new javax.swing.JLabel();
        jcmbType = new javax.swing.JComboBox<>();
        jcmbTransmission = new javax.swing.JComboBox<>();
        jtxtPlate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbtnUpdateAdd = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jlblID9 = new javax.swing.JLabel();
        jtxtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Detail"));

        jlblID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID.setText("ID");

        jtxtID.setEditable(false);

        jlblID1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID1.setText("Make");

        jtxtMake.setToolTipText("");

        jlblID2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID2.setText("Model");

        jlblID3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID3.setText("Year");

        jlblID4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID4.setText("Plate");

        jlblID5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID5.setText("Transmission");

        jlblID6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID6.setText("Rate");

        jlblID7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID7.setText("Color");

        jlblID8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID8.setText("Type");

        jcmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Coupe", "Sports", "Wagon", "Hatchback", "Convertible", "SUV", "Minivan", "Pickup" }));
        jcmbType.setToolTipText("");

        jcmbTransmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Manual" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtPlate)
                    .addComponent(jcmbTransmission, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtMake, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jlblID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jlblID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jlblID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblID5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblID6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jlblID7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jlblID8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jtxtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblID8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbType, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtableCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Make", "Model", "Year", "Plate", "Transmission", "Rate", "Color", "Availability", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableCar);
        if (jtableCar.getColumnModel().getColumnCount() > 0) {
            jtableCar.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Functions"));

        jbtnUpdateAdd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnUpdateAdd.setText("Update/Add");
        jbtnUpdateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateAddActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbtnUpdateAdd)
                .addGap(43, 43, 43)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnUpdateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlblID9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblID9.setText("Search");

        jtxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblID9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblID9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUpdateAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateAddActionPerformed
        
        if (!validateInput()) {
            JOptionPane.showMessageDialog(null, "Please Make Sure All Fields Are Entered");
        } else {
            
            try {
                int ID = Integer.parseInt(jtxtID.getText());
                String make = jtxtMake.getText();
                String model = jtxtModel.getText();
                int year = Integer.parseInt(jtxtYear.getText());
                String plate = jtxtPlate.getText();
                String transmission = jcmbTransmission.getSelectedItem().toString();
                double rate = Double.parseDouble(jtxtRate.getText());
                String color = jtxtColor.getText();
                String type = jcmbType.getSelectedItem().toString();

                Car car = new Car(ID, make, model, year, plate, transmission, rate, color, type);

                if (Arrays.getNewCarId() != ID) {

                    if (car.update(jtxtID.getText())) {
                        JOptionPane.showMessageDialog(null, "Succesfully Updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to Update");
                    }
                } else {

                    if (car.add()) {
                        JOptionPane.showMessageDialog(null, "Succesfully Added");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to Add");
                    }
                }

                reset();
                initTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        }
    }//GEN-LAST:event_jbtnUpdateAddActionPerformed

    private void jtableCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableCarMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jtableCar.getModel();
        int selectedRowIndex = jtableCar.getSelectedRow();
        
        jtxtID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jtxtMake.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jtxtModel.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jtxtYear.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jtxtPlate.setText(model.getValueAt(selectedRowIndex, 4).toString());
        jcmbTransmission.setSelectedItem(model.getValueAt(selectedRowIndex, 5).toString());
        jtxtRate.setText(model.getValueAt(selectedRowIndex, 6).toString());
        jtxtColor.setText(model.getValueAt(selectedRowIndex, 7).toString());
        jcmbType.setSelectedItem(model.getValueAt(selectedRowIndex, 9).toString());
        
    }//GEN-LAST:event_jtableCarMouseClicked

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        reset();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        
        if (!validateInput()) {
            JOptionPane.showMessageDialog(null, "Please Select Car to Delete");
        } else {
            if (new Car().delete(jtxtID.getText())) {
                JOptionPane.showMessageDialog(null, "Succesfully Deleted");
                reset();
                initTable();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to Delete");
            }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSearchKeyPressed
        model = (DefaultTableModel)jtableCar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtableCar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtSearch.getText().trim()));
    }//GEN-LAST:event_jtxtSearchKeyPressed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdateAdd;
    private javax.swing.JComboBox<String> jcmbTransmission;
    private javax.swing.JComboBox<String> jcmbType;
    private javax.swing.JLabel jlblID;
    private javax.swing.JLabel jlblID1;
    private javax.swing.JLabel jlblID2;
    private javax.swing.JLabel jlblID3;
    private javax.swing.JLabel jlblID4;
    private javax.swing.JLabel jlblID5;
    private javax.swing.JLabel jlblID6;
    private javax.swing.JLabel jlblID7;
    private javax.swing.JLabel jlblID8;
    private javax.swing.JLabel jlblID9;
    private javax.swing.JTable jtableCar;
    private javax.swing.JTextField jtxtColor;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtMake;
    private javax.swing.JTextField jtxtModel;
    private javax.swing.JTextField jtxtPlate;
    private javax.swing.JTextField jtxtRate;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables
}
