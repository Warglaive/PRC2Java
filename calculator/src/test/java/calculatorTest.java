/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    //@DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        calculator calculatorx = new calculator();
        assertEquals(2, calculatorx.add(1, 1), "1 + 1 should equal 2");

    }

    @Test
    public void testAssertThatEqual() {
        assertThat("123", is("123"));
    }
}
