package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menuguest extends Menu implements ActionListener{

    public Menuguest(String s) {
        super(s);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Adding")){
            this.setVisible(false);
            new Addguest("New Guest",5).setVisible(true);
        }
        
        if(ae.getActionCommand().equals("Searching")){
            this.setVisible(false);
            new Searchguest("Search Guest").setVisible(true);
        }
        
        if(ae.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Mangment("Menu").setVisible(true);
        }
    }  
}
