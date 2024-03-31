package jpa.core.filterProduct.controller.dto;

import jpa.core.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ResponseRecommendProduct {
    private String title;
    private List<ResponseProduct> products;

    public ResponseRecommendProduct(RequestProductRecommend request, List<ResponseProduct> products) {
        // TODO gender -> enum으로
        String gender = request.getGender();
        if ("male".equals(gender)) {
            gender = "남성";
        } else {
            gender = "여성";
        }
        this.title = Utils.birthToAgeGroup(request.getBirth()) + "대 " + gender + "분들의 인기 보험을 만나보세요";
        this.products = products;
    }
}
