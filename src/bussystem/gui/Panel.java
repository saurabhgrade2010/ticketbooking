package bussystem.gui;
import javax.swing.*; 
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
public class Panel extends JPanel 
{   public Panel(){}
    public Panel(String s) {
        setLayout(new java.awt.GridLayout(10, 4));
            
            JButton b = new JButton(String.valueOf(s));
            b.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    //...
                    
                }
            });
            add(b);
    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            
            public void run(){
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(new Dimension(300, 300));
                frame.add(new Panel());
                frame.setVisible(true);
            }
        });
    }
}
