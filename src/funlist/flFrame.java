/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funlist;

import java.awt.Color;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPopupMenu;

/**
 *
 * @author Khouiled
 */
public class flFrame extends javax.swing.JFrame {
       
    /**
     * Creates new form flFrame
     */
    public flFrame() {
        initComponents();
    }
public void setting(Font d,Color bg,Color fg,String sys,boolean alldll,String s){
    out.setFont(d);
    out.setBackground(bg);
    out.setForeground(fg);
    this.alldll=alldll;
    
    ss32=s;
}
boolean alldll=false;
String ss32="C:\\Windows\\System32";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        out = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        dll = new javax.swing.JTextField();
        sys = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        every = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FunList");

        out.setBackground(new java.awt.Color(0, 0, 0));
        out.setColumns(20);
        out.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        out.setForeground(new java.awt.Color(204, 204, 204));
        out.setRows(5);
        jScrollPane1.setViewportView(out);

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dllMouseClicked(evt);
            }
        });
        dll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dllActionPerformed(evt);
            }
        });

        sys.setSelected(true);
        sys.setText("System32");
        sys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysActionPerformed(evt);
            }
        });

        jButton2.setText("About");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Settings");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clean");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        every.setText("Clean Every Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sys)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(every)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(dll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sys))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(every))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sysActionPerformed

    private void dllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(every.isSelected()){
            out.setText("");
        }
        String dlltxt=dll.getText();
        if(sys.isSelected()){
    dlltxt=ss32+"\\"+dlltxt;
}
        if(alldll){
            if(!dlltxt.endsWith(".dll")){
                dlltxt+=".dll";
            }
        }
        try {
          
            Process pr=Runtime.getRuntime().exec("\""+System.getProperty("user.dir")+"\\dumpbin.exe\" /exports \""+dlltxt+"\"");
       for(;;){
           char c=(char) pr.getInputStream().read();
                   if(c!=Character.MAX_VALUE){
            out.append(""+c);
           }else{
               break;
           }
       }
                    
        } catch (IOException ex) {
            Logger.getLogger(flFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          out.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed
About a=new About();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
a.setLocation(this.getX()+50, this.getY()+50);


    a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
Settings s=new Settings();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
s.setLocation(this.getX()+50, this.getY()+50);
        s.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    PopupMenu pm=new PopupMenu(){
        
        @Override
        public MenuItem getItem(int index) {
            return itm[index];//To change body of generated methods, choose Tools | Templates.
        }
        
    };
    MenuItem itm[]={new MenuItem("Choose"){
        @Override
        public synchronized ActionListener[] getActionListeners() {
            ActionListener[] acl={
              new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                
                }
            }
            };
            return acl; //To change body of generated methods, choose Tools | Templates.
        }
        
        
        
    },new MenuItem("Copy"){
        @Override
        public synchronized ActionListener[] getActionListeners() {
            ActionListener[] acl={
              new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                dll.copy();
                }
            }
            };
            return acl; //To change body of generated methods, choose Tools | Templates.
        }
        
        
        
    },new MenuItem("Paste"){
        @Override
        public synchronized ActionListener[] getActionListeners() {
            ActionListener[] acl={
              new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                dll.paste();
                }
            }
            };
            return acl; //To change body of generated methods, choose Tools | Templates.
        }
        
        
        
    }};
    JPopupMenu pms=new JPopupMenu();
    private void dllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dllMouseClicked
if(evt.getButton()==MouseEvent.BUTTON3){
pms.add(pm);
    pms.show(this, evt.getX(), evt.getY());
}

    }//GEN-LAST:event_dllMouseClicked

    public void setup(Font f,Color bg,Color fg,boolean s32,boolean dll,boolean cln,String sys) {
        out.setFont(f);
        out.setBackground(bg);
        out.setForeground(fg);
        this.sys.setSelected(s32);
        alldll=dll;
        every.setSelected(cln);
        ss32=sys;
        
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dll;
    public javax.swing.JCheckBox every;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea out;
    public javax.swing.JCheckBox sys;
    // End of variables declaration//GEN-END:variables
}
