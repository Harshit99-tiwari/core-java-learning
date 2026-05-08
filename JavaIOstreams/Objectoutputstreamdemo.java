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

public class Objectoutputstreamdemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/Desktop/std2.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        Student5 s5 = new Student5(131, "Harshit", "AIML");
        os.writeObject(s5);

        fos.close();
        os.close();
    }
}
