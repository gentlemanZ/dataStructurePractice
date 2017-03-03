/* File: Lab07.java
 * Author: Wayne Snyder
 * Date: October 23nd, 2014
 * Purpose: This is the starter code for Lab 07
 */

public class Lab07 {
  
  // Basic Node definition: you will need to modify this for problems 1 and 2
  
  public static class Node {
    int key;
    int count ;
    Node left;
    Node right;
    Node parent;
    
    public Node(int k) {
      left = null;
      right = null;
      parent =null;
      key = k;
    }
    
    public Node(int k, Node left, Node right, Node parent) {
      key = k;
      count =1;
      this.left = left;
      this.right = right;
      this.parent = parent;
    }
    public Node(int k, Node p){
      key =k;
      count =1;
      this.left =null;
      this.right = null;
      this.parent = p;
    }
                                    
  }
  
  
  // Problem Zero: You must create three versions of this method, for Pre-, In-, and Postorder traversals
  
  public static void traverse(Node t) {
    if(t != null) {
      traverse(t.left);             
      visit(t);                           
      traverse(t.right);           
    }
  } 
  
  
  
  public static void traversePreorder(Node t) {
    visit(t);
    traverse(t.left);
    traverse(t.right);
  } 
  
  public static void traverseInorder(Node t) {
    traverse(t.left);
    visit(t);
    traverse(t.right);
  } 
  
  public static void traversePostorder(Node t) {
    traverse(t.left);
    traverse(t.right);
    visit(t);
  } 
  
  
  public static void visit(Node t) {
    System.out.print(t.key + " ");
  }
  
  
  // Problem One: You must modify the this method and its helper to account for parent pointers
  
  public static Node insert(Node t, int key) {
    return insertHelper(t,null,key); 
  }
  
  public static Node insertHelper(Node t,Node p, int key) {
    if (t == null)
      return new Node(key,p);
    else if (key < t.key) {
      t.left = insertHelper(t.left,t, key);
      return t;
    } else if (key > t.key) {
      t.right = insertHelper(t.right,t, key);
      return t;
    } else
      return t;
  }
  
  
  // Problem Two: You must complete this method
  // The parameter order indicates which traversal method: 1 = Preorder, 2 = Inorder, and 3 = Postorder
  
  public static void traverse(Node t, int order) {
    // your code here
    Node p =t;
    while(p != null){
      if(p.count ==1&&p.left != null){
        p.count ++;
        traverse(p.left);
      }else if (p.left == null&&p.count ==1){
        p.count++;
      }else if(p.count ==2 && p.right != null){
        p.count ++;
        traverse(p.right);
      }else if(p.right == null&&p.count ==2){
        p.count++;
      }
      else if(p.count ==3){
        if (order ==1){
        visit(p);
        p=p.parent;
        p.count =1;
        }
      
    }
      else{
      };
  }
  }
  
  
  
  // For debugging: recursively print out a diagram of the tree sideways
  
  public static void printTree(Node t) {
    System.out.println();
    printTreeAux(t, "");
    System.out.println();
  }
  
  public static void printTreeAux(Node t, String indent) {
    if (t != null) {
      printTreeAux(t.right, indent + "   "); // add three spaces to indent
      if(t.parent != null)
       System.out.println(indent + t.key + "   (" + t.parent.key + ")" );
     else
      System.out.println(indent + t.key);
      printTreeAux(t.left, indent + "   "); // add three spaces to indent
    }
  }
  
  public static void main(String[] args) {
    Node root = null; 
    root = insert(root,5); 
    root = insert(root,7); 
    root = insert(root,2); 
    root = insert(root,3); 
    
    printTree(root); 
    System.out.println("Preorder traversal two ways, should be same:"); 
    traversePreorder(root);
    System.out.println(); 
    traverse(root,1); 
    System.out.println("\n"); 
    
    System.out.println("Inorder traversal two ways, should be same:"); 
    traverseInorder(root);
    System.out.println(); 
    traverse(root,2); 
    System.out.println("\n"); 
    
    System.out.println("Postorder traversal two ways, should be same:"); 
    traversePostorder(root);
    System.out.println(); 
    traverse(root,3); 
    System.out.println("\n"); 
    
    root = insert(root,6); 
    root = insert(root,4); 
    root = insert(root,1); 
    
    printTree(root); 
    System.out.println("Preorder traversal two ways, should be same:"); 
    traversePreorder(root);
    System.out.println(); 
    traverse(root,1); 
    System.out.println("\n"); 
    
    System.out.println("Inorder traversal two ways, should be same:"); 
    traverseInorder(root);
    System.out.println(); 
    traverse(root,2); 
    System.out.println("\n"); 
    
    System.out.println("Postorder traversal two ways, should be same:"); 
    traversePostorder(root);
    System.out.println(); 
    traverse(root,3); 
    System.out.println("\n"); 
    
    
  }
  
}
