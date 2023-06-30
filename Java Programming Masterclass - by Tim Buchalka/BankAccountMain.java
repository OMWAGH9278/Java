public class BankAccountMain {

    public static void main(String[] args) {

//        BankAccount ba = new BankAccount("12345", 1000,
//                "Bob Brown", "myemail@bob.com",
//                "\"(087) 123-456-789\"");

        BankAccount ba = new BankAccount();

//        ba.setAccountNumber("12345");
//        ba.setAccountBalance(1000.00);
//        ba.setCustomerName("Bob Brown");
//        ba.setEmail("myemail@bob.com");
//        ba.setPhoneNumber("(087) 123-456-789");

        ba.withdrawFund(600);
        ba.depositFund(300);
        ba.depositFund(50);
        ba.withdrawFund(400);
        ba.depositFund(40);
        ba.withdrawFund(60);
        ba.depositFund(90);

        BankAccount timsAccount = new BankAccount("Tim",
                "tim@email.com", "12345");
        System.out.println("AccountNo: "+timsAccount.getNumber()+
                "; name: "+timsAccount.getCustomerName());
    }

}
