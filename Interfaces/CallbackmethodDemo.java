package Interfaces;

public class CallbackmethodDemo {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer("harshit");
        Customer c1 = new Customer("john");
        s.register(c);
        s.register(c1);
        s.invitesale();
    }
}

interface Member {
    void callback();
}

class Store {
    Member m[] = new Member[100];
    int count = 0;

    void register(Member mem) {
        m[count++] = mem;
    }

    void invitesale() {
        for (int i = 0; i < count; i++) {
            m[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("ok,i will visit: " + name);
    }
}
