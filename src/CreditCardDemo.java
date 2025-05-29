/*
    Description: QAP 2 - Problem 3 - CreditCardDemo Class
    Author: Joseph Gallant
    Dates: May 28, 2025 - May 29, 2025
 */

// Task 2.7: Compile, debug, and test the Address, Person, Money, and CreditCard classes
public class CreditCardDemo {
    public static void main(String[] args) {
//        Money m1 = new Money(-3.23);
//        Money m2 = new Money(0.72);
//        Money m3 = m1.add(m2);
//        Money m4 = new Money(-3.23);
//
//        // -3.23 + 0.72 = -2.51
//        System.out.println(m1);
//
//        m1.subtract(m2);
//
//        //-2.51 - 0.72 = -3.23
//        System.out.println(m1);
//
//        System.out.println(m1.compareTo(m2));
//        System.out.println(m2.compareTo(m1));
//        System.out.println(m2.compareTo(m2));
//
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.equals(m4));
//
//        Address addr1 = new Address("123 Main", "St. John's", "NL", "A0A0A0");
//        Money creditLimit = new Money(600);
//
//        CreditCard cc1 = new CreditCard(new Person("John", "Doe", addr1), creditLimit);
//
//        System.out.println(cc1.getPersonals());

        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Person owner = new Person(
                "Christie",
                "Diane",
                new Address("237J Harvey Hall","Menomonie", "WI" , "54751"));

        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit : " + visa.getCreditLimit());
        System.out.println();
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
    }
}
