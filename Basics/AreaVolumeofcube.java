package Basics;

import java.util.Scanner;

public class AreaVolumeofcube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int length,breadth,height;
         int totalArea,volume;

         System.out.println("enter length breadth and height");
         length = sc.nextInt();
         breadth =sc.nextInt();
         height=sc.nextInt();

         totalArea= 2*(length*breadth+length*height+breadth*height);
         volume=length*breadth*height;

         System.out.println("Total AREA "+totalArea);
         System.out.println("volume "+volume);

         sc.close();
    }
    
}
