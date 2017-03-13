import java.io.*;

public class Driver {

  private static int [] sortedArray;

  //generateTheInputArray that takes an arguement and makes the desired output
  public int[] generateTheInputArray(String order, int size) {
    int[] inputArray; 
    //logic for ascending
    if (order.equals("ascending")) {
      inputArray = new int[size];
      for(int i = 0; i < size -1; i++){
        inputArray[i]= i;
      }
    }
    //logic for descending
    else if(order.equals("descending")) {
      inputArray = new int[size];
      for(int i = size -1; i > 0; i--){
        inputArray[i]= i;
      }
    }
    //logic for random
    else if (order.equals("random")) {
      inputArray = new int[size];
      GenerateArray random = new GenerateArray();
      random.makeArray(size);
    }
    //logic everything else
    else {
      inputArray = new int[1];
      System.out.println("Not an option");
    }
    return inputArray;
  }

  public Long runSortAlgo (String algorithm, int[] generatedArray) {
    //if the arguement is for a bubble sort, this branch will run
    if (algorithm.equals("bubble")) {
      BubbleSort bubble = new BubbleSort();
      //timing of the algo logic
      Long startTime = System.nanoTime();
      sortedArray = bubble.bubbleSorter(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    //if the arguement is for a insertion sort, this branch will run
    else if(algorithm.equals("insertion")) {
      InsertionSort insertion = new InsertionSort();
      //timing of the algo logic
      Long startTime = System.nanoTime();
      sortedArray = insertion.insertionSort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    //if the arguement is for a merge sort, this branch will run
    else if(algorithm.equals("merge")) {
      MergeSort merge = new MergeSort();
      //timing of the algo logic
      Long startTime = System.nanoTime();
      sortedArray = merge.sort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    //if the arguement is for a quick sort, this branch will run
    else if(algorithm.equals("quick")) {
      QuickSort quick = new QuickSort();
      //timing of the algo logic
      Long startTime = System.nanoTime();
      sortedArray = quick.sort(generatedArray);
      Long endTime = System.nanoTime() - startTime;
      return endTime;
    }
    //default case when the algortihm type is not recognized
    else {
      Long startTime = System.nanoTime();
      System.out.println("Not an option");
      return startTime;
    }
  }
  public static void main(String[] args) {
    if (args.length != 4) {
      //This is the format the program should be used in
      System.out.println("Usage: java Assign1 <order> <size> <algorithm> <output file>");
      System.exit(0);
    }

    //initializing the data members that are used in this test
    String orderInput = args[0].toLowerCase();
    int size = Integer.parseInt(args[1]);
    String algorithm = args[2].toLowerCase();
    String outputFile = args[3];
    PrintWriter printWriter = null;
    int[] inputArray;
    Long rawRunTimeOfAlgo;

    //try block that initializes the print writer to write files
    try{
    FileOutputStream file = new FileOutputStream(outputFile);
    printWriter = new PrintWriter(file);
    }

    catch (IOException e) {
      e.getMessage();
    }

    //logic that initializes all the classes and runs the desired inputs
    Driver driver = new Driver();
    inputArray = driver.generateTheInputArray(orderInput, size);
    rawRunTimeOfAlgo = driver.runSortAlgo(algorithm, inputArray);
    double runTimeOfAlgo = rawRunTimeOfAlgo / 1000000000.000000000;
    printWriter.println(runTimeOfAlgo + " seconds");
    for (int i = 0; i < sortedArray.length; i++) {
      printWriter.println(sortedArray[i]);
    }
    printWriter.close();
  }
}