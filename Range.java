import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current,temp;

  /*
*@precondition: start <= end
*@param start : the starting value (inclusive)
*@param end : the ending value which is also inclusive.*/
  public Range(int s, int e){
    if(s<=e){
      start=s;
      end=e;
      current=start;
    }else{throw new IllegalArgumentException("Invalid values for Range");}
  }

  public void reset(){
    current=0;
  }

  public int length(){
    return end-start+1;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    if(current>end){return false;}
    return true;
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    if(!this.hasNext()){throw new NoSuchElementException("You have reached the end of the range");}
    temp=current;
    current++;
    return temp;
  }

}
