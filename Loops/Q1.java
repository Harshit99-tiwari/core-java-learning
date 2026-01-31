package Loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http")) {
            System.out.println("Hyper text transfer protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("file transfer protocol");
        }
        String ext = url.substring(url.lastIndexOf(".") + 1);
        if (ext.equals("com")) {
            System.out.println("commercial web");
        } else if (ext.equals("net")) {
            System.out.println("net web");
        } else if (ext.equals("org")) {
            System.out.println("organisational web");
        }
        sc.close();
    }
}
