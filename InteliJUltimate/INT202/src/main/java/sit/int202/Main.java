package sit.int202;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
//        Set<Student> students = new TreeSet<>();
        Set<Student> students = new HashSet<>();
        Student s1 = new Student(1001,"Somchai",3.98);
        for (int i = 0; i < 10; i++) {
            students.add(s1);
            s1 = new Student((int) (Math.random()*99+100),"Somchai",3.98);
//            s1 = new Student(1001,"Somchai",3.98);
        }
        System.out.println(students);
// tree -> implement comparable
// hash -> implement EqualsAndHashCode
    }
}