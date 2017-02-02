public class BubbleSort {
  public void bubbleSorter( int [] intArray){
    int n = intArray.length;
    int temp = 0;               
    for(int i=0; i < n; i++){
      for(int j=1; j < (n-i); j++){                               
        if(intArray[j-1] > intArray[j]){
          temp = intArray[j-1];
          intArray[j-1] = intArray[j];
          intArray[j] = temp;
        }                   
      }
    }
    System.out.println("");
    for (int c = 0; c < intArray.length -1; c ++){
      System.out.print(intArray[c] + ", ");
    }
    System.out.println("");
  }
}