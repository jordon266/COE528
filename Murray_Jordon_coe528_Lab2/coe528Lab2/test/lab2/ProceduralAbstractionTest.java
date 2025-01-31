/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab2;

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
public class ProceduralAbstractionTest {
    
    public ProceduralAbstractionTest() {
    }

    @Test
    public void testReverseFactorialwith119() {
        System.out.println("reverseFactorial");
        int num = 119;
        int expResult = 5;
        int result = ProceduralAbstraction.reverseFactorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testReverseFactorialwith0() {
        System.out.println("reverseFactorial");
        int num = 0;
        int expResult = 1;
        int result = ProceduralAbstraction.reverseFactorial(num);
        assertEquals(expResult, result); 
    }
    @Test
    public void testReverseFactorialwithnegative() {
    System.out.println("reverseFactorial");
    int num = -1;
    int expResult = 1;
    int result = ProceduralAbstraction.reverseFactorial(num);
    assertEquals(expResult, result);
    }
    /**
     * Test of firstRowSum method, of class ProceduralAbstraction.
     */


    /**
     * Test of isMatrixNice method, of class ProceduralAbstraction.
     */
    @Test
    public void testIsMatrixNice() {
        System.out.println("isMatrixNice");
        int[][] matrix = {{2,7,6},{9,5,1},{4,3,8}};
        boolean expResult = true;
        boolean result = ProceduralAbstraction.isMatrixNice(matrix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
        public void testIsMatrixNiceOneElement() {
        System.out.println("isMatrixNice");
        int[][] matrix = {{2}};
        boolean expResult = true; // should be nice as sum and dimensions are the same
        boolean result = ProceduralAbstraction.isMatrixNice(matrix);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsMatrixNiceNotSquare() {
        System.out.println("isMatrixNice");
        int[][] matrix = {{2,3,2}}; // length and width not same
        boolean expResult = false;
        boolean result = ProceduralAbstraction.isMatrixNice(matrix);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsMatrixNiceOneColumnOff() {
    System.out.println("isMatrixNice");
    int[][] matrix = {{1,1,1},{1,1,1},{1,2,1}};
    boolean expResult =false; // should be nice as sum and dimensions are the same
    boolean result = ProceduralAbstraction.isMatrixNice(matrix);
    assertEquals(expResult, result);
    }
    @Test
    public void testIsMatrixNiceNoColumnOff() {
    System.out.println("isMatrixNice");
    int[][] matrix = {{1,1,1},{1,1,1},{1,1,1}};
    boolean expResult = true; // should be nice as sum and dimensions are the same
    boolean result = ProceduralAbstraction.isMatrixNice(matrix);
    assertEquals(expResult, result);
    }

}
