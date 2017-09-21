/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectayman.people;

import javax.swing.JOptionPane;

/**
 *
 * @author Ghada
 */
public class exceptionhadling extends Exception {

    public exceptionhadling(){
        super();
    }
     
    public String toString(){
        return "My Exception";
    }
    
    public exceptionhadling(String s){
        super(s);
    }
    
    int checkPositive(String x){
      int number;
      do{
          number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
          if (number <= 0) {
              JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Tray Again :(");
          }
        } while (number <= 0);

        return number;
    }
    
    int checkno(String x){
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
            if (number <0 && number > 100) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Tray Again :(");
            }
        } while (number <= 0);
        return number;
    }

    String checkEmail(String x){
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter Valid input for "+x +" !");
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Tray Again :(");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }
    int checkAge(String x){
        int  age;
        do {
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
            if (age<0 && age>100) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Age Tray Again :(");
            }
        } while (age<0 && age>100);

        return age;
    }

    String checkPassLength(String x){
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Enter more than 8 char for "+x +" !");
            if (pass.length()<8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Tray Again :(");
            }
        } while (pass.length()<8);

        return pass;
    }
    
}