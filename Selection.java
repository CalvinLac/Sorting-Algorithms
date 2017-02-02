public class Selection {
  public void selectionSort(int[] arr){
    for(int i = 0; i < arr.length-1; i++) {
      int min = i;
      for(int j = i + 1; j < arr.length; j ++){
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    System.out.println("");
    for (int c = 0; c < arr.length -1; c ++){
      System.out.print(arr[c] + ", ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    int[] sample = new int[] {2,5,1,7,10,9};
    Selection hi = new Selection();
    hi.selectionSort(sample);
  }
}