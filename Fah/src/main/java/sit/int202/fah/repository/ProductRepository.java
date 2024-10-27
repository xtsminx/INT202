package sit.int202.fah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sit.int202.fah.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findProductsByProductNameContainingOrProductVendorContainingOrProductLine_ProductLine(String productName, String productVendor, String productLine);
    @Query("select p from Product p where p.productName like ?1 or p.productVendor like ?2 or p.productLine.productLine like ?3")
    List<Product> findAllProductByKeyword(String productName, String productVender, String productLine);
    List<Product> findProductsByBuyPriceBetweenOrderByBuyPriceDesc(BigDecimal lower, BigDecimal upper);
}