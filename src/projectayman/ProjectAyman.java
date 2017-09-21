package projectayman;

import java.util.*;
import projectayman.people.*;
import java.io.*;
import GUI.*;

import projectayman.MangmentSystem.*;

public class ProjectAyman {
   

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Mangment m = new Mangment("Hotel");
        m.setVisible(true);
      /* 
//123
        //accessToGuest toGuest = new accessToGuest();
     File_Manager file_Manager = new File_Manager();    
    Manger m1 =new Manger();
    Casher c1 = new Casher();
    Receptionist R1 =new Receptionist() ;
    //Guest guest=new Guest();
    Scanner scan=new Scanner(System.in);
                
      //Guest.doLoad();
    System.out.println("Enter your username first and password to login ");
        String usern=scan.next();
        String pw=scan.next();
        int w;
        if (m1.login(usern,pw))    
         {
             try{
          for(;;){
             System.out.printf("choose :\n(1)add guest\n"
                     + "(2)search guest\n(2)delete guest\n(4)logout\n");
            int choise =scan.nextInt(); 
            if(choise==1)
            {
            //henaaaaaaaaa hnkteb methods el add
             //Guest guest = new Gue     
         try{
         System.out.println("Please Enter guest id");
         int id=scan.nextInt();
         System.out.println("Please Enter guest Nam");
         String name=scan.next();
         System.out.println("Please Enter guest Age");
         int age=scan.nextInt();
         System.out.println("Please Enter guest Day in");
         int din=scan.nextInt();
         System.out.println("Please Enter guest Month In");
         int min=scan.nextInt();
         System.out.println("Please Enter guest Year In");
         int yin=scan.nextInt();
         System.out.println("Please Enter guest Day Out");
         int dout=scan.nextInt();
         System.out.println("Please Enter guest Month Out");
         int mout=scan.nextInt();
         System.out.println("Please Enter guest Year Out");
         int yout=scan.nextInt();
         System.out.println("Please Enter guest Depoiste");
         double deposite=scan.nextDouble();
         System.out.println("Please Enter guest Room Number");
         String room_no=scan.next();
         System.out.println("Please Enter guest Room Type");
         String room_type=scan.next();
         System.out.println("Please Enter the additinal services u want (please enter this format ex: spa/gym ");
         String add_type=scan.next();                                      
            System.out.println(" guest added successfuly ");
     
            Guest guest=new Guest(id,name,age,din,min,yin,
            dout,mout,yout,deposite,room_no,room_type,add_type);
            //File_Manager file_Manager = new File_Manager();
           /*guest.setage(age);
           guest.setdin(din);
           guest.setmin(min);
           guest.setyin(yin);
           guest.setdout(dout);
           guest.setdout(dout);*/
        /*file_Manager.addGuest(guest);
            }
        catch(Exception e){System.out.println("you entered wrong data so adding failed");}    
            
        //Guest.doSave();
            }
      
         else if(choise==2)
         {
         //henaaaaaaaaaa hnkteb meth2ods el search
          System.out.println("Enter guest id to search for");
           int id=scan.nextInt();
             w = file_Manager.searchForGuests(id);
                    if (w != -1) {
                        //System.out.println("Guest Found :)");
                        System.out.println( Guest.GuestAt(w).toString());
                        System.out.println();
                    } else {
                        System.out.println("Not found :(");
                    }
          //System.out.println(  file_Manager.searchForGuests(id)); 
         
         System.out.println("guest searched successfuly");
         }
         else if(choise==3)
         {
         //henaaaaaaaaaa hnkteb methods el deleteEnter
             System.out.println("Enter the id to delete");
             String id=scan.next();
            // file_Manager.delete(id ,"GUESTS.txt");
         System.out.println("guest deleted successfuly");
         }
         else if(choise==4)
         {
            break;
         }
         else
         {
         System.out.println("unavailable choise");
            }                    
         }  
         }
              
        catch(Exception e){System.out.println("you entered wrong data");}
          
         }
        if (R1.login(usern,pw))
         {
             try{
         // a receptionet loged in 
               
         for(;;){
         System.out.printf("choose :\n(1)add guest\n(2)update guest\n(3)search guest\n(4)delete guest\n(5)logout\n");
         int choise =scan.nextInt(); 
         if(choise==1)
         {
         //henaaaaaaaaa hnkteb methods el update
         System.out.println(" guest added successfuly ");         
         }
       
         else if(choise==2)
         {
         //henaaaaaaaaaa hnkteb meth2ods el search
         System.out.println("guest searched successfuly");
         }
         else if(choise==3)
         {
         //henaaaaaaaaaa hnkteb methods el delete
         System.out.println("guest deleted successfuly");
         }
         else if(choise==4)
         {
         break;
         }
         else
         {
         System.out.println("unavailable choise");
         }                    
         }  
          }   
        catch(Exception e){System.out.println("you entered wrong data");
         //a receptionist loged out
         }
         if (c1.login(usern,pw))
         {
                 System.out.println("Enter guest id");
                 int id=scan.nextInt();
                 
                System.out.println(file_Manager.searchForGuests(id));
                 System.out.println("if the guest go spa enter true .... true .... true and enter the type room");
                 boolean a =scan.nextBoolean();
                 boolean b= scan.nextBoolean();
                 boolean c=scan.nextBoolean();
                 String type=scan.next();
                 System.out.println(c1.cost(a, c, a, type));
                 System.out.println("guest searched successfuly");
                 
         }
           
     if (!c1.login(usern,pw)&&!m1.login(usern,pw)&&!R1.login(usern,pw))
             System.out.println("Wrong Pw Or User name");
       
           // catch(Exception e){System.out.println("you entered wrong data");}
         }
    
       Guest.doSave();
        }*/
    }
}