package se.udemy.elmira.Numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {
    //£36,075.81   -->£
    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static BigDecimal calculate(String principle, String rate, int period, String contribution) throws ParseException {
       // Balance(Y) = P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]
            String rateAsPercent = percentFormatter.parse(rate).toString();
            BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); //(1 + r) ^ period
            BigDecimal c = a.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
            BigDecimal d = c.divide(new BigDecimal(rateAsPercent)); // ((1 + r)^Y - 1) / r
            BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString())); //c[ ((1 + r)^Y - 1) / r]
            BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principle).toString())); //(1 + r) ^ period * principle
            BigDecimal g = f.add(e);
            return g;
    }

    public static void main(String[] args) throws ParseException {
        // NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE); // 36 075,81 €   -->€
       // NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN); // ￥36,076  -->￥
        BigDecimal balance = CompoundInterestCalc.calculate("$25,300", "8%", 10, "$7,500");
        System.out.println(moneyFormatter.format(balance));
    }
}
