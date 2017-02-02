import java.util.*;

public class GenerateArray {
  public int[] makeArray(int length){
    int[] array;
      
    array = new int[length];
    
    Random random = new Random();
    
    //populate the array with random integers 0-1000
    for(int i=0; i<length; i++)
      array[i]=random.nextInt(1001);
    // //print the contents of the array
    // for(int i=0;i<length;i++)
    //  System.out.println(array[i]);
    return array;
  }
}