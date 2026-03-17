package Innerclasses;

public class inclassExample4 {
    public static void main(String[] args) {
         First.Second f =new First.Second();
        f.Display();
    }
}
class First{
      static int x =10;
      static int y =20;
      static class Second{
        void Display(){
            System.out.println(x);
           System.out.println(y);  
        }
      }
}

