package se.udemy.elmira.Numbers;

public class MathStuff {
    public static void main(String[] args) {
        System.out.println(3 + 5 + 2 + 7);
        System.out.println(10 - 7);
        System.out.println(7 - 10); //-3
        System.out.println(7 - 10 + 3 - 9);  //-9
        System.out.println(7 * 4); //28
        System.out.println(8 / 4); //2
        System.out.println(64 / 8 / 4); //2
        System.out.println(8 * 8 / 8 / 4);
        System.out.println(7 / 4); //1

        System.out.println("-------");
        System.out.println(7f / 4); //1.75
        System.out.println(7 / 4f);  //1.75

        System.out.println("-------");
        //casting
        System.out.println((double) 7 / 4); //1.75
        System.out.println((float) 7 / 4); //1.75
        System.out.println(7 / (double) 4); //1.75
        System.out.println(7 / (float) 4); //1.75

        System.out.println((double) (7 / 4)); //1.0

        System.out.println("-------");
        int num1 = 7;
        int num2 = 4;
        System.out.println(num1 / num2); //1

        System.out.println(num1 / 4.0);  //1.75

        System.out.println("-------");
        double num3 = 7;
        float num4 = 4;
        System.out.println(num3 / num4); //1.75

        System.out.println("-------");
        System.out.println(2 + 3 * 5); //17
        System.out.println(2 + (3 * 5)); //17
        System.out.println(5 * 3 + 2); //17
        System.out.println(5 * (3 + 2)); //25
        System.out.println(5 * ((3d + 2d) / 10d)); //2.5
        System.out.println(4 % 2); //0
        System.out.println(5 % 2); //1

        System.out.println("-------");
        System.out.println(1 % 3); //1
        System.out.println(2 % 3); //2
        System.out.println(3 % 3); //0
        System.out.println(4 % 3); //1
        System.out.println(5 % 3); //2
        System.out.println(6 % 3); //0
        System.out.println(7 % 3); //1
        System.out.println(8 % 3); //2
        System.out.println(9 % 3); //0
        System.out.println(10 % 3); //1


        System.out.println("-------");
        int x = 1;
        System.out.println(x);    //1

        x += 4;  //x = x + 4;
        x += 4;
        x += 4;
        x += 4;
        x += 4;
        System.out.println(x);   //21


        System.out.println("-------");
        int y = 1;
        y++;       // y = y + 1;  OR    y+=1;
        System.out.println(y);  //2


        System.out.println("-------");
        int z = 1;
        System.out.println(z++); //1
        System.out.println(z); //2


        System.out.println("-------");
        int a = 1;
        System.out.println(a++); //1
        a++;
        System.out.println(a); //3


        System.out.println("-------");
        int b = 1;
        System.out.println(++b); //2
        System.out.println(b); //2


        System.out.println("-------");
        int c = 1;
        System.out.println(c);  //1
        c -= 1;
        System.out.println(c);   //0


        System.out.println("-------");
        int d = 1;
        System.out.println(d--);  //1
        System.out.println(d);   //0


        System.out.println("-------");
        int e = 1;
        System.out.println(--e);  //0
        System.out.println(e);   //0

        System.out.println("-------");
        boolean myFlag = true;
        System.out.println(myFlag);     //true
        System.out.println(!myFlag);   //false


        System.out.println("-------");
        boolean flag = true;
        System.out.println(flag);//true
        flag = !flag;
        System.out.println(flag); //false


    }
}