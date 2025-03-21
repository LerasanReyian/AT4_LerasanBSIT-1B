package Login;

//importing packages/statements....
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class login extends javax.swing.JFrame {

    /**
     * nag create po ako ng isang method where all the inputs from the user will
     * be stored on this variables or identifiers.
     */
    private static String uname, password;
    /**
     * This methods utilized to create a file path para dito ma stored 'yong
     * json files natin and using JsonParser the json file (filepath) will parse
     * or break-down into to understandable program/language(java).
     */
    private static final String filepath = "E:\\Downloads\\Login\\src\\Login\\users.json";
    private static final JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();// this method is used to hold break-down data (parsed)
    private static JSONArray userlist = new JSONArray();// this method is used to store user records or list of users from the filepath

    public login() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LblUname = new javax.swing.JLabel();
        LblPswd = new javax.swing.JLabel();
        TFuname = new javax.swing.JTextField();
        Pswd = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(798, 339));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(106, 156, 137));
        jPanel1.setMinimumSize(new java.awt.Dimension(798, 339));

        LblUname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblUname.setText("Enter Username: ");

        LblPswd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblPswd.setText("Enter Password:");

        TFuname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFunameActionPerformed(evt);
            }
        });

        Pswd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BtnLogin.setBackground(new java.awt.Color(255, 218, 179));
        BtnLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(102, 102, 102));
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnClear.setBackground(new java.awt.Color(255, 218, 179));
        BtnClear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(102, 102, 102));
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/logo-white-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblUname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblPswd))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnClear, BtnLogin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUname))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPswd)
                    .addComponent(Pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnClear, BtnLogin});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        try {
            //this code is ginakuha niya ang inouts from the text fields
            uname = TFuname.getText();
            password = Pswd.getText();
            // checking the data from the filepath
            filecheck();
            int checker = 0;
            /**
             * from line 179-186, this block of code will loop through userlist
             * and find a matching username and password
             */
            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userobject = (JSONObject) userlist.get(a);
                String searcheduname = (String) userobject.get("user");
                String searchedpswd = (String) userobject.get("password");
                if (uname.equals(searcheduname) && password.equals(searchedpswd)) {
                    checker++;

                    break;
                }
            }
            //Display login status
            if (checker == 0) {
                System.out.println("Username or Password  does not exist");
            } else {
                //this code will go to children window called welcome if the input is true
                welcome x = new welcome();
                x.setVisible(true);//visibility is true
                x.setLocationRelativeTo(null);//maintain center on the screen
                this.dispose();//after the operation the login window will close

            }
          //error handling exception
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnLoginActionPerformed
    // this button is for clear event
    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        //rest the input fields
        TFuname.setText("");
        Pswd.setText("");
    }//GEN-LAST:event_BtnClearActionPerformed

    private void TFunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFunameActionPerformed
    public static String getuname() {
        return uname;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//this method will display the login window
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
               
                
            }
        });
    }
// this method is used to read and parse user credentials from the json file 
    public static void filecheck() throws FileNotFoundException, IOException, ParseException {
        //utilizing the file reader as 'reader' identifier
        FileReader reader = new FileReader(filepath);
        //conditional statement
        if (reader.ready()) {

            Scanner sc = new Scanner(reader);
            String line = "";
            //Scanner/reading all the content from the file
            while (sc.hasNext()) {
                line = line + sc.nextLine();
            }

            if (!line.equals("")) {

                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                userlist = (JSONArray) record.get("users");//Extracting users list from json
                reader2.close();
            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel LblPswd;
    private javax.swing.JLabel LblUname;
    private javax.swing.JPasswordField Pswd;
    private javax.swing.JTextField TFuname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
