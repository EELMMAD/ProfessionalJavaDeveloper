package se.udemy.elmira.Numbers.exercise;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;

public class Ex7 {
    /*
    Write a function that takes a String input of “$12,345.83” and prints out that value divided
     by 32.19. It should return $383.53.
     */
    public static String calculate(String formattedMoney) throws ParseException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Number value = formatter.parse(formattedMoney);
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
        // Used MathContext.DECIMAL32 above so I wouldn't have to create one myself. Chose 32 instead of the others
        // because it was the smallest one, in terms of precision.
        return formatter.format(result);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(calculate("$12,345.83"));
    }
}
