
package bussystem.gui.newpackage;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import bookdetails.util.BookPojo;
public class AnotherClass{
    JDialog dialog;
    JLabel label;
  
    public AnotherClass(ArrayList<BookPojo> obj)
    {
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton button = new JButton("RESULT");
        button.addActionListener(null);
        JPanel south = new JPanel();
        south.add(button);
        dialog = new JDialog(new Frame(), "AnotherClass dialog");
        dialog.getContentPane().add(label, "First");
        dialog.getContentPane().add(south, "Last");
        dialog.setSize(200,100);
        dialog.setLocation(425, 200);
    }
}