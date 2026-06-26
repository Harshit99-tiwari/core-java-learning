package JavaGenerics;

class GenericArray<T> {

    T arr[] = (T[]) new Object[10];

    int length = 0;

    public void append(T value) {
        arr[length++] = value;
    }

    public void display() {

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class ChildGenericArray<T> extends GenericArray<T> {

}

public class GenericInheritanceDemo {

    public static void main(String[] args) {

        ChildGenericArray<String> obj = new ChildGenericArray<>();

        obj.append("Hello");
        obj.append("Java");
        obj.append("Generics");

        obj.display();
    }
}