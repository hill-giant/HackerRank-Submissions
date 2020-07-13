import java.util.Calendar;
public class Solution {
    public static String getDay(String day, String month, String year) {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        String[] days = 
        { 
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);
        return days[c.get(c.DAY_OF_WEEK) - 1];
    }
