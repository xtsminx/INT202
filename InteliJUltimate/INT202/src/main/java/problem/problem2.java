package problem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 7, 9, 6, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = scanner.nextInt();

        findPairs(arr, x);
    }

    public static void findPairs(int[] arr, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = x - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found : (" + map.get(complement) + "," + i + ")");
                System.out.println("Values : (" + complement + "," + arr[i] + ")");
            }
            map.put(arr[i], i);
        }
    }
}
