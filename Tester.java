public class Tester{
  public static void main(String[] args){
    Range a = new Range(0,25);
// shamelessly stolen test case
    while(a.hasNext()){
      System.out.print(a.next());
      if(a.hasNext()){
         System.out.print(", ");
      }
    }
    System.out.println();
    int[] thing = new int[]{1,3,5,0,-1,3,9};
    ArraySequence b = new ArraySequence(thing);
    ArraySequence c = new ArraySequence(a);
    while(c.hasNext()){
      System.out.print(c.next());
      if(c.hasNext()){
         System.out.print(", ");
      }
    }
  }
}
