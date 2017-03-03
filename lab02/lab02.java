public class lab02{
   public static void main(String[] args){
     String s = "able"; 
     String t = "bble";
     String u = "ben"; 
     String v = "benjamin";
     String w = "aaron";
     
     System.out.println(s.compareTo(t));
     System.out.println(s.compareTo(u));
     System.out.println(s.compareTo(v));
     System.out.println(t.compareTo(w));
     System.out.println(v.compareTo(s));
     System.out.println(u.compareTo(v));
     System.out.println(s.compareTo("hello"));
     System.out.println(t.compareTo(u));
     System.out.println("noway".compareTo(u));
  }
}