package JavaIOstreams;

import java.io.*;

class student1 {
    int rollno;
    String name;
    String dept;
}

public class PrintStreamFilewritte {
    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream("C:/Users/ASUS/Desktop/student1.txt");
        PrintStream ps = new PrintStream(fo);

        student1 s1 = new student1();
        s1.rollno = 10;
        s1.name = "Harshit";
        s1.dept = "CSE";
        ps.println(s1.rollno);
        ps.println(s1.name);
        ps.println(s1.dept);
        ps.close();
        fo.close();
    }
}
