package se.udemy.elmira.Numbers;

public class NumberStuff7 { //More on numeric wrapper classes
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        /*
        double amount = Double.parseDouble("345.12");
        boolean flag = Boolean.parseBoolean("true");
        System.out.println(flag);
         */
        System.out.printf("You will be %d years of age in 15 years.%n", age + 15);
    }
}
