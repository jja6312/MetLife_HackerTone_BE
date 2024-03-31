package jpa.core.products.service;

import java.util.List;
import java.util.Optional;

import jpa.core.products.domain.Product;
import jpa.core.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(long productId) {
        return productRepository.findById(productId);
    }
}
