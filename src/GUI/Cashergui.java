/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class Cashergui extends Search implements ActionListener{

    public Cashergui(String s) {
        super(s);
        
        search = new JLabel("ID");
        add(search);
        Search = new JTextField("");
        add(Search);
        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
        reset = new JButton("Reset");
        add(reset);
        reset.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Submit")){
            this.setVisible(false);
            //new Cashergui("Casher Menu").setVisible(true);
        }
        
        if(e.getActionCommand().equals("Reset")){
            this.setVisible(false);
        }
    }
    
}
