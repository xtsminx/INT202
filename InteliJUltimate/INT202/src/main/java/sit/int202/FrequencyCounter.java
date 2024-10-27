package sit.int202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] data = {8,  2,  3,  7,  8,  8,  7,  4,  7,  4,  4,
                2,  2,  3,  8,  2,  7,  3,  3,  8 };
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(map.get(data[i]) == null) {
                map.put(data[i], new ArrayList<>());
            }
            map.get(data[i]).add(i);
        }
        int maxFrequency = 0;
        int maxIndex = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > maxFrequency) {
                maxFrequency = entry.getValue().size();
                maxIndex = entry.getKey();
            }
        }
        System.out.printf("%d (%d) : %s\n", maxFrequency, maxIndex,
                map.get(maxIndex).toString());
    }
}
