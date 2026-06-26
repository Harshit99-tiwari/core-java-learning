package DateTimeAPI;

//import java.util.*;
import java.time.*;
//import java.time.temporal.*;

public class AdvancedDateTimeApiDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt.getMonth());

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        MonthDay md = MonthDay.now();
        System.out.println(md.getMonth());
        
        YearMonth ym = YearMonth.now();
        ym.getYear();
        System.out.println(ym);

        Period p = Period.of(2, 3, 10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);
    }
}
