public class DequeClient{
   public static void main(String [] args) {
      
      System.out.println("\nShould print out:\n3  4  5  6  7  8  9  10  11  12:"); 
      

      enqueue(1); 
      enqueue(2);
      enqueue(3);
      
      dequeue();
      dequeue(); 
      
      enqueue(4); 
      enqueue(5);  
      enqueue(6);
      enqueue(7);
      enqueue(8);  
      enqueue(9);
      enqueue(10); 
      enqueue(11); 
      enqueue(12); 
      
      
      while( !isEmpty() ) {
         System.out.print( dequeue() + "  "); 
      }
      System.out.println(); 
      
      
   }
}