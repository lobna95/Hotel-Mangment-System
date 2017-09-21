package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mangergui extends JFrame{
    
    private JButton []arrbutton = new JButton[5];
    
    public Mangergui (){
        
        setTitle("Manger");
        setSize(300,200);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        arrbutton[0] = new JButton("Add");
        cp.add(arrbutton[0]);
        
        arrbutton[1] = new JButton("Search");
        cp.add(arrbutton[1]);
        
        arrbutton[2] = new JButton("Delete");
        cp.add(arrbutton[2]);
        
        arrbutton[3] = new JButton("Back");
        cp.add(arrbutton[3]);
        
        arrbutton[4] = new JButton("Close");
        cp.add(arrbutton[4]);
        
    }
    
}
