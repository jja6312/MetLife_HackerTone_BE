package jpa.core.specialContact.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jpa.core.products.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

@AllArgsConstructor
@Entity
@Table(name = "special_contacts")
@NoArgsConstructor()
@Getter
public class SpecialContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product products;

    private String category;

    private String paymentPeriod;

    private String paymentAge;

    private Integer guaranteeAmount;

    private Integer monthPaymentAmount;

    @Builder
    public SpecialContact(String name, String category, String paymentPeriod, String paymentAge,
        Integer guaranteeAmount, Integer monthPaymentAmount, Product product) {
        this.name = name;
        this.category = category;
        this.paymentPeriod = paymentPeriod;
        this.paymentAge = paymentAge;
        this.guaranteeAmount = guaranteeAmount;
        this.monthPaymentAmount = monthPaymentAmount;
        this.products = product;
    }

    public Integer SumMonthPaymentAmount(Integer monthPaymentAmount) {
        this.monthPaymentAmount += monthPaymentAmount;
        return monthPaymentAmount;
    }
}
