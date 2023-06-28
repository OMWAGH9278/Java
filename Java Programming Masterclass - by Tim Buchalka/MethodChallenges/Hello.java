public class Hello {
    public static void main(String a[]){
        System.out.println("Hello, Om..");
        System.out.print("Hello World");

        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double value = (firstNumber + secondNumber) * 100.00;
        System.out.println("MyValuesTotal = " + value);
        double remainder = value % 40.00;
        System.out.println("Remainder = " + remainder);
        boolean flag = (remainder == 0) ? true : false;
        System.out.println(flag);
        if(!flag){
            System.out.println("got some remainder");
        }

    }
}
