package String;

public class Q6 {
    public static void main(String[] args) {
        String str[] = {"ABCD","EFGH","ijkl"};
      
      for(int i =0;i<str.length;i++){
      if(i%2==0)
      {
      System.out.println(str[i].toUpperCase());
      }else if(i%2!=0){
        System.out.println(str[i].toLowerCase());
      }
      }
    }
}
