package Staticandfinal;

public class StaticMember {
    public static void main(String[] args) {
         Member m1 = new Member();
        m1.show();
       // m1.x=40;
        m1.y=90;
        m1.show();

        Member m2 = new Member();
        m2.show();
    }
}
class Member{
    static int x =10;
    int y =20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void Display(){
        System.out.println(x);
    }
}
