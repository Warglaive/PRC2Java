package validator;

import static java.lang.Character.DECIMAL_DIGIT_NUMBER;
import static java.lang.Character.LOWERCASE_LETTER;
import static java.lang.Character.UPPERCASE_LETTER;
import static java.lang.Character.getType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

/**
 * Password validator using lambdas and maps.
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public class Validator {

    private String password;

    public Validator(String password) throws IllegalArgumentException {
        emptyPasswordCheck(password);
        this.password = password;
    }

    public void emptyPasswordCheck(String password1) throws IllegalArgumentException {
        if (password1.isEmpty()) {
            throw new IllegalArgumentException("Password can NOT be empty");
        }
    }

    //I will validate everything in this method, because of "Quality" task requirements.
    public boolean validate(String password) {
        boolean isValid = true;
        if (!atLeastTenCharsLongCheck(password)) {
            isValid = false;
        } else if (!atLeastOneUppercaseCheck(password)) {
            isValid = false;
        } else if (!atLeastOneLowercaseCheck(password)) {
            isValid = false;
        }
        return isValid;
        //Start with contain at least one digit test and implement
    }

    public boolean atLeastTenCharsLongCheck(String passwordInput) {
        if (passwordInput.length() >= 10) {
            return true;
        }
        return false;
    }

    public boolean atLeastOneUppercaseCheck(String input) {
        for (char letter : input.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public boolean atLeastOneLowercaseCheck(String input) {
        for (char letter : input.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public boolean atLeastOneDigitCheck(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean atLeastOneSpecialCharCheck(String input) {
        for (char c : input.toCharArray()) {
            switch (Character.getType(c)) {
                case Character.MODIFIER_SYMBOL:
                    return true; // ` ^
                case Character.DASH_PUNCTUATION:
                    return true; // -
                case Character.MATH_SYMBOL:
                    return true; // = ~ + | < >
                case Character.OTHER_PUNCTUATION:
                    return true; // !@#%&*;':",./?
                case Character.START_PUNCTUATION:
                    return true; // ( [ {
                case Character.END_PUNCTUATION:
                    return true; // ) ] }
            }
        }
        return false;
    }

    public String getPassword() {
        return this.password;
    }
}
