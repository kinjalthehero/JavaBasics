public class BreakStatement {

    public static void main (String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 4)
                break;

            System.out.println(i);
        }

        System.out.println("This statement will be executed after break keyword");
    }

}
