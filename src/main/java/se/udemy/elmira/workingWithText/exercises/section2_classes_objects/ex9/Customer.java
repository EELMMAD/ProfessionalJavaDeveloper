package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex9;

public class Customer {
      /*
       9. How can you ensure that a Customer instance can not be created without a name and an
          initial deposit?
        */
      private String name;
      private float deposit;

    public Customer(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }
    public static void main(String[] args) {
        Customer customer = new Customer("Frank", 1234.83f);
    }
}
