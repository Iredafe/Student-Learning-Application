/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolApp;

/**
 *
 * @author Iredafe
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
    
    setLocationRelativeTo(null);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topDashboardPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        subtopDashboardPanel = new javax.swing.JPanel();
        settingsInSubTopPanel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        addSubjectPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        uploadVideoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        addToLibraryPanel = new javax.swing.JPanel();
        updateSubjectPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topDashboardPanel.setBackground(new java.awt.Color(0, 153, 153));
        topDashboardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        topDashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        topDashboardPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/search-icon (2).png"))); // NOI18N
        topDashboardPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 40, 40));

        getContentPane().add(topDashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 80));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/classroom.png"))); // NOI18N
        jButton1.setText("Classes");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 70));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Apps-Google-Analytics-icon.png"))); // NOI18N
        jButton2.setText("Performance");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 70));

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/games-config-options-icon.png"))); // NOI18N
        jButton4.setText("Games");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 70));

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/students-icon.png"))); // NOI18N
        jButton5.setText("Students");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 70));

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Teachers-icon.png"))); // NOI18N
        jButton7.setText("Teachers");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 580));

        subtopDashboardPanel.setBackground(new java.awt.Color(0, 102, 102));
        subtopDashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsInSubTopPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/gears (1).png"))); // NOI18N
        subtopDashboardPanel.add(settingsInSubTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

        getContentPane().add(subtopDashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1000, 50));

        addSubjectPanel.setBackground(new java.awt.Color(153, 255, 153));
        addSubjectPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Lecture Notes");
        addSubjectPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 20));

        jButton6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton6.setText("Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jButton10.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton10.setText("Preview");
        addSubjectPanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        jTextField2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 40));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Topics");
        addSubjectPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Notes");
        addSubjectPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 40, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Topics");
        addSubjectPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setText("Subject Name");
        addSubjectPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 20));
        addSubjectPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 40));

        jButton11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton11.setText("Update Subject");
        addSubjectPanel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addSubjectPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 450, 280));

        jButton13.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton13.setText("Add Subject");
        addSubjectPanel.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 380, 120, -1));

        jTabbedPane1.addTab("tab1", addSubjectPanel);

        uploadVideoPanel.setBackground(new java.awt.Color(153, 255, 153));
        uploadVideoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Lecture Videos");
        uploadVideoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        uploadVideoPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 30));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        uploadVideoPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 360, 220));

        jButton8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton8.setText("Upload");
        uploadVideoPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jButton18.setBackground(new java.awt.Color(0, 102, 102));
        jButton18.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton18.setText("Back To Home");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, 30));

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton9.setText("Watch Videos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, 30));

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton12.setText("e-Library ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 100, 30));

        jTabbedPane1.addTab("tab2", uploadVideoPanel);

        addToLibraryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab3", addToLibraryPanel);

        updateSubjectPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab4", updateSubjectPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 1000, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        dispose();
        StudentHome sh = new StudentHome();
        sh.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addSubjectPanel;
    private javax.swing.JPanel addToLibraryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel settingsInSubTopPanel;
    private javax.swing.JPanel subtopDashboardPanel;
    private javax.swing.JPanel topDashboardPanel;
    private javax.swing.JPanel updateSubjectPanel;
    private javax.swing.JPanel uploadVideoPanel;
    // End of variables declaration//GEN-END:variables
}
