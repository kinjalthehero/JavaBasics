package ExceptionConcept;

public class ExceptionBasics {


    void method() {
        try {
            System.out.println("Try");

            int[] arr = new int[4];
            //int i = arr[4]; // this statement causes an exception
            int i = 2/0;
            System.out.println("After exception in try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch ArrayIndexOutOfBoundsException");
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println("Catch General exception");
            System.out.println(e.getClass().getName());
        }

        finally {
            System.out.println("Finally");
        }
        System.out.println("After exception");
    }


    public static void main(String[] args) {
        ExceptionBasics obj = new ExceptionBasics();
        obj.method();
    }
}
