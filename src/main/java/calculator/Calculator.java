package calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator implements CalculatorService {
    static Scanner scanner = new Scanner(System.in);
    private BigDecimal x;
    private BigDecimal y;

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    @Override
    public BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    @Override
    public BigDecimal substract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }

    @Override
    public BigDecimal divide(BigDecimal x, BigDecimal y) {
        return x.divide(y);
    }

    @Override
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }

    @Override
    public BigDecimal input() {

        System.out.println("Podaj wartość");
        x = new BigDecimal(scanner.nextLine());
        return x;

    }

    @Override
    public BigDecimal output() {
        System.out.println(x);
        return x;
    }
}
