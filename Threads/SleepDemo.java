public class SleepDemo {
  public static void main(String[] args) {
    System.out.println("Program started...");
    try {
      System.out.println("\nSleeping for 1000 milliseconds (1 second)...");
      long start1 = System.currentTimeMillis(); // record start time
      Thread.sleep(1000); // sleep for 1 second
      long end1 = System.currentTimeMillis(); // record end time
      System.out.println("Woke up after: " + (end1 - start1) + " ms");

      System.out.println("\nSleeping for 1000 milliseconds and 500000 nanoseconds (≈1.0005 seconds)...");
      long start2 = System.currentTimeMillis();
      Thread.sleep(1000, 500000); // sleep for 1.0005 seconds
      long end2 = System.currentTimeMillis();
      System.out.println("Woke up after: " + (end2 - start2) + " ms");
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted!");
    }
    System.out.println("\nProgram ended.");
  }
}