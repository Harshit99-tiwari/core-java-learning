package OOP;

public class AccountDemo {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.Acc_no);
        System.out.println(a.Acc_holder_name);
        System.out.println(a.current_balance);
        a.deposit(2000);
        a.withdrawl(1000);
    }
}

class Account {
    long Acc_no;
    String Acc_holder_name;
    long current_balance;

    Account() {
        this.Acc_no = 12233445566l;
        this.Acc_holder_name = "Harshit nath tiwari";
        this.current_balance = 5000l;
    }

    void deposit(int amt) {
        current_balance += amt;
        System.out.println("after deposit current balance: " + current_balance);
    }

    void withdrawl(int amt) {
        if (current_balance >= amt) {
            current_balance -= amt;
            System.out.println("After withdraw current balance: " + current_balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
