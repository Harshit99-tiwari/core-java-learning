package Collections;

import java.util.*;
import java.io.*;

public class Propertydemo {
    public static void main(String[] args) throws Exception {
      /*   //Writing properties file
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Proessor", "i7");
        p.setProperty("OS", "Window");
        p.setProperty("Model", "Latitude");

        p.store(new FileOutputStream("C:\\Users\\Admin\\Desktop\\sdnt1.txt"), "Laptop");

        p.storeToXML(new FileOutputStream("C:\\Users\\Admin\\Desktop\\sdnt111.xml"), "Laptop");*/

        //Extractng properties from file
        Properties p = new Properties();

        p.loadFromXML(new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\sdnt111.xml"));
        System.out.println(p);



    }
}
