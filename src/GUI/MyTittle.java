
package GUI;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public   class MyTittle extends JFrame implements ActionListener{
    protected int LW =100 , LH=30 , TW=200 , TH=30 ;
    JLabel TitleLable ;
    JLabel sucess;
    JLabel fail;
    /*JList list;
    String [] arr = {"sfas","fdsaf","fsaf"};*/
    String m ="" ;
    
    public MyTittle (String s){
        super (s);
        m=s;
        
        setLocation(400,100);
        setSize(650,500);
        
        this.TitleLable=new JLabel (m);
        add(TitleLable);
        
        /*this.list= new JList(arr);
        add(list);
        list.setBounds(1, 1, 50, 50);*/
        
        this.sucess=new JLabel("Done");
        add(sucess);
        sucess.setVisible(false);
        
        this.fail=new JLabel("Sorry ......");
        add(fail);
        fail.setVisible(false);
        
        setLayout(null);
        
        TitleLable.setBounds(50,10 , 200, 40);
        sucess.setBounds(TitleLable.getBounds().x+170, TitleLable.getBounds().y, 150, 40);
        fail.setBounds(TitleLable.getBounds().x+170, TitleLable.getBounds().y, 150, 40);
        setBackground(Color.blue);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setDefaul1tCloseOperation(HIDE_ON_CLOSE);
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //  addWindowListener(new Closing());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
      
}