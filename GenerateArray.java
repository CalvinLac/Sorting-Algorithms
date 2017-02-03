import java.util.*;

public class GenerateArray {
  public int[] makeArray(int length){
    int[] array;
      
    array = new int[length];
    
    //make use of the Random class
    Random random = new Random();
    
    //populate the array with random integers 0-1000
    for(int i=0; i<length; i++)
      array[i]=random.nextInt(1001);
    return array;
  }
}