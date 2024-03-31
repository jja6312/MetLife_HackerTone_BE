package jpa.core.filterProduct.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class RequestProductRecommend {

    private LocalDate birth;
    private String gender;

}
