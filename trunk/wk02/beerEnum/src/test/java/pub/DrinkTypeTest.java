/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pub;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import pub.Beer;

/**
 *
 * @author Warglaive
 */
public class DrinkTypeTest {

    @Test
    public void drinkSizeTesting() {
        //select large beer
        Beer beer = new Beer(DrinkType.LARGE);
        //get the actual type from the Beer object.
        DrinkType actual = beer.getType();
        //set expected type
        DrinkType expected = DrinkType.LARGE;
        //test if both are equal
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testEnumValuesCount() {
        int expectedTypesCount = 3;
        assertThat(DrinkType.LARGE.getTypesCount()).isEqualTo(expectedTypesCount);
    }
}
