package bussystem.gui;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import bookdetails.util.BookPojo;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
public class Resultbus extends javax.swing.JFrame {
    ArrayList<BookPojo> x;
    String email;
    JDialog dialog;
    JLabel label;
    public Resultbus(){}
    public Resultbus(ArrayList<BookPojo> x,String email) {
    initComponents();
    this.x=x;
    this.email=email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        resultbtn = new javax.swing.JPanel();
        relatedbusbtn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultbtn.setBackground(new java.awt.Color(0, 0, 0));

        relatedbusbtn.setText("RELATED BUS");
        relatedbusbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        relatedbusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatedbusbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultbtnLayout = new javax.swing.GroupLayout(resultbtn);
        resultbtn.setLayout(resultbtnLayout);
        resultbtnLayout.setHorizontalGroup(
            resultbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultbtnLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(relatedbusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        resultbtnLayout.setVerticalGroup(
            resultbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultbtnLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(relatedbusbtn)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void relatedbusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatedbusbtnActionPerformed
        // TODO add your handling code here:
        int y=0;
        if(x.isEmpty())
        {
            JOptionPane.showConfirmDialog(null,"No Bus");
            new SearchBus().setVisible(true);
            y=1;
        }
        int i=0;
         JFrame f=new JFrame("Button Example"); 
        for(BookPojo obj:x){  
         JButton b=new JButton(obj.getBusname());
          b.setBounds(50,100+i,95,30);
          if(y!=1)
          {
            b.addActionListener(new ActionListener(){  
              public void actionPerformed(ActionEvent e){
                Ticketbooking oo=new Ticketbooking(obj,email);
                oo.setLocationRelativeTo(null);
                oo.setVisible(true);
                f.dispose();
                         }  
                      });  
          }
          this.dispose();
         f.add(b);  
         f.setLocationRelativeTo(null);
         f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);
           i+=50;
        }
        
    }//GEN-LAST:event_relatedbusbtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Resultbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultbus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton relatedbusbtn;
    private javax.swing.JPanel resultbtn;
    // End of variables declaration//GEN-END:variables
}
