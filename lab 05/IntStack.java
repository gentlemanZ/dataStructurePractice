 /* File: IntStack.java
  * Classes: IntStack, Stack (interface)
  * Date: 10/3/13
  * Class: Boston University CS 112, Fall 2013
  * Author: Wayne Snyder (snyder@bu.edu)
  * Purpose: Example of simple array-based stack for Lab 04
  */

public class IntStack implements Stack {
  
  private int [] A = new int[5]; 
  
  private int next = 0;                        // location of next available unused slot  
  
  // interface methods
  
  public void push(int key) throws OverFlowException {         // push the key onto the top of the stack 
    if(next >=5)
      throw new OverFlowException("Stack overflow ",key);
    A[next++] = key; 
    
  }
  
  public int pop() throws UnderFlowException {    // remove the top integer and return it -- will cause error if empty! 
    if(next ==0){
      throw new UnderFlowException("Stack underflow");
    }
    return A[--next];   
  }
  
  public boolean isEmpty() {
    return (next == 0); 
  }
  
  public int size() {                 // how many integers in the stack 
    return next; 
  }
  
  
  
  // unit test
 
  public static void main(String [] args) {
    
    Stack S = new IntStack();        
 

    System.out.println("Pushing 5, 9, 9, -3, 31 then popping and printing it out:");
    try{
    S.push(5); S.push(9); S.push(9); S.push(-3); S.push(31);
    }
    catch{
      
    while(!S.isEmpty()) {
      try{
       System.out.println(S.pop()); 
      }
      catch(UnderFlowException e){
      System.out.println(e.getMessage());
    }
    }
    
    // this one will cause an error!
    try{
    System.out.println(S.pop());
    }
    catch(UnderFlowException e){
      System.out.println(e.getMessage());
    }
    
    // So will this one!
    System.out.println("Pushing 5, 9, 9, -3, 31, and 99 then popping and printing it out:"); 
    try{
    S.push(5); S.push(9); S.push(9); S.push(-3); S.push(31); S.push(99);
    }
    catch(UnderFlowException e){
      System.out.println(e.getMessage());
    }
   
  }
}
  
  
class UnderFlowException extends Exception {
  int num;
    public UnderFlowException(String msg) {
        super(msg);
        num=;
    }
}
class OverFlowException extends Exception {
  int num;
  String msg;
    public OverFlowException(String msg,int n) {
        super(msg);
        num = n;
    }
}


// Stack Interface

interface Stack { 
  public void push(int key)throws OverFlowException;          // push the key onto the top of the stack 
  public int pop()throws UnderFlowException;                   // remove the top integer and return it 
  public boolean isEmpty(); 
  public int size();                  // how many integers in the stack 
}

