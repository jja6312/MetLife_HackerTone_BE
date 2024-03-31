package jpa.core.user.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void createUser() throws Exception {
        User user = User.builder()
            .gender("남성")
            .birth("1995-01-01")
            .build();

        assertThat(user.getGender()).isEqualTo("남성");
        assertThat(user.getBirth()).isEqualTo("1995-01-01");
    }
}
