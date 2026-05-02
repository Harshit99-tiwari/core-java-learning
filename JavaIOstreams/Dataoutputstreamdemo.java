package JavaIOstreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

class student3{
    int rollno;
    String name;
    String dept;
}

public class Dataoutputstreamdemo {
     public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/Desktop/sdnt1.txt");
        DataOutputStream ds=new DataOutputStream(fos);

        student3 s3=new student3();
        s3.rollno=101;
        s3.name="harsh";
        s3.dept="ece";

        ds.writeInt(s3.rollno);
        ds.writeUTF(s3.name);
        ds.writeUTF(s3.dept);
fos.close();
ds.close();
    }
}
