package money;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {

    Dollar cash, cash1, cash2, cash3, cash4;



    @BeforeEach
    void setUp() {

        cash = new Dollar(5);

    }

    @Test
    void testToString() {
        assertEquals(cash.toString(), "$5,00");
    }

    @Test
    void areDifferent() {

        cash1 = new Dollar(4);
        cash2 = new Dollar(10);
        cash3 = new Dollar(4);
        assertFalse(cash1.toString().contains(cash2.toString()));
        assertTrue(cash1.toString().contains(cash3.toString()));
        assertTrue(cash1.getCash()==cash3.getCash());
        assertFalse(cash1.getCash()==cash2.getCash());
        assertNotSame(cash1,cash3);

    }

    @Test
    void isMinusRight() {

        cash1 = new Dollar(4);
        cash2 = new Dollar(4);
        assertTrue(cash1.minus(cash2)==0);
        assertTrue(cash1.minus(cash2)!=4);
        assertEquals(cash1.minus(cash2), 0);

    }
}
