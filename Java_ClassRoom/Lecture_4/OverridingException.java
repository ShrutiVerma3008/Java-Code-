import java.io.FileNotFoundException;

class A {
    void show() throws FileNotFoundException {
        System.out.println("A FileNotFoundException");
    }
}

class B extends A {
    // Cannot throw IOException, which is a broader exception than FileNotFoundException.
    // Either throw FileNotFoundException or no exception at all.
    void show() throws FileNotFoundException {
        System.out.println("B FileNotFoundException");
    }
}

public class OverridingException {
    public static void main(String[] args) {
        A a = new B();
        try {
            a.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

