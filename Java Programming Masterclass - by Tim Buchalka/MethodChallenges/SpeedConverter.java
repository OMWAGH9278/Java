public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return (-1);
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return (milesPerHour);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}