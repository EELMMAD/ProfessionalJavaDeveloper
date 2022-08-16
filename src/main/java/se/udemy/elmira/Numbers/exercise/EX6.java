package se.udemy.elmira.Numbers.exercise;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class EX6 {
    /*
    Write a function that takes a String like “149.32” and formats it as money for wherever you
live. So, if you live in the United States, it would return “$149.32”, Korea = ₩149, France/
EU = 149,32 €, etc.
     */
    public static String formatMoney(String money) {
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format(new BigDecimal(money));
    }

    public static void main(String[] args) {
        System.out.println(formatMoney("149.32"));
    }
}
