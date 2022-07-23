package se.udemy.elmira.Numbers;

import java.math.BigDecimal;

public class CompoundInterestCalc { //Calculating compound interest
    public static BigDecimal calculate(String principle, String rate, int period, String contribution){
       // Balance(Y) = P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); //(1 + r) ^ period
        BigDecimal c = a.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal d = c.divide(new BigDecimal(rate)); // ((1 + r)^Y - 1) / r
        BigDecimal e = d.multiply(new BigDecimal(contribution)); //c[ ((1 + r)^Y - 1) / r]
        BigDecimal f = a.multiply(new BigDecimal(principle)); //(1 + r) ^ period * principle
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) {
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", ".08", 10, "1000");
        System.out.println(balance);
    }
}
