/*
    Description: QAP 2 - Problem 3 - CreditCard Class
    Author: Joseph Gallant
    Dates: May 28, 2025 - May 29, 2025
 */

// Task 2: Passing and returning objects
// Task 2.1: Create a CreditCard class according to the UML diagram
public class CreditCard {
    // Private attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructors
    // Parameterized
    // Task 2.2: Constructor to initialize a CreditCard with a cardholder (Person) and credit limit (Money)
    public CreditCard(Person newCardHolder, Money limit) {
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    // Getters
    // Task 2.3: Return a new balance Money object for security purposes
    public Money getBalance() {
        return new Money(balance);
    }

    // Task 2.3: Return a new creditLimit Money object for security purposes
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Task 2.4: Accessor method to get information about the owner
    public String getPersonals() {
        return this.owner.toString();
    }

    // Task 2.5: Charge an amount to the credit card
    // Charge the card for a Money amount if there is enough available credit
    public void charge(Money amount) {
        // Calculate the available credit
        Money availableCredit = new Money(creditLimit);
        availableCredit.subtract(this.balance);

        // If there is enough credit available, allow the transaction, otherwise, just show an error message.
        if (availableCredit.compareTo(amount) >= 0) {
            this.balance.add(amount);
            System.out.println("Charge: " + amount.toString());
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Task 2.6: Make a payment on the credit card
    // Make a payment to the card for a Money amount. Must be a positive value.
    public void payment(Money amount) {
        // Make sure the payment amount is a positive value
        if (amount.compareTo(new Money(0)) > 0) {
            this.balance.subtract(amount);
            System.out.println("Payment: " + amount.toString());
        } else {
            System.out.println("The payment amount should be positive.");
        }
    }
}
