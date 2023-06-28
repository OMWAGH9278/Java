public class isEvenNumber {

    public static void main(String[] args) {
        int number = 5, evenCount = 0, oddCount = 0;
        while(number++<=20 && evenCount<5){
            if(isEvenNumber(number)) {
                System.out.println(number);
                evenCount++;
            }else oddCount++;
        }
        System.out.println("Odd Count = "+oddCount);
        System.out.println("Even Count = "+evenCount);
    }

    public static boolean isEvenNumber(int number){
        return (number%2 == 0);
    }
}
