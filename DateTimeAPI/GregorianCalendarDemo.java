package DateTimeAPI;
import java.util.*;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println("Date: "+gc.get(Calendar.DATE)+"Month: "+gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
         TimeZone t = gc.getTimeZone();
         System.out.println(t.getID());
    }
}
