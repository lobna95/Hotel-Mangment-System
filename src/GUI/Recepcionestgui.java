package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Recepcionestgui extends MyTittle implements ActionListener{

    JLabel Titlelable;
    JButton rguest;
    JButton rsearch;
    
    public Recepcionestgui(String s){
        super(s);
  
        this.Titlelable = new JLabel("Recepionest Menu");
        add(Titlelable);
        this.rguest = new JButton("Adding");
        add(rguest);
        rguest.addActionListener(this);
        this.rsearch = new JButton("Search");
        add(rsearch); 
        rsearch.addActionListener(this);
       
        Titlelable.setBounds(TitleLable.getBounds().x+20, TitleLable.getBounds().y+30, 200, 40);
        rguest.setBounds(TitleLable.getBounds().x+175, TitleLable.getBounds().y+80, 150, 60);
        rsearch.setBounds(rguest.getBounds().x,rguest.getBounds().y+170, 150, 60);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Adding")){
            this.setVisible(false);
            new Addguest ("New Guest",0).setVisible(true);
        }
        if(ae.getActionCommand().equals("Search")){
            this.setVisible(false);
            new Searchguest("Search Guest").setVisible(true);
        }
    }

}