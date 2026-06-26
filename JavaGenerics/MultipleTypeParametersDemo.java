package JavaGenerics;

class Pair<K, V> {
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key = " + key);
        System.out.println("Value = " + value);
    }
}

public class MultipleTypeParametersDemo {

    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>();

        p.set("Age", 22);

        p.display();
    }
}