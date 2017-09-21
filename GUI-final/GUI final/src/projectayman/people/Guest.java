package projectayman.people;


import AddtionalService.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectayman.MangmentSystem.Ibinary;
import projectayman.Room.Room;


public class Guest extends Person implements Serializable, Ibinary{
    static boolean flage = true;
    static ArrayList<Guest> Arr = new ArrayList<Guest>();
    
   // private static Object arr;
    private int din;
    private int min;
    private int yin;
    private int dout;
    private int mout;
    private int yout;
    public double deposit;
    public Room room=new Room();
    public AdditionalService add =new AdditionalService(); 
    private String room_no;
   
    //this.room.room_no = room_no;
    //this.room.type=room_type;
       // this.add.type=add_type;
    public Guest(){
    
    } 
    
    
    public Guest(int id, String name, int age, int din, int min, int yin,
          int dout, int mout, int yout, double deposit ,
           String room_no, String room_type,String add_type){
    //    super(id, fname, lname, age);
        
        this.id = id;
        this.name = name;
        this.age = age;
        this.din = din;
        this.min = min;
        this.yin = yin;
        this.dout = dout;
        this.mout = mout;
        this.yout = yout;
        this.deposit = deposit;
        this.room.room_no = room_no;
        this.room.type=room_type;
        this.add.type=add_type;
    }

   
  /*  public Guest(int id, String fname, String lname, int age, int din, int min, int yin,
          int dout, int mout, int yout, double deposit ,
           String room_no, String room_type,String add_type)   {
        //this.room_no = room_no;
      
        
            this.id = id;
        this.fname = fname;
        this.lname=lname;
        this.age = age;
        this.din = din;
        this.min = min;
        this.yin = yin;
        this.dout = dout;
        this.mout = mout;
        this.yout = yout;
        this.deposit = deposit;
        this.room.room_no = room_no;
        this.room.type=room_type;
        this.add.type=add_type;
    
        
        
        
    }
    8*/
   
    
/*
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void write(Object x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
  */  
    /*public int id ;
    public String name ;
    private int age ;*/
   /* private int din;
    private int min;
    private int yin;
    private int dout;
    private int mout;
    private int yout;
    public double deposit;
    public Room room=new Room();*/
    //public AdditionalService add =new AdditionalService(); 
    //public Spa spa =new Spa ();
   /* public Glassboat glass =new Glassboat();
    public Gym gym = new Gym ();
    public transportation trans =new transportation ();
    public Safari safari =new Safari ();*/
    
    public void setage (int age){
           if(age>0 && age<99)
           this.age=age;
       
       else 
       {
                System.out.println("plz enter your id again");
       }
    }
    public int getage(){
       return age;
    }
    public void setdin (int din){
       if(din>0 && din<32)
           this.din=din;
    }
    public int getdin(){
       return din;
    }
    public void setmin (int min){
       if(min>0 && min <13)
           this.min=min;
    }
    public int getmin(){
       return min;
    }
    public void setyin (int yin){
       if(yin>2000 && yin<2020)
           this.yin=yin;
    }
    public int getyin(){
       return yin;
    }
    public void setdout (int dout){
       if(yin>0 && yin<32)
           this.dout=dout;
    }
    public int getdout(){
       return dout;
    }
    public void setmout (int mout){
       if(yin>0 && yin<13)
           this.mout=mout;
    }
    public int getmout(){
       return mout;
    }
    public void setyout (int yout){
       if(yin>2000 && yin<2020)
           this.yout=yout;
    }
    public int getyout(){
       return yin;
    }
    //Spa spa=new Spa();
   
    
    @Override
    public String toString (){

        return "The guest : " + name + " \n" + "ID : " + id +" checkin :" + din + min + 
                 yin + "\n" + 
                " checkout : " + dout + mout + yout + " Age : " + age + "\n"
                +"The depsite was :"+ deposit + "\n" +
                "The room type : " + room.type + "\n" + " The addservices type : " + add.type ;
    }
    
    /**
     *
   */
    public static Guest GuestAt(int index){
       return Arr.get(index);
    
    }
     public void write(Object o) {
        Guest x = ((Guest) o);
        Arr.add(x);
        doSave();
    }
    
   public static void doSave(){
//        ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("students.bin",true));
//        Bin.writeObject(x);
//        Bin.close();

        try {
            try (FileOutputStream fileOut = new FileOutputStream("guest8888.bin"); 
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

            Arr = (ArrayList<Guest>) (Object) in.readObject();
           
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
 /*  
   public static int search(int id){
       for(int i=0;Arr.size>=i;i++){
            if(id==Arr.get(i).id)
                return Arr.get(index)
            else
                return -1;
    }*/
       /*
    Guest findCustomerByid(int id){
    boolean exist=false;

    if(this.Arr.isEmpty()) {
        return null;
    }

    for(int i=0;i<this.Arr.size();i++) {
        if(this.Arr.get(i).id == id) {
            exist=true;
            break;
        }

        if(exist) {
            return this.Arr.get(id);
        } else {
            return this.Arr.get(id);
        }
    }
*/
 
    public boolean neartocheckout(){
        mout-=1;
        yout-=1900;  
        Date checkout =new Date(yout,mout,dout);
        Date dnow=new Date();
        if((dnow.getDay()==checkout.getDay()||(dnow.getDay()-1)==checkout.getDay())&&dnow.getMonth()==checkout.getMonth()&&dnow.getYear()==checkout.getYear()){  
            return true;}
        else {
            return false;}
    }

    //public Integer setage() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}