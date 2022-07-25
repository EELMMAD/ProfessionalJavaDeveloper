package se.udemy.elmira.Numbers;

public class NumberStuff6 {   //Numeric Wrapper Classes
    public static void main(String[] args) {
        int num1 = 7;
        Integer num1B = Integer.valueOf(num1); //auto-boxing  -->  it's putting our number in a box
        //  Double  myDouble = Double.valueOf(2343.12);
        Double myDouble = Double.valueOf("2343.12");
        // Float myFloat = Float.valueOf(23.23f);
        Float myFloat = Float.valueOf("23.23f");
        Byte myByte = Byte.valueOf("23");  // attention "23" is String
        storeData(num1B);
    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj) {
        //Do something with obj
    }
}
