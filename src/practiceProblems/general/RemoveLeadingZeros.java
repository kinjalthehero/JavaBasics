package practiceProblems.general;

public class RemoveLeadingZeros {

    public String removeLeadingZerosMethod (String num) {

        int count=0;

        // IMPORTANT
        // Remember that zero should be compared is a char
        // So put single quote around it
        while (num.charAt(count) == '0')
            count++;

        // Here we can not use String
        // We need to use StringBuffer
        // Reason: String is immutable. It can not change size.
        StringBuffer newString = new StringBuffer(num);
        newString.replace(0, count, "");

        return newString.toString();
    }

    public static void main(String[] args) {
        RemoveLeadingZeros obj = new RemoveLeadingZeros();
        System.out.println(obj.removeLeadingZerosMethod("00001234"));
    }
}
