package JavaDoc;
import java.lang.annotation.*;

//@Retention(RetentionPolicy.CLASS)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE) //used on local variable
@Target(value=ElementType.METHOD) //used on method

@interface MyAnno11
{
   String name();
   String project();
   String date();
   String version() default "25";
}


public class MetaAnnotationDemo {
    int data;
     @MyAnno11(name="harsh",project="bank",date="1/1/2-26")
   
    public static void main(String[] args) {
        
    }
}
