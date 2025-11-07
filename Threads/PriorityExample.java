import java.lang.*;

class PriorityExample extends Thread {
  public void run() {
    System.out.println("Inside the run method");
  }

  public static void main(String[] args) {
    PriorityExample t1 = new PriorityExample();
    PriorityExample t2 = new PriorityExample();
    PriorityExample t3 = new PriorityExample();

    //KNOWING THE PRIORITY OF THE THREAD THAT IS 5 BY DEFAULT ----------
    System.out.println("Get Thread 1 priority:" + t1.getPriority());
    System.out.println("Get Thread 2 priority:" + t2.getPriority());
    System.out.println("Get Thread 3 priority:" + t3.getPriority());

    t1.setPriority(8);
    t2.setPriority(7);
    t3.setPriority(9);

    //AFTER SETTING THE PRIORITIES OF THE THREAD NEW PRIORITY -----
    System.out.println("Get Thread 1 priority:" + t1.getPriority());
    System.out.println("Get Thread 2 priority:" + t2.getPriority());
    System.out.println("Get Thread 3 priority:" + t3.getPriority());


    //THIS IS FOR CURRENTLY RUNNING THREAD ------------

    System.out.println("Currently running thread name:" + Thread.currentThread().getName());
    System.out.println("Currently running thread priority:" + Thread.currentThread().getPriority());

    Thread.currentThread().setPriority(2);
    System.out.println("Currently running new thread priority:" + Thread.currentThread().getPriority());

  }
}