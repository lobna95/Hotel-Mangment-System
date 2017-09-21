/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectayman.people.Receptionist;

/**
 *
 * @author Toshiba
 */
public class Addreceptionest extends Addeemployee implements ActionListener {

    public Addreceptionest(String s) {
        super(s);
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Submit")){
            Receptionist x = new Receptionist();
            x.write(x);
        }
        
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menureceptionist("Menu of Receptionist").setVisible(true);
        }
    }
}
