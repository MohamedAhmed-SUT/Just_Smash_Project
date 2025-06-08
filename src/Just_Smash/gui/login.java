package Just_Smash.gui;



import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

   
   public login() {
       initComponents();
   }


   @SuppressWarnings("unchecked")
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jtusername = new javax.swing.JTextField();
       jpassword = new javax.swing.JTextField();
       bCasher = new javax.swing.JButton();
       bAdmin = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       jLabel1.setText("username :");

       jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       jLabel2.setText("password :");

       jtusername.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jtusernameActionPerformed(evt);
           }
       });

       jpassword.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jpasswordActionPerformed(evt);
           }
       });

       bCasher.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       bCasher.setText("Casher");
       bCasher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

       bAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       bAdmin.setText("Admin");
       bAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
       bAdmin.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               bCasherActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addComponent(jLabel2)
                       .addGap(18, 18, 18))
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(13, 13, 13)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(jtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                   .addComponent(jpassword))
               .addGap(0, 0, Short.MAX_VALUE))
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addContainerGap(82, Short.MAX_VALUE)
               .addComponent(bAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(bCasher, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(67, 67, 67))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(22, 22, 22)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel1)
                   .addComponent(jtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2)
                   .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(bCasher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(bAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
       );

       pack();
   }                       

   private void jtusernameActionPerformed(java.awt.event.ActionEvent evt) {                                           
   }                                          

   private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {                                          
   }                                         

   private void bCasherActionPerformed(java.awt.event.ActionEvent evt) {                                       
if (jtusername.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Please enter username");
}
else if (jpassword.getText().equals("")){
JOptionPane.showMessageDialog(null, "Please enter password");

}else if (jtusername.getText().contains("just_smash")&& jpassword.getText().contains("1234*")) {
JOptionPane.showMessageDialog(null, "login successful");
 
 Dashboard Dash = new Dashboard();
 Dash.setVisible(true);

} else {
JOptionPane.showMessageDialog(null, "wrong username or password !!!", "Error", JOptionPane.ERROR_MESSAGE);

}    }                                      
  
   public static void main(String args[]) {
 
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new login().setVisible(true);
           }
       });
   }

   private javax.swing.JButton bAdmin;
   private javax.swing.JButton bCasher;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JTextField jpassword;
   private javax.swing.JTextField jtusername;
}
