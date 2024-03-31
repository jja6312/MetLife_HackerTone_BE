package jpa.core.filterProduct.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Table(name = "filter_product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FilterProduct {

    @EmbeddedId
    private FilterProductId id;

    private Integer recommendRank;

    @Builder
    public FilterProduct(Integer ageGroup, String gender, Long productId, Integer recommendRank) {
        this.id = new FilterProductId(ageGroup, gender, productId);
        this.recommendRank = recommendRank;
    }
}
