package jpa.core.specialContact.dto;

import jpa.core.products.domain.Product;
import jpa.core.specialContact.domain.SpecialContact;

public class RequestInsuracneCreate {

    private String birth;
    private String gender;
    private Long productId;
    private String paymentPeriod;
    private String paymentAge;

    public RequestInsuracneCreate(String birth, String gender, Long productId, String paymentPeriod,
        String paymentAge) {
        this.birth = birth;
        this.gender = gender;
        this.productId = productId;
        this.paymentPeriod = paymentPeriod;
        this.paymentAge = paymentAge;
    }

    public SpecialContact toEntity(Long productId, String paymentPeriod,
        String paymentAge) {

        return SpecialContact.builder()
            .paymentPeriod(paymentPeriod)
            .paymentAge(paymentAge)
            .build();
    }
}
