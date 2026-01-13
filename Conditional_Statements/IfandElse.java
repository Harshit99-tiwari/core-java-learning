package Conditional_Statements;

public class IfandElse {
    public static void main(String[] args) {
          int marks = 55;
        if (marks>=0 && marks < 33){
            System.out.println("Fail");
        }else if(marks>= 33 && marks <60 ){
            System.out.println("GRADE : C");
        }else if(marks>=60 && marks<80){
      System.out.println("Grade: B");
        }else if (marks>=80 && marks<=100){
            System.out.println("Grade:A");
        }else if(marks>100){
            System.out.println("INVALID");
        }
        System.out.println(marks);
    }
}
