package jpa.core.service;

import jpa.core.filterProduct.domain.FilterProduct;
import jpa.core.filterProduct.repository.FilterProductRepository;
import jpa.core.filterProduct.service.FilterProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class FilterProductServiceTest {

    private FilterProductService filterProductService;

    private FilterProductRepository filterProductRepository = mock(FilterProductRepository.class);

    @BeforeEach
    void setUp() {
        FilterProduct filterProduct = FilterProduct.builder()
            .productId(1L)
            .ageGroup(10)
            .gender("여자")
            .recommendRank(1)
            .build();

        filterProductService = new FilterProductService(filterProductRepository);

        given(filterProductRepository.findAll()).willReturn(List.of(filterProduct));
    }
}
