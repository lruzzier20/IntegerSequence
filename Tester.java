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
  }
}
