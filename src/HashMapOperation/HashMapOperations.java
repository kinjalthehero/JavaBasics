package HashMapOperation;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapOperations {

    public static void main(String[] args) {

        HashMap<String, String> loans = new HashMap<>();
        loans.put("HDFC", "Basic loans");
        loans.put("ICICI", "Matured loans");
        loans.put("CitiBank", "Premium loans");

        // keySet() will provide entire Set of keys
        // get() will return value based on the key
        for (String loan: loans.keySet()) {
            System.out.println("Bank name: " + loan + ", Type of loan: " + loans.get(loan));
        }

        // Create iterator of keys
        // Use while loop to loop through iterator
        // To get value, we still need to access the Hashmap
        Iterator<String> itr = loans.keySet().iterator();
        while (itr.hasNext())
            System.out.println("Bank name: " + itr + ", Type of loan: " + loans.get(loans.get(itr)));
    }

}
