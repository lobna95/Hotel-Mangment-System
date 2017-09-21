
package projectayman.people;

import java.util.HashMap;
import projectayman.*;
import projectayman.Room.*;
import projectayman.Room.Double;
import AddtionalService.*;



public class Casher extends User{
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

}
