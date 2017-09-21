package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projectayman.people.Casher;
import projectayman.people.Manger;
import projectayman.people.Person;
import projectayman.people.Receptionist;

public  class Admingui extends MyTittle implements ActionListener{
    
    public static Person logedPerson = null ;
    JLabel TitleLable;
    JLabel usernamelabel;
    JTextField username;
    JLabel password;
    JPasswordField pass;
    JButton login;
    JButton forget;
    String m = "";
    
    public Admingui(String s){
        
        super(s);
        
                
        setLocation(550,150);
        setSize(550, 400);
        
        this.TitleLable = new JLabel("Log in");
        add(TitleLable);
        this.usernamelabel = new JLabel("Username");
        add(this.usernamelabel);
        this.username = new JTextField("");
        add(this.username);
        this.password = new JLabel("Password");
        add(this.password);
        this.pass = new JPasswordField("");
        add(this.pass);
        this.login = new JButton("Login");
        add(this.login);
        login.addActionListener(this);
        this.forget = new JButton("Forget");
        add(this.forget);
        forget.addActionListener(this);
        
        setLayout(null);
        
        TitleLable.setBounds(55, 30, 200, 40);

        usernamelabel.setBounds(100, 100, 100, 30);
        password.setBounds(usernamelabel.getBounds().x, usernamelabel.getBounds().y + 40, 100, 30);

        username.setBounds(usernamelabel.getBounds().x + 100, usernamelabel.getBounds().y, 200, 30);
        pass.setBounds(usernamelabel.getBounds().x + 100, usernamelabel.getBounds().y + 40, 200, 30);

        login.setBounds(45, usernamelabel.getBounds().y + 150, 125, 45);
        forget.setBounds(login.getBounds().x +275 , usernamelabel.getBounds().y + 150, 125, 45);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Login")){
            Person x;
            x = new Manger();
            if (x.login(username.getText(), pass.getText())) {
                this.setVisible(false);
                new Mangment("Welcome Manager ").setVisible(true);
            } else {
                x = new Receptionist();
                if (x.login(username.getText(), pass.getText())) {
                    this.setVisible(false);
                    new Recepcionestgui("Welcome Manager ").setVisible(true);
                }
                else {
                     x = new Casher();
                if (x.login(username.getText(), pass.getText())) {
                    this.setVisible(false);
                    new Recepcionestgui("Welcome Manager ").setVisible(true);
                    } 
                    else {
                        fail.setVisible(true);
                    }
                logedPerson = x;
                }
            }
        }    
           
        
        if (e.getActionCommand().equals("Forget")) {
            JOptionPane.showMessageDialog(rootPane, "reset info ");
        }
    }
}