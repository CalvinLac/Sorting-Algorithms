public class InsertionSort {
  public void insertionSort(int[] input){
    //http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
    int temp;
    for (int i = 1; i < input.length; i++) {
        for(int j = i ; j > 0 ; j--){
            if(input[j] < input[j-1]){
                temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
            }
        }
    }
    System.out.println("");
    for (int c = 0; c < input.length -1; c ++){
      System.out.print(input[c] + ", ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    InsertionSort i = new InsertionSort();
    int [] a = new int[] {5,3,4,8,6,0,3,45,2,84,984,35,2};
    i.insertionSort(a);
  }
}