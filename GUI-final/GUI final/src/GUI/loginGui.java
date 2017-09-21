package GUI;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class loginGui extends JFrame{
    
    private JButton []arrbuttons = new JButton[3];
    private JTextField []arrtextfields = new JTextField[2];
    private JLabel []arrlabel = new JLabel[4];
    private ImageIcon img;
    
    public loginGui (){
        
        setSize (400,300);
        setTitle("Login");
        
        Container cp=getContentPane();
         
        arrlabel [0] = new JLabel("User Name");
        cp.setLayout(null);
        arrlabel[0].setBounds(5, 10 , 100 , 20);
        cp.add(arrlabel[0]);
        arrtextfields [0] = new JTextField(20);
        arrtextfields[0].setBounds(arrlabel[0].getBounds().x+70,arrlabel[0].getBounds().y,arrlabel[0].getBounds().width,arrlabel[0].getBounds().height);
        cp.add(arrtextfields[0]);
     
        arrlabel [1] = new JLabel("Password");
        arrlabel[1].setBounds(5,40,100,20);
        cp.add(arrlabel[1]);
        arrtextfields[1] = new JTextField(20);
        arrtextfields[1].setBounds(arrlabel[1].getBounds().x+70,arrlabel[1].getBounds().y,arrlabel[1].getBounds().width,arrlabel[1].getBounds().height);
        cp.add(arrtextfields[1]);
        
        img = new ImageIcon(getClass().getResource("loginButton.png"));
        arrlabel[2] = new JLabel(img);
        arrlabel[2].setBounds(arrlabel[1].getBounds().x,arrlabel[1].getBounds().y+20, 300, 100);
        cp.add(arrlabel[2]);
        
        arrbuttons[0] = new JButton();
        arrbuttons[0].setText("Log in");
        arrbuttons[0].setBounds(arrlabel[2].getBounds().x+20,arrlabel[2].getBounds().y+100, 100, 20);
        cp.add(arrbuttons[0]);
        
        arrbuttons[1] = new JButton();
        arrbuttons[1].setText("Back");
        arrbuttons[1].setBounds(arrbuttons[0].getBounds().x+120, arrbuttons[0].getBounds().y, 100, 20);
        cp.add(arrbuttons[1]);
        
        arrbuttons[2] = new JButton();
        arrbuttons[2].setText("Close");
        arrbuttons[2].setBounds(arrbuttons[1].getBounds().x+120,arrbuttons[1].getBounds().y,100, 20);
        cp.add(arrbuttons[2]);
    }
}
