/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author romua
 */
public class VendingMachine extends javax.swing.JFrame {

    /**
     * Creates new form VendingMachine
     */
    public VendingMachine() {

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

        JdiagCandy = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        JCandy1 = new javax.swing.JButton();
        JCandy2 = new javax.swing.JButton();
        ChipsDone1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JdiagChips = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        JChips1 = new javax.swing.JButton();
        JChips2 = new javax.swing.JButton();
        ChipsDone2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JdiagGum = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        JCandy5 = new javax.swing.JButton();
        JCandy6 = new javax.swing.JButton();
        ChipsDone3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JdiagCookies = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        JCandy7 = new javax.swing.JButton();
        JCandy8 = new javax.swing.JButton();
        ChipsDone4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CANDIES = new javax.swing.JButton();
        CHIPS = new javax.swing.JButton();
        GUM = new javax.swing.JButton();
        COOKIES = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        LavelCandies = new javax.swing.JLabel();
        LavelChips = new javax.swing.JLabel();
        LavelGum = new javax.swing.JLabel();
        LavelCookies = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        JdiagCandy.setMinimumSize(new java.awt.Dimension(304, 477));
        JdiagCandy.setResizable(false);
        JdiagCandy.getContentPane().setLayout(null);

        jLabel29.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Price : 1");
        JdiagCandy.getContentPane().add(jLabel29);
        jLabel29.setBounds(110, 80, 90, 30);

        JCandy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/frutos.logo.png"))); // NOI18N
        JCandy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy1ActionPerformed(evt);
            }
        });
        JdiagCandy.getContentPane().add(JCandy1);
        JCandy1.setBounds(90, 200, 105, 50);

        JCandy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/maxx.logo.png"))); // NOI18N
        JCandy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy2ActionPerformed(evt);
            }
        });
        JdiagCandy.getContentPane().add(JCandy2);
        JCandy2.setBounds(90, 270, 105, 50);

        ChipsDone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/done.png"))); // NOI18N
        ChipsDone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsDone1ActionPerformed(evt);
            }
        });
        JdiagCandy.getContentPane().add(ChipsDone1);
        ChipsDone1.setBounds(100, 350, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/background_candy.png"))); // NOI18N
        JdiagCandy.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 450);

        JdiagChips.setMinimumSize(new java.awt.Dimension(304, 477));
        JdiagChips.setResizable(false);
        JdiagChips.getContentPane().setLayout(null);

        jLabel32.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Price :26 &  19");
        JdiagChips.getContentPane().add(jLabel32);
        jLabel32.setBounds(90, 90, 140, 16);

        JChips1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/nova.logo.png"))); // NOI18N
        JChips1.setMinimumSize(new java.awt.Dimension(180, 75));
        JChips1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JChips1ActionPerformed(evt);
            }
        });
        JdiagChips.getContentPane().add(JChips1);
        JChips1.setBounds(90, 210, 105, 40);

        JChips2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/chippy.logo.png"))); // NOI18N
        JChips2.setText("candy2");
        JChips2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JChips2ActionPerformed(evt);
            }
        });
        JdiagChips.getContentPane().add(JChips2);
        JChips2.setBounds(90, 270, 105, 50);

        ChipsDone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/done.png"))); // NOI18N
        ChipsDone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsDone2ActionPerformed(evt);
            }
        });
        JdiagChips.getContentPane().add(ChipsDone2);
        ChipsDone2.setBounds(100, 350, 88, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/background_candy.png"))); // NOI18N
        JdiagChips.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 450);

        JdiagGum.setMinimumSize(new java.awt.Dimension(304, 477));
        JdiagGum.setResizable(false);
        JdiagGum.getContentPane().setLayout(null);

        jLabel37.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Price :1 &  3");
        JdiagGum.getContentPane().add(jLabel37);
        jLabel37.setBounds(100, 90, 140, 16);

        JCandy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/judge.logo.png"))); // NOI18N
        JCandy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy5ActionPerformed(evt);
            }
        });
        JdiagGum.getContentPane().add(JCandy5);
        JCandy5.setBounds(80, 210, 110, 40);

        JCandy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/vfresh.logo.png"))); // NOI18N
        JCandy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy6ActionPerformed(evt);
            }
        });
        JdiagGum.getContentPane().add(JCandy6);
        JCandy6.setBounds(90, 273, 105, 40);

        ChipsDone3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/done.png"))); // NOI18N
        ChipsDone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsDone3ActionPerformed(evt);
            }
        });
        JdiagGum.getContentPane().add(ChipsDone3);
        ChipsDone3.setBounds(100, 350, 88, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/background_candy.png"))); // NOI18N
        JdiagGum.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 450);

        JdiagCookies.setMinimumSize(new java.awt.Dimension(304, 477));
        JdiagCookies.setResizable(false);
        JdiagCookies.getContentPane().setLayout(null);

        jLabel33.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Price :15 &  17");
        JdiagCookies.getContentPane().add(jLabel33);
        jLabel33.setBounds(90, 90, 140, 16);

        JCandy7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/gluten.logo.png"))); // NOI18N
        JCandy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy7ActionPerformed(evt);
            }
        });
        JdiagCookies.getContentPane().add(JCandy7);
        JCandy7.setBounds(80, 210, 120, 40);

        JCandy8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/cookies.logo.png"))); // NOI18N
        JCandy8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy8ActionPerformed(evt);
            }
        });
        JdiagCookies.getContentPane().add(JCandy8);
        JCandy8.setBounds(90, 273, 105, 50);

        ChipsDone4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/done.png"))); // NOI18N
        ChipsDone4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsDone4ActionPerformed(evt);
            }
        });
        JdiagCookies.getContentPane().add(ChipsDone4);
        ChipsDone4.setBounds(100, 350, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/background_candy.png"))); // NOI18N
        JdiagCookies.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 300, 450);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(416, 520));
        getContentPane().setLayout(null);

        CANDIES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/trybutton.png"))); // NOI18N
        CANDIES.setContentAreaFilled(false);
        CANDIES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANDIESActionPerformed(evt);
            }
        });
        getContentPane().add(CANDIES);
        CANDIES.setBounds(239, 204, 90, 30);

        CHIPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/chips.png"))); // NOI18N
        CHIPS.setContentAreaFilled(false);
        CHIPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHIPSActionPerformed(evt);
            }
        });
        getContentPane().add(CHIPS);
        CHIPS.setBounds(238, 276, 90, 30);

        GUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/gum.png"))); // NOI18N
        GUM.setContentAreaFilled(false);
        GUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUMActionPerformed(evt);
            }
        });
        getContentPane().add(GUM);
        GUM.setBounds(238, 349, 90, 30);

        COOKIES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/cookies.png"))); // NOI18N
        COOKIES.setContentAreaFilled(false);
        COOKIES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COOKIESActionPerformed(evt);
            }
        });
        getContentPane().add(COOKIES);
        COOKIES.setBounds(238, 423, 90, 30);

        ex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/ex.png"))); // NOI18N
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        getContentPane().add(ex);
        ex.setBounds(348, 51, 30, 30);

        LavelCandies.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        LavelCandies.setText("100");
        getContentPane().add(LavelCandies);
        LavelCandies.setBounds(62, 203, 29, 16);

        LavelChips.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        LavelChips.setText("100");
        getContentPane().add(LavelChips);
        LavelChips.setBounds(62, 275, 29, 16);

        LavelGum.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        LavelGum.setText("100");
        getContentPane().add(LavelGum);
        LavelGum.setBounds(64, 344, 29, 16);

        LavelCookies.setFont(new java.awt.Font("BubbleGum", 1, 14)); // NOI18N
        LavelCookies.setText("100");
        getContentPane().add(LavelCookies);
        LavelCookies.setBounds(64, 424, 29, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine/Untitled-1.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        PrintWriter write;
        try {
            File file = new File("C:\\Users\\romua\\Documents\\NetBeansProjects\\VendingMachine\\src\\vendingmachine\\" + "log.txt");
            write = new PrintWriter(file);
            write.print(rec);
            write.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VendingMachine.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_exActionPerformed

    private void CANDIESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANDIESActionPerformed
        try {
            JdiagCandy.pack();
            JdiagCandy.setLocationRelativeTo(this);
            JdiagCandy.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CANDIESActionPerformed

    private void CHIPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHIPSActionPerformed
        try {
            JdiagChips.pack();
            JdiagChips.setLocationRelativeTo(this);
            JdiagChips.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CHIPSActionPerformed

    private void GUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUMActionPerformed
        try {
            JdiagGum.pack();
            JdiagGum.setLocationRelativeTo(this);
            JdiagGum.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_GUMActionPerformed

    private void COOKIESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COOKIESActionPerformed
        try {
            JdiagCookies.pack();
            JdiagCookies.setLocationRelativeTo(this);
            JdiagCookies.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_COOKIESActionPerformed

    private void JCandy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy1ActionPerformed
        try {
            rec += "Frutos ";
            sellProduct(Candies1, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy1ActionPerformed

    private void JCandy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy2ActionPerformed
        try {
            rec += "Maxx ";
            sellProduct(Candies2, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy2ActionPerformed

    private void JChips1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JChips1ActionPerformed
        try {
            rec += "Nova ";
            sellProduct(Chips1, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JChips1ActionPerformed

    private void JChips2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JChips2ActionPerformed
        try {
            rec += "Chippy ";
            sellProduct(Chips2, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JChips2ActionPerformed

    private void ChipsDone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsDone1ActionPerformed
        try {
            JdiagCandy.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ChipsDone1ActionPerformed

    private void ChipsDone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsDone2ActionPerformed
        try {
            JdiagChips.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ChipsDone2ActionPerformed

    private void JCandy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy5ActionPerformed
        try {
            rec += "Judge ";
            sellProduct(Gum1, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy5ActionPerformed

    private void JCandy6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy6ActionPerformed
        try {
            rec += "VFresh ";
            sellProduct(Gum2, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy6ActionPerformed

    private void ChipsDone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsDone3ActionPerformed
        try {
            JdiagGum.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ChipsDone3ActionPerformed

    private void JCandy7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy7ActionPerformed
        try {
            rec += "GlutenFreeChocolateCookies ";
            sellProduct(Cookies1, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy7ActionPerformed

    private void JCandy8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy8ActionPerformed
        try {
            rec += "ChocolatesChipsCookies ";
            sellProduct(Cookies2, Cashier);
            refresherOrb();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JCandy8ActionPerformed

    private void ChipsDone4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsDone4ActionPerformed
        try {
            JdiagCookies.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ChipsDone4ActionPerformed

    public String rec = "";
    Dispenser Candies1 = new Dispenser(50, 1);
    Dispenser Candies2 = new Dispenser(50, 1);

    Dispenser Chips1 = new Dispenser(50, 26);
    Dispenser Chips2 = new Dispenser(50, 19);

    Dispenser Gum1 = new Dispenser(50, 1);
    Dispenser Gum2 = new Dispenser(50, 3);

    Dispenser Cookies1 = new Dispenser(50, 15);
    Dispenser Cookies2 = new Dispenser(50, 17);

    CashRegister Cashier = new CashRegister();

    public void sellProduct(Dispenser product, CashRegister cRegister) {
        try {
            int price;
            int coinsInserted;
            int coinsRequired;

            if (product.getCount() > 0) {
                price = product.getProductCost();
                coinsRequired = price;
                coinsInserted = 0;

                while (coinsRequired > 0) {
                    rec += "\nPrice =  " + coinsRequired;

                    coinsInserted += Integer.parseInt(JOptionPane.showInputDialog("please deposit "
                            + coinsRequired + " cents:"));
                    coinsRequired = price - coinsInserted;
                }
                if ((coinsInserted - price) > 0) {
                    rec += "\nChange =  " + (coinsInserted - price);
                    JOptionPane.showMessageDialog(null, "Your Change : " + ((coinsInserted - price)));
                }
                cRegister.acceptedAmount(coinsInserted);
                product.makeSale();
                rec += "\n";
                JOptionPane.showMessageDialog(null, "Collect your item "
                        + " at the bottom and "
                        + " enjoy.\n");
            }
        } catch (Exception e) {
        }
    }

    private void refresherOrb() {
        try {
            LavelCandies.setText(Integer.toString(Candies1.getCount() + Candies2.getCount()));
            LavelChips.setText(Integer.toString(Chips1.getCount() + Chips2.getCount()));
            LavelGum.setText(Integer.toString(Gum1.getCount() + Gum2.getCount()));
            LavelCookies.setText(Integer.toString(Cookies1.getCount() + Cookies2.getCount()));
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANDIES;
    private javax.swing.JButton CHIPS;
    private javax.swing.JButton COOKIES;
    private javax.swing.JButton ChipsDone1;
    private javax.swing.JButton ChipsDone2;
    private javax.swing.JButton ChipsDone3;
    private javax.swing.JButton ChipsDone4;
    private javax.swing.JButton GUM;
    private javax.swing.JButton JCandy1;
    private javax.swing.JButton JCandy2;
    private javax.swing.JButton JCandy5;
    private javax.swing.JButton JCandy6;
    private javax.swing.JButton JCandy7;
    private javax.swing.JButton JCandy8;
    private javax.swing.JButton JChips1;
    private javax.swing.JButton JChips2;
    private javax.swing.JDialog JdiagCandy;
    private javax.swing.JDialog JdiagChips;
    private javax.swing.JDialog JdiagCookies;
    private javax.swing.JDialog JdiagGum;
    private javax.swing.JLabel LavelCandies;
    private javax.swing.JLabel LavelChips;
    private javax.swing.JLabel LavelCookies;
    private javax.swing.JLabel LavelGum;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
