package view;

import controller.PhonebookController;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Person;
import util.PhonebookUtil;

public class PhoneBookUI extends javax.swing.JFrame {

    Person selectedPerson, updatePerson;

    public PhoneBookUI() {

        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diagEditContact = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEditName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbEditGender = new javax.swing.JComboBox<>();
        cmbEditAge = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JToggleButton();
        txtEditPhoneNumber = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        diagAddContact = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        cmbAge = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JToggleButton();
        txtPhoneNumber = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        popMenu = new javax.swing.JPopupMenu();
        mnEditContact = new javax.swing.JMenuItem();
        mnDeleteContact = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jbSelected = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        Search = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnLoadData = new javax.swing.JMenuItem();
        mnSaveData = new javax.swing.JMenuItem();

        diagEditContact.setModal(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel5.setText("Phone Number:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 110, 120, 29);

        txtEditName.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.add(txtEditName);
        txtEditName.setBounds(90, 20, 270, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel6.setText("Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 70, 29);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel7.setText("Age:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 70, 40, 29);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 70, 74, 29);

        cmbEditGender.setBackground(new java.awt.Color(153, 255, 153));
        cmbEditGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jPanel2.add(cmbEditGender);
        cmbEditGender.setBounds(90, 70, 100, 25);

        cmbEditAge.setBackground(new java.awt.Color(153, 255, 153));
        cmbEditAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        jPanel2.add(cmbEditAge);
        cmbEditAge.setBounds(260, 70, 100, 25);

        btnUpdate.setBackground(new java.awt.Color(102, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/heartcheck1.png"))); // NOI18N
        btnUpdate.setText("Update  PhoneBook");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(120, 170, 200, 50);

        txtEditPhoneNumber.setBackground(new java.awt.Color(153, 255, 153));
        try {
            txtEditPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtEditPhoneNumber);
        txtEditPhoneNumber.setBounds(160, 110, 200, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/giphy (1).gif"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(-4, -4, 410, 280);

        javax.swing.GroupLayout diagEditContactLayout = new javax.swing.GroupLayout(diagEditContact.getContentPane());
        diagEditContact.getContentPane().setLayout(diagEditContactLayout);
        diagEditContactLayout.setHorizontalGroup(
            diagEditContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        diagEditContactLayout.setVerticalGroup(
            diagEditContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        diagAddContact.setMinimumSize(new java.awt.Dimension(400, 280));
        diagAddContact.setModal(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel4.setText("Phone Number:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 130, 29);

        txtName.setBackground(new java.awt.Color(153, 255, 153));
        txtName.setPreferredSize(new java.awt.Dimension(6, 25));
        jPanel1.add(txtName);
        txtName.setBounds(90, 20, 270, 25);
        txtName.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 75, 29);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(203, 70, 40, 29);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel2.setText("Gender:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 74, 29);

        cmbGender.setBackground(new java.awt.Color(153, 255, 153));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jPanel1.add(cmbGender);
        cmbGender.setBounds(90, 70, 100, 25);

        cmbAge.setBackground(new java.awt.Color(153, 255, 153));
        cmbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        jPanel1.add(cmbAge);
        cmbAge.setBounds(260, 70, 100, 25);

        btnSave.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/heartcheck1.png"))); // NOI18N
        btnSave.setText("Save to Phonebook");
        btnSave.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(120, 170, 200, 50);

        txtPhoneNumber.setBackground(new java.awt.Color(153, 255, 153));
        try {
            txtPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtPhoneNumber);
        txtPhoneNumber.setBounds(160, 110, 200, 25);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/giphy (1).gif"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 400, 280);

        javax.swing.GroupLayout diagAddContactLayout = new javax.swing.GroupLayout(diagAddContact.getContentPane());
        diagAddContact.getContentPane().setLayout(diagAddContactLayout);
        diagAddContactLayout.setHorizontalGroup(
            diagAddContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        diagAddContactLayout.setVerticalGroup(
            diagAddContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diagAddContactLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnEditContact.setText("Edit Contact");
        mnEditContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditContactActionPerformed(evt);
            }
        });
        popMenu.add(mnEditContact);

        mnDeleteContact.setText("Delete Contact");
        mnDeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDeleteContactActionPerformed(evt);
            }
        });
        popMenu.add(mnDeleteContact);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        setMinimumSize(new java.awt.Dimension(617, 430));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        tblContacts.setBackground(new java.awt.Color(153, 255, 153));
        tblContacts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Gender", "Age", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblContactsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblContacts);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 560, 190);

        txtSearch.setBackground(new java.awt.Color(153, 255, 153));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch);
        txtSearch.setBounds(440, 90, 140, 25);

        jbSelected.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jbSelected);
        jbSelected.setBounds(30, 120, 540, 30);

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add1.png"))); // NOI18N
        jToggleButton2.setBorder(null);
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseReleased(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(170, 90, 20, 20);

        Search.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New folder/search1.png"))); // NOI18N
        Search.setText("Search");
        getContentPane().add(Search);
        Search.setBounds(320, 90, 100, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel9.setText("Add New Contacts");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 90, 140, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PHONEBOOK3.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(80, 20, 470, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/background.gif"))); // NOI18N
        Background.setText("jLabel10");
        getContentPane().add(Background);
        Background.setBounds(0, -40, 610, 410);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New folder/sd1.png"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnLoadData.setText("Load Data");
        mnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoadDataActionPerformed(evt);
            }
        });
        jMenu1.add(mnLoadData);

        mnSaveData.setText("Save Data");
        mnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveDataActionPerformed(evt);
            }
        });
        jMenu1.add(mnSaveData);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        diagAddContact.pack();
        diagAddContact.setLocationRelativeTo(this);
        diagAddContact.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    PhonebookController controller = new PhonebookController();

    private void refreshTable() {
        DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Name ", "Gender", "Age", "Phone Number"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        for (Person p : controller.getPersonlist()) {
            ArrayList al = new ArrayList();
            al.add(p.getName());
            al.add(p.getGender());
            al.add(p.getAge());
            al.add(p.getPhoneNumber());

            tableModel.addRow(al.toArray());
        }
        tblContacts.setModel(tableModel);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here
        try {
            Person p = new Person();
            p.setName(txtName.getText());
            p.setGender(cmbGender.getSelectedItem().toString());
            p.setAge(Integer.parseInt(cmbAge.getSelectedItem().toString()));
            p.setPhoneNumber(txtPhoneNumber.getText());

            controller.addContact(p);
            JOptionPane.showMessageDialog(this, "Successfully added a contact.");
            diagAddContact.dispose();
            refreshTable();

            txtName.setText("");
            cmbGender.setSelectedIndex(-1);
            cmbAge.setSelectedIndex(-1);
            txtPhoneNumber.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseReleased

    }//GEN-LAST:event_jToggleButton2MouseReleased

    private void tblContactsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactsMouseReleased

        // TODO add your handling code here:
        int row = tblContacts.rowAtPoint(evt.getPoint());
        if (row >= 0 && row < tblContacts.getRowCount()) {
            tblContacts.setRowSelectionInterval(row, row);

        } else {
            tblContacts.clearSelection();
        }
        int rowindex = tblContacts.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        selectedPerson = controller.getPersonlist().get(rowindex);
        jbSelected.setText("Selected: " + selectedPerson.getName());
        if (evt.isPopupTrigger()) {
            popMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblContactsMouseReleased

    private void mnEditContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditContactActionPerformed
        if (selectedPerson != null) {
            txtEditName.setText(selectedPerson.getName());
            cmbEditAge.setSelectedItem(selectedPerson.getAge());
            cmbEditGender.setSelectedItem(selectedPerson.getGender());
            txtEditPhoneNumber.setText(selectedPerson.getPhoneNumber());

            diagEditContact.pack();
            diagEditContact.setLocationRelativeTo(this);
            diagEditContact.setVisible(true);
        }
    }//GEN-LAST:event_mnEditContactActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String view = "";

        Person p = controller.search(txtSearch.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtSearch.getText().length() > 0) {

            if (p != null) {
                view = view + "Name: " + p.getName() + " (" + p.getGender() + ") " + "\n";
                view = view + "Gender:" + p.getGender() + "\n";
                view = view + "Phone Number: " + p.getPhoneNumber() + "\n\n";
                JOptionPane.showMessageDialog(this, view, "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not found", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void mnDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDeleteContactActionPerformed
        if (selectedPerson != null) {
            int ans = JOptionPane.showConfirmDialog(this, "The selected record will be remove: " + selectedPerson.getName()
                    + "(" + selectedPerson.getPhoneNumber() + ")", "Confirm", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                controller.removeContact(selectedPerson);
                refreshTable();
            }
        }
    }//GEN-LAST:event_mnDeleteContactActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void mnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveDataActionPerformed
        if (controller.getPersonlist().isEmpty()) {
            JOptionPane.showMessageDialog(this, "The phonbook is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String csbFile = "contacts.csv";
        try {
            FileWriter writer = new FileWriter(csbFile);
            PhonebookUtil.saveContacts(writer, controller.getPersonlist());
            writer.flush();
            writer.close();
            JOptionPane.showMessageDialog(this, "Successfully saved to file.", "File save", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(PhoneBookUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mnSaveDataActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoadDataActionPerformed
        try {
            controller.setPersonlist(PhonebookUtil.loadContacts("contacts.csv"));
            refreshTable();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PhoneBookUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnLoadDataActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(this, "would like to save the contacts to file?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (controller.getPersonlist().isEmpty()) {
                JOptionPane.showMessageDialog(this, "The phonebook is empty", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String csvFile = "contacts.csv";
            try {
                FileWriter writer = new FileWriter(csvFile);
                PhonebookUtil.saveContacts(writer, controller.getPersonlist());
                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(this, "Successfully saved to fle.", "File save", JOptionPane.INFORMATION_MESSAGE);
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(PhoneBookUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (confirm == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            System.exit(0);
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }


    }//GEN-LAST:event_formWindowClosing

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            updatePerson = new Person();
            updatePerson.setName(txtEditName.getText());
            updatePerson.setAge(Integer.parseInt(cmbEditAge.getSelectedItem().toString()));
            updatePerson.setGender(cmbEditGender.getSelectedItem().toString());
            updatePerson.setPhoneNumber(txtEditPhoneNumber.getText());

            controller.updateConptact(selectedPerson, updatePerson);
            txtEditName.setText("");
            cmbEditGender.setSelectedIndex(-1);
            cmbEditAge.setSelectedIndex(-1);
            txtEditPhoneNumber.setText("");
            diagEditContact.dispose();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (Exception e) {

                }
                new PhoneBookUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Search;
    private javax.swing.JToggleButton btnSave;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAge;
    private javax.swing.JComboBox<String> cmbEditAge;
    private javax.swing.JComboBox<String> cmbEditGender;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JDialog diagAddContact;
    private javax.swing.JDialog diagEditContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel jbSelected;
    private javax.swing.JMenuItem mnDeleteContact;
    private javax.swing.JMenuItem mnEditContact;
    private javax.swing.JMenuItem mnLoadData;
    private javax.swing.JMenuItem mnSaveData;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tblContacts;
    private javax.swing.JTextField txtEditName;
    private javax.swing.JFormattedTextField txtEditPhoneNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
