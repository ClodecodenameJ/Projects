
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author romua
 */
public class ValveController extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ValveController() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PGuage = new javax.swing.JSlider();
        AllTheWayOn = new javax.swing.JButton();
        MostlyOn = new javax.swing.JButton();
        SlightlyOn = new javax.swing.JButton();
        Off = new javax.swing.JButton();
        valve = new javax.swing.JLabel();
        PressureGauge = new javax.swing.JLabel();
        PGTextField = new javax.swing.JTextField();
        PGSetValue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PGLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        PGuage.setMaximum(1000);
        PGuage.setValue(0);
        PGuage.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PGuageStateChanged(evt);
            }
        });
        jPanel1.add(PGuage);
        PGuage.setBounds(17, 205, 210, 23);

        AllTheWayOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/All the way onB.png"))); // NOI18N
        AllTheWayOn.setBorder(null);
        AllTheWayOn.setBorderPainted(false);
        AllTheWayOn.setContentAreaFilled(false);
        AllTheWayOn.setDefaultCapable(false);
        AllTheWayOn.setFocusPainted(false);
        AllTheWayOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllTheWayOnActionPerformed(evt);
            }
        });
        jPanel1.add(AllTheWayOn);
        AllTheWayOn.setBounds(12, 266, 100, 30);

        MostlyOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/Mostly onB.png"))); // NOI18N
        MostlyOn.setBorderPainted(false);
        MostlyOn.setContentAreaFilled(false);
        MostlyOn.setFocusPainted(false);
        MostlyOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostlyOnActionPerformed(evt);
            }
        });
        jPanel1.add(MostlyOn);
        MostlyOn.setBounds(7, 300, 110, 25);

        SlightlyOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/Slightly onB.png"))); // NOI18N
        SlightlyOn.setBorderPainted(false);
        SlightlyOn.setContentAreaFilled(false);
        SlightlyOn.setFocusPainted(false);
        SlightlyOn.setFocusable(false);
        SlightlyOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlightlyOnActionPerformed(evt);
            }
        });
        jPanel1.add(SlightlyOn);
        SlightlyOn.setBounds(128, 266, 110, 30);

        Off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/offB.png"))); // NOI18N
        Off.setBorderPainted(false);
        Off.setContentAreaFilled(false);
        Off.setFocusPainted(false);
        Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffActionPerformed(evt);
            }
        });
        jPanel1.add(Off);
        Off.setBounds(125, 300, 120, 25);

        valve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/Valve.png"))); // NOI18N
        jPanel1.add(valve);
        valve.setBounds(37, 150, 180, 67);

        PressureGauge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/Off.png"))); // NOI18N
        jPanel1.add(PressureGauge);
        PressureGauge.setBounds(72, 82, 60, 70);

        PGTextField.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        PGTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(PGTextField);
        PGTextField.setBounds(80, 357, 80, 30);

        PGSetValue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/SetB.png"))); // NOI18N
        PGSetValue.setBorderPainted(false);
        PGSetValue.setContentAreaFilled(false);
        PGSetValue.setFocusPainted(false);
        PGSetValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGSetValueActionPerformed(evt);
            }
        });
        jPanel1.add(PGSetValue);
        PGSetValue.setBounds(20, 395, 200, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("set custom value");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 332, 110, 14);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valve Controller");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 250, 28);

        PGLabel.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        PGLabel.setForeground(new java.awt.Color(255, 255, 255));
        PGLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(PGLabel);
        PGLabel.setBounds(143, 77, 90, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/BackGround.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 250, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int GlobalVariable = 0;
//method to call to refresh the value everytime changes are made

    public void refreshValue() {
        if (GlobalVariable <= 0) {
            System.out.println("Valve Off");
            PGLabel.setText("Off");
            PressureGauge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/Off.png")));
        } else if (GlobalVariable <= 490) {
            System.out.println("Valve Slightly On");
            PGLabel.setText("SlightlyOn");
            PressureGauge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/SlightlyOn.png")));
        } else if (GlobalVariable <= 990) {
            System.out.println("Valve Mostly On");
            PGLabel.setText("MostlyOn");
            PressureGauge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/MostlyOn.png")));
        } else if (GlobalVariable >= 999) {
            System.out.println("Valve On");
            PGLabel.setText("On");
            PressureGauge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaterMeterPng/On.png")));
        } else {
            System.out.println("Error");
            refreshValue();
        }
        //updating the slider value
        PGuage.setValue(GlobalVariable);
        //updating the textfield value
        PGTextField.setText(String.valueOf(GlobalVariable));

    }

    private void OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffActionPerformed
        GlobalVariable = 0;
        refreshValue();
    }//GEN-LAST:event_OffActionPerformed

    private void AllTheWayOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllTheWayOnActionPerformed
        GlobalVariable = 1000;
        refreshValue();        // TODO add your handling code here:
    }//GEN-LAST:event_AllTheWayOnActionPerformed

    private void MostlyOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostlyOnActionPerformed
        GlobalVariable = 990;
        refreshValue();   // TODO add your handling code here:
    }//GEN-LAST:event_MostlyOnActionPerformed

    private void SlightlyOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlightlyOnActionPerformed
        GlobalVariable = 490;
        refreshValue();     // TODO add your handling code here:
    }//GEN-LAST:event_SlightlyOnActionPerformed

    private void PGSetValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGSetValueActionPerformed
        try {
            if (Integer.parseInt(PGTextField.getText()) > 1000) {
                GlobalVariable = 1000;
                refreshValue();
            } else if (Integer.parseInt(PGTextField.getText()) < 0) {
                GlobalVariable = 0;
                refreshValue();
            } else {
                GlobalVariable = Integer.parseInt(PGTextField.getText());
                refreshValue();
            }
        } catch (Exception e) {
            System.out.println("Error Value please try again");
            refreshValue();
        }
    }//GEN-LAST:event_PGSetValueActionPerformed

    private void PGuageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PGuageStateChanged
        GlobalVariable = PGuage.getValue();
        refreshValue();        // TODO add your handling code here:
    }//GEN-LAST:event_PGuageStateChanged

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
            java.util.logging.Logger.getLogger(ValveController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValveController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValveController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValveController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValveController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllTheWayOn;
    private javax.swing.JButton MostlyOn;
    private javax.swing.JButton Off;
    private javax.swing.JLabel PGLabel;
    private javax.swing.JButton PGSetValue;
    private javax.swing.JTextField PGTextField;
    private javax.swing.JSlider PGuage;
    private javax.swing.JLabel PressureGauge;
    private javax.swing.JButton SlightlyOn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valve;
    // End of variables declaration//GEN-END:variables
}
