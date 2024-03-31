package jpa.core.utils;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalcSpecialContactPriceTest {

    @Test
    public void testCalculationWithFemaleAndBirthAfter19840323() {
        CalcSpecialContactPrice calculator = new CalcSpecialContactPrice();
        long result = calculator.Calculation(1000, "19900101", "female");
        assertThat(result).isEqualTo((long)800 );

    }

    @Test
    public void testCalculationWithMaleAndBirthAfter19740323() {
        CalcSpecialContactPrice calculator = new CalcSpecialContactPrice();
        long result = calculator.Calculation(1000, "19800101", "male");
        assertThat(result).isEqualTo((long)(1000*1.1));
    }

    @Test
    public void testCalculationWithBirthAfter19640323() {
        CalcSpecialContactPrice calculator = new CalcSpecialContactPrice();
        long result = calculator.Calculation(1000, "19700101", "male");
        assertThat(result).isEqualTo((long)1000*1.1*1.2 );
    }

    @Test
    public void testCalculationWithDefaultValues() {
        CalcSpecialContactPrice calculator = new CalcSpecialContactPrice();
        long result = calculator.Calculation(1000, "19500101", "male");
        assertThat(result).isEqualTo((long)1000*1.1*1.2*1.3 );

    }
}