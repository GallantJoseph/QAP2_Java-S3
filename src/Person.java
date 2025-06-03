/*
    Description: QAP 2 - Problem 3 - Person Class
    Author: Joseph Gallant
    Date: May 28, 2025
 */

public class Person {
    // Private attributes
    private String lastName;
    private String firstName;
    private Address home;

    // Constructors
    // Parameterized
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method override
    public String toString() {
        return (firstName + " " + lastName + ", " + home.toString());
    }
}
