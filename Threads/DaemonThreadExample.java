class DaemonThreadExample extends Thread {
  public void run() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println("This is a Deamon thread");
    } else {
      System.out.println("This is a user thread");
    }
  }

  public static void main(String[] args) {
    DaemonThreadExample t1 = new DaemonThreadExample(); // User Thread
    DaemonThreadExample t2 = new DaemonThreadExample(); // Deamon Thread
    DaemonThreadExample t3 = new DaemonThreadExample(); // Deamon Thread

    // SET THREAD 2 AS DEAMON THREAD
    t2.setDaemon(true);

    t1.start();
    t2.start();
    t3.start();
  }
}
