package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeTest {

    @Test
    void testGiveCurrencyToExchange(){
        //Given
        Exchange exchangeOffice  = new Exchange();

        //When
        BigDecimal amount1 = BigDecimal.valueOf(100);
        BigDecimal amount2 = BigDecimal.valueOf(-100);
        BigDecimal amount3 = BigDecimal.valueOf(0);
        Double amount4 = 100d;
        Integer amount5 = 100;
        Long amount6 = 100L;


        //Then
        assertEquals(true,exchangeOffice.giveCurrencyToExchange(amount1)); //czy kantor przyjmuje  kwotę, gdy wartość jest dodatnia?
        assertEquals(false, exchangeOffice.giveCurrencyToExchange(amount2)); //czy kantor przyjmuje  kwotę, gdy wartość jest ujemna?
        assertEquals(false,exchangeOffice.giveCurrencyToExchange(amount3)); //czy kantor przyjmuje  kwotę, gdy wartość jest równa 0?
        assertEquals(true,exchangeOffice.giveCurrencyToExchange(amount4)); //czy kantor przyjmuje  kwotę, gdy wartość jest typu Double?
        assertEquals(true,exchangeOffice.giveCurrencyToExchange(amount5)); //czy kantor przyjmuje  kwotę, gdy wartość jest typu Integegr?
        assertEquals(true,exchangeOffice.giveCurrencyToExchange(amount6)); //czy kantor przyjmuje  kwotę, gdy wartość jest typu Long?
    }

    @Test
    void shouldNotGetCurrencyAfterConversionWhenAmountNotGiven(){
        //Given
        Exchange exchangeOffice;

        //When
        exchangeOffice  = new Exchange();

        //Then
        assertNull(exchangeOffice.GetCurrencyAfterConversion());
    }

    @Test
    void shouldNotGetCurrencyAfterConversionWhenAmountIsGiven(){
        //Given
        Exchange exchangeOffice  = new Exchange();

        //When
        BigDecimal amount = BigDecimal.valueOf(100);
        BigDecimal rate = BigDecimal.valueOf(4.1234);
        exchangeOffice.giveCurrencyToExchange(amount);
        exchangeOffice.giveCurrencyToExchange(rate);

        //Then
        assertEquals(BigDecimal.valueOf(412.34), exchangeOffice.getCurrencyAfterConversion(rate));
    }
}