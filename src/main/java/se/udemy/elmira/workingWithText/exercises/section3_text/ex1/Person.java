package se.udemy.elmira.workingWithText.exercises.section3_text.ex1;

public class Person {
        /*
        1. Model a Person with a first name and last name and ensure that even if the first name is
          entered all lowercase, it will be stored all uppercase.
         */

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName.toUpperCase(); // Here's the important part
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
}
