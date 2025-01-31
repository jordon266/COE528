/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */
public abstract class Passenger {
    private String name;
    private int age;
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract double applyDiscount(double originalPrice);
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
}
