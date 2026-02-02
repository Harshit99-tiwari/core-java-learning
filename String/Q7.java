package String;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
         String str = "I LOVE JAVA ";
    String words[] = str.split(" ");
    int start = 0;
    int end = words.length - 1;
    while (start < end) {
      String temp = words[start];
      words[start] = words[end];
      words[end] = temp;
      start++;
      end--;
    }

    System.out.println(Arrays.toString(words));

    }
}
