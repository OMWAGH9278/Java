import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int attempt=1;
        double sum=0;
        while(attempt<=5){
            System.out.print("Enter number #"+attempt+" : ");
            String nextNumber = in.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                sum += number;
                attempt++;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of numbers is : "+sum);
    }
}
