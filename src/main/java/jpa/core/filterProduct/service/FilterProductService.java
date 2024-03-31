package jpa.core.filterProduct.service;

import jpa.core.filterProduct.controller.dto.RequestProductRecommend;
import jpa.core.filterProduct.repository.FilterProductRepository;
import jpa.core.products.domain.Product;
import jpa.core.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class FilterProductService {

    private final FilterProductRepository filterProductRepository;

    public List<Product> findByGenderAndAgeGroup(RequestProductRecommend request) {
        return filterProductRepository.findProductByGenderAndAgeGroup(request.getGender(), Utils.birthToAgeGroup(request.getBirth()))
                .stream().map(productInterface ->
                        new Product(productInterface.getId(), productInterface.getName(), null, null))
                .toList();
    }
}
