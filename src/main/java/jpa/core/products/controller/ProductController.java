package jpa.core.products.controller;

import java.util.List;
import java.util.Optional;

import com.azure.core.annotation.QueryParam;
import jakarta.websocket.server.PathParam;
import jpa.core.products.controller.dto.RequestDetail;
import jpa.core.products.controller.dto.ResponseProduct;
import jpa.core.products.domain.Product;
import jpa.core.products.controller.dto.RequestProduct;
import jpa.core.products.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ResponseProduct> findAll() {
        return productService.findAll().stream().map(ResponseProduct::new).toList();
    }

    @GetMapping("/product/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Product> findById(@PathVariable("productId") long productId){
        Optional<Product> product = productService.findById(productId);
        return product;
    }
}
