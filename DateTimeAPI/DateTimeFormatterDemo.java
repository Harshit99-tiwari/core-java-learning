package DateTimeAPI;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatterDemo
{
      public static void main(String[] args) {
        ZonedDateTime lt = ZonedDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh.mm.ss z Z");
        System.out.println(dtf.format(lt));

         ZonedDateTime zdt = ZonedDateTime.now();
         System.out.println(zdt.get(ChronoField.MINUTE_OF_DAY));
          System.out.println(zdt.get(ChronoField.DAY_OF_MONTH));
           System.out.println(zdt.get(ChronoField.YEAR));
    }
}