package jpa.core.filterProduct.repository;

import jpa.core.filterProduct.domain.FilterProduct;
import jpa.core.filterProduct.domain.FilterProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilterProductRepository extends JpaRepository<FilterProduct, FilterProductId> {

    List<FilterProduct> findAll();

    @Query(value = """
            select
                p.id as id
                , p.name as name
            from filter_product fp
            join products p
            on fp.gender = :gender
            and fp.age_group = :ageGroup
            and fp.product_id = p.id
            """, nativeQuery = true)
    List<ProductInterface> findProductByGenderAndAgeGroup(@Param("gender") String gender, @Param("ageGroup") Integer ageGroup);
}
