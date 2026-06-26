package JavaGenerics;

class Parent {
}

class Child extends Parent {
}

interface DemoInterface {
}

class DemoImpl implements DemoInterface {
}

@SuppressWarnings("unchecked")
class NumberArray<T extends Number> {

    T arr[] = (T[]) new Number[10];

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

@SuppressWarnings("unchecked")
class ParentArray<T extends Parent> {

    T arr[] = (T[]) new Parent[10];

    int length = 0;

    public void append(T value) {
        arr[length++] = value;
    }
}

@SuppressWarnings("unchecked")
class InterfaceArray<T extends DemoInterface> {

    T arr[] = (T[]) new DemoInterface[10];

    int length = 0;

    public void append(T value) {
        arr[length++] = value;
    }
}

public class BoundedGenericsDemo {

    public static void main(String[] args) {

        NumberArray<Integer> a = new NumberArray<>();
        a.append(10);
        a.append(20);

        NumberArray<Double> b = new NumberArray<>();
        b.append(12.5);

        ParentArray<Child> c = new ParentArray<>();
        c.append(new Child());

        InterfaceArray<DemoImpl> d = new InterfaceArray<>();
        d.append(new DemoImpl());

        a.display();
        b.display();
    }
}