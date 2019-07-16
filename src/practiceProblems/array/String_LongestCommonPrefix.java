package practiceProblems.array;


// This is a bad implementation of the program. OK to skip.
public class String_LongestCommonPrefix {

    public static void main(String[] args)
    {
        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String longestPrefix=getLongestCommonPrefix(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
    }

    public static String getLongestCommonPrefix(String[] strArr) {

        if(strArr.length==0)
            return "";

        // Find String with minimum length
        String minStr = getMinString(strArr);
        int minPrefixStrLength = minStr.length();

        // take one string at a time
        for(int i=0; i< strArr.length; i++)
        {
            int j;

            // Compare each letter of min string and string from the array we are considering
            // We break when there is a mismatch of letters.
            // Till this point, we had same chars
            for(j=0; j < minPrefixStrLength; j++)
            {
                if(minStr.charAt(j) != strArr[i].charAt(j))
                    break;
            }

            // We find the min prefix length
            if(j < minPrefixStrLength)
                minPrefixStrLength = j;
        }

        return minStr.substring(0,minPrefixStrLength);
    }

    // Find string with minimum length
    public static String getMinString(String[] strArr)
    {
        String minStr = strArr[0];

        for(int i=1;i<strArr.length;i++){
            if(strArr[i].length() < minStr.length())
                minStr = strArr[i];
        }
        return minStr;
    }
}
