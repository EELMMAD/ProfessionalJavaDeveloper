package se.udemy.elmira.Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberStuff5 {  //More on BigDecimal & BigInteger
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(3.141592f);
        byte b = num1.byteValue();    //float -> byte   stripped off the fractional part
        System.out.println(b);

        System.out.println("--------");
        //if we were to initialize this big decimal with a number that is outside
        // of the range or beyond the range of a byte:  byet ->  -128 ... 127
        BigDecimal num2 = new BigDecimal("1024");
        byte myByte = num2.byteValue();
        System.out.println(myByte);

        System.out.println("--------");
        BigDecimal num3 = new BigDecimal("1024");
        System.out.println(num3.doubleValue());   //1024.0


        System.out.println("--------");
        //  So the whole point of big integer is that it is capable of representing integers much larger than any
        //of the other primitive data types for numbers.
        BigInteger mtInt = new BigInteger("1234563829382938");
        //3.141592 -> 3141592
    }
}
