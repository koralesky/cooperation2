package calculator;

import java.math.BigDecimal;

public interface CalculatorService {

    BigDecimal add(BigDecimal x, BigDecimal y);
    BigDecimal substract(BigDecimal x, BigDecimal y);
    BigDecimal divide(BigDecimal x, BigDecimal y);
    BigDecimal multiply(BigDecimal x, BigDecimal y);
    BigDecimal input();
    BigDecimal output();

}
