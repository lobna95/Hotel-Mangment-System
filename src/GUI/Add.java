package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import projectayman.people.Casher;

public class Add extends MyTittle implements ActionListener{
     
    JLabel id;
    JTextField tid;
    JLabel name;
    JTextField tname;
    JLabel age;
    JTextField tage;
    JButton Submit;
    JButton reset;
    JButton Back;
    
    public Add(String s) {
        super(s);
        
        
        
        this.id= new JLabel ("ID");
        add(id);
         this.tid= new JTextField ("");
        add(tid);
        this.name = new JLabel ("Name");
        add(name);
        this.tname=new JTextField ("");
        add(tname);
        this.age= new JLabel ("Age");
        add(age);
        this.tage= new JTextField("");
        add(tage);
        
        
        
        id.setBounds(150, 80, 100, 30);
        tid.setBounds(id.getBounds().x +100, id.getBounds().y, 200, 30);
        name.setBounds(id.getBounds().x, id.getBounds().y + 40, 100, 30);
        tname.setBounds(name.getBounds().x+100, name.getBounds().y, 200, 30);
        age.setBounds(id.getBounds().x, id.getBounds().y+80, 40, 30);
        tage.setBounds(age.getBounds() .x +100 ,age.getBounds().y, 200 , 30);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reset")){
            tid.setText("");
            tname.setText("");
            tage.setText("");
        }
    }
}