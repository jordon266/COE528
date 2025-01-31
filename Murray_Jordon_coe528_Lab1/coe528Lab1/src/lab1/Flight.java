/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    double originalPrice;
    public Flight(int flightNumber, String origin,String destination,String departureTime,int capacity,double originalPrice){
        if(origin.equals(destination)){
            throw new IllegalArgumentException();
        }
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = this.capacity;
        this.originalPrice = originalPrice;
    }
    public int getFlightNumber(){
        return this.flightNumber;
    }
    public void setFlightNumber(int flightNumber){ 
        this.flightNumber = flightNumber;
    }
    public String getOrigin(){
        return this.origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getDestination(){
        return this.destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDepartureTime(){
        return this.departureTime;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapactiy(int capacity){
        this.capacity = capacity;
    }
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    public double getOriginalPrice(){
        return this.originalPrice;
    }
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    public boolean bookASeat(){
        if(this.numberOfSeatsLeft > 0){
            this.numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    /*
        This class should override the toString method that returns a String representation of a Flight
    object. The String should include the flight number, the origin, the destination, the departure time
    and the original price. e.g., "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$"
    */
    @Override
    public String toString(){
        return "Flight " + this.flightNumber + ", " + this.origin + " to " + this.destination + ", " + this.departureTime + ", original price: " + String.format("%.0f", this.originalPrice)+ "$";
    }
}
