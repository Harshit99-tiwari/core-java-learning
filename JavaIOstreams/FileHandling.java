package JavaIOstreams;

import java.io.File;

public class FileHandling {
     public static void main(String[] args) throws Exception
    {
       /* File f=new File("C:/Users/ASUS/Desktop/Data.txt");
        //f.setReadOnly();
        f.setWritable(true);
        System.out.println(f.lastModified());
        FileOutputStream fos=new FileOutputStream("C:/Users/ASUS/Desktop/Data.txt");*/


        File f=new File("C:/Users/ASUS/Desktop");
       System.out.println( f.isDirectory());
       File list[] = f.listFiles();

       for(File x:list){
        System.out.print(x.getName()+" ");
        System.out.println(x.getPath());
       // System.out.println(x.getParentFile());
       }
       
    
    }
}
