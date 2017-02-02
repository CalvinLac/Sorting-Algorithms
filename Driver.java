import java.io.*;

public class Driver {

  public static void main(String[] args) {
    if (args.length != 4) {
      System.out.println("Usage: java Assign1 <order> <size> <algorithm> <output file>");
      System.exit(0);
    }

    String order = args[0];
    String size = args[1];
    String algorithm = args[2];
    String outputFile = args[3];
    PrintWriter printWriter = null;

    try{
    FileOutputStream file = new FileOutputStream(outputFile);
    printWriter = new PrintWriter(file);
    }

    catch (IOException e) {
      e.getMessage();
    }

    printWriter.println("hello");
    printWriter.close();
  }
}