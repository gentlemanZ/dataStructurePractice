/* Program: StackClient.java
 * Author: Wayne Snyder
 * Date: 9/9/14
 * Class: CS 112
 * Purpose: Example for Lecture 3 in CS 112. A stack client uses a stack ADT 
 *     implemented using an array. No resizing! Can overflow and underflow!
 *     An interface verifies that the interactions between client and ADT
 *     are correct. 
 */

public class StackClient {
   
   public static void main(String [] args) {
      
      Stack S = new Stack();                      // so can access private debugging methods
//   Stackable S = new Stack();                // for testing interface; you will need to 
      // comment out the S.list() lines when you do this
      
      System.out.println("Stack starts empty!");
      S.list();
      System.out.println("isEmpty?\t" + S.isEmpty());
      System.out.println("size:   \t" + S.size());
      
      
      System.out.println("Pushing 5, 9, 9, -3, 31...."); 
      S.push(5); S.push(9); S.push(9); S.push(-3); S.push(31);
      
      S.list();
      System.out.println("isEmpty?\t" + S.isEmpty()); 
      System.out.println("size:   \t" + S.size()); 
      
      System.out.println( "Pop: " + S.pop() ); 
      System.out.println( "Pop: " + S.pop() ); 
      
      S.list();
      
      System.out.println("Pushing 15, 2 ...."); 
      S.push(15); S.push(2);  
      
      S.list();
      
      System.out.println( "Pop: " + S.pop() ); 
      
      S.list();
      
      
      System.out.println("Pushing -23, 21, 9, 77, 99, 12 .... "); 
      S.push(-23); S.push(21); S.push(9); S.push(77);S.push(99);S.push(12);
      
      S.list();
      
//    System.out.println("Pushing 666 .... "); 
//    S.push(666); 
//    S.list();
//
// 
//    System.out.println("Removing everything from the stack...");  
//    while(!S.isEmpty()) {
//      S.pop();
//      }
//    
//    S.list();
      
      /*
       System.out.println("One more pop won't hurt... or will it? "); 
       
       S.pop();           // this will cause an array index out of bounds error
       //  Comment it out if you want to remove the error
       
       */
      
      
      
      
      
   }
   
}

// Stack ADT using an array with resizing

class Stack implements Stackable {
   
   private final int SIZE = 10;
   private int [] A = new int[SIZE];      // array of ints
   
   private int next = 0;                  // location of next available unused slot  
   
   
   // push the key onto the top of the stack
   // May overflow!
   
   public void push(int key) {          
      A[next] = key; 
      ++next;
   }
   
   // remove the top integer and return it -- will cause stack underflow error if empty!
   
   public int pop() {             
      int temp = A[next-1];
      --next;
      return temp;   
   }
   
   // just two utility methods to check on status of the stack
   
   public boolean isEmpty() {
      return (next == 0); 
   }
   
   public int size() {                 
      return next; 
   }
   
   // for debugging....
   
   public void list() {
      System.out.print("[");
      for(int i = 0; i < A.length; ++i) {
         if(i == next)
            System.out.print(" | " + A[i]);
         else if(i == 0)
            System.out.print(A[i] );
         else 
            System.out.print(", " + A[i] );
      }
      System.out.println("]\n"); 
      
   }
   
   
}


// Interface which specifies the set of standard stack methods

interface Stackable  {
   public void push(int item);    // Pushes int on top of stack
   public int pop();              // Pops top int off stack and returns it, or returns null if stack is empty
   public boolean isEmpty();      // Returns T iff stack has no elements
   public int size();             // Returns number of items in stack
}
