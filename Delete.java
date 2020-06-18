public class Delete implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println ("Thread “ + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }

    public static void splitString (String str) {

        String[] arr = str.split("[^a-zA-Z]");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        /*int n = 8;  // Number of threads

        for (int i=0; i<8; i++) {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }*/

        splitString("My name is kinjal");

    }
}
