/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Jordon
 */
import java.util.ArrayList;
public class QueueOfDistinctStrings {
 // Overview: QueueOfDistinctStrings are mutable, bounded
 // collection of distinct strings that operate in
 // FIFO (First-In-First-Out) order.
 //
 // The abstraction function is:
 // a) Write the abstraction function here 
 // Assuming that its not the trivial case in which items is not empty 
 //    AF(items): {items.get(i).StringValue | 0 <= i < items.size}
 //    + {items,get(0).StringValue....items.get(items.size-1).StringValue such that front = items.get(0).StringValue && end = items.get(item.size - 1).StringValue  }
 //    + {items(0).StringValue....items(items.size-1).StringValue such that each StringValue is unique }      
 //    
 //
 //
 // The rep invariant is:
 // b) Write the rep invariant here
 // RI: items != null &&
 //   for all integer i. c.get(i) is a String &&
 //   for all integers i, j. ( 0<=i j < items.size =>             
 //     items.get(i).stringValue != items.get(j).stringValue ) 
 //
 //
 //the rep
 private ArrayList<String> items;
 // constructor
 public QueueOfDistinctStrings () {
 // EFFECTS: Creates a new QueueOfDistinctStrings object
 items = new ArrayList<String>();
 }
 // MODIFIES: this
 // EFFECTS: Appends the element at the end of the queue
 // if the element is not in the queue, otherwise
 // does nothing.
 public void enqueue(String element) throws Exception {
    if(element == null) throw new Exception();
        if(false ==items.contains(element))
            items.add(element);
 }
// public void wrongEnqueue(String element) throws Exception {
//    if(element == null) throw new Exception();
//        items.add(element);
// }
 public String dequeue() throws Exception {
 // MODIFIES: this
 // EFFECTS: Removes an element from the front of the queue
    if (items.size() == 0) throw new Exception();
        return items.remove(0);
 }
 // MODIFIES: None
 // EFFECTS: Returns true if and only if there is no duplicates, false otherwise.

 
 public boolean repOK() {
 // EFFECTS: Returns true if the rep invariant holds for this
 // object; otherwise returns false
 // c) Write the code for the repOK() here
    if(this.items == null){ // if items is null return false, condition 1 => items should not be null
        return false;
    }
    for(int i = 0; i < this.items.size();i++){
        if(!(this.items.get(i) instanceof String)){ //condition 2 =>  (for all integer i. c.get(i) is a String) condition 2
            return false;
        }
        for(int j = i+1;j<this.items.size();j++){ // check for duplicates
            if(this.items.get(j).equals(items.get(i))){ // condition 3=> there should be no duplicates
                return false;
            }
        } 
    }
    return true; // rep holds true if all three conditions hold true.
    
 }
 @Override
 public String toString() {
 // EFFECTS: Returns a string that contains the strings in the
 // queue, the front element and the end element.
 // Implements the abstraction function.
 // d) Write the code for the toString() here 
 // takes advantage of arraylist to string method and adds the front element and end element
    int end = this.items.size();
    if(end != 0){
        end -=1; // make sure end is length-1 if not 0
    } else {
        return items.toString() + " No front or end element";
    }
    return items.toString() + " The front element: " + this.items.get(0) + " | The end element: " + this.items.get(end);
 }
 public static void main(String[] args) throws Exception {
     QueueOfDistinctStrings q = new QueueOfDistinctStrings();
//     q.enqueue("jordon");
     System.out.println(q);
     System.out.println(q.repOK());
 }
}
