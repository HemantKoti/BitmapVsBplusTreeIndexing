package BitmapMajorProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BitmapGUIWithIndexing extends javax.swing.JFrame {

    static int flag, rating = Integer.MAX_VALUE;
    static String filePath = null;
    static ArrayList<Integer> deptAl = new ArrayList<>();
    static int ratingOffset = 20;
    static int departmentOffset = 10;

    public BitmapGUIWithIndexing() {
        setTitle("With Bitmap Indexing");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnWithInndexing = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        rbg = new javax.swing.JRadioButton();
        rbe = new javax.swing.JRadioButton();
        rbl = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter The Deparment Names");

        btnWithInndexing.setText("With Indexing");
        btnWithInndexing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithInndexingActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search Time With Indexing");

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

        jLabel2.setText("Choose Rating");

        rbg.setText("> 3.5");
        rbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbgActionPerformed(evt);
            }
        });

        rbe.setText("= 3.5");
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
                .addGap(189, 189, 189)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb7)
                            .addComponent(cb4)
                            .addComponent(cb1))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbg)
                                        .addGap(28, 28, 28)
                                        .addComponent(rbe)
                                        .addGap(35, 35, 35))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb2)
                                            .addComponent(cb5)
                                            .addComponent(cb8)
                                            .addComponent(btnWithInndexing))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb6)
                                    .addComponent(cb9)
                                    .addComponent(cb3)
                                    .addComponent(rbl))))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb4)
                    .addComponent(cb5)
                    .addComponent(cb6))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb7)
                    .addComponent(cb8)
                    .addComponent(cb9))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbg)
                    .addComponent(rbe)
                    .addComponent(rbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnWithInndexing)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithInndexingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithInndexingActionPerformed
        double startTime = System.nanoTime();
        FileReader fileEmpDept = null, fileEmpBenCon = null;
        try {            
            int count = 0;
            String lineEmpDept = null, lineEmpBenCon = null;
            String arrEmpDept[] = null, arrEmpBenCon[] = null;

            fileEmpDept = new FileReader("TableFiles\\Employees\\Employee_Bitmap.txt");
            fileEmpBenCon = new FileReader("TableFiles\\Employees\\Employees_Benefits_Contact.txt");
            BufferedReader brEmpDept = new BufferedReader(fileEmpDept);
            BufferedReader brEmpBenCon = new BufferedReader(fileEmpBenCon);

            while ((lineEmpDept = brEmpDept.readLine()) != null && (lineEmpBenCon = brEmpBenCon.readLine()) != null) {
                flag = 0;
                arrEmpDept = lineEmpDept.split("#");
                if ("1".equals(arrEmpDept[rating])) {
                    for (int deptal : deptAl) {
                        if ("1".equals(arrEmpDept[deptal])) {
                            flag++;
                        }
                    }
                }
                if (flag == deptAl.size()) {
                    count++;
                    arrEmpBenCon = lineEmpBenCon.split("#");
                    displayArea.append("   " + arrEmpDept[0]
                            + "   " + arrEmpDept[1]
                            + "   " + arrEmpDept[2]
                            + "   " + arrEmpDept[3]
                            + "   " + arrEmpDept[4]
                            + "   " + arrEmpDept[5]
                            + "   " + arrEmpDept[6]
                            + "   " + arrEmpDept[7]
                            + "   " + arrEmpDept[8]
                            + "   " + arrEmpDept[9]
                            + "   " + arrEmpBenCon[0]
                            + "   " + arrEmpBenCon[1]
                            + "   " + arrEmpBenCon[2]
                            + "   " + arrEmpBenCon[3]
                            + "   " + arrEmpBenCon[4]
                            + "   " + arrEmpBenCon[5]
                            + "   " + arrEmpBenCon[6]
                            + "   " + arrEmpBenCon[7]
                            + "   " + arrEmpBenCon[8]
                            + "   " + arrEmpBenCon[9] + "\n"
                    );
                }
            }            

            if (count == 0) {
                displayArea.append("No records found\n");
            } else {
                System.out.println("Count is : " + count);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / Math.pow(10.0, 9.0);
            timeField.setText(time + "");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWithInndexingActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        deptAl.add(7 + departmentOffset);
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        deptAl.add(1 + departmentOffset);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        deptAl.add(2 + departmentOffset);
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        deptAl.add(3 + departmentOffset);
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        deptAl.add(4 + departmentOffset);
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        deptAl.add(5 + departmentOffset);
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        deptAl.add(6 + departmentOffset);
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        deptAl.add(8 + departmentOffset);
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        deptAl.add(9 + departmentOffset);
    }//GEN-LAST:event_cb9ActionPerformed

    private void rbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbgActionPerformed
        rating = 3 + ratingOffset;
    }//GEN-LAST:event_rbgActionPerformed

    private void rbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeActionPerformed
        rating = 2 + ratingOffset;
    }//GEN-LAST:event_rbeActionPerformed

    private void rblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblActionPerformed
        rating = 1 + ratingOffset;
    }//GEN-LAST:event_rblActionPerformed

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
            java.util.logging.Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BitmapGUIWithIndexing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BitmapGUIWithIndexing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWithInndexing;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JRadioButton rbe;
    private javax.swing.JRadioButton rbg;
    private javax.swing.JRadioButton rbl;
    private javax.swing.JTextField timeField;
    // End of variables declaration//GEN-END:variables
}
