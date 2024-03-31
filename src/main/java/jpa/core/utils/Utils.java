package jpa.core.utils;

import java.time.LocalDate;
import java.time.Period;

public class Utils {

    public static Integer birthToAgeGroup(LocalDate birth) {
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();

        // 생년월일을 사용하여 현재 나이 계산
        Period agePeriod = Period.between(birth, currentDate);
        int age = agePeriod.getYears();

        // 나이대 계산
        // 십의 자리 기준으로 나이대 반환
        return age / 10 * 10;
    }
}
