package projectayman.MangmentSystem;

import java.io.*;
//import java.io.*;
import java.util.Scanner;
import AddtionalService.*;
import java.util.ArrayList;
import projectayman.people.Guest;
import projectayman.Room.Room;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import projectayman.people.Manger;

public class File_Manager {

    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    /**
     *
     * @author Tamer
     */
    ArrayList<Guest> st = null;

    public void addGuest(Guest x) {
        x.write(x);
    }

    public ArrayList<Guest> readAllGuests() {
        Guest g = new Guest();
        //st=(ArrayList<Guest>) (Object) g.read();
        ArrayList<Object> a = g.read();
        return (ArrayList<Guest>) (Object) a;
    }

    public int searchForGuests(int id) {
        if (st == null) {
            st = readAllGuests();
        }

        int i = 0;
        for (Guest x : st) {
            if (x.id == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean DeleteGuest(int id) {
        if (st == null) {
            st = readAllGuests();
        }
        int w = searchForGuests(id);
        if (w != -1) {
            st.remove(w);
            return true;
        } else {
            return false;
        }

    }

    

}
//

/*
 public String search(String str, String fileName) throws FileNotFoundException {

 FileInputStream File = new FileInputStream(fileName);
 Scanner Scan = new Scanner(File);
 String line = "", line2 = "";
 while (Scan.hasNext()) {
 line = Scan.nextLine();
 if (line.startsWith(str)) {
 line2 = line2 + line + "\n";
 }
 //startsWith
 }
 return line2;
 }
    
 public void delete(String name, String fileName) throws FileNotFoundException {

 FileInputStream f = new FileInputStream(fileName);
 Scanner scan1 = new Scanner(f);
 FileOutputStream fo2 = new FileOutputStream("temp.txt", false);
 PrintWriter p2 = new PrintWriter(fo2);
 String line = "";
 while (scan1.hasNext()) {
 line = scan1.nextLine();
 if (!line.startsWith(name)) {
 p2.println(line);
 }
 }
 p2.close();
 scan1.close();
 FileInputStream f2 = new FileInputStream("temp.txt");
 Scanner scan2 = new Scanner(f2);
 FileOutputStream fo = new FileOutputStream(fileName, false);
 PrintWriter p1 = new PrintWriter(fo);
 while (scan2.hasNext()) {
 line = scan2.nextLine();
 p1.println(line);
 }
 scan2.close();
 p1.close();
 }
    



 public void add(Guest guest) throws FileNotFoundException, IOException {

     
       
 FileOutputStream Guest_input = new FileOutputStream("GUESTS.txt", true);
 PrintWriter Guest_Write = new PrintWriter(Guest_input);
              
 Guest_Write.println(guest.id+"\t"+guest.name+"\t"+guest.getage()
 +"\t"+guest.getdin()+"\t"+guest.getmin()+"\t"+guest.getyin()
 +"\t"+guest.getdout()+"\t"+guest.getmout()+"\t"+guest.getyout()
 +"\t"+guest.deposit+"\t"+guest.room.room_no+"\t"+guest.room.type
 +"\t"+guest.add.type);
               
 Guest_Write.close();
 } 
  
 public void add(Room room) throws FileNotFoundException, IOException {

 FileOutputStream Room_input = new FileOutputStream("Rooms.txt", true);
 PrintWriter Room_Write = new PrintWriter(Room_input);

 Room_Write.println(room.room_no+"\t"+room.bed_no+"\t"+room.price_day);
               

 Room_Write.close();
       
 }*/
