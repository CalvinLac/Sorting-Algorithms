
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
    else {
      inputArray = new int[1];
      System.out.println("Not an option");
    }
    return inputArray;
  }

  public Long runSortAlgo (String algorithm, int[] generatedArray) {
    if (algorithm.equals("bubble")) {
      BubbleSort bubble = new BubbleSort();
      Long startTime = System.nanoTime();
      bubble.bubbleSorter(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    else if(algorithm.equals("insertion")) {
      InsertionSort insertion = new InsertionSort();
      Long startTime = System.nanoTime();
      insertion.insertionSort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    else if(algorithm.equals("merge")) {
      MergeSort merge = new MergeSort();
      Long startTime = System.nanoTime();
      merge.sort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    else if(algorithm.equals("quick")) {
      QuickSort quick = new QuickSort();
      Long startTime = System.nanoTime();
      quick.sort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    else {
      Long startTime = System.nanoTime();
      System.out.println("Not an option");
      return startTime;
    }
  }
  public static void main(String[] args) {
    if (args.length != 4) {
      System.out.println("Usage: java Assign1 <order> <size> <algorithm> <output file>");
      System.exit(0);
    }

    String orderInput = args[0].toLowerCase();
    int size = Integer.parseInt(args[1]);
    String algorithm = args[2].toLowerCase();
    String outputFile = args[3];
    PrintWriter printWriter = null;
    int[] inputArray;
    Long rawRunTimeOfAlgo;

    try{
    FileOutputStream file = new FileOutputStream(outputFile);
    printWriter = new PrintWriter(file);
    }

    catch (IOException e) {
      e.getMessage();
    }

    Driver driver = new Driver();
    inputArray = driver.generateTheInputArray(orderInput, size);
    rawRunTimeOfAlgo = driver.runSortAlgo(algorithm, inputArray);
    double runTimeOfAlgo = rawRunTimeOfAlgo / 1000000000.000000000;
    printWriter.println(runTimeOfAlgo);
    printWriter.close();
  }
}