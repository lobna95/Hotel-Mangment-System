package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectayman.MangmentSystem.File_Manager;

public class searchreceptionist extends Search implements ActionListener{

    public searchreceptionist(String s) {
        super(s);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")){
            File_Manager x = new File_Manager();
            x.searchReceptionist(Integer.parseInt(this.Search.getText()));
            
        }
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menureceptionist("Menu of Receptionist").setVisible(true);
        }
    }
}
