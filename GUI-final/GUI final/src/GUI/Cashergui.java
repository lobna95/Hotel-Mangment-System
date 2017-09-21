package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cashergui extends JFrame {
    
    private JButton []arrbuttons = new JButton[3];
    private JLabel []arrlabel = new JLabel[10];
    private JTextField []arrtextfields = new JTextField[10];
    
    public Cashergui(){
        
        setTitle("Casher");
        setSize(600,300);
        
        Container cp = getContentPane();
        cp.setLayout(null);
        
        for(int i=0; i<5; ++i){
            int b=i*40;
            arrlabel [0] = new JLabel("Guest ID");
            arrlabel [1] = new JLabel("Cost of room");
            arrlabel [2] = new JLabel("Cost of Day");
            arrlabel [3] = new JLabel("Cost of Additional Service");
            arrlabel [4] = new JLabel("Total Bill");
   
            arrlabel[i].setBounds(5, 10+b , 150 , 20);
            cp.add(arrlabel[i]);
            
            int border=i*30;
            
            arrtextfields [i] = new JTextField(20);
            arrtextfields[i].setBounds(arrlabel[i].getBounds().x+150, arrlabel[i].getBounds().y, 50, 20);
            arrtextfields[i].setEditable(false);
            cp.add(arrtextfields[i]);
                
            JCheckBox glass = new JCheckBox("Glass Boat");
             
            if(i==3){
                glass.setSelected(false);
                JCheckBox gym = new JCheckBox("GYM");
                gym.setSelected(false);
                JCheckBox safari = new JCheckBox("Safari");
                safari.setSelected(false);
                JCheckBox spa = new JCheckBox("SPA");
                spa.setSelected(false); 
                JCheckBox transportation = new JCheckBox("Transportation");
                transportation.setSelected(false);
        
                ButtonGroup additional = new ButtonGroup();
                additional.add(glass);
                additional.add(gym);
                additional.add(safari);
                additional.add(spa);
                additional.add(transportation);
        
                glass.setBounds(arrtextfields[i].getBounds().x+50, arrlabel[i].getBounds().y, 90, 20);
                cp.add(glass);
        
                gym.setBounds(glass.getBounds().x+90,glass.getBounds().y, 50, 20);
                cp.add(gym);
        
                safari.setBounds(gym.getBounds().x+50,glass.getBounds().y, 60, 20);
                cp.add(safari);
        
                spa.setBounds(safari.getBounds().x+60,safari.getBounds().y, 50, 20);
                cp.add(spa);
        
                transportation.setBounds(spa.getBounds().x+50,spa.getBounds().y, 120, 20);
                cp.add(transportation);   
            }
        }
        
        arrbuttons[0] = new JButton();
        arrbuttons[0].setText("Print Bill");
        arrbuttons[0].setBounds(100, 200, 100, 20);
        cp.add(arrbuttons[0]);
        
        arrbuttons[1] = new JButton();
        arrbuttons[1].setText("Back");
        arrbuttons[1].setBounds(arrbuttons[0].getBounds().x+120,arrbuttons[0].getBounds().y,100, 20);
        cp.add(arrbuttons[1]);
        
        arrbuttons[2] = new JButton();
        arrbuttons[2].setText("Close");
        arrbuttons[2].setBounds(arrbuttons[1].getBounds().x+120,arrbuttons[1].getBounds().y,100, 20);
        cp.add(arrbuttons[2]);
        
    }
}
