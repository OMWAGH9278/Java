package OOPPart1Inheritance;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.balance = balance;
        this.number = number;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName,
                customerEmail, customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }

    public void depositFund(double funds) {
        this.balance += funds;
        System.out.println("Deposit of $" + funds +
                " processed, New balance is $" + balance);
    }

    public void withdrawFund(double funds) {
        if (this.balance < funds) {
            System.out.println("Insufficient funds in your account. You only have $" + this.balance +
                    " in your account");
        } else {
            this.balance -= funds;
            System.out.println("Withdrawal of $" + funds +
                    " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getAccountBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

}
