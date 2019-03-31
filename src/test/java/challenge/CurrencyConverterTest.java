package challenge;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    private Double PLNEUR = 4.3003;
    private Double D_AMOUNT_TO_CONVERT = 100d;
    private Integer I_AMOUNT_TO_CONVERT = 100;
    private Long L_AMOUNT_TO_CONVERT = 100L;

    @Test
    void shouldInputValueBeBigDecimal() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();

        //When
        BigDecimal amount = BigDecimal.valueOf(D_AMOUNT_TO_CONVERT);
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //Then
        assertEquals(BigDecimal.valueOf(D_AMOUNT_TO_CONVERT * PLNEUR), currencyConverter.convert(amount, rate));
    }

    @Test
    void shouldInputValueBeDouble() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        Double amount = D_AMOUNT_TO_CONVERT;

        //Then
        assertEquals(BigDecimal.valueOf(D_AMOUNT_TO_CONVERT * PLNEUR), currencyConverter.convert(amount, rate));
    }

    @Test
    void shouldInputValueBeInteger() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        Integer amount = I_AMOUNT_TO_CONVERT;

        //Then
        assertEquals(BigDecimal.valueOf(I_AMOUNT_TO_CONVERT * PLNEUR), currencyConverter.convert(amount, rate));
    }

    @Test
    void shouldInputValueBeLong() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        Long amount = L_AMOUNT_TO_CONVERT;

        //Then
        assertEquals(BigDecimal.valueOf(L_AMOUNT_TO_CONVERT * PLNEUR), currencyConverter.convert(amount, rate));
    }

    @Test
    void shouldNotInputValueBeString() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        String amount = "OddawajMiKase";

        //Then
        assertEquals(null, currencyConverter.convert(amount, rate));
        assertSame("The source amount should be a decimal number", currencyConverter.getMessage());
    }


    @Test
    void shouldNotInputValueBeZero() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        BigDecimal amount = BigDecimal.valueOf(0);

        //Then
        assertEquals(null, currencyConverter.convert(amount, rate));
        assertSame("The source amount should be a positive number", currencyConverter.getMessage());

    }

    @Test
    void shouldNotInputValueBeNegative() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);

        //When
        BigDecimal amount = BigDecimal.valueOf(-100);

        //Then
        assertEquals(null, currencyConverter.convert(amount, rate));
        assertSame("The source amount should be a positive number", currencyConverter.getMessage());

    }


    @Test
    void shouldNotConvertWhenRateValueNotGiven() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(PLNEUR);
        //When
        BigDecimal amount = BigDecimal.valueOf(D_AMOUNT_TO_CONVERT);

        //Then
        assertEquals(null, currencyConverter.convert(amount));
        assertEquals("The source rate must be given", currencyConverter.getMessage());

    }

    @Test
    void shouldNotConvertWhenRateValueEqualsZero() { //konwertuje wartosc, gdy
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(0);

        //When
        BigDecimal amount = BigDecimal.valueOf(D_AMOUNT_TO_CONVERT);

        //Then
        assertEquals(null, currencyConverter.convert(amount, rate));
        assertSame("The source rate must be a positive number", currencyConverter.getMessage());

    }

    @Test
    void shouldConvertWhenRateValueIsNegative() { //konwertuje wartosc, gdy
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(-4.0);

        //When
        BigDecimal amount = BigDecimal.valueOf(D_AMOUNT_TO_CONVERT);

        //Then
        assertNull(currencyConverter.convert(amount, rate));
        assertSame("The source rate must be a positive number", currencyConverter.getMessage());

    }

    @Test
    void shouldNotConvertWhenRateValueIsString() {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        String rate = "zJava";

        //When
        BigDecimal amount = BigDecimal.valueOf(D_AMOUNT_TO_CONVERT);

        //Then
        assertNull(currencyConverter.convert(amount, rate));
        assertSame("The source rate must be a positive number", currencyConverter.getMessage());

    }
}