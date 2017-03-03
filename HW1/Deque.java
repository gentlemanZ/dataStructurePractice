public class Deque implements Dequeable{

static private final int SIZE = 10; 
   static private int [] A = new int[SIZE]; 
   static private int size = 0;                      // number of elements stored in array, NOT size of array
   static private int front = 0; 
   static private int next = 0;  
   
   // gives next index in array which wraps around in a ring; moves clockwise through indices
   static private int nextSlot(int k) { 
      return ((k + 1) % A.length); 
   }
   static private int previousSlot(int k){
     if(k!=0){
       return k-1;
     }else{
       return A.length-1;
     }
   }
   
   // enqueue in next slot clockwise around the ring
   public void enqueue(int n) { 
      if(size != A.length) {              // do nothing if full
         A[next] = n; 
         next = nextSlot(next); 
         ++size;  
      }
      
   } 
   
   // dequeue and move front pointer clockwise; can underflow without warning and produce error elements
   public int dequeue() { 
      int temp = A[front]; 
      front = nextSlot(front);  
      --size;  
      return temp; 
   } 
   
   // just a wrapper for private value size
   public int size() { 
      return size; 
   }  
   
   // standard utility for data structures
  
   public boolean isEmpty() { 
      return (size == 0); 
   }
    public void enqueueFront(int k){
    if(size != A.length) {              // do nothing if full
      for(int i =next; i >=front; i ++){
        A[i]=A[previousSlot(i)];
      }
      A[front] = k;
      next=nextSlot(next);
         ++size;  
      }
  }
  public int dequeueFront(){
    int temp = A[front]; 
      front = nextSlot(front);  
      --size;  
      return temp; 
  }
  public void enqueueRear(int k){
    if(size != A.length) {              // do nothing if full
         A[next] = k; 
         next = nextSlot(next); 
         ++size;  
      }
  }
  public int dequeueRear(){
    int temp = A[previousSlot(next)]; 
      next = previousSlot(next);  
      --size;  
      return temp; 
  }
  private void contractArray(){
    if(A.length >=20 && this.size()<A.length/4){
      int[] tempArray = new int[A.lenght/2];
      for(int i =front; i<next; ++i)
        tempArray[i] = A [i];
      A=temparray;
    }
  }
   private void expandArray(){
    if(this.size() == A.length){
      int[] tempArray = new int[A.lenght*2];
      for(int i =front; i<next; ++i)
        tempArray[i] = A [i];
      A=temparray;
    }
  }
    
                                       
}