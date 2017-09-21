/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectayman.people;

import java.io.Serializable;

/**
 *
 * @author Ghada
 */
public abstract class Person implements Serializable {
    
     public  int id;
    protected String name;

    protected int age;
    
    public Person() {
    }
    
     public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
        public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name =name;
    }

   

    public void setAge(int age) {
        this.age = age;
    }
    //getter

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

  

    public int getAge() {
        return this.age;
    }
    
    @Override
    public abstract String toString();
    
}
