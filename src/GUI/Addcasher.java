package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import projectayman.people.Casher;

public class Addcasher extends Addeemployee implements ActionListener{

    public Addcasher(String s) {
        super(s);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Submit")){
            Casher x = new Casher();
            x.write(x);
        }
        
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menucasher("Menu of Casher").setVisible(true);
        }
    }
}
