package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menureceptionist extends Menu implements ActionListener {

    public Menureceptionist(String s) {
        super(s);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Adding")){
            this.setVisible(false);
            new Addreceptionest ("New Receptionist").setVisible(true);
        }
        
        if (ae.getActionCommand().equals("Searching")){
            this.setVisible(false);
            new searchreceptionist("Search Receptionist").setVisible(true);
        }
        
        if(ae.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Mangment("Menu").setVisible(true);
        }
    }  
}
