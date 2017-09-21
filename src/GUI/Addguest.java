package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import projectayman.MangmentSystem.File_Manager;
import projectayman.Room.Room;
import projectayman.people.Guest;


public  class Addguest extends Add implements ActionListener{
   
    JLabel din;
    JTextField dayin;
    JLabel min;
    JTextField mouthin;
    JLabel yin;
    JTextField yearin;
    JLabel dout;
    JTextField dayout;
    JLabel mout;
    JTextField mouthout;
    JLabel yout;
    JTextField yearout;
    JLabel deposite;
    JTextField Deposite;
    JLabel roomno;
    JTextField Roomno;
    JLabel roomtype;
    JTextField Roomtype;
    JLabel add;
    JTextField additional;
    
    
    public Addguest(String s,int x) {
        super(s);
        
        setSize(650,750);
        
        this.din = new JLabel ("Day In");
        add(din);
         this.dayin= new JTextField ("");
        add(dayin);
        this.min = new JLabel ("Month In");
        add(min);
         this.mouthin= new JTextField ("");
        add(mouthin);
        this.yin = new JLabel ("Year In");
        add(yin);
         this.yearin= new JTextField ("");
        add(yearin);
        this.dout = new JLabel ("Day Out");
        add(dout);
         this.dayout= new JTextField ("");
        add(dayout);
        this.mout = new JLabel ("Month Out ");
        add(mout);
         this.mouthout= new JTextField ("");
        add(mouthout);
        this.yout = new JLabel ("Year Out");
        add(yout);
         this.yearout= new JTextField ("");
        add(yearout);
        this.deposite = new JLabel ("Deposite");
        add(deposite);
         this.Deposite= new JTextField ("");
        add(Deposite);
        this.roomno = new JLabel ("Room Number");
        add(roomno);
        this.Roomno= new JTextField ("");
        add(Roomno);
        this.roomtype = new JLabel("Room Type");
        add(roomtype);
        this.Roomtype = new JTextField("");
        add(Roomtype);
        /*
        this.Roomtype = new JComboBox();
        Roomtype.addItem("Single");
        Roomtype.addItem("Double");
        Roomtype.setSelectedItem("Single");
        add(Roomtype);*/
        this.add = new JLabel("Additional Service");
        add(add);
        this.additional = new JTextField("");
        add(additional);
        
        din.setBounds(id.getBounds().x , id.getBounds().y+120, 100, 30);
        min.setBounds(id.getBounds().x,  id.getBounds().y+160, 100, 30);
        yin.setBounds(id.getBounds().x ,id.getBounds().y+200, 200, 30);
        dout.setBounds(id.getBounds().x , id.getBounds().y+240, 100, 30);
        mout.setBounds(id.getBounds().x,  id.getBounds().y+280, 100, 30);
        yout.setBounds(id.getBounds().x , id.getBounds().y+320, 200, 30);
        deposite.setBounds(id.getBounds().x, id.getBounds().y+360, 125, 30);
        roomno.setBounds(id.getBounds().x,id.getBounds().y+400 , 125, 30);
        add.setBounds(id.getBounds().x, id.getBounds().y+440, 125, 30);
        dayin.setBounds(din.getBounds().x+100 , din.getBounds().y, 200, 30);
        mouthin.setBounds(min.getBounds().x+100, min.getBounds().y, 200, 30);
        yearin.setBounds(yin.getBounds().x+100, yin.getBounds().y , 200 , 30);
        dayout.setBounds(dout.getBounds().x+100, dout.getBounds().y, 200, 30);
        mouthout.setBounds(mout.getBounds().x+100, mout.getBounds().y, 200, 30);
        yearout.setBounds(yout.getBounds().x+100, yout.getBounds().y, 200, 30);
        Deposite.setBounds(deposite.getBounds().x+100, deposite.getBounds().y, 200, 30);
        Roomno.setBounds(roomno.getBounds().x+100, roomno.getBounds().y, 200, 30);
        roomtype.setBounds(id.getBounds().x, id.getBounds().y+440, 100, 30);
        Roomtype.setBounds(roomtype.getBounds().x+100, roomtype.getBounds().y, 200, 30);
        add.setBounds(id.getBounds().x, id.getBounds().y+480, 200, 30);
        additional.setBounds(add.getBounds().x+100, add.getBounds().y, 200, 30);
        
        if(x==0){
            
            this.Submit = new JButton ("Submit");
            add(Submit);
            Submit.addActionListener(this);
            this.reset = new JButton ("Reset");
            add(reset);
            reset.addActionListener(this);
            this.Back = new JButton ("BAck");
            add(Back);
            Back.addActionListener(this);
        
            Submit.setBounds(60, id.getBounds().y + 550, 125, 45);
            reset.setBounds(Submit.getBounds().x +180, Submit.getBounds().y, 125, 45);
            Back.setBounds(Submit.getBounds().x +380, Submit.getBounds().y, 125, 45);
            
        }
        else{
            this.Submit = new JButton ("Submit");
            add(Submit);
            Submit.addActionListener(this);
            this.reset = new JButton ("Reset");
            add(reset);
            reset.addActionListener(this);
            this.Back = new JButton ("Back");
            add(Back);
            Back.addActionListener(this);
        
            Submit.setBounds(60, id.getBounds().y + 550, 125, 45);
            reset.setBounds(Submit.getBounds().x +180, Submit.getBounds().y, 125, 45);
            Back.setBounds(Submit.getBounds().x +380, Submit.getBounds().y, 125, 45);
        }
    }
    

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Submit")){
            if(!tid.getText().equals("") && !tname.getText().equals("") && !tage.getText().equals("") && !dayin.getText().equals("")
                    && !mouthin.getText().equals("") && !yearin.getText().equals("") && !dayout.getText().equals("") 
                    && !mouthout.getText().equals("") && !yearout.getText().equals("")
                    && !Deposite.getText().equals("") && !Roomno.getText().equals("")
                    && !Roomtype.getText().equals("") && !additional.getText().equals("")){
                
                File_Manager x = new File_Manager();
                
                Guest g = new Guest(Integer.parseInt(super.tid.getText()), super.tname.getText(), Integer.parseInt(super.tage.getText()),
                    Integer.parseInt(this.dayin.getText()), Integer.parseInt(this.mouthin.getText()), Integer.parseInt(this.yearin.getText()),
                    Integer.parseInt(this.dayout.getText()), Integer.parseInt(this.mouthout.getText()),
                    Integer.parseInt(this.yearout.getText()),
                    Double.parseDouble(this.Deposite.getText()), this.Roomno.getText(), this.Roomtype.getText(), this.additional.getText());
            
           x.addGuest(g);
            fail.setVisible(false);
            sucess.setVisible(true);
            }
            else{
                fail.setVisible(true);
                sucess.setVisible(false);
            }
          /*  Room d = null;
            if (Roomtype.getSelectedItem().equals("Single")) {
                    d = new Room("Single");
                }
                if (Roomtype.getSelectedItem().equals("Double")) {
                    d = new Room("Double");
                }*/
                
            
        }
                   
        if(e.getActionCommand().equals("Reset")){
            dayin.setText("");
            mouthin.setText("");
            yearin.setText("");
            dayout.setText("");
            mouthout.setText("");
            yearout.setText("");
            Deposite.setText("");
            Roomno.setText("");
            Roomtype.setText("");
            additional.setText("");
        }
        
        if(e.getActionCommand().equals("Back")){
            this.setVisible(false);
            new Menuguest("Menu of Guest").setVisible(true);
        }
        if(e.getActionCommand().equals("BAck")){
            this.setVisible(false);
            new Recepcionestgui("Recepionest Menu").setVisible(true);
        }
    }
}
