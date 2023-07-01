public class BankAccount {

    private long accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

//    public BankAccount(){
//
//    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(int fund){
        this.accountBalance+=fund;
    }
    public void withdrawFund(int fund){
        this.accountBalance-=fund;
    }
}
