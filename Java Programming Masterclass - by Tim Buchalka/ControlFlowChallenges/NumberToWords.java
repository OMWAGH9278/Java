public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int digit=0, digitCount=getDigitCount(number);
        int temp=reverse(number);
        for(int i=0; i<digitCount; i++){
            digit=temp%10;
            switch(digit){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            temp=temp/10;
        }
    }
    public static int reverse(int number){
        int reverse=0;
        while(number != 0){
            reverse=(reverse*10)+(number%10);
            number=number/10;
        }
        return (reverse);
    }
    public static int getDigitCount(int number){
        int digitCount=0;
        if(number < 0){
            System.out.println("Invalid Value");
            return (-1);
        }
        while(number != 0){
            digitCount++;
            number=number/10;
        }
        if(digitCount==0) return (1);
        else return (digitCount);
    }
}