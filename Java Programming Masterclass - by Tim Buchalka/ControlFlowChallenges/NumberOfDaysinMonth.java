class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year<=1 || year>=9999) return false;
        if((year%4==0 && year%100!=0) || (year%400==0)) return true;
        else return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month<1 || month>12) || (year<1 || year>9999)) return -1;
        int daysInMonth = 0;
        switch(month){
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                if(isLeapYear(year)) daysInMonth = 29;
                else daysInMonth = 28;
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
        }
        return daysInMonth;
    }
}