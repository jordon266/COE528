/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */
public class Ticket {
    private static int ticketNumber = 0;
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    public Ticket(Passenger passenger, Flight flight, double price){
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.number = ticketNumber++;
    }
    public Passenger getPassenger(){
        return this.passenger;
    }
    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }
    public Flight getFlight(){
        return this.flight;
    }
    public void setFlight(Flight flight){
        this.flight = flight;
    }
    public int getNumber(){
        return this.number;
    }
    public static int getNumberOfTicketsSold(){
        return ticketNumber;
    }
    /*
        override the toString() method that returns a String representation of a Ticket object. The
    String should include the passenger’s name, information about the flight (e.g. the flight num-
    ber, the origin, the destination, the departure, and the original price) and the actual ticket
    price. e.g., "Julia Chow, Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$, ticket price: $600.00"
    */
    @Override
    public String toString(){
        return this.passenger.getName() + flight + ", ticket price: $" + String.format("%.2f", this.passenger.applyDiscount(this.flight.originalPrice));
    }
}
