public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 2) return (-1);
        int largestPrime = 2;
        for(int i=0; i<=number/2; i++){
            if(number%i == 0){
                largestPrime = i;
            }
        }
        return (largestPrime);
    }
}