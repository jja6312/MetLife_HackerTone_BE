package jpa.core.domain;

import static org.assertj.core.api.Assertions.assertThat;

import jpa.core.specialContact.domain.SpecialContact;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpecialContactTest {

    @DisplayName("특약상품 생성")
    @Test
    public void createSpecialContact() {
        SpecialContact specialContact = SpecialContact.builder()
            .name("특약상품1")
            .category("특약")
            .paymentAge("80")
            .build();


        assertThat(specialContact.getName()).isEqualTo("특약상품1");
        assertThat(specialContact.getCategory()).isEqualTo("특약");
        assertThat(specialContact.getPaymentAge()).isEqualTo("80");
    }
}
