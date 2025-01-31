/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Admin
 */
public class ProceduralAbstraction {
    public static int factorial(int n){ // use for reverse factorial
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    // 0 means negative value
    public static int reverseFactorial(int num){
        if(num >= 0){
            int n = 1;
            while(factorial(n) < num){
                n++;
            }
            return n;
        }
        return 1;
    }
    public static int firstRowSum(int[][] matrix){ // an arbitrary chosen sum value that is used to be tested for each column row and diagonal
        int sum = 0;
        for(int i = 0; i<matrix.length;i++){
            sum+= matrix[0][i];
        }
        return sum;
    }
    //checking columns against test value
    public static boolean areColumnsNice(int [][] matrix, int num){ 
        int sum = 0;
        int length = matrix[0].length;
        boolean nice = false;
        int i = 0, j = 0;
        while(i < length){
            while(j < length){
                sum += matrix[j][i];
                j++;
            }
            nice = (sum == num);
            if(!nice){ // exit loop immediately if sum of column does not equal num
                i = length +1;
                j = length +1;
            }  
            i++;
            sum = 0; // reset sum
            j = 0; // reset j index
        }
        return nice;
    }
        //checking rows against test value
    public static boolean areRowsNice(int [][] matrix, int num){
        int sum = 0;
        int length = matrix[0].length;
        boolean nice = false;
        int i = 0, j =0;
        while(i < length){
            while(j < length){
                sum += matrix[i][j];
                j++;
            }
            nice = (sum == num);
            if(!nice){
                i = length +1;
                j = length +1;
            }  
            i++;
            sum = 0;
            j = 0;
        }
        return nice;
    }
        //checking diagonals against test value
    public static boolean areDiagonalsNice(int [][] matrix, int num){
        int sum = 0, i = 0;
        int length = matrix[0].length;
        boolean nice = false;
        while(i < length){
            sum += matrix[i][i];
            i++;
        }
        nice = (sum == num); 
        if(nice){
            sum = 0;
            i = length-1;
            while(i>=0){
                sum+=matrix[i][i];
                i--;
            }
            nice = (sum == num);  
        }
        return nice;
    }
    public static boolean isMatrixNice(int[][] matrix){
        int sum = firstRowSum(matrix);
        if(matrix.length != matrix[0].length){
            return false;
        }
        // checking columns, rows and diagonals
        boolean nice  = areColumnsNice(matrix,sum) && areRowsNice(matrix,sum) && areDiagonalsNice(matrix,sum);
        if(nice){
            System.out.println(sum); // only print if matrix is nice
        }
        return nice;
    }
    public static void main(String[] args){
        System.out.println(reverseFactorial(119));
        int [][] matrix = {{2,7,6},{9,5,1},{4,3,8}};
        System.out.println(isMatrixNice(matrix));

    }
}
