public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = "+ convertToCentimeters(5, 8));
        System.out.println("68in = "+ convertToCentimeters(68));
    }

    public static double convertToCentimeters(int inch){
        return  (inch * 2.54);
    }
    public static double convertToCentimeters(int feet, int inch){
        //return (convertToCentimeters((feet*12)+inch));
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inch;
        double result = convertToCentimeters(totalInches);
        return  (result);
    }
}
