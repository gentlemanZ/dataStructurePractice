/*
 * File: PostfixCalculator.java 
 * Author: Wayne Snyder (waysnyder@gmail.com) 
 * Date: 9/11/14 
 * Purpose: This is a simple program to evaluate postfix expressions involving
 *       single digits, for Lab 01 in CS 112, Fall 2014.
 * Platform: This was developed on Mac OS X 10.6.8 in Dr. Java
 * 
 */

import java.io.*;
import java.util.Scanner;

public class PostfixCalculator {
   
   
   private static void reportError(String msg) throws InterruptedException {
      System.out.println("Error: " + msg); 
      System.out.println("Exiting...."); 
      Thread.sleep(2000); 
      System.exit(0); 
   }
   public static void main(String[] args) throws InterruptedException {
      
      // YOUR CODE HERE:  Declare a Stack (must put StackClient.java in the same directory as this file)
      
      String line;
      int cmd;      
      Character cmd2;    
      int value = 0;    
      
      Scanner sc = new Scanner(System.in); 
      
      System.out.println("Postfix Calculator");
      System.out.println("What would you like to do, evaluate an expression (1), or exit (0)?"); 
      
      while(sc.hasNext()) {
         
         cmd = sc.nextInt(); 
         
         if(cmd == 1) {
            
            System.out.println("What expression would you like to evaluate (may contain ");
            System.out.println("digits, or operators + or *, separated by white space)?");
            
            sc.nextLine(); 
            line = sc.nextLine();   
            
            for(int i = 0; i < line.length(); ++i) {
               
               cmd2 = line.charAt(i); 
               
               if(Character.isSpaceChar(cmd2))                  // if space, skip it
                  ;
               else if(Character.isDigit(cmd2)) {             // token is an integer, push on stack
                  
                  // YOUR CODE HERE:  push the numeric value of cmd2 on the stack
                  //                  using Character.getNumericValue(...)
                  
               }
               else if(cmd2.compareTo('+') == 0) {            // token is an operator, pop operands and push result
                  // YOUR CODE HERE:  pop two integers off the stack and push their sum on the stack
                  //                  you MUST check before EACH pop whether the stack will underflow
                  //                  and if it would, you must reportError(....)  with an appropriate message (problem 3)
                  
               }
               else if(cmd2.compareTo('*') == 0) {
                  // ditto, but multiply
                  
               }
               
               else {
                  
                  reportError("Unrecognizable token: " + cmd2); 
                  
               }
            }      // end of for loop  
            
            // YOUR CODE HERE:  pop the final value off the stack and assign to value;
            //                  check for any other errors (problem 4) and report!
            
            System.out.println("Value = " + value); 
            
         }    // end else cmd == 2
         
         else if(cmd == 0) {
            
            System.out.println("Bye!"); 
            return;
            
         }
         else { 
            reportError("Please enter a 0 or 1 next time!"); 
         }
         
         System.out.println("What would you like to do, evaluate an expression (1), or exit (0)?"); 
         
      }   // end while
      
   }    // end main
   
}

