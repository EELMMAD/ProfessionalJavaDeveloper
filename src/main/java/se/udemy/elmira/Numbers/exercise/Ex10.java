package se.udemy.elmira.Numbers.exercise;

import java.text.DecimalFormat;

public class Ex10 {
    /*
    Use instances of DecimalFormat to perform the same
     conversions in the table above.
     */
    public static void main(String[] args) {
        System.out.println(new DecimalFormat("$,###.##").format(123456.783)); // you could also do "$#,###.##"
        System.out.println(new DecimalFormat(",###.###;(#)").format(-9876.32532));
        System.out.println(new DecimalFormat("0.######E00f").format( 23.19283928394829182)); // not possible to get the plus sign in "...e+01f" with format string
        System.out.println(new DecimalFormat("0000000000").format(123456));
        System.out.println(new DecimalFormat(",###.#;-").format(-9876.35532));
    }
}
