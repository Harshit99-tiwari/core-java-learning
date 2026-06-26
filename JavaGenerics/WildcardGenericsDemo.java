package JavaGenerics;
@SuppressWarnings("unchecked")
class yarray<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class WildcardGenericsDemo {
    static void fun(yarray<?> obj)
    {
        obj.display();
    }
    public static void main(String[] args) {
        yarray<String> ma = new yarray<>();
        ma.append("hii");
        ma.append("hello");

        yarray<Integer> ma1 = new yarray<>();
        ma1.append(10);
        ma1.append(12);

        fun(ma);
        fun(ma1);
    }
}