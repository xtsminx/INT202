package problem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem4 {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 7, 8, 8, 7, 4, 7, 4, 4, 2, 2, 3, 8, 2, 7, 3, 3, 8};
        findMostFrequentNumber(arr);
    }

    public static void findMostFrequentNumber(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, List<Integer>> locationMap = new HashMap<>();
        int maxFreq = 0;
        int mostFrequentNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            locationMap.computeIfAbsent(num, k -> new ArrayList<>()).add(i);

            if (frequencyMap.get(num) > maxFreq) {
                maxFreq = frequencyMap.get(num);
                mostFrequentNumber = num;
            }
        }

        List<Integer> locations = locationMap.get(mostFrequentNumber);

        System.out.println("Number with highest frequency: " + mostFrequentNumber);
        System.out.println("Locations: " + locations);
    }
}
