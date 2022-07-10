package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex7;

import java.time.Year;

public class Car {
       /*
       7. Model a Car, create an instance of it, pass it to System.out.println() so that its properties will
           be printed.
        */
    private String make;
    private String model;
    private Year modelYear;

    public Car(String make, String model, Year modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
    }

    /* The key is to generate a toString() method that prints all the properties */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "X", Year.of(2022));
        System.out.println(myCar);
    }
}
