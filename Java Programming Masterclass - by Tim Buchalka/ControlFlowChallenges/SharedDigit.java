public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if((firstNumber<10 || firstNumber>99) || (secondNumber<10 || secondNumber>99)) return false;
        while(firstNumber != 0){
            int secondTemp = secondNumber;
            while(secondTemp != 0){
                if((firstNumber%10)==(secondTemp%10)) return true;
                secondTemp = secondTemp/10;
            }
            firstNumber = firstNumber/10;
            secondNumber = secondNumber/10;
        }
        return false;
    }
}