package opgave03;

public class Opgave03 {
    public static void main(String[] args) {
        weekDayArray(0,2);
    }

    public static String weekday(int dayOfWeek, int daysInTheFuture) {
        dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;
        if (dayOfWeek == 0) {
            return "Mandag";
        } else if (dayOfWeek == 1) {
            return "Tirsdag";
        } else if (dayOfWeek == 2) {
            return "Onsdag";
        } else if (dayOfWeek == 3) {
            return "Torsdag";
        } else if (dayOfWeek == 4) {
            return "Fredag";
        } else if (dayOfWeek == 5) {
            return "Lørdag";
        } else {
            return "Søndag";
        }
    }
    public static void weekDayArray(int acctualDay, int daysInTheFuture){
        String[] dayOfTheWeek = {"Mandag","tirsdag","onsdag","torsdag","fredag","lørdag","søndag"};
         acctualDay = (acctualDay + daysInTheFuture) % 7;
        System.out.println(dayOfTheWeek[acctualDay]);

    }
} //done
