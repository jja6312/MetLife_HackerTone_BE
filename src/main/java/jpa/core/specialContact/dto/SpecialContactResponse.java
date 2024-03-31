package jpa.core.specialContact.dto;

import jpa.core.products.domain.Product;
import jpa.core.specialContact.domain.SpecialContact;
import lombok.Getter;

@Getter
public class SpecialContactResponse {

    private final String name;

    private final Product products;

    private final String category;

    private final String paymentPeriod;

    private final String paymentAge;

    private final Integer guaranteeAmount;

    private final Integer monthPaymentAmount;

    public SpecialContactResponse(SpecialContact specialContact) {
        this.name = specialContact.getName();
        this.products = specialContact.getProducts();
        this.category = specialContact.getCategory();
        this.paymentPeriod = specialContact.getPaymentPeriod();
        this.paymentAge = specialContact.getPaymentAge();
        this.guaranteeAmount = specialContact.getGuaranteeAmount();
        this.monthPaymentAmount = specialContact.getMonthPaymentAmount();
    }
}
