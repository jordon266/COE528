/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */
public class Member extends Passenger {
    private final int yearsOfMembership;
    public Member(String name, int age, int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership = yearsOfMembership;
    }
    @Override
    public double applyDiscount(double originalPrice){
        if(this.yearsOfMembership > 1){
            if(this.yearsOfMembership >= 5){
                return .5 * originalPrice;
            }
            return .9 *originalPrice;
        }
        return originalPrice;
    }
}
