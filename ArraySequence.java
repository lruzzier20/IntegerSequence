import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;
  private int temp;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data=other;
    currentIndex=0;
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    int i=0;
    otherseq.reset();
    while(otherseq.hasNext()){
      data[i]=otherseq.next();
      i++;
    }
    otherseq.reset();
  }

  public boolean hasNext(){
    if(currentIndex>=data.length){return false;}
    return true;
  }

  public int next(){
    temp=currentIndex;
    currentIndex++;
    return data[temp];
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex=0;
  }
}
