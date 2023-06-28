public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return ("Seconds must be positive");
        }
        return (getDurationString(seconds / 60, seconds));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return("Minutes must be positive");
        }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;
        return (hours+"h "+remainingMinutes+"m "+remainingSeconds+"s");
    }
}
