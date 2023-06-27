public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year < 1)||(year > 9999)) return false;
        boolean flag = false;
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    flag = true;
                }
            }else flag = true;
        }
        return (flag);
    }
}