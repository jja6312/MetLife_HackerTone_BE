package jpa.core.products.controller.dto;

import lombok.Getter;

@Getter
public class ResponseProductId {
    private String username;
    private String productFeature;

    public ResponseProductId(String username, String productFeature) {
        this.username = username;
        this.productFeature = productFeature;
    }
}
