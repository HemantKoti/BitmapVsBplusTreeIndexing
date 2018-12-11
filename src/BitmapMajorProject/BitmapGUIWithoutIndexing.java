package BitmapMajorProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BitmapGUIWithoutIndexing extends javax.swing.JFrame {

    static int flag;
    static double rating = 5.0;
    static String filePath = null;
    static ArrayList<String> deptAl = new ArrayList<>();

    public BitmapGUIWithoutIndexing() throws ClassNotFoundException {
        setTitle("Without Indexing");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollnoLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        btnWithoutIndex = new javax.swing.JButton();
        lblSearchWithoutIndex = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        lblRating = new javax.swing.JLabel();
        rbg = new javax.swing.JRadioButton();
        rbe = new javax.swing.JRadioButton();
        rbl = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rollnoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rollnoLabel.setText("Enter Department Names");

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("   WELCOME!!!!");

        btnWithoutIndex.setText("Without Index");
        btnWithoutIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithoutIndexActionPerformed(evt);
            }
        });

        lblSearchWithoutIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchWithoutIndex.setText("Search Time Without Indexing");

        timeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("seconds");

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        cb1.setText("Marketing");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setText("Finance");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb3.setText("Human Resources");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setText("Production");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb5.setText("Development");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb6.setText("Quality Management");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        cb7.setText("Sales");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });

        cb8.setText("Research");
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });

        cb9.setText("Customer Service");
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });

        lblRating.setText("Choose Rating");

        rbg.setText("> 3.5");
        rbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbgActionPerformed(evt);
            }
        });

        rbe.setText(" = 3.5");
        rbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbeActionPerformed(evt);
            }
        });

        rbl.setText("< 3.5");
        rbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblSearchWithoutIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addComponent(cb4)
                            .addComponent(cb1)
                            .addComponent(cb7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(rbg)
                                .addGap(36, 36, 36)
                                .addComponent(rbe)
                                .addGap(51, 51, 51)
                                .addComponent(rbl))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb5)
                            .addComponent(cb2)
                            .addComponent(cb8))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb3)
                            .addComponent(cb6)
                            .addComponent(cb9))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(rollnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnWithoutIndex)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rollnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb1)
                        .addComponent(cb2)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb4)
                    .addComponent(cb5)
                    .addComponent(cb6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb8)
                    .addComponent(cb9)
                    .addComponent(cb7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbg)
                    .addComponent(rbe)
                    .addComponent(rbl))
                .addGap(28, 28, 28)
                .addComponent(btnWithoutIndex)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchWithoutIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithoutIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithoutIndexActionPerformed
        double startTime = System.nanoTime();
        FileReader fileEmployee = null, fileEmployeeContact = null, fileEmployeeBenefit = null;
        try {
            int count = 0;
            String lineEmployee = null, lineEmployeeContact = null, lineEmployeeBenefit = null;
            String multiDept[] = null, arrEmployee[] = null, arrEmployeeContact[] = null, arrEmployeeBenefit[] = null;
            fileEmployee = new FileReader("TableFiles\\Employees\\Employee_Department.txt");
            fileEmployeeContact = new FileReader("TableFiles\\Employees\\Employee_Contact.txt");
            BufferedReader brEmployee = new BufferedReader(fileEmployee);
            BufferedReader brEmployeeContact = new BufferedReader(fileEmployeeContact);
            BufferedReader brEmployeeBenefit = null;
            double rowRating;
            while ((lineEmployee = brEmployee.readLine()) != null && (lineEmployeeContact = brEmployeeContact.readLine()) != null) {
                flag = 0;
                arrEmployee = lineEmployee.split("#");
                arrEmployeeContact = lineEmployeeContact.split("#");
                multiDept = arrEmployee[6].split(",");
                rowRating = Double.parseDouble(arrEmployee[9]);
                if (rowRating > 3.5) {
                    rowRating = 1.0;
                } else if (rowRating == 3.5) {
                    rowRating = 0.0;
                } else if (rowRating < 3.5) {
                    rowRating = -1.0;
                }
                if (rating == rowRating) {
                    boolean isPresentInBenefits = false;
                    fileEmployeeBenefit = new FileReader("TableFiles\\Employees\\Employee_Benefits.txt");
                    brEmployeeBenefit = new BufferedReader(fileEmployeeBenefit);
                    while ((lineEmployeeBenefit = brEmployeeBenefit.readLine()) != null) {
                        arrEmployeeBenefit = lineEmployeeBenefit.split("#");
                        if (arrEmployee[9].equals(arrEmployeeBenefit[0])) {
                            isPresentInBenefits = true;
                            break;
                        }
                    }
                    if (!isPresentInBenefits) {
                        continue;
                    }
                    for (String deptal : deptAl) {
                        for (String multidept : multiDept) {
                            if (deptal.equalsIgnoreCase(multidept)) {
                                flag++;
                            }
                        }
                    }
                }
                if (flag == deptAl.size()) {
                    count++;
                    displayArea.append("   " + arrEmployee[0]
                            + "   " + arrEmployee[1]
                            + "   " + arrEmployee[2]
                            + "   " + arrEmployee[3]
                            + "   " + arrEmployee[4]
                            + "   " + arrEmployee[5]
                            + "   " + arrEmployee[6]
                            + "   " + arrEmployee[7]
                            + "   " + arrEmployee[8]
                            + "   " + arrEmployee[9]
                            + "   " + arrEmployeeContact[0]
                            + "   " + arrEmployeeContact[1]
                            + "   " + arrEmployeeContact[2]
                            + "   " + arrEmployeeContact[3]
                            + "   " + arrEmployeeContact[4]
                            + "   " + arrEmployeeBenefit[0]
                            + "   " + arrEmployeeBenefit[1]
                            + "   " + arrEmployeeBenefit[2]
                            + "   " + arrEmployeeBenefit[3]                            
                            + "   " + arrEmployeeBenefit[4] + "\n"
                    );
                }
            }
            if (count == 0) {
                displayArea.append("No records found\n");
            } else {
                System.out.println("Count Records Found : " + count);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / Math.pow(10.0, 9.0);
            timeField.setText(time + "");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileEmployee.close();
            } catch (IOException ex) {
                Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnWithoutIndexActionPerformed

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        deptAl.add(cb1.getText());
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        deptAl.add(cb2.getText());
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        deptAl.add(cb3.getText());
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        deptAl.add(cb4.getText());
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        deptAl.add(cb5.getText());
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        deptAl.add(cb6.getText());
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        deptAl.add(cb7.getText());
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        deptAl.add(cb8.getText());
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        deptAl.add(cb9.getText());
    }//GEN-LAST:event_cb9ActionPerformed

    private void rblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblActionPerformed
        rating = -1.0;
    }//GEN-LAST:event_rblActionPerformed

    private void rbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbgActionPerformed
        rating = 1.0;
    }//GEN-LAST:event_rbgActionPerformed

    private void rbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeActionPerformed
        rating = 0.0;
    }//GEN-LAST:event_rbeActionPerformed

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
            java.util.logging.Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BitmapGUIWithoutIndexing().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BitmapGUIWithoutIndexing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWithoutIndex;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblSearchWithoutIndex;
    private javax.swing.JRadioButton rbe;
    private javax.swing.JRadioButton rbg;
    private javax.swing.JRadioButton rbl;
    private javax.swing.JLabel rollnoLabel;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
