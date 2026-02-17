package OOP;

public class Circle {
    public static void main(String[] args) {
        Cir c = new Cir(10);
        c.area();
        c.circumference();
    }
}
class Cir{
   int r;
   Cir(int r){
     this.r=r;
   }
   void area(){
    float area=3.14f*r*r;
    System.out.println(area);
   }
   void circumference(){
    float circumference=2*3.14f*r;
    System.out.println(circumference);
   }
}