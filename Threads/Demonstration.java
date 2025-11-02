
class ClassA extends Thread {

    public void run() {
        System.out.println("Start Thread A ....");
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield(); // gives other threads a chance

            }
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("... Exit Thread A");
    }
}

class ClassB extends Thread {

    private volatile boolean running = true; // flag to control thread

    public void stopThread() {
        running = false;
    }

    public void run() {
        System.out.println("Start Thread B ....");
        for (int j = 1; j <= 5 && running; j++) {
            System.out.println("From Thread B: j = " + j);
            if (j == 2) {
                stopThread(); // stop safely using flag
            }
        }
        System.out.println("... Exit Thread B");
    }
}

class ClassC extends Thread {

    public void run() {
        System.out.println("Start Thread C ....");
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C: k = " + k);
            if (k == 3) {
                try {
                    Thread.sleep(1000); // pauses for 1 second
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("... Exit Thread C");
    }
}

public class Demonstration {

    public static void main(String args[]) {
        ClassA t1 = new ClassA();
        ClassB t2 = new ClassB();
        ClassC t3 = new ClassC();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("... End of execution");
    }
}
