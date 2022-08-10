package se.udemy.elmira.workingWithText.exercises.section3_text;

public class Ex5 {
    /*
    Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
    same format, can you write code that can parse and print out:
    1. The building number: 12345
    2. The Street: “Big St.”
    3. City: “Alphabet City”
    4. State: “CA”
    5. Postal Code: 90210
     */
/*
    public static void main(String[] args) {
        String address = "12345 Big St., Alphabet City, CA 90210";

        String buildingNumber = address.split(" ")[0];
        String street = findStreet(address);
        String city = findCity(address);
        String state = findState(address);
        String postCode = findPostCode(address);

        System.out.println(buildingNumber);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(postCode);

    }

    public static String findStreet(String address) {
        int firstSpace = address.indexOf(" ");
        int firstComma = address.indexOf(",");
        String street = address.substring(firstSpace + 1, firstComma);
        return street;
    }

    public static String findCity(String address) {
        return address.split(",")[1].strip();
    }

    public static String findState(String address) {
        // First split address on commas, which returns an array with 3 elements
        // Then get the 3rd element (arrays are zero-based, so 3rd element is [2]) which contains: " CA 90210"
        // Strip leading & trailing spaces
        // Then split 3rd element on spaces, which return array with 2 elements
        // Then get 1st element which contains: "CA" & return it
        return address.split(",")[2].strip().split(" ")[0];
    }

    public static String findPostCode(String address) {
        // same as findState() except gets second element at the end
        return address.split(",")[2].strip().split(" ")[1];
    }

 */
}
