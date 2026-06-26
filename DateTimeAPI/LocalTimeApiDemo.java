package DateTimeAPI;

//import java.util.*;
import java.time.*;
//import java.time.temporal.*;

public class LocalTimeApiDemo {
    public static void main(String[] args) {

        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = t.minusHours(2);
        System.out.println(t1);
        t1.getHour();
        t1.getMinute();
        t1.plusHours(2);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        dt.getDayOfMonth();
        dt.getMinute();
        dt.getMonth();

    }
}
