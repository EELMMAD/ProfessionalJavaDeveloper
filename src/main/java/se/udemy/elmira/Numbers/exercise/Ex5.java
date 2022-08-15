package se.udemy.elmira.Numbers.exercise;

import java.util.Random;

public class Ex5 {
    /*
        . Make a method, next(), that can be called 10 times and generate a random integer between
    0 & 10 (non-inclusive). This method keep a running sum of all random numbers it generates
    and return that sum each time. If first time next() is called, it generates 5, and second time
    it’s called it generates 3, it should return 8 from the second call - for example.
     */

        private int sum = 0;

        public int next() {
            this.sum += new Random().nextInt(10);
            return this.sum;
        }

        public static void main(String[] args) {
            Ex5 exercise5 = new Ex5();
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
            System.out.println(exercise5.next());
        }
    }

