package se.udemy.elmira.Numbers;

public class MathStuff2 {          //Standard math functions
    public static void main(String[] args) {
        System.out.println(Math.abs(-5)); //5

        //Math.ceil() -> round up to an integer
        System.out.println(Math.ceil(5.0)); //5.0
        System.out.println(Math.ceil(5.4)); //6.0
        System.out.println(Math.ceil(5.6)); //6.0
        System.out.println(Math.ceil(5.01)); //6.0


        System.out.println("--------");
        //Math.floor() -> down to an integer  (down to the floor)
        System.out.println(Math.floor(5.0)); //5.0
        System.out.println(Math.floor(5.4)); //5.0
        System.out.println(Math.floor(5.6)); //5.0
        System.out.println(Math.floor(5.01)); //5.0
        System.out.println(Math.floor(5.999)); //5.0


         System.out.println("--------");
         int num1 = 3;
         int num2 = 5;
        System.out.println(Math.min(num1, num2));  //3


          System.out.println("--------");                
          int num3 = 3;
          int num4 = 5;
         System.out.println(Math.max(num1, num2));  //5


        System.out.println(Math.pow(2, 3));  //8

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());


        //Random between zero and 10
        System.out.println(Math.random() * 10);
        System.out.println((int)(Math.random() * 10)); 
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 10));


        //after 5.5 it rounds up
        System.out.println(Math.round(5.0));    //5
        System.out.println(Math.round(5.2));    //5
        System.out.println(Math.round(5.4));    //5
        System.out.println(Math.round(5.5));    //6
        System.out.println(Math.round(5.7));    //6
        System.out.println(Math.round(5.8));    //6
        System.out.println(Math.round(5.999));  //6

        System.out.println(Math.sqrt(4));   //2.0
        System.out.println(Math.sqrt(81));   //9.0

        System.out.println(Math.PI);
        System.out.println(Math.E);     //Euler's number 2.7

    }
}
