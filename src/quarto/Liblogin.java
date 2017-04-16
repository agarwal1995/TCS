
package quarto;

import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
public class Liblogin extends javax.swing.JFrame {

    Connection c=null;
    ResultSet rs=null;
    PreparedStatement psn=null;
    public Liblogin() {
         initComponents();
     Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2 );
       
       
        c=db.java_db();
         
        
        
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lib_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lib_combo = new javax.swing.JComboBox<>();
        lib_button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lib_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quarto/Images/1490303445_house_shelf.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 250, 210));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("LIBRARY MANAGEMENT  ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("NAME");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 55, -1, -1));

        lib_text.setBackground(new java.awt.Color(51, 51, 51));
        lib_text.setForeground(new java.awt.Color(255, 255, 255));
        lib_text.setBorder(null);
        lib_text.setCaretColor(new java.awt.Color(255, 255, 255));
        lib_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lib_textMouseClicked(evt);
            }
        });
        lib_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_textActionPerformed(evt);
            }
        });
        lib_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lib_textKeyPressed(evt);
            }
        });
        jPanel3.add(lib_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 75, 273, 28));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("PASSWORD");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 137, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("LEVEL");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 208, -1, -1));

        lib_combo.setBackground(new java.awt.Color(51, 51, 51));
        lib_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "LIBRARIAN" }));
        lib_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lib_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_comboActionPerformed(evt);
            }
        });
        lib_combo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lib_comboKeyPressed(evt);
            }
        });
        jPanel3.add(lib_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 234, 273, 28));

        lib_button.setBackground(new java.awt.Color(52, 41, 41));
        lib_button.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lib_button.setForeground(new java.awt.Color(255, 255, 255));
        lib_button.setText("LOGIN");
        lib_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        lib_button.setBorderPainted(false);
        lib_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_buttonActionPerformed(evt);
            }
        });
        lib_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lib_buttonKeyPressed(evt);
            }
        });
        jPanel3.add(lib_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 296, 231, 46));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 109, 273, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 187, 273, 10));

        lib_pass.setBackground(new java.awt.Color(51, 51, 51));
        lib_pass.setForeground(new java.awt.Color(255, 255, 255));
        lib_pass.setBorder(null);
        lib_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        lib_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lib_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lib_passMouseClicked(evt);
            }
        });
        lib_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_passActionPerformed(evt);
            }
        });
        lib_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lib_passKeyPressed(evt);
            }
        });
        jPanel3.add(lib_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 157, 273, 24));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quarto/Images/black-wood-wallpaper-wide.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 766, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void loginclicked()
    {
        String sql="select id,username,password,division,emp_id from Users where (username=? and password=? and division=?)";
        
         try
        {
            
            int count=0;
            psn=c.prepareStatement(sql);
            psn.setString(1, lib_text.getText());
            psn.setString(2, lib_pass.getText());
            psn.setString(3, lib_combo.getSelectedItem().toString());
            
            
            rs=psn.executeQuery();
            while(rs.next())
            {
                count+=1;
                String id=rs.getString(1);
                String id1=rs.getString(5);
                Lib.libid=id;
                Lib.libid1=id1;
                
            }
            String access=(lib_combo.getSelectedItem().toString());
            
            
            
            if("ADMIN".equals(access))
            {
                if(count==1){
                    JOptionPane.showMessageDialog(null, "SUCCESS");
                    Menu j=new Menu();
                    j.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username and Password entered are Wrong");
                }
            }
            if("LIBRARIAN".equals(access))
            {
                if(count==1){
                    JOptionPane.showMessageDialog(null, "SUCCESS");
                    Menu1 j=new Menu1();
                    j.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username and Password entered are Wrong");
                }
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try{
                psn.close();
                rs.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    private void lib_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_textActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_lib_textActionPerformed

    private void lib_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_buttonActionPerformed
        
        loginclicked();
        
        
        
        
        
    }//GEN-LAST:event_lib_buttonActionPerformed

    private void lib_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lib_comboActionPerformed

    private void lib_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lib_passActionPerformed

    private void lib_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lib_passKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            lib_combo.requestFocus();
        }
    }//GEN-LAST:event_lib_passKeyPressed

    private void lib_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lib_passMouseClicked
        lib_pass.setText("");
    }//GEN-LAST:event_lib_passMouseClicked

    private void lib_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lib_textMouseClicked
       lib_text.setText("");
    }//GEN-LAST:event_lib_textMouseClicked

    private void lib_textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lib_textKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            lib_pass.setText("");
            lib_pass.requestFocus();
        }
    }//GEN-LAST:event_lib_textKeyPressed

    private void lib_comboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lib_comboKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            lib_button.requestFocus();
        }
    }//GEN-LAST:event_lib_comboKeyPressed

    private void lib_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lib_buttonKeyPressed
        loginclicked();
    }//GEN-LAST:event_lib_buttonKeyPressed

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
            java.util.logging.Logger.getLogger(Liblogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liblogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liblogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liblogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Liblogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton lib_button;
    private javax.swing.JComboBox<String> lib_combo;
    private javax.swing.JPasswordField lib_pass;
    private javax.swing.JTextField lib_text;
    // End of variables declaration//GEN-END:variables
}
