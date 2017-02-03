//Code retrieved from http://www.java2novice.com/java-sorting-algorithms/bubble-sort/
public class BubbleSort {
  public void bubbleSorter( int [] intArray){
    //initializing the data members
    int n = intArray.length;
    int temp = 0;               
    //outer for loop that traverses the list
    for(int i=0; i < n; i++){
      //inner for loop that does the comparisons
      for(int j=1; j < (n-i); j++){            
        //this is the logic condition to see if the elements need to be swapped                   
        if(intArray[j-1] > intArray[j]){
          temp = intArray[j-1];
          intArray[j-1] = intArray[j];
          intArray[j] = temp;
        }                   
      }
    }
  }
}