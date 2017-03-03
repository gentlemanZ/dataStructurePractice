/* Program: CollectionGradingClientLab.java
 * Author: Wayne Snyder
 * Date: 9/12/14
 * Class: CS 112
 * Purpose: Version of grading program from HW01, adapted for Lab 03
 */

public class CollectionGradingClientLab { 
   public static void main(String [] args) { 
      IntCollectionLab C = new IntCollectionLab();
      System.out.println("\nTesting size and isEmpty...");
      System.out.println("At beginning should be:\n0  true");
      System.out.println(C.size()+ "  " + C.isEmpty()); 
      System.out.println("\nNow insert two elements and test again; should be:\n2  false");
      C.insert(7);
      C.insert(13);
      System.out.println(C.size()+ "  " + C.isEmpty()); 
      System.out.println("\nNow delete the two elements and test again; should be:\n0  true");
      C.delete(7);
      C.delete(13);
      System.out.println(C.size()+ "  " + C.isEmpty());
      
      System.out.println("\nTesting basic insertions and deletions...");
      System.out.println("\nInserting 8 elements; should be:\n[2, 3, 7, 13, 34, 64, 111, 234 | 0, 0]"); 
      C.insert(64);
      C.insert(2);
      C.insert(7);
      C.insert(34);
      C.insert(3); 
      C.insert(111);
      C.insert(13);
      C.insert(234); 
      C.list();                         
      System.out.println("\nDeleting 2 from front; should be:\n[3, 7, 13, 34, 64, 111, 234 | 234, 0, 0]"); 
      C.delete(2);
      C.list(); 
      System.out.println("\nDeleting 234 from end; should be:\n[3, 7, 13, 34, 64, 111 | 234, 234, 0, 0]"); 
      C.delete(234);
      C.list();
      System.out.println("\nDeleting 13 and 34 from middle; should be:\n[3, 7, 64, 111 | 111, 111, 234, 234, 0, 0]"); 
      C.delete(34);
      C.delete(13);
      C.list();
      System.out.println("\nTesting that can not insert duplicates...");
      System.out.println("\nInserting 64 twice more; should be:\n[3, 7, 64, 111 | 111, 111, 234, 234, 0, 0]"); 
      C.insert(64); 
      C.insert(64);   
      C.list(); 
      System.out.println("\nTesting that deleting non-members (-3, 5, 234) should have no effect; Should be:");
      System.out.println("\n[3, 7, 64, 111 | 111, 111, 234, 234, 0, 0]");
      C.delete(-3);
      C.delete(5);
      C.delete(234);
      C.list();
      
      System.out.println("\nTesting member......");
      System.out.println("\nChecking member(7); should be:\ntrue");
      System.out.println(C.member(7)); 
      System.out.println("\nChecking member(3); should be:\ntrue");
      System.out.println(C.member(3)); 
      System.out.println("\nChecking member(111); should be:\ntrue");
      System.out.println(C.member(111)); 
      System.out.println("\nChecking member(13); should be:\nfalse");
      System.out.println(C.member(13)); 
      System.out.println("\nChecking member(234); should be:\nfalse");
      System.out.println(C.member(234)); 
      
      System.out.println("\nTesting that array will expand.... should be:\n[3, 7, 64, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 111 | 0, 0, 0, 0, 0, 0]");
      for(int i = 100; i < 110; ++i)
         C.insert(i);
      C.list(); 
      System.out.println("\nTesting that array will NOT shrink until < 1/4th full.... should be:\n[3, 7, 64, 109, 111 | 111, 111, 111, 111, 111, 111, 111, 111, 111, 0, 0, 0, 0, 0, 0]");
      for(int i = 100; i < 109; ++i)
         C.delete(i);
      C.list(); 
      System.out.println("\nTesting that array WILL shrink when < 1/4th full.... should be:\n[3, 64, 109, 111 | 0, 0, 0, 0, 0, 0]");
      C.delete(7);
      C.list();  
      System.out.println("\nTesting that array will NOT shrink if minimum size of 10 reached; should be: \n[64 | 109, 111, 111, 0, 0, 0, 0, 0, 0]");
      C.delete(3);
      C.delete(111);
      C.delete(109);
      C.list();      
   }    
} 



