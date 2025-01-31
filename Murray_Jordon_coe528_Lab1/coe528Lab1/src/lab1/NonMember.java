/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */
public class NonMember extends Passenger {
    public NonMember(String name, int age){
        super(name,age);
    }
    @Override
    public double applyDiscount(double originalPrice ){
        if(super.getAge() > 65){
            return .9 * originalPrice;
        }
        return originalPrice;
    }
}
