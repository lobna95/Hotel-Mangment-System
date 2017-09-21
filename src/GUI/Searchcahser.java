/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Toshiba
 */
public class Searchcahser extends Search implements ActionListener{

    public Searchcahser(String s) {
        super(s);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")){
            this.setVisible(false);
            
            
        }
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menucasher("Menu of Casher").setVisible(true);
        }
    }
    
}
