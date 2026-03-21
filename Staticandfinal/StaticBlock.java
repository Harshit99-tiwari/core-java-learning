package Staticandfinal;

class Statics{
     static {
        System.out.println("block 1");
    }
     static {
        System.out.println("blocvk 2");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
         System.out.println("main");
        //  Statics ss =new Statics();
    }
}
