package course.amigoscode.domain;

public class Customer {
    private String customerName;
    private String customerNumber;

    public Customer(String customerName, String customerNumber) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
