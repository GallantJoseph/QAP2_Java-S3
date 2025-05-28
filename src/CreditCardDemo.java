/*
    Description: QAP 2 - Problem 3 - CreditCardDemo Class
    Author: Joseph Gallant
    Date: May 28, 2025
 */

public class CreditCardDemo {
    public static void main(String[] args) {
        Money m1 = new Money(-3.23);
        Money m2 = new Money(0.72);
        Money m3 = m1.add(m2);

        // -3.23 + 0.72 = -2.51
        System.out.println(m1);

        m1.subtract(m2);

        //-2.51 - 0.72 = -3.23
        System.out.println(m1);
    }
}
