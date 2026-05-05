package JavaIOstreams;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
     public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("C:/Users/ASUS/Desktop/Data.txt", "rw");
        // byte[] b = HARSHITNATHTIWARI
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        rf.write('s');
        System.out.println((char) rf.read());
        rf.skipBytes(3);
        System.out.println((char) rf.read());
        rf.seek(3);
        System.out.println((char) rf.read());
        rf.seek(rf.getFilePointer() + 2);
        System.out.println((char) rf.read());
        rf.close();
    }
}
