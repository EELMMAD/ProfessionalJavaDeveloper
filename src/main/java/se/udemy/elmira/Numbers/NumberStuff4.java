package se.udemy.elmira.Numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NumberStuff4 {  //Using BigDecimal
    public static void main(String[] args) {
        System.out.println(new BigDecimal(".3145683").add(new BigDecimal(5.321)));
        System.out.println(new BigDecimal(".3145683").subtract(new BigDecimal(5.321)));
        System.out.println(new BigDecimal(".3145683").multiply(new BigDecimal(5.321)));

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);// Precision -> 5-> meaningful digits after . not including zeros
        System.out.println(new BigDecimal(".3145683").divide(new BigDecimal(5.321), mc));
        //System.out.println(new BigDecimal("49").sqrt(mc));
        //System.out.println(new BigDecimal(".054798").sqrt(mc));
        System.out.println(new BigDecimal("7").max(new BigDecimal("13"))); //13
        System.out.println(new BigDecimal("7").min(new BigDecimal("13"))); //7
        System.out.println(new BigDecimal("13").remainder(new BigDecimal("8"))); //13 % 8 = 5    % modulo

        System.out.println("--------------");
        System.out.println(new BigDecimal("1").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("4").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("5").remainder(new BigDecimal("2")));
    }
}
