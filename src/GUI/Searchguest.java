package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import projectayman.people.Guest;
import projectayman.MangmentSystem.File_Manager;


public class Searchguest extends Search implements ActionListener{

    public Searchguest(String s) {
        super(s);
        ArrayList<Guest> st = null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")){
            
            File_Manager x = new File_Manager();
            x.searchForGuests(Integer.parseInt(Search.getText()));
            
        }
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menuguest("Menu of Guest").setVisible(true);
        }
    }
    
}