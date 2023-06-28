public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0, count = 0;
        for(int i = 1; count<5 && i<=1000; i++){
            if(i%3==0 && i%5==0) {
                System.out.println("Found a match : "+i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
