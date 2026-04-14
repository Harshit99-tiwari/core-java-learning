package Multithreading;

class ATM {
   synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking balance");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   synchronized public void Withdraw(String name, int amount) {
        System.out.println(name + "  withdrawn " + amount);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Costumer extends Thread {
    ATM atm;
    String name;
    int amount;

    public Costumer(ATM atm,String name,int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.Withdraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}
public class Studentchallange {
    public static void main(String[] args) {
          ATM at = new ATM();
    Costumer c1 = new Costumer(at,"harsh",10000);
    c1.start();

     Costumer c2 = new Costumer(at,"harshit",120000);
     c2.start();
    }
}
