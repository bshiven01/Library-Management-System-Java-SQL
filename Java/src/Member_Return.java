import javax.swing.table.*;
import java.sql.*;
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
public class Member_Return extends Global {
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
    /**
     * Creates new form Preview
     */
    public Member_Return() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        memid = new javax.swing.JTextField();
        memname = new javax.swing.JTextField();
        retbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return Books");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        t2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><h3>Book 1<h3>", "<html><h3>Book 2<h3>", "<html><h3>Book 3<h3>", "<html><h3>Magazine<h3>"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t2.setColumnSelectionAllowed(true);
        t2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t2);
        t2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 570, 150));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Member ID ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Member Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        memid.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        memid.setEnabled(false);
        memid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memidActionPerformed(evt);
            }
        });
        jPanel1.add(memid, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 210, 30));

        memname.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        memname.setEnabled(false);
        jPanel1.add(memname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 210, 30));

        retbtn.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        retbtn.setText("RETURN");
        retbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retbtnActionPerformed(evt);
            }
        });
        jPanel1.add(retbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 130, -1));

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.png"))); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logout.png"))); // NOI18N
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFocusTraversalPolicyProvider(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 20, 430));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 140)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/library.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
jdbc();
        try
        {
            DefaultTableModel tm2=(DefaultTableModel)t2.getModel();
            String sql="select * from member where username='"+Login.mname.getText()+"';";
            rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                tm2.setRowCount(0);
                Object arr1[]={rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14)};
                tm2.addRow(arr1);                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Member().setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
logout();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void memidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memidActionPerformed

    }//GEN-LAST:event_memidActionPerformed

    private void retbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retbtnActionPerformed
jdbc();
try
{
    int[] ret=t2.getSelectedColumns();
    int len=ret.length;
    String option="";
//Coding for member and inventory table
    for(int i=0;i<len;i++)
    {
        switch(ret[i])
        {
            case 0:option="book1";
            break;
            case 1:option="book2";
            break;
            case 2:option="book3";
            break;
            case 3:option="magazine";
            break;
        }
        String book=(String) t2.getValueAt(0, ret[i]);
        String sql="update member set "+option+"=null where memberid='"+memid.getText()+"';";
        stmt.executeUpdate(sql);
        String sql2="update inventory set available=available+1 where bookname='"+book+"';";
        stmt.executeUpdate(sql2);
        JOptionPane.showMessageDialog(null, "Book(s) returned succesfully.");
        
//Coding for weekly summary table
        ResultSet rs2=stmt.executeQuery("select curdate();");
        rs2.next();
        String d=rs2.getString(1);
        ResultSet rs3=stmt.executeQuery("select * from inventory where bookname='"+book+"';");
        rs3.next();
        String bid=rs3.getString("bookid");
        String name=book;
        ResultSet rs4=stmt.executeQuery("select * from member where memberid='"+memid.getText()+"';");
        rs4.next();
        String mid=memid.getText();
        String mname=rs4.getString("membername");
        String act="returned";             
        String sum="insert into summary values('"+d+"','"+bid+"','"+name+"','"+mid+"','"+mname+"','"+act+"');";
        stmt.executeUpdate(sum);
    }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, "Return Error: "+e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_retbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jdbc();
try
{
    rs=stmt.executeQuery("select memberid,membername,membership from member where username='"+Login.mname.getText()+"';");
    rs.next();
    memid.setText(rs.getString(1));
    memname.setText(rs.getString(2));
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField memid;
    private javax.swing.JTextField memname;
    private javax.swing.JButton retbtn;
    private javax.swing.JTable t2;
    // End of variables declaration//GEN-END:variables
}
