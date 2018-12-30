package ThreadPackage;

public class ThreadDemo extends Thread {

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " started");
    }

    public static void main(String[] args) {

        for (int i=0; i < 5; i++) {
            ThreadDemo object = new ThreadDemo();
            object.start();
        }
    }
}
