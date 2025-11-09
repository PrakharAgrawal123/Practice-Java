class ThreadA extends Thread {
  public void run() {
    System.out.println("Starting of Thread A");
    for (int i = 0; i < 5; i++) {
      System.out.println("From Thread A i = " + 2 * i);
    }
  }
}

class ThreadB extends Thread {
  public void run() {
    System.out.println("Starting of Thread B");
    for (int i = 0; i < 5; i++) {
      System.out.println("From Thread B i = " + 4 * i);
    }
  }
}

class ThreadC extends Thread {
  public void run() {
    System.out.println("Starting of Thread C");
    for (int i = 0; i < 5; i++) {
      System.out.println("From Thread c i = " + 3 * i);
    }
  }
}

public class Deamon {
  public static void main(String[] args) {
    ThreadA t1 = new ThreadA();
    ThreadB t2 = new ThreadB();
    ThreadC t3 = new ThreadC();

    t1.start();
    t2.start();
    t3.start();
  }
}