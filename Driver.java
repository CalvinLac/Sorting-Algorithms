
import java.io.*;

public class Driver {

  public int[] generateTheInputArray(String order, int size) {
    int[] inputArray; 
    if (order.equals("ascending")) {
      inputArray = new int[size];
      for(int i = 0; i < size -1; i++){
        inputArray[i]= i;
      }
      System.out.println(inputArray[1]);
    }
    else if(order.equals("descending")) {
      inputArray = new int[size];
      for(int i = size -1; i > 0; i--){
        inputArray[i]= i;
      }
      System.out.println(inputArray[1]);
    }
    else{
      GenerateArray randomArrayMaker = new GenerateArray();
      inputArray = randomArrayMaker.makeArray(size);
      System.out.println(inputArray[1]);
    }
    return inputArray;
  }

  public void runSortAlgo (String algorithm, int[] generatedArray) {
    if (algorithm.equals("bubble")) {
      BubbleSort bubble = new BubbleSort();
      bubble.bubbleSorter(generatedArray);
    }
    else if(algorithm.equals("insertion")) {
      InsertionSort insertion = new InsertionSort();
      insertion.insertionSort(generatedArray);
    }
    else if(algorithm.equals("merge")) {
      MergeSort merge = new MergeSort();
      merge.sort(generatedArray);
    }
    else if(algorithm.equals("quick")) {
      QuickSort quick = new QuickSort();
      quick.sort(generatedArray);
    }
    else {
      System.out.println("Not an option");
    }
  }
  public static void main(String[] args) {
    if (args.length != 4) {
      System.out.println("Usage: java Assign1 <order> <size> <algorithm> <output file>");
      System.exit(0);
    }

    String orderInput = args[0];
    int size = Integer.parseInt(args[1]);
    String algorithm = args[2];
    String outputFile = args[3];
    PrintWriter printWriter = null;
    int[] inputArray;

    try{
    FileOutputStream file = new FileOutputStream(outputFile);
    printWriter = new PrintWriter(file);
    }

    catch (IOException e) {
      e.getMessage();
    }

    Driver driver = new Driver();
    inputArray = driver.generateTheInputArray(orderInput, size);
    driver.runSortAlgo(algorithm, inputArray);
    printWriter.println("hello");
    printWriter.close();
  }
}