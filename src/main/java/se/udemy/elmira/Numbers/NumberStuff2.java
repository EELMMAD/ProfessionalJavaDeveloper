package se.udemy.elmira.Numbers;

import java.security.SecureRandom;
import java.util.Random;

public class NumberStuff2 {   //More Random Numbers
    public static void main(String[] args) {
        Random random = new Random(987234); //supplying the seed
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        System.out.println("-------");
        Random random1 = new Random();
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());

        System.out.println("-------");
        SecureRandom random2 = new SecureRandom();
        System.out.println(random2.nextInt(10));
        System.out.println(random2.nextInt(10));
        System.out.println(random2.nextInt(10));
        System.out.println(random2.nextInt(10));
        System.out.println(random2.nextInt(10));
    }
}
