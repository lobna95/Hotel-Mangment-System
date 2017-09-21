package GUI;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Receptionestgui extends JFrame{
    
    private JButton []arrbuttons = new JButton[3];
    private JTextField []arrtextfields = new JTextField[5];
    private JLabel []arrlabel = new JLabel[20];
    private ImageIcon img;
    
    public Receptionestgui (){
        setSize (500,500);
        setTitle("Receptionist");
        
        Container cp=getContentPane();
        
        cp.setLayout(null);
        
        for(int i=0; i<4; ++i){
            int x=i*30;
            if(i!=3){
                arrtextfields [i] = new JTextField(20);
                arrtextfields[i].setBounds(100,10+x,100,20);
                cp.add(arrtextfields[i]);
            }
        }
        arrlabel [0] = new JLabel("Name");
        arrlabel[0].setBounds(5, 10 , 100 , 20);
        cp.add(arrlabel[0]);
       /* 
        arrlabel [1] = new JLabel("Middle name");
        arrlabel[1].setBounds(5,40,100,20);
        cp.add(arrlabel[1]);
        
        arrlabel [2] = new JLabel("Last name");
        arrlabel[2].setBounds(5,70,100,20);
        cp.add(arrlabel[2]);
        
        arrlabel [3] = new JLabel("Gender");
        arrlabel[3].setBounds(5,100,100,20);
        cp.add(arrlabel[3]);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        male.setBounds(arrlabel[3].getBounds().x+90,arrlabel[3].getBounds().y,arrlabel[3].getBounds().width,arrlabel[3].getBounds().height);
        cp.add(male);
        female.setBounds(male.getBounds().x+100,male.getBounds().y,male.getBounds().width,male.getBounds().height);
        cp.add(female);*/
        
        arrlabel [4] = new JLabel("Age");
        arrlabel[4].setBounds(5,40,100,20);
        cp.add(arrlabel[4]);
        /*
        arrlabel [5] = new JLabel("Phone number");
        arrlabel[5].setBounds(5,130,160,20);
        cp.add(arrlabel[5]);
        */
        arrlabel [6] = new JLabel("Address");
        arrlabel[6].setBounds(5,70,100,20);
        cp.add(arrlabel[6]);
        
        arrlabel[7] = new JLabel("Check In");
        arrlabel[7].setBounds(5,100,100,20);
        cp.add(arrlabel[7]);
        
        JComboBox iday = new JComboBox();
        for(int i=0; i<=31; i++){
            iday.addItem(i+1);
        }
        iday.setBounds(arrlabel[7].getBounds().x+100, arrlabel[7].getBounds().y, 40, 20);
        cp.add(iday);
        
        JComboBox imonth = new JComboBox();
        for(int i=0; i<=12; i++){
            imonth.addItem(i+1);
        }
        imonth.setBounds(iday.getBounds().x+50, iday.getBounds().y, 40, 20);
        cp.add(imonth);
        
        JComboBox iyear = new JComboBox();
        for(int i=0; i<5; i++){
            iyear.addItem(2015+i);
        }
        iyear.setBounds(iday.getBounds().x+100, iday.getBounds().y, 70, 20);
        cp.add(iyear);
        
        arrlabel[8] = new JLabel("Check Out");
        arrlabel[8].setBounds(5,130,100,20);
        cp.add(arrlabel[8]);
        
        JComboBox oday = new JComboBox();
        for(int i=0; i<30; i++){
            oday.addItem(i+2);
        }
        oday.setBounds(arrlabel[8].getBounds().x+100, arrlabel[8].getBounds().y, 40, 20);
        cp.add(oday);
        
        JComboBox omonth = new JComboBox();
        for(int i=0; i<=12; i++){
            omonth.addItem(i+1);
        }
        omonth.setBounds(oday.getBounds().x+50, oday.getBounds().y, 40, 20);
        cp.add(omonth);
        
        JComboBox oyear = new JComboBox();
        for(int i=0; i<5; i++){
            oyear.addItem(2015+i);
        }
        oyear.setBounds(oday.getBounds().x+100, oday.getBounds().y, 70, 20);
        cp.add(oyear);
        
        arrlabel[9] = new JLabel("Room");
        arrlabel[9].setBounds(5,160,100,20);
        cp.add(arrlabel[9]);
        
        JComboBox room = new JComboBox();
        room.addItem("Single");
        room.addItem("Double");
        room.addItem("Triple");
        room.setBounds(arrlabel[9].getBounds().x+100, arrlabel[9].getBounds().y, 100, 20);
        cp.add(room);
        
        arrlabel[10] = new JLabel ("Addational Service");
        arrlabel[10].setBounds(5,190,110,20);
        cp.add(arrlabel[10]);
        
        JCheckBox glass = new JCheckBox("Glass Boat");
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
        
        glass.setBounds(arrlabel[10].getBounds().x+110,arrlabel[10].getBounds().y, 90, 20);
        cp.add(glass);
        
        gym.setBounds(glass.getBounds().x+90,glass.getBounds().y, 50, 20);
        cp.add(gym);
        
        safari.setBounds(gym.getBounds().x+50,glass.getBounds().y, 60, 20);
        cp.add(safari);
        
        spa.setBounds(safari.getBounds().x+60,safari.getBounds().y, 50, 20);
        cp.add(spa);
        
        transportation.setBounds(spa.getBounds().x+50,spa.getBounds().y, 120, 20);
        cp.add(transportation);
        
        arrlabel[11] = new JLabel("Deposite");
        arrlabel[11].setBounds(5,220,110,20);
        cp.add(arrlabel[11]);
        arrtextfields [4] = new JTextField(20);
        arrtextfields[4].setBounds(arrlabel[11].getBounds().x+100,arrlabel[11].getBounds().y,100,20);
        cp.add(arrtextfields[4]);
        
        img = new ImageIcon(getClass().getResource("image4.png"));
        arrlabel[12] = new JLabel(img);
        arrlabel[12].setBounds(arrlabel[11].getBounds().x,arrlabel[11].getBounds().y+30, 500, 150);
        cp.add(arrlabel[12]);
       
        arrbuttons[0] = new JButton();
        arrbuttons[0].setText("Add");
        arrbuttons[0].setBounds(arrlabel[12].getBounds().x+50, arrlabel[12].getBounds().y+175, 100, 20);
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
/*       for(int i=0; i<8; ++i){
            int b=i*40;
            arrlabel [0] = new JLabel("Name");
            arrlabel [1] = new JLabel("Age");
            arrlabel [2] = new JLabel("Address");
            arrlabel [3] = new JLabel("Check in");
            arrlabel [4] = new JLabel("Check out");
            arrlabel [5] = new JLabel("Room");
            arrlabel [6] = new JLabel("Additional Service");
            arrlabel [7] = new JLabel("Deposite");
   
            arrlabel[i].setBounds(5, 10+b , 150 , 20);
            cp.add(arrlabel[i]);
            if(i!=4){
            int x=i*30;
                arrtextfields [i] = new JTextField(20);
                arrtextfields[i].setBounds(100,10+x,100,20);
                cp.add(arrtextfields[i]);
            }
             
            if(i==3){
                
                    JComboBox iday = new JComboBox();
                    
                    for(int y=0; y<=31; y++)
                        iday.addItem(y+1);
                
                    iday.setBounds(arrlabel[3].getBounds().x+100, arrlabel[3].getBounds().y, 40, 20);
                    cp.add(iday);
        
                    JComboBox imonth = new JComboBox();
                    
                    for(int y=0; y<=12; y++)
                        imonth.addItem(y+1);
        
                    imonth.setBounds(iday.getBounds().x+50, iday.getBounds().y, 40, 20);
                    cp.add(imonth);
        
                    JComboBox iyear = new JComboBox();
                    
                    for(int y=0; y<5; y++)
                        iyear.addItem(2015+y);
        
                    iyear.setBounds(iday.getBounds().x+100, iday.getBounds().y, 70, 20);
                    cp.add(iyear);
            }
            if(i==4){
                JComboBox oday = new JComboBox();
            
                for(int y=0; y<=31; ++y)
                    oday.addItem(y+2);
        
                oday.setBounds(arrlabel[4].getBounds().x+100, arrlabel[4].getBounds().y, 40, 20);
                cp.add(oday);
        
                JComboBox omonth = new JComboBox();
          
                for(int y=0; y<=12; y++)
                   omonth.addItem(y+1);
        
                omonth.setBounds(oday.getBounds().x+50, oday.getBounds().y, 40, 20);
                cp.add(omonth);
        
                JComboBox oyear = new JComboBox();
       
                for(int y=0; y<5; y++)
                    oyear.addItem(2015+y);
        
                oyear.setBounds(oday.getBounds().x+100, oday.getBounds().y, 70, 20);
                cp.add(oyear);
            }
        }*/