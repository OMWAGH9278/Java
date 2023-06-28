class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        long firstNum = (long)(firstNumber*1000);
        long secondNum = (long)(secondNumber*1000);
        if(firstNum == secondNum) return true;
        else return false;
    }
}