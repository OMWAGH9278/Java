public class PrimeNumberChallenge {

    public static void main(String[] args) {

        printPrimeNumbersInRange(15);
    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor < wholeNumber; divisor++){

            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return  true;
    }

    public static void printPrimeNumbersInRange(int startRange){
        int primeCount = 0;
        for(int i=startRange; primeCount<3 && i<=50; i++){
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCount++;
            }
        }
    }
}
