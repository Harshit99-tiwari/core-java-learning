package JavaIOstreams;

import java.io.*;

class Student5 implements Serializable {
   private static final long serialVersionUID = 1L;
    public int roll;
    public String name;
    public String branch;
    public static int data = 10;
    public transient int t;

    public Student5() {
    }

    public Student5(int r, String n, String b) {

        roll = r;
        name = n;
        branch = b;
        data = 100;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + roll +
                "\nName " + name +
                "\nBranch " + branch +
                "\nData " + data +
                "\nTransdient " + t + "\n";

    }

}
public class Objectinputstreamdemo {
    public static void main(String[] args) throws Exception
     {
        FileInputStream fis=new FileInputStream("C:/Users/ASUS/Desktop/std2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student5 s5=(Student5)ois.readObject();
        System.out.println(s5);
fis.close();
ois.close();
    }
}

