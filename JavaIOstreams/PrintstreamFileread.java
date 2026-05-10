package JavaIOstreams;

import java.io.*;

class student2 {
    int rollno;
    String name;
    String dept;
}

public class PrintstreamFileread {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/ASUS/Desktop/student1.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        student2 s2= new student2();
        s2.rollno=Integer.parseInt(br.readLine());
        s2.name=br.readLine();
        s2.dept=br.readLine();

        System.out.println("Roll no "+s2.rollno);
        System.out.println("Name "+s2.rollno);
        System.out.println("dept "+s2.dept);

        br.close();
        fis.close();

       
    }
}
