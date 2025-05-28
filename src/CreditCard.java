/*
    Description: QAP 2 - Problem 3 - CreditCard Class
    Author: Joseph Gallant
    Date: May 28, 2025
 */

public class CreditCard {
    // Private attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructors
    // Parameterized
    public CreditCard(Person newCardHolder, Money limit) {
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    // Getters
    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    // Charge the card for a Money amount if there is enough available credit
    public void charge(Money amount) {
        // Calculate the available credit
        Money availableCredit = new Money(creditLimit);
        availableCredit.subtract(this.balance);

        // If there is enough credit available, allow the transaction, otherwise, just show an error message.
        if (availableCredit.compareTo(amount) >= 0) {
            this.balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make a payment to the card for a Money amount. Must be a positive value.
    public void payment(Money amount) {
        // Make sure the payment amount is a positive value
        if (amount.compareTo(new Money(0)) > 0) {
            this.balance.subtract(amount);
        } else {
            System.out.println("The payment amount should be positive.");
        }
    }
}
