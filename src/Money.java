/*
    Description: QAP 2 - Problem 3 - Money Class
    Author: Joseph Gallant
    Date: May 28, 2025
 */

public class Money {
    // Private attributes
    private long dollars;
    private long cents;

    // Constructors
    // Copy
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Parameterized
    public Money(double amount) {
        long dollarCents = Double.valueOf(amount * 100).longValue();

        this.cents = dollarCents % 100;
        this.dollars = (dollarCents - cents) / 100;
    }

    // Add a Money object amount to the current instance
    public Money add(Money otherAmount) {
        // Get the value in cents for each Money object
        long dollarCents = Math.abs(this.dollars * 100) + Math.abs(this.cents);
        long otherDollarCents = Math.abs(otherAmount.dollars * 100) + Math.abs(otherAmount.cents);

        // If the dollar or cent value is negative, adjust it to become negative
        if (this.dollars < 0 || this.cents < 0) {
            dollarCents = -dollarCents;
        }

        if (otherAmount.dollars < 0 || otherAmount.cents < 0) {
            otherDollarCents = -otherDollarCents;
        }

        // Add the values in cents together
        long sumDollarCents = dollarCents + otherDollarCents;

        // The resulting cents value
        long cents = sumDollarCents % 100;

        this.dollars = (sumDollarCents - cents) / 100;

        // If the value is under or equal to -1 dollar OR over or equal to 1 dollar
        // The cents value should be positive, the negative value will be assigned to the dollar amount instead
        if (sumDollarCents >= 100 || sumDollarCents <= -100) {
            cents = Math.abs(cents);
        }

        this.cents = cents;

        return this;
    }

    // Subtract a Money object amount from the current instance
    public Money subtract(Money otherAmount) {
        // Get the value in cents for each Money object
        long dollarCents = Math.abs(this.dollars * 100) + Math.abs(this.cents);
        long otherDollarCents = Math.abs(otherAmount.dollars * 100) + Math.abs(otherAmount.cents);

        // If the dollar or cent value is negative, adjust it to become negative
        if (this.dollars < 0 || this.cents < 0) {
            dollarCents = -dollarCents;
        }

        if (otherAmount.dollars < 0 || otherAmount.cents < 0) {
            otherDollarCents = -otherDollarCents;
        }

        // Subtract the cents value from the current instance
        long diffDollarCents = dollarCents - otherDollarCents;

        // The resulting cents value
        long cents = diffDollarCents % 100;

        this.dollars = (diffDollarCents - cents) / 100;;

        // If the value is under or equal to -1 dollar OR over or equal to 1 dollar
        // The cents value should be positive, the negative value will be assigned to the dollar amount instead
        if (diffDollarCents >= 100 || diffDollarCents <= -100) {
            cents = Math.abs(cents);
        }

        this.cents = cents;

        return this;
    }

    // Compare the current Money object with another one
    // Returns 1 if it's over, 0 if it's the same, -1 if it's lower
    public int compareTo(Money otherObject) {
        // Get the value in cents for each Money object
        long dollarCents = Math.abs(this.dollars * 100) + Math.abs(this.cents);
        long otherDollarCents = Math.abs(otherObject.dollars * 100) + Math.abs(otherObject.cents);

        // If the dollar or cent value is negative, adjust it to become negative
        if (this.dollars < 0 || this.cents < 0) {
            dollarCents = -dollarCents;
        }

        if (otherObject.dollars < 0 || otherObject.cents < 0) {
            otherDollarCents = -otherDollarCents;
        }

        // If the current Money amount is over the otherObject Money amount, return 1;
        // the same as, return 0; less than, return -1
        if (dollarCents > otherDollarCents) {
            return 1;
        } else if (dollarCents == otherDollarCents) {
            return 0;
        } else {
            return -1;
        }
    }

    // Method that compares the values of the current Money object, and another one
    // Returns true if they are equal
    public boolean equals(Money otherObject) {
        return (this.compareTo(otherObject) == 0);
    }

    // toString method overload
    public String toString() {
        // If the amount is between -0.99 and -0.01
        // Display the negative sign before the dollar amount
        if (this.dollars == 0 && this.cents < 0) {
            return "-" + this.dollars + "." + Math.abs(this.cents);
        } else {
            return this.dollars + "." + this.cents;
        }
    }
}
