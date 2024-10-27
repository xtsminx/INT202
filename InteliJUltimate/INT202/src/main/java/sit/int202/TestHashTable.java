package sit.int202;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class TestHashTable {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(16,0.5f); //จองพื้นที่ 16 ช่อง ขยาย 2 เท่า
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt());
        }
    }
}
// loadFactor ปริมาณที่จะเก็บได้สูงสุด