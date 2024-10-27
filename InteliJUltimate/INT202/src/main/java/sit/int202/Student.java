package sit.int202;
import lombok.*;
@Getter
@Setter
@ToString(exclude = "gpax")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "gpax")
public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.sid = o.sid;
    }
    private  Integer sid;
    private String name;
    private double gpax;
}
