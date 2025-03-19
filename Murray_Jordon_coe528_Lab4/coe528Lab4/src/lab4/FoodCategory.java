/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author jjmurray
 */
import java.util.ArrayList;
public class FoodCategory extends FoodComponent {
    ArrayList<FoodComponent> foodComponents; // rep
    // effects: Initializes this to
    public FoodCategory(String name){
        super(name);
        this.foodComponents = new ArrayList<>();
    }   
    // Modifies: this
    // Effects: adds food component to food components
    public void add(FoodComponent food){
        if(food != null){
            this.foodComponents.add(food);
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    // effects: returns the sum of all the food components this contains
    public double getPrice(){
        double sum = 0;
        for( FoodComponent food: this.foodComponents){
            sum+= food.getPrice();
        }
        return sum;
    }
    // Effects: print specified number of tabs (utility function)
    public void printTabs(int number){
        for(int i = 0; i< number; i++){
            System.out.print("\t");
        }
    }
    @Override
    //  Effects: print its name, the cumulative price and it should also print the food components it has
    public void print(int level){   
        printTabs(level)    ;
        System.out.println( "FoodCategory ("+ super.name +", " + this.getPrice() + ") contains:") ;
        for(int i =0;i < this.foodComponents.size();i++){ 
            this.foodComponents.get(i).print(level+1);  
        }      
    }
    
}
