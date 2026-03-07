package AbstractClasses;


abstract class KFC{
    KFC(){
        System.out.println("distribute outlets");
    }
    void makeItems(){
        System.out.println("maikng chicken based food");
    }
    abstract void billing();
    abstract void offer();
}
class Mykfc extends KFC{
    void billing(){
        System.out.println("billing via upi only");
    }
    void offer(){
        System.out.println("buy 1 get 1 free");
    }
    void festOffer(){
        System.out.println("50% off on family pack");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
          Mykfc m =new Mykfc();
        m.makeItems();
        m.billing();
        m.offer();
        m.festOffer();
    }
}
