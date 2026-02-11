package Methods;

public class Methodoverloading {
    int max(int m ,int n){
        return m>n?m:n;
    }
    float max(float m,float n){
        return m>n?m:n;
    }
    int max(int x,int y,int z){
        return x>y && x>z?x:y>x && y>z?y:z;
    }
    public static void main(String[] args) {
       Methodoverloading m = new Methodoverloading();
       System.out.println(m.max(2.5f, 2.49898f));
       System.out.println(m.max(5, 6));
       System.out.println(m.max(4, 50, 500));

    }
}
