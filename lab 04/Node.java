public class Node {

       public int item;
       public Node next;

       Node() {                 // this would be the default if we did not provide the next two
          item = 0; 
          next = null;      
       } 

       Node(int n) {
          item = n;
          next = null;
       }

       Node(int n, Node p) {
          item = n;
          next = p;
       }
   
public static void main(String[] args){
   Node head;
   head = new Node(9,null);
   head= new Node(5,head);
   head= new Node(1,head);
   head= new Node(4,head);
   head= new Node(1,head);
   head= new Node(3,head);
}
}// Assume a global variable head which points to first node in list
                                       // Note that pointers are set to null by default, as if "Node head = null"

