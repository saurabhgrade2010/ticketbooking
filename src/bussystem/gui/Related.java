/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussystem.gui;

import bookdetails.util.BookPojo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import bookdetails.util.BookPojo;
import java.util.ArrayList;
public class Related {
    public Related(ArrayList<BookPojo> x,String email){
     int i=0;
         JFrame f=new JFrame("Button Example"); 
        for(BookPojo obj:x){  
         JButton b=new JButton(obj.getBusname());
          b.setBounds(50,100+i,95,30);
          b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
                Ticketbooking oo=new Ticketbooking(obj,email);
                oo.setLocationRelativeTo(null);
                oo.setVisible(true);
    }  
    });  
         
         f.add(b);  
         f.setSize(400+i,400+i);  
          f.setLayout(null);  
          f.setVisible(true);
           i+=50;
        }
        
    }     
}         

