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
    protected String password ;
    public abstract boolean login(String username ,String Password);
    protected int age;
    protected double salary;
    
    public Person() {
    }
    
    static exceptionhadling MyEX = new exceptionhadling("");
    
    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        //this.age = age;
           if (age<0 && age>100) {
            this.age = MyEX.checkAge("Age");
        } else {
            this.age = id;
        }
        this.id = id;
        this.name = name;
        //this.age = age;
    
        this.salary = salary;
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
    
    public void setSalary(double salary){
        this.salary = salary;
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
    
    public double getSalary(double salary){
        return this.salary;
    }
    
    @Override
    public abstract String toString();
    
}