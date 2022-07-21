package se.udemy.elmira.Numbers;

public class Area {  //Area of Circle  A=πr2
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(3));
    }

    /**
     * This method calculate the area of a circle
     * It uses the formula: area = PI * radius^2
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius){
        //A = PI * r^2
        return Math.PI * Math.pow(radius, 2);
    }
}
