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
 * @author ANIL BARBARE
 */
public class Manage_Orders extends Global {
 public static Object ordrec="";
    public void jdbc()
{
    try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/lbms","root","1234");
            stmt=con.createStatement();          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());           
        }
}
    /**
     * Creates new form Manage_Orders
     */
    public Manage_Orders() {
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Orders");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        t1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><h3>Book Name<h3>", "<html><h3>Author<h3>", "<html><h3>Publication<h3>", "<html><h3>Quantity<h3>"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.setFillsViewportHeight(true);
        t1.getTableHeader().setResizingAllowed(false);
        t1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t1);
        t1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (t1.getColumnModel().getColumnCount() > 0) {
            t1.getColumnModel().getColumn(0).setResizable(false);
            t1.getColumnModel().getColumn(0).setPreferredWidth(500);
            t1.getColumnModel().getColumn(1).setResizable(false);
            t1.getColumnModel().getColumn(1).setPreferredWidth(200);
            t1.getColumnModel().getColumn(2).setResizable(false);
            t1.getColumnModel().getColumn(2).setPreferredWidth(200);
            t1.getColumnModel().getColumn(3).setResizable(false);
            t1.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1240, 90));

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.png"))); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logout.png"))); // NOI18N
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, -1));

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton5.setText("MOVE TO INVENTORY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 290, 50));

        jButton6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back.png"))); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 190, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 140)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/library.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -12, -1, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Admin().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        logout();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jdbc();
DefaultTableModel tm=(DefaultTableModel)t1.getModel();
int arr[]=t1.getSelectedRows();
String id1="";
try
{
  int l=arr.length;
  //System.out.println(l);
 if(l>0)
 {
for(int i=0;i<l;i++)
{   
    int j=arr[i];
    ordrec="'"+tm.getValueAt(j,0)+"','"+tm.getValueAt(j,1)+"','"+tm.getValueAt(j,2)+"',"+tm.getValueAt(j,3);
   // System.out.println(ordrec);
String bknm=(String)tm.getValueAt(j,0);
String q3="delete from orders where bookname='"+bknm+"';";
stmt.executeUpdate(q3);
stmt.executeUpdate("drop table if exists ord2;");
stmt.executeUpdate("create table ord2 as select * from orders;");
String q="select bookid from inventory order by bookid";
rs=stmt.executeQuery(q);
rs.last();
String b=rs.getString(1);

int n1=(Integer.parseInt(b.substring(3)));
int id=Integer.parseInt(rs.getString(1).substring(2))+(i+1);
   //System.out.println(Integer.parseInt(rs.getString(1).substring(2)));
  id1="MO"+id;
   //System.out.println(id1);    
    String q2="insert into inventory values('"+id1+"',"+ordrec+","+tm.getValueAt(j,3)+");";
stmt.executeUpdate(q2);
ordrec="";
} 
JOptionPane.showMessageDialog(rootPane,"Successfully moved to inventory");
}
 else
     JOptionPane.showMessageDialog(rootPane,"No item selected");
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,"Error"+e.getMessage());
}

    


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
new Orders().setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
jdbc();
        DefaultTableModel tm=(DefaultTableModel)t1.getModel();
tm.setRowCount(0);
        try
{
    String sql="select bookname,author,publication,quantity from ord2";
   
    rs=stmt.executeQuery(sql);
    if(rs.next())
    {
     while(rs.next())
     {
    Object arr[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
    tm.addRow(arr);
     }
    }
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(rootPane,"Error"+e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Manage_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
