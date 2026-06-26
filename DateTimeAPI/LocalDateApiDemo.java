package DateTimeAPI;

import java.util.*;
import java.time.*;
//import java.time.temporal.*;



public class LocalDateApiDemo{
   @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Date d = new Date();
        d.setHours(21);
        System.out.println(d);
        
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

         LocalDate lt = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(lt);

         LocalDate l = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(l);

         LocalDate dd = LocalDate.of(2025, 10, 5);
        System.out.println(dd);

         LocalDate lld = LocalDate.ofEpochDay(1);
        System.out.println(lld);

         LocalDate ldd = LocalDate.parse("2026-01-04");
         LocalDate l1 = ldd.plusMonths(2);
        System.out.println(l1);

    }
}