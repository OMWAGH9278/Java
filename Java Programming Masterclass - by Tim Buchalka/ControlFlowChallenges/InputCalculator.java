import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            String input = in.nextLine();
            try{
                int number = Integer.parseInt(input);
                sum+=number;
                count++;
            }catch(NumberFormatException e){
                break;
            }

        }

        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}


