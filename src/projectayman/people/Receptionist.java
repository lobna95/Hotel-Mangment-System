/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectayman.people;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static projectayman.people.Guest.Arr;

public class Receptionist extends Person implements login{
    static boolean flage = true;
    static ArrayList<Receptionist> Arr = new ArrayList<Receptionist>();
     protected int Salary;

    public Receptionist ()
    {
  
    }
    
    @Override
    public boolean login(String username , String Password) {        
        String name ="RecMahmoud";
        HashMap<String,String> rec = new HashMap<>();
        rec.put(name, "632");
        String pass = rec.get(name);
        if (pass.equals(Password)&& name.equals(username.toLowerCase()))
           return true ;
        else 
           return false ;
    }

    @Override
    public String toString() {
          return "The Receptionist : " + name + " \n" + "ID : " + id + "\n" +
                  "Age : "+age+ "\n" + "Salary : "+Salary
               ;
    }
    
    public static Receptionist ReceptionistAt(int index){
      return Arr.get(index);

    }
    
    public void write(Object o) {
        Receptionist x = ((Receptionist) o);
        Arr.add(x);
        
        doSave();
    }
    
   public static void doSave(){
//        ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("students.bin",true));
//        Bin.writeObject(x);
//        Bin.close();

        try {
            try (FileOutputStream fileOut = new FileOutputStream("receptionist8888.bin"); 
                    ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(Arr);
                System.out.println("Added");
                fileOut.close();
                out.close();
            }
        } catch (Exception ee) {
            System.err.println("77777Can't save");
        }
    }
    
    public ArrayList<Object> read() {
        if (flage) {
            try {
                doLoad();
                flage = false;
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<Object>) (Object) Arr;
        
    }
       
    public static void doLoad() throws IOException, ClassNotFoundException {
        if(flage){
        FileInputStream fileIn =  new FileInputStream("guest8888.bin");
        //System.out.println("first Loading Students array Object...");
    try (ObjectInputStream in = new ObjectInputStream(fileIn)) {
        //System.out.println("first Loading Students array Object...");

        Arr = (ArrayList<Receptionist>) (Object) in.readObject();

       // in.close();
        //fileIn.close();
    }
      for (int i = 0; i < Arr.size(); i++) {
            System.out.println(Arr.get(i).toString());
            System.out.println();
     }
     flage=false;
     }
   }
}