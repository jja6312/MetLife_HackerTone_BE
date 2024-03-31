package jpa.core.filterProduct.controller.dto;

import jpa.core.products.domain.Product;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseProduct {

    private Long productId;
    private String title;

    public ResponseProduct(Product product) {
        this.productId = product.getId();
        this.title = product.getName();
    }
}
