package sit.int202;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class TestList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>(); // สร้าง 10 ช่อง ขยาย 1.5 เท่า
//        for (int i = 0; i < 30; i++) {
//            list.add(i);
//        }

        List<Integer> list = new LinkedList<Integer>(); // สร้าง 10 ช่อง ขยาย 1.5 เท่า
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
    }


}
