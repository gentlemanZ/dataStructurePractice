/*GenericsTest that can test pair.
 * lab02 for cs112
 * adding a class named pair to help the code to compare a pair of numbers
 * coder:Tianyang Zhong
 * duedate 24/09/2014
 */


public class GenericsTest<Item extends Comparable<Item>> { 
  
  public void test(Item s, Item t) {         
    if( s.compareTo(t) < 0)            
      System.out.println(s + " < " + t); 
    else if( s.compareTo(t) > 0)
      System.out.println(s + " > " + t); 
    else
      System.out.println(s + " equals " + t); 
  }     
  
  public static void main(String [] args) {         
    GenericsTest<OneInt> f = new GenericsTest<OneInt>();         
    OneInt p = new OneInt(3);         
    OneInt q = new OneInt(4);         
    f.test(p,q); 
    f.test(q,p);
    f.test(p,p);
  }            
  
}

class OneInt implements Comparable<OneInt>{
   private int x;
   
   public OneInt(int x) {
      this.x = x;
   }
   public int compareTo(OneInt q) {
      if(x < q.x)
         return -1;
      else if (x > q.x)
         return 1;
      else 
         return 0;
   }
   public String toString() {
      return "(" + x + ")"; 
   }
}
class Pair implements Comparable<Pair>{
  private int x;
  private int y;
  private int result;
  public Pair(int x,int y){
    this.x=x;
    this.y=y;
  }
    public int compareTo(Pair q){
      if(x<q.x){
        return -1;
      }else if (x==q.x){
        if(y<q.y){
          return -1;
        }else if(y>q.y){
          return 1;
        }else{
          return 0;
        }
      }else{
        return -1;
      }
    }
    public String toString(){
      return "("+x+","+y+")";
    }
  }
        


   
