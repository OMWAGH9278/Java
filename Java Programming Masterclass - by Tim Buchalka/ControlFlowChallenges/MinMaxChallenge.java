import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double min=0, max=0;
        int loopCount=0;
        while(true){
            System.out.print("Enter a number, or any character to exit : ");
            String input = in.nextLine();
            try{
                double number = Double.parseDouble(input);
                if(loopCount==0 || number<min) {
                    min=number;
                }
                if(loopCount==0 || number>max) {
                    max=number;
                }
                loopCount++;
            }catch(NumberFormatException e){
                break;
            }
        }
        if(loopCount>0){
            System.out.println("min = "+min+", max = "+max);
        }else{
            System.out.println("No valid data entered");
        }
    }

}
