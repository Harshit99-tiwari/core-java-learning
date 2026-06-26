package DateTimeAPI;
import java.util.*;

    public class DateApiDemo {
        @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        /**
         * these are the deprecated methods,old
         */
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);
       

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());

        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);

       
        Date d2 = new Date("7/25/2026");
        System.out.println(d2);
        System.out.println(d2.getDate());
        System.out.println(d2.getMonth());
        System.out.println(d2.getYear()+1900);
        System.out.println(d2.after(d2));
        System.out.println(d2.before(d2));
        
    }
}
