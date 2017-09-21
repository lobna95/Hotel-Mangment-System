package projectayman.MangmentSystem;

import projectayman.Room.Room;

    public class accessToRooms {

       public Room room;
        public String[] split(String line) {
         String[] arr = new String[3];
        arr = line.split("\t");
        return arr;
     
    }
        
    public Room assign(String[] splited) {
    
       this.room.room_no=splited[0];
       this.room.bed_no=Integer.valueOf(splited[1]);
       this.room.price_day=java.lang.Double.valueOf(splited[2]);
       //this.room.roomguest.id=splited[3];
       return room;
    }
    
}
