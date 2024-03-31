package jpa.core.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.List;
import jpa.core.products.domain.Product;
import jpa.core.products.repository.ProductRepository;
import jpa.core.products.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.given;

@DisplayName("ProductService")
class ProductServiceTest {

    private ProductService productService;

    private ProductRepository productRepository = mock(ProductRepository.class);

    @BeforeEach
    void setUp() {
        Product product = Product.builder()
            .name("product1")
            .specialContacts(null)
            .build();

        productService = new ProductService(productRepository);

        given(productRepository.findAll()).willReturn(List.of(product));
    }

    @Test
    public void getProductAll() throws Exception {
        List<Product> products = productService.findAll();

        assertThat(products).isNotEmpty();

        assertThat(products.get(0).getName()).isEqualTo("product1");
    }

}
