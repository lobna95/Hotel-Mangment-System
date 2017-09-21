
package projectayman.people;

import java.util.HashMap;




public class Manger extends User implements login {
    public Manger ()
    {
     
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
    
}
