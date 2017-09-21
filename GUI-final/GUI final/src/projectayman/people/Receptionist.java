/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectayman.people;

import java.util.HashMap;



public class Receptionist extends User{

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
   

}
