package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import projectayman.people.Guest;

public class Mangment extends MyTittle implements ActionListener{
  
    JButton guest;
    JButton receptiones;
    JButton casher;
    JButton report;

    public Mangment(String s) {
        super(s);
        
        this.guest = new JButton("Guest");
        add(guest);
        guest.addActionListener(this);
        this.receptiones = new JButton("Receptionist");
        add(receptiones);
        receptiones.addActionListener(this);
        this.casher = new JButton("Casher");
        add(casher);
        casher.addActionListener(this);
//        this.report = new JButton("Report");
//        add(report);
//        report.addActionListener(this);
        
    
        guest.setBounds(230, 90, 150, 60);
        receptiones.setBounds(guest.getBounds().x, guest.getBounds().y +85, 150, 60);
        casher.setBounds(guest.getBounds().x, guest.getBounds().y +170, 150, 60);
//        report.setBounds(guest.getBounds().x, guest.getBounds().y +255, 150, 60);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Guest")) {
           this.setVisible(false);
           new Menuguest ("Menu of Guest").setVisible(true);
        }
        if (ae.getActionCommand().equals("Receptionist")){
            this.setVisible(false);
            new Menureceptionist ("Menu of Receptionist").setVisible(true);
        }
        if (ae.getActionCommand().equals("Casher")){
            this.setVisible(false);
            new Menucasher ("Menu of Cahser").setVisible(true);
        }
//        if (ae.getActionCommand().equals("Report")){
//            this.setVisible(false);
//               JFrame f = new JFrame();
//            f.setLocation(250, 100);
//            f.setSize(600, 550);
//            //new Report("Report").setVisible(true);
//            
//                  Guest x = new Guest();
//            ArrayList<Guest> g = (ArrayList<Guest>) (Object) x.read();
//            double[] values = new double[g.size()];
//            String[] names = new String[g.size()];
//            for (int i = 0; i < g.size(); i++) {
//                values[i] = g.get(i).deposit;
//                names[i] = g.get(i).getName();
//
//
//            f.getContentPane().add(new Charts(values, names, "Hotel Money"));
//            f.setVisible(true);
//        }
    }
}