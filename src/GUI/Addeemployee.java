package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addeemployee extends Add implements ActionListener{

    JLabel Salary;
    JTextField salary;
    JLabel pass;
    JTextField Pass;
    
    public Addeemployee(String s) {
        super(s);
        
        this.Salary= new JLabel ("Salary");
        add(Salary);
        this.salary= new JTextField ("");
        add(salary);
        this.pass = new JLabel("Password");
        add(pass);
        this.Pass = new JTextField("");
        add(Pass);
        this.Submit = new JButton ("Submit");
            add(Submit);
            Submit.addActionListener(this);
            this.reset = new JButton ("Reset");
            add(reset);
            reset.addActionListener(this);
            this.Back = new JButton ("Back");
            add(Back);
            Back.addActionListener(this);
        
        Salary.setBounds(id.getBounds().x , id.getBounds().y+120, 100, 30);
        salary.setBounds(Salary.getBounds().x +100, Salary.getBounds().y, 200, 30);
        pass.setBounds(id.getBounds().x, id.getBounds().y+170, 100, 30);
        Pass.setBounds(pass.getBounds().x+100, pass.getBounds().y, 200, 30);
        
        
            Submit.setBounds(60, id.getBounds().y + 250, 125, 45);
            reset.setBounds(Submit.getBounds().x +180, Submit.getBounds().y, 125, 45);
            Back.setBounds(Submit.getBounds().x +380, Submit.getBounds().y, 125, 45);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("Reset")){
            salary.setText("");
            Pass.setText("");
        }
    }
}
