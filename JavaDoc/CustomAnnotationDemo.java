package JavaDoc;
//import java.lang.annotation.Annotation;
@interface MyAnno
{
   String name();
   String project();
   String date();
   String version() default "25";
}

@MyAnno(name="harsh",project="bank",date="1/1/2-26")
public class CustomAnnotationDemo {
    int data;
    public static void main(String[] args) {
         int x=10;
        System.out.println(x);
    }
}
