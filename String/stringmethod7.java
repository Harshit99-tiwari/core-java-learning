package String;

public class stringmethod7 {
    public static void main(String[] args) {
        String str = "java";
        String str1 = "java";
        String stt="Java";
        System.out.println(str.compareToIgnoreCase(stt));
        System.out.println(str.compareTo(str1));


         String sen = "the great wall of china ";
            System.out.println(sen.contains("wall"));
            
            String str4 = "the great wall of";
            String str5 = " of china ";
            System.out.println(str4.concat(str5));
            System.out.println(str4+str5);
    }
}
