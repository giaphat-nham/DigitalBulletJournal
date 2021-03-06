/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author DLCH
 */
public class LoginFrame extends javax.swing.JFrame {

    MongoClient client = MongoClients.create("mongodb+srv://ngphat:301002@cluster0.8fmtc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

    MongoDatabase db = client.getDatabase("DigitalBulletJournal");
    public LoginFrame() {
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

        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        loginUsernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        loginPasswordInput = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        loginConfirmButton = new javax.swing.JButton();
        switchToRegisterButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        registerPanel.setVisible(false);
        registerLabel = new javax.swing.JLabel();
        registerUsernameInput = new javax.swing.JTextField();
        registerUsernameLabel = new javax.swing.JLabel();
        registerPasswordInput = new javax.swing.JPasswordField();
        registerPasswordLabel = new javax.swing.JLabel();
        registerPasswordConfirmInput = new javax.swing.JPasswordField();
        registerPasswordConfirmLabel = new javax.swing.JLabel();
        registerConfirmButton = new javax.swing.JButton();
        switchToLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(0, 204, 204));

        loginLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        loginUsernameInput.setBackground(new java.awt.Color(255, 255, 255));
        loginUsernameInput.setForeground(new java.awt.Color(0, 0, 0));
        loginUsernameInput.setToolTipText("");
        loginUsernameInput.setBorder(null);
        loginUsernameInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginUsernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameInputActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setLabelFor(loginUsernameInput);
        usernameLabel.setText("Username: ");

        loginPasswordInput.setBackground(new java.awt.Color(255, 255, 255));
        loginPasswordInput.setForeground(new java.awt.Color(0, 0, 0));
        loginPasswordInput.setBorder(null);

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setLabelFor(loginPasswordInput);
        passwordLabel.setText("Password:");

        loginConfirmButton.setBackground(new java.awt.Color(0, 0, 0));
        loginConfirmButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        loginConfirmButton.setText("Confirm");
        loginConfirmButton.setBorder(null);
        loginConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginConfirmButton.setFocusPainted(false);
        loginConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginConfirmButtonActionPerformed(evt);
            }
        });

        switchToRegisterButton.setBackground(new java.awt.Color(0, 102, 102));
        switchToRegisterButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        switchToRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        switchToRegisterButton.setText("Register");
        switchToRegisterButton.setBorder(null);
        switchToRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchToRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToRegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(loginUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginPasswordInput)
                            .addComponent(passwordLabel)
                            .addComponent(loginConfirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(switchToRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addGap(1, 1, 1)
                .addComponent(loginUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loginConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(switchToRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        registerPanel.setBackground(new java.awt.Color(0, 204, 204));

        registerLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setText("Register");

        registerUsernameInput.setBackground(new java.awt.Color(255, 255, 255));
        registerUsernameInput.setForeground(new java.awt.Color(0, 0, 0));
        registerUsernameInput.setBorder(null);

        registerUsernameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registerUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerUsernameLabel.setLabelFor(registerUsernameInput);
        registerUsernameLabel.setText("Username:");

        registerPasswordInput.setBackground(new java.awt.Color(255, 255, 255));
        registerPasswordInput.setForeground(new java.awt.Color(0, 0, 0));
        registerPasswordInput.setBorder(null);

        registerPasswordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registerPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordLabel.setLabelFor(registerPasswordInput);
        registerPasswordLabel.setText("Password:");

        registerPasswordConfirmInput.setBackground(java.awt.Color.white);
        registerPasswordConfirmInput.setForeground(new java.awt.Color(0, 0, 0));
        registerPasswordConfirmInput.setToolTipText("");
        registerPasswordConfirmInput.setBorder(null);
        registerPasswordConfirmInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordConfirmInputActionPerformed(evt);
            }
        });

        registerPasswordConfirmLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registerPasswordConfirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordConfirmLabel.setLabelFor(registerPasswordConfirmInput);
        registerPasswordConfirmLabel.setText("Password confirmation:");

        registerConfirmButton.setBackground(new java.awt.Color(0, 0, 0));
        registerConfirmButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registerConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        registerConfirmButton.setText("Confirm");
        registerConfirmButton.setBorder(null);
        registerConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerConfirmButtonActionPerformed(evt);
            }
        });

        switchToLoginButton.setBackground(new java.awt.Color(0, 102, 102));
        switchToLoginButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        switchToLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        switchToLoginButton.setText("Back to login");
        switchToLoginButton.setBorder(null);
        switchToLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchToLoginButton.setFocusPainted(false);
        switchToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(registerLabel))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerUsernameInput)
                            .addComponent(registerUsernameLabel)
                            .addComponent(registerPasswordLabel)
                            .addComponent(registerPasswordInput)
                            .addComponent(registerPasswordConfirmLabel)
                            .addComponent(registerPasswordConfirmInput)
                            .addComponent(registerConfirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(switchToLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(registerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordConfirmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerPasswordConfirmInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordConfirmInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordConfirmInputActionPerformed

    //Nut xac nhan dang ky
    private void registerConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerConfirmButtonActionPerformed
        if (evt.getSource()==registerConfirmButton) {
            String username;
            String password;
            String passwordConfirm;
            
            //Input khong duoc de trong
            if (!"".equals(registerUsernameInput.getText())
                    && !"".equals(String.valueOf(registerPasswordInput.getPassword()))
                    && !"".equals(String.valueOf(registerPasswordConfirmInput.getPassword()))) {
                username = registerUsernameInput.getText(); //Lay username duoc input
                password = String.valueOf(registerPasswordInput.getPassword());  //Lay password duoc input
                passwordConfirm = String.valueOf(registerPasswordConfirmInput.getPassword());
                
                //Kiem tra tai khoan da duoc tao hay ch??a
                MongoCollection userCollection = db.getCollection("user");
                FindIterable<Document> createdUsers = userCollection.find();
                boolean usernameExists = false; //co hieu
                
                for (Document document : createdUsers){
                    if (username.equals(document.get("username"))){
                        usernameExists = true;
                        break;
                    }
                }
                //Neu tai khoan da ton tai thi thong bao
                if (usernameExists){
                    JOptionPane.showMessageDialog(null, "This username is already existed.", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
                }
                //Kiem tra password va password confirmation va thong bao
                else if (!password.equals(passwordConfirm)){
                    JOptionPane.showMessageDialog(null, "Password and password confirmation do not match.", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
                }
                //Luu tai khoan moi vao database
                else {
                    Document newUserInfo = new Document("username",username) // tao document de luu vao collection
                                                        .append("password",password);
                    userCollection.insertOne(newUserInfo);
                    registerUsernameInput.setText("");
                    registerPasswordInput.setText("");
                    registerPasswordConfirmInput.setText("");
                    JOptionPane.showMessageDialog(null, "Your account has been successfully created", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            //Thong bao username va password khong duoc trong
            else {
                JOptionPane.showMessageDialog(null,"Username and password can't be blank.","Invalid input",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_registerConfirmButtonActionPerformed

    //Nut xac nhan dang nhap
    private void loginConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginConfirmButtonActionPerformed
        if (evt.getSource()==loginConfirmButton){
            MongoCollection userCollection = db.getCollection("user");
            FindIterable<Document> createdUsers = userCollection.find();
            
            String username;
            String password;
            
            //Kiem tra xem thong itn dang nhap co trong hay khong
            if (!"".equals(loginUsernameInput.getText())&&!"".equals(loginPasswordInput.getText())){
                username = loginUsernameInput.getText(); //Lay username da input
                password = String.valueOf(loginPasswordInput.getPassword()); //Lay password da input
                boolean usernameExists = false; //Co hieu
                
                //Kiem tra username co ton tai hay khong
                for (Document document : createdUsers) {
                    if (username.equals(document.get("username"))) {
                        usernameExists = true;
                        break;
                    }
                }
                
                //Neu username ton tai thi tiep tuc kiem tra password
                if (usernameExists) {
                    FindIterable<Document> usersInfo = userCollection.find(new Document("username",username));
                    boolean passwordIsCorrect = false;
                    
                    //Kiem tra password co dung hay khong
                    for (Document document : usersInfo) {
                        if (password.equals(document.get("password"))){
                            passwordIsCorrect = true;
                            break;
                        }
                    }
                    
                    //Neu password dung thi dang nhap
                    if (passwordIsCorrect){
                        new Application(username).setVisible(true);
                        this.setVisible(false);
                    }
                    //Neu khong thong bao password sai
                    else {
                        JOptionPane.showMessageDialog(null,"Incorrect password.","Invalid input",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                //neu khong thong bao den nguoi dung
                else {
                    JOptionPane.showMessageDialog(null, "Username does not exist.", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            //thong bao den nguoi dung
            else {
                JOptionPane.showMessageDialog(null,"Username and password can't be blank.","Invalid input",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginConfirmButtonActionPerformed

    private void loginUsernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameInputActionPerformed

    private void switchToRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToRegisterButtonActionPerformed
        if (evt.getSource()==switchToRegisterButton) {
            //Hien thi form dang ky
            loginPanel.setVisible(false);
            registerPanel.setVisible(true);
        }
    }//GEN-LAST:event_switchToRegisterButtonActionPerformed

    private void switchToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToLoginButtonActionPerformed
        if (evt.getSource()==switchToLoginButton) {
            //Hien thi form dang nhap
            loginPanel.setVisible(true);
            registerPanel.setVisible(false);
        }
    }//GEN-LAST:event_switchToLoginButtonActionPerformed

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginConfirmButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordInput;
    private javax.swing.JTextField loginUsernameInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerConfirmButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordConfirmInput;
    private javax.swing.JLabel registerPasswordConfirmLabel;
    private javax.swing.JPasswordField registerPasswordInput;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JTextField registerUsernameInput;
    private javax.swing.JLabel registerUsernameLabel;
    private javax.swing.JButton switchToLoginButton;
    private javax.swing.JButton switchToRegisterButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
