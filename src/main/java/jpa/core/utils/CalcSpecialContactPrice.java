package jpa.core.utils;


import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

@Component
public class CalcSpecialContactPrice {


    // 한화 생명 기준
    public long Calculation(long price, String birth, String gender){

        long calcPrice = price;

        if (StringUtils.equals(gender,"female")){
            calcPrice = (long)(calcPrice*0.8);
        }
        if (Integer.parseInt(birth) < 19840323){
            calcPrice = (long)(calcPrice*1.1);
        }
        if (Integer.parseInt(birth) < 19740323){
            calcPrice = (long)(calcPrice*1.2);
        }
        if (Integer.parseInt(birth) < 19640323){
            calcPrice = (long)(calcPrice*1.3);
        }

        return calcPrice;
    }
}
