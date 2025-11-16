class MyThread extends Thread {
  public void run() {
    System.out.println("Thread is in RUNNABLE/RUNNING state.");
    try {
      Thread.sleep(1000); // moves thread to TIMED_WAITING
      System.out.println("Thread woke up from TIMED_WAITING.");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

public class ThreadLifeCycle {
  public static void main(String[] args) {

    MyThread t = new MyThread();

    // NEW
    System.out.println("State after creating thread: " + t.getState());

    // RUNNABLE
    t.start();
    System.out.println("State just after starting: " + t.getState());

    try {
      Thread.sleep(500); // Give time for thread to go to sleep
      System.out.println("State during thread sleep (TIMED_WAITING): " + t.getState());

      t.join(); // Wait for thread to finish — goes to WAITING
      System.out.println("State after join completed: " + t.getState());

    } catch (Exception e) {
      System.out.println(e);
    }

    // TERMINATED
    System.out.println("Final State of thread: " + t.getState());
  }
}
