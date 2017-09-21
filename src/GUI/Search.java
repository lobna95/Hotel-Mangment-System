package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Search extends MyTittle{
    
    JLabel search;
    JTextField Search;
    JButton submit;
    JButton reset;
    JButton back;
    
    public Search(String s) {
        super(s);
        
        search = new JLabel("ID");
        add(search);
        Search = new JTextField("");
        add(Search);
        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
        reset = new JButton("Reset");
        add(reset);
        reset.addActionListener(this);
        back = new JButton("Back");
        add(back);
        back.addActionListener(this);
        
        
        search.setBounds(TitleLable.getBounds().x+150, TitleLable.getBounds().y+150, 50, 30);
        Search.setBounds(search.getBounds().x+50, search.getBounds().y, 200, 30);
        submit.setBounds(TitleLable.getBounds().x+20, TitleLable.getBounds().y+300, 150, 50);
        reset.setBounds(TitleLable.getBounds().x+200, TitleLable.getBounds().y+300, 150, 50);
        back.setBounds(TitleLable.getBounds().x+380, TitleLable.getBounds().y+300, 150, 50);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reset")){
           Search.setText("");
        }
    }
}
