/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class FlightTest {
    private Flight instance;
   // "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$"
    public FlightTest() {
        this.instance = new Flight(1030,"Toronto","Kolkata","03/02/99 7:50 pm",10000,1000.0);
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        int expResult = 1030;
        int result = this.instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test 
    public void testConstructor(){
        // testing all values put in constructor
        Flight temp = new Flight(1090,"Montego Bay","Vancouver","03/02/01 7:50 pm",1000000,1.0);
        assertTrue(temp.getFlightNumber() == 1090);
        assertTrue(temp.getOrigin().equals("Montego Bay"));
        assertTrue(temp.getDestination().equals("Vancouver"));
        assertTrue(temp.getDepartureTime().equals("03/02/01 7:50 pm"));
        assertTrue(temp.getCapacity() == 1000000);
        assertTrue(temp.getNumberOfSeatsLeft() == 1000000);
        assertTrue(temp.getOriginalPrice() == 1.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        String origin = "Toronto"; // should throw IllegalArgumentException as it is used for origin and destination
        Flight temp = new Flight(1090,origin,origin,"03/02/01 7:50 pm",1000000,1.0);

        
    }
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1040;
        instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getFlightNumber(),1040);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getOrigin().equals(expResult));
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Kingston";
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getOrigin().equals(origin));
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult = "Kolkata";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Jane and Fince";
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getDestination().equals(destination));
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        String expResult = "03/02/99 7:50 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "02/01/98 7:40 pm";
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getDepartureTime().equals(departureTime));
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult = 10000;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCapactiy method, of class Flight.
     */
    @Test
    public void testSetCapactiy() {
        System.out.println("setCapactiy");
        int capacity = 0;
        instance.setCapactiy(capacity);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getCapacity() == capacity);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        int expResult = 10000;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 50000;
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getNumberOfSeatsLeft() == numberOfSeatsLeft);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        double expResult = 1000.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 400.0;
        instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getOriginalPrice() == originalPrice);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        //testing for 0 if there is zero seats should return false
        instance.setNumberOfSeatsLeft(0);
        expResult = false;
        result = instance.bookASeat();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
