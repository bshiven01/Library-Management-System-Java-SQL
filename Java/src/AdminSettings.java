
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravik
 */
public class AdminSettings extends Global {
    public void jdbc()
{
    try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/lbms?useSSL=false","root","1234");
            stmt=con.createStatement();          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());           
        }
}
public String profile="";
public int arr[]={};
 StringBuffer sb=new StringBuffer();
    /**
     * Creates new form AdminSettings
     */
    public AdminSettings() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        changepassbtn = new javax.swing.JButton();
        newpass = new javax.swing.JPasswordField();
        confpass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        o = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 770));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Settings");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Change Login Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        newname.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        newname.setNextFocusableComponent(newpass);
        jPanel2.add(newname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 170, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        changepassbtn.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        changepassbtn.setText("CONFIRM");
        changepassbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassbtnActionPerformed(evt);
            }
        });
        jPanel2.add(changepassbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        newpass.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        jPanel2.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, 30));

        confpass.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        jPanel2.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 490, 360));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 150, 60, -1));

        nametxt.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        nametxt.setNextFocusableComponent(email);
        jPanel3.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 76, 280, 30));

        email.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        email.setNextFocusableComponent(m);
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 280, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 16)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("Male");
        m.setNextFocusableComponent(f);
        m.setOpaque(false);
        jPanel3.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        buttonGroup1.add(f);
        f.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 16)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("Female");
        f.setNextFocusableComponent(o);
        f.setOpaque(false);
        jPanel3.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 90, -1));

        buttonGroup1.add(o);
        o.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 16)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setText("Other");
        o.setNextFocusableComponent(contact);
        o.setOpaque(false);
        jPanel3.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        contact.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        contact.setNextFocusableComponent(add);
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 266, 280, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Profile Picture");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/plus.png"))); // NOI18N
        add.setNextFocusableComponent(remove);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 40, 40));

        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/cross.png"))); // NOI18N
        remove.setNextFocusableComponent(newname);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 40, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/default_profile.png"))); // NOI18N
        jPanel3.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 150));

        edit.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel3.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        confirm.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel3.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 540, 570));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.png"))); // NOI18N
        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logout.png"))); // NOI18N
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/library.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(24235345, 23413144));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
nametxt.setEnabled(false);
email.setEnabled(false);
m.setEnabled(false);
f.setEnabled(false);
o.setEnabled(false);
contact.setEnabled(false);
add.setEnabled(false);
remove.setEnabled(false);
jdbc();
try
{
    String sql="Select * from admin where username='"+Login.adname.getText()+"';";
    rs=stmt.executeQuery(sql);
    rs.next();
    nametxt.setText(rs.getString(1));
    email.setText(rs.getString(2));
    char gen=Character.toLowerCase(rs.getString(3).charAt(0));
    if(gen=='m')
        m.setSelected(true);
    else if(gen=='f')
        f.setSelected(true);
    else if(gen=='o')
        o.setSelected(true);
    contact.setText(rs.getString(4));
    
    if(rs.getString(5)!=null)
    {
        StringBuffer sb=new StringBuffer(rs.getString(5));
    }
    pic.setIcon(new ImageIcon(rs.getString(5)));
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e.getMessage());
}
/*try{
    rs=stmt.executeQuery("select profile from admin whereusername='"+Login.adname.getText()+"';");
    rs.next();
    StringBuffer  p=new StringBuffer(rs.getString(1));
    if(p!=null)
        
            
}
catch(Exception e)
{
    
}
*/
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Admin().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        logout();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
nametxt.setEnabled(true);
email.setEnabled(true);
m.setEnabled(true);
f.setEnabled(true);
o.setEnabled(true);
contact.setEnabled(true);
add.setEnabled(true);
remove.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
String gen="";
 sb=new StringBuffer(profile);
int j=0;
while(j<arr.length)
{
    sb.replace(j,j+1,"\\");
}
if(m.isSelected())
    gen="M";
else if(f.isSelected())
    gen="F";
else if(o.isSelected())
    gen="O";

jdbc();
try
{
    if(profile==null);
    else{
    String sql="update admin set name = '"+nametxt.getText()+"',email='"+email.getText()+"',gender='"+gen+"',contact="+contact.getText()+",profile='"+sb+"' where username='"+Login.adname.getText()+"';";
    int i=stmt.executeUpdate(sql);
    if(i!=0)
    JOptionPane.showMessageDialog(rootPane,"Succesfully updated data!");   
    }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
}
nametxt.setEnabled(false);
email.setEnabled(false);
m.setEnabled(false);
f.setEnabled(false);
o.setEnabled(false);
contact.setEnabled(false);
add.setEnabled(false);
remove.setEnabled(false);
//profile="";
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

    private void changepassbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassbtnActionPerformed
String u=newname.getText();
String p1=new String(newpass.getPassword());
String p2=new String(confpass.getPassword());
String unm=Admin.user.getText();
if(p1.equals(p2))
{
    jdbc();
    try
    {
        String sql="update admin set username='"+u+"',pass='"+p1+"' where name='"+Admin.user.getText().substring(12)+"';";
        //System.out.println(sql);
        int i=stmt.executeUpdate(sql);
        if(i!=0)
        JOptionPane.showMessageDialog(rootPane,"Succesfully updated username and password!"); 
        newname.setText("");
        newpass.setText("");
        confpass.setText("");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane,e.getMessage());
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_changepassbtnActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/default_profile.png")));
        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
profile=JOptionPane.showInputDialog(rootPane,"Enter path of new Profile Picture");
for(int i=0;i<profile.length();i++){    
        StringBuffer sb=new StringBuffer(profile);        
        if(sb.charAt(i)=='\\');
        int l=arr.length;
        arr[l]=i;
}
sb=new StringBuffer(profile);
int j=0;
while(j<arr.length)
{
    sb.replace(j,j+1,"\\");
}
if(profile!=null)
pic.setIcon(new ImageIcon(profile));
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changepassbtn;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JTextField contact;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField newname;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JRadioButton o;
    private javax.swing.JLabel pic;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}