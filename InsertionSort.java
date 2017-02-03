//Code retrieved from http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
public class InsertionSort {
  public int[] insertionSort(int[] input){
    int temp;
    //for loop that traverses the array
    for (int i = 1; i < input.length; i++) {
        //inner for loop that will do comparisons and determine if a swap is needed
        for(int j = i ; j > 0 ; j--){
            //this is the swap logic
            if(input[j] < input[j-1]){
                temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
            }
        }
    }
    return input;
  }
}