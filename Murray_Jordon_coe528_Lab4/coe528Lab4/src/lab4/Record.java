/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author jjmurray
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.nio.file.Path;
import java.io.FileWriter;
public class Record {
    // Applied Singleton design pattern
    private static Record record;
    private Record(){}
    public static Record getInstance(){
        if(record == null){
           record = new Record(); 
        }
        return record;
    }
// Implemented write as per spec
// Effects: Appends the specified message, msg, to the
// associated file.
    public static void write(String msg){
        try {
            File file = new File("./record.txt");
            FileWriter writer;
            if (file.createNewFile()){
                writer = new FileWriter(file.getAbsolutePath());
            } else {
                writer = new FileWriter(file.getAbsolutePath(),true);
            }
            writer.write(msg);
            writer.close();
            
        } catch(IOException e) {
            System.out.println("something went wrong");
        }
    }
// Effects: Reads and prints the contents of the associated
// file to the standard output.
    public  static void read() {
        try (Scanner scanner = new Scanner(Path.of("record.txt")) ) {
        // Write the code here
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static void main(String[] args) {
    // Fill the blank below that obtains the sole instance
    // of the Record class.
    // (You should not invoke the Record constructor here.)
        Record r = Record.getInstance(); // completed main
    // Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
        "contains the following lines:");
        r.read();
    }
}
