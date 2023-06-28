public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        if(number < 0) number = -number;
        int temp = number, reverseNumber = 0;
        while(temp != 0){
            reverseNumber = reverseNumber*10 + (temp%10);
            temp = temp/10;
        }
        return (number == reverseNumber);
    }

}