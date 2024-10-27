package sit.int202.fah.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sit.int202.fah.services.ProductService;


@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String getProducts(ModelMap model) {
        model.addAttribute("product", productService.findAll());
        return "product_list";
    }
    @GetMapping("/paging")
    public String getProductsPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            ModelMap model) {
        model.addAttribute("page", productService.findAll(PageRequest.of(page, size)));
        return "product_list_paging";
    }

    @GetMapping("/search-product")
    public String searchProduct(@RequestParam String searchParam, ModelMap model) {
        model.addAttribute("products", productService.findProductByText(searchParam));
        return "product_list";
    }

    @GetMapping("/search-product-price")
    public String searchProductPrice(@RequestParam(defaultValue = "0.0") Double lower, @RequestParam(defaultValue = "1000") Double upper, ModelMap model) {
        model.addAttribute("products", productService.findProductByPrice(lower, upper));
        return "product_list";
    }
}
