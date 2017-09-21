package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminMenu extends JFrame{
    
    private JButton []arrbuttons = new JButton[3];
    
    public AdminMenu(){
        
        setTitle("Admin Menu");
        setSize(300,100);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        arrbuttons[0]= new JButton("Manger");
        arrbuttons[0].setSize(10,20);
        cp.add(arrbuttons[0]);
        
        arrbuttons[1]= new JButton("Receptionist");
        cp.add(arrbuttons[1]);
        
        arrbuttons[2]= new JButton("Casher");
        cp.add(arrbuttons[2]);
        
    }
}
