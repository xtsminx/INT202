package problem;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student implements Comparable<Student> {
    private Integer sid;
    private String name;
    private double gpax;

    @Override
    public int compareTo(Student o) {
        int gpaxComparison = Double.compare(o.gpax, this.gpax);
        if (gpaxComparison != 0) {
            return gpaxComparison;
        }
        return this.name.compareTo(o.name);
    }
}
