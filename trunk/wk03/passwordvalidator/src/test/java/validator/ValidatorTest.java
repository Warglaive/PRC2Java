package validator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test validator with Parameterized test.
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public class ValidatorTest {

    private Validator validator;
    private String validPassword = "Ad5+pouhjf";

    @Test
    @BeforeEach
    public void initializeValidatorTest() {
        this.validator = new Validator(this.validPassword);
        assertThat(validator).isInstanceOf(Validator.class);
    }

    @Test
    public void emptyPasswordCheckTest() {
        String emptyPass = "";
        assertThatThrownBy(() -> {
            this.validator = new Validator(emptyPass);
        }, "123")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Password can NOT be empty");
    }

    @Test
    public void getPasswordTest() {
        this.validator.getPassword();
        assertThat(this.validPassword).isEqualTo(this.validator.getPassword());
    }

    @Test
    public void atLeastTenCharsLongCheckTest() {
        //String InvalidPass = "123";
        assertThat(this.validator.atLeastTenCharsLongCheck(this.validPassword)).isTrue();
    }

    @Test
    public void atLeastOneUppercaseCheckTest() {
        assertThat(this.validator.atLeastOneUppercaseCheck(this.validPassword)).isTrue();
        //String InvalidPass = "123";
    }

    @Test
    public void atLeastOneLowercaseCheckTest() {
        assertThat(this.validator.atLeastOneLowercaseCheck(this.validPassword)).isTrue();
        //String InvalidPass = "123";
    }

    @Test
    public void atLeastOneDigitCheckTest() {
        assertThat(this.validator.atLeastOneDigitCheck(this.validPassword)).isTrue();
    }

    @Test
    public void atLeastOneSpecialCharCheckTest() {
        assertThat(this.validator.atLeastOneSpecialCharCheck(this.validPassword)).isTrue();
    }
}
