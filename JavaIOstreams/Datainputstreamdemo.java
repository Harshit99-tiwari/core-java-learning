package JavaIOstreams;

import java.io.DataInputStream;
import java.io.FileInputStream;

class student4{
    int rollno;
    String name;
    String dept;
}

public class Datainputstreamdemo {
      public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/ASUS/Desktop/sdnt1.txt");
        DataInputStream di=new DataInputStream(fis);
        student4 s4=new student4();
        s4.rollno=di.readInt();
        s4.name=di.readUTF();
        s4.dept=di.readUTF();

        System.out.println(s4.rollno+" "+s4.name+" "+s4.dept);

        fis.close();
        di.close();

    }
}
