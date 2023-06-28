

public class SwitchNew {
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is 3, 4 or 5");
                System.out.println("Actually it is " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
            String month = "OCTOBER";
            System.out.println(month + " is in the "+ getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield ("1st");
            }
            case "APRIL", "MAY", "JUNE" -> ("2nd");
            case "JULY", "AUGUST", "SEPTEMBER" -> ("3rd");
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> ("4th");
            default -> {
                String badResponse = month + " is bad";
                yield (badResponse);
            }
        };
    }
}

