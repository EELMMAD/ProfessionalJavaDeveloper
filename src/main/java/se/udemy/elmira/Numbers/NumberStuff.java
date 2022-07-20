package se.udemy.elmira.Numbers;

public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 127;
        boolean myFlag = true;   //0 -> false      1 -> true
        short myBigShort = 32767;
        char myChar = '갱'; //gang
        char myA = 'A';  //65
        char biggerShort = 64000;
        double myDouble = 3.141592;
        float myFloat = 3.141592f;

        byte anotherByte = 0x1f;  //hexadecimal
        int anotherInt = 0b11;  //binary  3
        int int1 = 0b01 | 0b10;  // 1 + 2 = 3
        int int2 = 1 | 2; //1 + 2 = 3
        int int3 = 1 | 2 | 4;  //1 + 2 + 4 = 7

        int int4 = 0b01 | 0b10 | 0b100; //1 + 2 + 4 = 7

        //192.168.1.1 = IP Address
        //Netmask / network mask
        //5.5.5.3
        // 0b0101 0b0101 0b0101 0b0011 - 0101 0101 0101 0011
        // 1111 1111 0000 0000
        // network mask     Host address


        System.out.println(myByte);

        NumberStuff myInstance = new NumberStuff();
        System.out.println(anotherInt);
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4 & 4);  //And we want to know if the fourth place is, which is here is on.
        System.out.println(int4 & 0x04);

        int int5 = 0b01 | 0b10 | 0b000;
        System.out.println(int5 & 0x04);
    }
}
