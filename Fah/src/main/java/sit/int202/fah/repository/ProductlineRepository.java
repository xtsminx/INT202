package sit.int202.fah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int202.fah.entities.Productline;

public interface ProductlineRepository extends JpaRepository<Productline, String> {

}