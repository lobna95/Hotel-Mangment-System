package projectayman.Room;

import java.io.Serializable;

public class Room implements Serializable{
    
    public String room_no ;
    public int bed_no ;
    public double price_day ;
    public String type ;
    //public Guest roomguest;
    
   /*public Room(Room type){
       this.type=type;
   }*/
    
    public Room (String room_no,int bed_no,double price_day,String type){
       this.room_no=room_no;
       this.bed_no=bed_no;
       this.price_day=price_day;
       this.type=type;
       //this.roomguest.id=roomguests;
    }

  public Room() {
         
    }
    public boolean usage= false;
    
    public void isused(){
    usage=true;
    
    }
    public void emptying(){
    usage=false;
    }
}