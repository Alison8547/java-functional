package course.amigoscode.test;

import course.amigoscode.domain.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Chris", "(81)99999-9999");

        greatCustomer(customer);

        PersonTest.jumpLine();

        consumerFunction.accept(customer);

        PersonTest.jumpLine();

        greatCustomerV2(customer, false);

        PersonTest.jumpLine();

        biConsumerFunction.accept(customer, false);
    }

    // same thing as a void

    static Consumer<Customer> consumerFunction = customer -> System.out.printf("Thanks for register on our website!%nYou name: %s%nYou number: %s%n",
            customer.getCustomerName(), customer.getCustomerNumber());

    static BiConsumer<Customer, Boolean> biConsumerFunction = (customer, showNumber) -> System.out.printf("Thanks for register on our website!%nYou name: %s%nYou number: %s%n",
            customer.getCustomerName(), showNumber ? customer.getCustomerNumber() : "**********");

    public static void greatCustomer(Customer customer) {
        System.out.printf("Thanks for register on our website!%nYou name: %s%nYou number: %s%n",
                customer.getCustomerName(), customer.getCustomerNumber());
    }

    public static void greatCustomerV2(Customer customer, boolean showNumber) {
        System.out.printf("Thanks for register on our website!%nYou name: %s%nYou number: %s%n",
                customer.getCustomerName(), showNumber ? customer.getCustomerNumber() : "**********");
    }
}
