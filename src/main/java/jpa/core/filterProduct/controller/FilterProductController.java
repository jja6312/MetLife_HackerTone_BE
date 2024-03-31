package jpa.core.filterProduct.controller;

import jpa.core.filterProduct.controller.dto.RequestProductRecommend;
import jpa.core.filterProduct.controller.dto.ResponseProduct;
import jpa.core.filterProduct.controller.dto.ResponseRecommendProduct;
import jpa.core.filterProduct.service.FilterProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FilterProductController {

    private final FilterProductService filterProductService;

    @GetMapping("/products/recommend")
    public ResponseRecommendProduct getRecommendProducts(RequestProductRecommend request) {

        List<ResponseProduct> products = filterProductService.findByGenderAndAgeGroup(request)
                .stream().map(ResponseProduct::new)
                .toList();

        return new ResponseRecommendProduct(request, products);
    }
}
