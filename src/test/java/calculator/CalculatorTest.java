package calculator;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

    CalculatorService caluclatronix = new Calculator();

    @Test
    void isAddCorrect() {
        assertEquals(caluclatronix.add(new BigDecimal(10), new BigDecimal(6)).compareTo(new BigDecimal(16)), 0);

    }
}
