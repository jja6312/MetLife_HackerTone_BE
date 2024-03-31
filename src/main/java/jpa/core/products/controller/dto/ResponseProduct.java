package jpa.core.products.controller.dto;

import jpa.core.products.domain.Product;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ResponseProduct {
    private Long id;
    private String username;
    private String productFeature;

    public ResponseProduct(Long id, String username, String productFeature) {
        this.id = id;
        this.username = username;
        this.productFeature = productFeature;
    }

    public ResponseProduct(Product product) {
        this.id = product.getId();
        this.username = product.getName();
        this.productFeature = product.getProductFeature();
    }

}
