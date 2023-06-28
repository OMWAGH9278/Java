public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return (-1);
        }
        if(number/10 == 0) {
            return (2*number);
        }
        int sum=0, digit=0, temp=number;
        while(temp != 0){
            digit = temp%10;
            if(temp==number || temp/10 == 0) sum += digit;
            temp = temp / 10;
        }
        return (sum);
    }

}