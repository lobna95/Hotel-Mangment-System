package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menucasher extends Menu implements ActionListener{

    public Menucasher(String s) {
        super(s);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Adding")){
            this.setVisible(false);
            new Addcasher("New Casher").setVisible(true);
        }
        
        if (ae.getActionCommand().equals("Searching")){
            this.setVisible(false);
            new Searchcahser("Search Casher").setVisible(true);
        }
        
        if(ae.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Mangment("Menu").setVisible(true);
        }
    }  
}
