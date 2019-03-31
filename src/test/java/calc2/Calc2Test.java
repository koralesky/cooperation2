package calc2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Calc2Test {
    private Calc2 calc = null;
     Calc2Service service = mock(Calc2Service.class);


    @BeforeEach
    void setUp() {
        calc = new Calc2(service);
    }

    @Test
    public void testAddition(){
        when(service.add(3,3)).thenReturn((double) 6);
        assertEquals(6, calc.perform_1(3, 3));
        verify(service, atLeastOnce()).add(3,3);
    }

    @Test
    public void testSubstraction(){
        when(service.substract(8,3)).thenReturn((double) 5);
        assertEquals(5, calc.perform_2(8,3));
        verify(service, atLeastOnce()).substract(8,3);
    }

    @Test
    void testMultiply() {
        when(service.multiply(5,4)).thenReturn((double) 20);
        assertEquals(20, calc.perform_3(5, 4));
        verify(service, atLeastOnce()).multiply(5,4);

    }

    @Test
    void testDivide(){
        when(service.divide(15,3)).thenReturn((double) 5);
        assertEquals(5, calc.perform_4(15,3));
        verify(service, atMost(10)).divide(15,3);
    }
}
