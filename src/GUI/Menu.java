package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class Menu extends MyTittle implements ActionListener{
    
    JButton AddButton;
    JButton SearchButton;
    JButton BackButton;

    public Menu(String s) {
        super(s);
        
        this.AddButton = new JButton("Adding");
        add(AddButton);
        AddButton.addActionListener(this);
        this.SearchButton = new JButton ("Searching");
        add(SearchButton);
        SearchButton.addActionListener(this);
        this.BackButton = new JButton ("Back");
        add(BackButton);
        BackButton.addActionListener(this);
        
        setLayout(null);
        
        AddButton.setBounds(TitleLable.getBounds().x+70, TitleLable.getBounds().y + 100, 170, 70);
        SearchButton.setBounds(AddButton.getBounds().x + 200 , AddButton.getBounds().y , 170, 70);
        BackButton.setBounds(AddButton.getBounds().x + 100, AddButton.getBounds().y + 100, 170, 70);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
