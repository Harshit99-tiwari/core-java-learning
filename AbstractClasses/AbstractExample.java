package AbstractClasses;

public class AbstractExample {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.admit();
        h.billing();
        h.emergency();
    }
}

abstract class Hospital {
    abstract void admit();

    abstract void emergency();

    abstract void billing();
}

class MyHospital extends Hospital {
    void admit() {
        System.out.println("patient admmited");
    }

    void emergency() {
        System.out.println("patient in emergency");
    }

    void billing() {
        System.out.println("bill paid");
    }

}
