package jpa.core.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import jpa.core.products.domain.Product;
import jpa.core.specialContact.domain.SpecialContact;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

    @DisplayName("상품 생성")
    @Test
    public void createProduct() {
        SpecialContact specialContact = SpecialContact.builder()
            .name("특약상품1")
            .category("특약")
            .paymentAge("80")
            .build();

        SpecialContact specialContact2 = SpecialContact.builder()
            .name("특약상품1")
            .category("특약")
            .paymentAge("80")
            .build();

        Product product = Product.builder()
            .name("상품1")
            .specialContacts(List.of(specialContact))
            .build();

        assertThat(product.getName()).isEqualTo("상품1");
    }
}
