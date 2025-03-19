/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author jjmurray
 */
// Applying abstract design pattern
public abstract class FoodComponent {
    protected String name; 
    //Effects : initializes this
    protected FoodComponent(String name){
        this.name = name;
    }
    // Effects : get Price depending on the foodComponent
    public abstract double getPrice();
    // Effects : prints foodComponent based on the level number of the tabs.
    public abstract void print(int level);
}
