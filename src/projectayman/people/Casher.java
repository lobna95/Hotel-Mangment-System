package projectayman.people;

import java.util.HashMap;
import projectayman.Room.*;
import projectayman.Room.Double;
import AddtionalService.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static projectayman.people.Receptionist.Arr;

public class Casher extends Person implements login {
    
    static boolean flage = true;
    static ArrayList<Casher> Arr = new ArrayList<Casher>();
    protected int Salary;
    public Gym gogym= new Gym();
    public Spa gospa= new Spa();
    public Safari gosafari = new Safari();
    public boolean spa ;
    public boolean gym;
    public boolean safari;
    public Super goroom=new Super();
    public Single gorooms=new Single();
    public Double goroomd = new Double();
  
    public Casher ()
    {
        //this.password="789";
      
    }

    public Casher(  boolean spa , boolean gym , boolean safari,String room) {
        
        this .spa=spa ;
       this.gym=gym;
       this.safari=safari;
       
    }
    public boolean login(String username,String Password) {        

      HashMap<String,String> cash = new HashMap<>();
            String name = "cashahmed";
            cash.put(name, "125");
            String pass = cash.get(name);
            
            if (pass.equals(password)&&name.equals(username.toLowerCase()))
                return true ;
            else 
                return false ;
    }

    public double cost (boolean spa,boolean gym , boolean safari ,String room)
    {
        double total=0 ;
     
       if (spa==true)
       {
         total+=this.gospa.price;
       
       }
       if (gym==true)
       {
           total+=this.gogym.price;
       }
       if (safari==true)
       {
           total+=this.gosafari.price;
       }
       
       if ("Super".toLowerCase().equals(room))
       {
           total+=this.goroom.price_day;
       }   
       if ("Single".toLowerCase().equals(room))
       {
           total+=this.gorooms.price_day;
       }
       if("Double".toLowerCase().equals(room))
       {
           total+=this.goroomd.price_day;
       }
        return total;
       
       
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public static Casher ReceptionistAt(int index){
       return Arr.get(index);
    
    }
     public void write(Object o) {
        Casher x = ((Casher) o);
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

            Arr = (ArrayList<Casher>) (Object) in.readObject();
           
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