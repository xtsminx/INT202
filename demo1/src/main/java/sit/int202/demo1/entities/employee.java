package sit.int202.demo1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@ToString
@Getter
@Setter
public class employee {
    @Id
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String extension;
    private String officeCode;
    private int reportsTo;
    private String jobTitle;

}
