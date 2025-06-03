/*
    Description: QAP 2 - Problem 3 - Address Class
    Author: Joseph Gallant
    Date: May 28, 2025
 */

public class Address {
    // Private attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructors
    // Parameterized
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method override
    public String toString() {
        return (street + ", " + city + ", " + state + ", " + zip);
    }
}
