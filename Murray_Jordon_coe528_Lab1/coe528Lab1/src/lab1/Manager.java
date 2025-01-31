/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Manager {
    private final ArrayList<Flight> flights;
    private final ArrayList<Ticket> tickets;
    private final Scanner scanner;
    public Manager(Scanner scanner){
        this.flights = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.scanner = scanner;
    }
       // "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$"
    public void createFlights(){
        System.out.println("flight number:");
        int flightNumber = Integer.parseInt(this.scanner.nextLine());
        System.out.println("origin:");
        String origin = this.scanner.nextLine();
        System.out.println("destination:");
        String destination = this.scanner.nextLine();
        System.out.println("departure time:");
        String departureTime = this.scanner.nextLine();
        System.out.println("capacity:");
        int capacity = Integer.parseInt(this.scanner.nextLine());
        System.out.println("original price:");
        double originalPrice = Double.parseDouble(this.scanner.nextLine());
        this.flights.add(new Flight(flightNumber,origin,destination,departureTime,capacity,originalPrice));
        System.out.println("Flight Added, Number of flights is " + this.flights.size());
    }
    public void displayAvailableFlights(String origin,String destination){
        for(Flight flight: this.flights){
            if(flight.getOrigin().equals(origin) && flight.getDestination().equals((destination))){
                if(flight.getNumberOfSeatsLeft() > 0){
                    System.out.println(flight );
                }
            }
        }
    }
    public Flight getFlight(int flightNumber){
        for(Flight flight: this.flights){
            if(flight.getFlightNumber() == flightNumber){
                return flight;
            }
        }
        return null;
    }
    public void bookSeat(int flightNumber, Passenger p){
        Flight flight = getFlight(flightNumber); 
        if( flight != null){
            if(flight.bookASeat()){
                Ticket ticket  = new Ticket(p,flight,flight.getOriginalPrice());
                System.out.println(); 
                printBookingInfo(ticket,flight);
            } else {
                System.out.println("No more seats left cannot book");
            }
        } else {
            System.out.println("Sorry cannot book");
        }
    }
    // Additional functions 
    public void printMenu(){
        System.out.println();
        System.out.println("Testing Functions");
        System.out.println("createFlight (Press 1)");
        System.out.println("displyAvailable Flights (Press 2)");
        System.out.println("getFlight (Press 3)");
        System.out.println("bookSeat (Press 4)");
        System.out.println();
    }
    public Passenger passengerInformation(){
        System.out.println("name:");
        String name = this.scanner.nextLine();
        System.out.println("age");
        int age = Integer.valueOf(this.scanner.nextLine());
        System.out.println("Member ( Press y or n):");
        String memberOrNot = this.scanner.nextLine();
        Passenger temp = null;
        if(memberOrNot.equals("y")){
            System.out.println("years of membership:");
            int yearsOfMembership = Integer.valueOf(this.scanner.nextLine());
            temp = new Member(name,age,yearsOfMembership);
        }else {
            temp = new NonMember(name, age);
        }
        return temp;
    }
    public int flightNumberToBook(){
        System.out.println("flight number:");
        return Integer.valueOf(this.scanner.nextLine());
    }
    public void start(){
        while(true){
            printMenu();
            System.out.println("What option (Press 1-4 or quit):");
            String number = this.scanner.nextLine();
            if(number.equals("quit")){
                break;
            }
            if(number.equals("1")){
                this.createFlights();
            }
            if(number.equals("2")){
                System.out.println("origin:");
                String origin = this.scanner.nextLine();
                System.out.println("destination:");
                String destination = this.scanner.nextLine();
                this.displayAvailableFlights(origin, destination);
            }
            if(number.equals("3")){
                System.out.println("flight number:");
                int flightNumber = Integer.parseInt(this.scanner.nextLine());
                System.out.println(this.getFlight(flightNumber));
            }
            if(number.equals("4")){
                int flightNumber = flightNumberToBook();
                Passenger p = passengerInformation();
                bookSeat(flightNumber,p);   
            }
        }
    }
    public void printBookingInfo(Ticket ticket, Flight flight){
        System.out.println("Booking information");
        System.out.println("Ticket Info");
        System.out.println(ticket);
        System.out.println("Flight Info");
        System.out.println(flight);
    }
    public static void main(String[] args){
        
        Manager manager = new Manager(new Scanner(System.in));
        manager.start();
        
    }
}
