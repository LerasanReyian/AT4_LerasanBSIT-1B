/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class dungag extends javax.swing.JFrame {

    private static String adname, adpass;

    private static String filepath2 = "E:\\Downloads\\Login\\src\\Login\\users.json";
    private static JSONParser jsonParser2 = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject user = new JSONObject();

    public dungag() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Addusname = new javax.swing.JTextField();
        Addpass = new javax.swing.JTextField();
        Addconfirmpass = new javax.swing.JTextField();
        savecha = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(418, 310));

        jPanel1.setBackground(new java.awt.Color(106, 156, 137));
        jPanel1.setForeground(new java.awt.Color(106, 156, 137));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(418, 310));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("New user name:");

        back.setBackground(new java.awt.Color(255, 218, 179));
        back.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("Clear");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("New password:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Confirm password:");

        Addusname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Addusname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Addusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddusnameActionPerformed(evt);
            }
        });

        Addpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Addpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Addpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddpassActionPerformed(evt);
            }
        });

        Addconfirmpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Addconfirmpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Addconfirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddconfirmpassActionPerformed(evt);
            }
        });

        savecha.setBackground(new java.awt.Color(255, 218, 179));
        savecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        savecha.setForeground(new java.awt.Color(102, 102, 102));
        savecha.setText("SaveChanges");
        savecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savechaActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(255, 218, 179));
        home.setForeground(new java.awt.Color(102, 102, 102));
        home.setText("Home");
        home.setToolTipText("");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/site-logo-2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Addusname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Addconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Addpass, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(savecha)
                        .addGap(18, 18, 18)
                        .addComponent(back)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(16, 16, 16))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, savecha});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Addusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Addconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Addpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(savecha))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, savecha});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        Addusname.setText("");
        Addpass.setText("");
        Addconfirmpass.setText("");
    }//GEN-LAST:event_backActionPerformed

    private void AddusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddusnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddusnameActionPerformed

    private void AddpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddpassActionPerformed

    private void AddconfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddconfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddconfirmpassActionPerformed

    private void savechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savechaActionPerformed
        try {
            filecheck();
            adname = Addusname.getText();
            adpass = Addpass.getText();

            user.put("user", adname);
            user.put("password", adpass);

            userlist.add(user);
            record.put("users", userlist);

            save();
            JOptionPane.showMessageDialog(null, "Successfully Added into json file...");
        } catch (IOException ex) {
            Logger.getLogger(dungag.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(dungag.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_savechaActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        welcome wel = new welcome();
        wel.setLocationRelativeTo(null);
        wel.setVisible(true);

    }//GEN-LAST:event_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dungag().setVisible(true);
            }
        });
    }

    public static void filecheck() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(filepath2);

        if (reader.ready()) {
            Scanner scan = new Scanner(reader);
            String line = "";

            while (scan.hasNext()) {
                line = line + scan.nextLine();
            }
            reader.close();
            if (!line.equals("")) {

                try (FileReader reader2 = new FileReader(filepath2)) {
                    record = (JSONObject) jsonParser2.parse(reader2);
                    userlist = (JSONArray) record.get("users");
                } catch (IOException a) {
                    System.out.println("error");
                }
            }
        }
    }

    public static void save() throws IOException {
        FileWriter file = new FileWriter(filepath2);
        file.write(record.toJSONString());
        file.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addconfirmpass;
    private javax.swing.JTextField Addpass;
    private javax.swing.JTextField Addusname;
    private javax.swing.JButton back;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton savecha;
    // End of variables declaration//GEN-END:variables
}
