package projectayman.people;

import java.util.ArrayList;
import java.util.HashMap;

public class Manger extends Person implements login {
    
    ArrayList<Guest> G = null;
    
    public Manger ()
    {
     
    }
public Guest searchguest(int id) {
    if (G == null) {
        Guest g = new Guest();
        G =(ArrayList<Guest>) (Object) g.read();
    }

    int i = 0;
    for (Guest x : G) {
        if (x.id == id) {
            return x;
        }
    }
    return null;
}

@Override
public boolean login(String username,String Password) {        
    String name ="mangermohamed";
    HashMap<String,String> man = new HashMap<>();
    man.put(name, "123");
    String pass = man.get(name);

    if (pass.equals(Password)&&name.equals(username.toLowerCase()))
     return true ;
     else
      return false ;
}   

@Override
public String toString() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

}
