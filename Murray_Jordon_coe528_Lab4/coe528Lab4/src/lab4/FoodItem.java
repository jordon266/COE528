/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author jjmurray
 */
public class FoodItem extends FoodComponent {
    private final double price;
    // constructor
    // Effects: Initializes this with name and price
    public FoodItem(String name,double price){
        super(name);
        this.price = price;
    }
    // Effects: returns price of this food item
    @Override 
    public double getPrice(){
        return this.price;  
    }
    // Effects : print tabs specified by number
    public void printTabs(int number){
        for(int i = 0; i< number; i++){
            System.out.print("\t");
        }
    }
    @Override // implementation of print for food item
    // Effects: prints this foodname and this price with preceded by the level number of tabs
    public void print(int level){
        printTabs(level);
        System.out.println("FoodItem: " + super.name + ", " + this.price);
    }
}
