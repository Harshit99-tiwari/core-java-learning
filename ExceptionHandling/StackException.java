package ExceptionHandling;

class StackOverFlow extends Exception {
    public String toString() {
        return "Stack overflow";
    }
}

class StackUnderFlow extends Exception {
    public String toString() {
        return "Stack underflow";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int s[];

    public Stack(int sz) {
        size = sz;
        s = new int[sz];
    }

    public void push(int x) throws StackOverFlow {
        if (top == size - 1)
            throw new StackOverFlow();
        top++;
        s[top] = x;
    }

    public int pop() throws StackUnderFlow {
        int x = -1;
        if (top == -1)
            throw new StackUnderFlow();
        x = s[top];
        top--;
        return x;

    }
}

public class StackException {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        try {
            st.push(5);
            st.push(8);
            st.push(9);
            st.push(7);
            st.push(43);
            st.push(89);

        }
         catch (StackOverFlow e) {
            System.out.println(e);
        }
         try {
                st.pop();
                st.pop();
                st.pop();
                st.pop();
                st.pop();
                st.pop();

            } catch (StackUnderFlow e) {
                System.out.println(e);
            }
    }
}
