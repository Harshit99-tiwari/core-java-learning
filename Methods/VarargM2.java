package Methods;

public class VarargM2 {
    static void showlist(String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(i + 1 + ". " + S[i]);
        }
    }

    static void showList1(int start, String... P) {
        for (int i = 0; i < P.length; i++) {
            System.out.println(start + ". " + P[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showlist("harshit", "harsh", "ankush");
        System.out.println();
        showList1(4,"john","deer","kali","linux");
    }
}
