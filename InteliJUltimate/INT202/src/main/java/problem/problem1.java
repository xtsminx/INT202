package problem;
import problem.Student;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class problem1 {
    public static void main(String[] args) {
        Set<Student> Hstudents = new HashSet<>();
        Set<Student> Tstudents = new TreeSet<>();
        Student s1 = new Student(10001,"Somsri",3.25);
        Student s2 = new Student(10002,"Somsak",3.00);
        Student s3 = new Student(10009,"Somchai",3.26);
        Student s4 = new Student(10007,"Somsiri",3.25);
        Student s5 = new Student(10037,"Sirisopaphan",3.25);

        Hstudents.add(s1);
        Hstudents.add(s2);
        Hstudents.add(s3);
        Hstudents.add(s4);
        Hstudents.add(s5);

        Tstudents.add(s1);
        Tstudents.add(s2);
        Tstudents.add(s3);
        Tstudents.add(s4);
        Tstudents.add(s5);

        System.out.println("HashSet Students");
        for (Student student : Hstudents) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        System.out.println("TreeSet Students");
        for (Student student : Tstudents) {
            System.out.println(student);
        }

    }
}
