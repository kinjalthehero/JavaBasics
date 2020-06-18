import java.util.*;

public class Delete {


    public static ArrayList<String> popularNFeatures(int numFeatures,
                                                     int topFeatures,
                                                     List<String> possibleFeatures,
                                                     int numFeatureRequests,
                                                     List<String> featureRequests) {

        if (topFeatures > numFeatureRequests)
            return new ArrayList<>(possibleFeatures);

        Map<String, Integer> map = new HashMap<>();

        for (String featureRequest : featureRequests) {

            Set<String> uniqueFeatureRequests = new HashSet<>();
            String[] features = featureRequest.split("\\W");

            for (String feature : features) {

                if (possibleFeatures.contains(feature) && !uniqueFeatureRequests.contains(feature)) {
                    map.put(feature, map.getOrDefault(feature, 0) + 1);
                }
            }
        }

        System.out.println(map);

        Set<String> keys = map.keySet();
        ArrayList<String> keyList = new ArrayList<>(keys);

        keyList.sort((a, b) -> map.get(a) == map.get(b) ? a.compareTo(b) : (map.get(a) < map.get(b)) ? 1 : -1);

        return new ArrayList<>(keyList.subList(0, topFeatures));
    }

    static void absSort(List<Integer> arr) {

        System.out.println("Before: " + arr);
        arr.sort((a, b) -> ((Math.abs(a) == Math.abs(b)) ? ((a < b) ? -1 : 1) : (Math.abs(a) < Math.abs(b)) ? -1 : 1));
        System.out.println("After: " + arr);
    }

    static int[] absSortArray(int[] arr) {

        System.out.println("Before: " + Arrays.toString(arr));

        //Integer[] input = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Integer[] input = new Integer[arr.length];
        for (int i=0; i < input.length; i++) {
            input[i] = arr[i];
        }

        Arrays.sort(input, (a, b) -> ((Math.abs(a) == Math.abs(b)) ? ((a < b) ? -1 : 1) : (Math.abs(a) < Math.abs(b)) ? -1 : 1));

        int[] output =  new int[input.length];
        for (int i=0; i < input.length; i++) {
            output[i] = input[i];
        }

        return output;
    }


    public static void main(String[] args) {

        /*List<Integer> possibleFeatures = new ArrayList<>();
        possibleFeatures.add(2);
        possibleFeatures.add(-7);
        possibleFeatures.add(-2);
        possibleFeatures.add(-2);
        possibleFeatures.add(0);*/

        int[] possibleFeatures = {2,-7,-2,-2,0};
        absSortArray(possibleFeatures);


        /*String str1 = "Best services provided by anacell";
        String str2 = "betacellular has great services";
        String str3 = "anacell provides much better services than all other";
        List<String> featureRequests = new ArrayList<>();
        featureRequests.add(str1);
        featureRequests.add(str2);
        featureRequests.add(str3);


        System.out.println(popularNFeatures(5, 2, possibleFeatures, 3, possibleFeatures));*/
    }

}


