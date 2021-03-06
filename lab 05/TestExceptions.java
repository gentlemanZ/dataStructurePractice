
import java.util.Scanner;



public class TestExceptions {


/* File: TestExceptions.java
* Author: Wayne Snyder
* Purpose: Just a simple program to show
*     how exceptions work.
*/

    static Scanner in = new Scanner(System.in);
   
    public static int promptAndInputInteger() throws  TooLargeException,TooSmallException {

        System.out.println("Input Positive Integer between 5 and 10:");
        int n = inputInteger(); 
        if(n > 10)
            throw new TooLargeException("Integer is too large: ", n);
        return n;
    }
   
    public static int inputInteger() throws TooSmallException {
        int m = in.nextInt(); 
        if(m < 5)
            throw new TooSmallException("Integer is too small: ", m);
        else
            return m;
    }
   
    public static void main(String[] args) {
       
       try { 
            int k = promptAndInputInteger();
            System.out.println("Correct: " + k);
           
        }
  
        catch (Exception e) {
            System.out.println(e.getMessage());
           
        }     
        finally {
            System.out.println("Done");
        }
        
  
    }
   
}


class TooSmallException extends Exception {
    public int num;
    public TooSmallException(String msg, int n) {
        super(msg);
        num = n;
    }
}
class TooLargeException extends Exception {
    public int num;
    public TooLargeException(String msg, int n) {
        super(msg);
        num = n;
    }
}

