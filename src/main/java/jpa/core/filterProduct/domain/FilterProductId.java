package jpa.core.filterProduct.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FilterProductId implements Serializable {

    @Column(name = "age_group")
    private Integer ageGroup;

    @Column
    private String gender;

    @Column(name = "product_id")
    private Long productId;
}
