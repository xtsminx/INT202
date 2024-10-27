package sit.int202.fah.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sit.int202.fah.entities.Product;
import sit.int202.fah.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(String productCode) {
        return repository.findById(productCode).orElse(null);
    }

    public List<Product> findProductByText(String searchParam) {
//        String keyword =  "%" + searchParam + "%";
//        return repository.findAllProductByKeyword(keyword, keyword, keyword);
        return repository.findProductsByProductNameContainingOrProductVendorContainingOrProductLine_ProductLine(searchParam, searchParam, searchParam);
    }

    public List<Product> findProductByPrice(Double lower, Double upper) {

        return repository.findProductsByBuyPriceBetweenOrderByBuyPriceDesc(BigDecimal.valueOf(lower), BigDecimal.valueOf(upper));
    }

    public Page<Product> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
