package Inheritance;

public class BankAccountInheritanceDemo {
    public static void main(String[] args) {

        // Savings Account Object
        SavingsAccount sa = new SavingsAccount(
                "S001",
                "Ankush",
                "Delhi",
                "9999999999",
                "01-01-2004",
                50000);

        System.out.println("---- Savings Account ----");
        System.out.println("Account No: " + sa.getAccNo());
        System.out.println("Name: " + sa.getName());
        System.out.println("Balance: " + sa.getBalance());

        sa.deposit(5000);
        sa.withdraw(2000);

        System.out.println("Updated Balance: " + sa.getBalance());

        // Loan Account Object
        LoanAccount la = new LoanAccount(
                "L001",
                "Rahul",
                "Lucknow",
                "8888888888",
                "05-05-2020",
                100000);

        System.out.println("\n---- Loan Account ----");
        System.out.println("Account No: " + la.getAccNo());
        System.out.println("Name: " + la.getName());
        System.out.println("Loan Amount: " + la.getBalance());

        la.payEMI(10000);
    }
}

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob, long balance) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    };

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

}

class SavingsAccount extends Account {

    SavingsAccount(String acc, String n, String add, String phno, String dob, long balance) {
        super(acc, n, add, phno, dob, balance);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    LoanAccount(String acc, String n, String add, String phno, String dob, long balance) {
        super(acc, n, add, phno, dob, balance);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}
