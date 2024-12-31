class Test {
    // Phương thức tĩnh
    static void hello() {
        System.out.println("Hello World!");
    }
}

public class CallStaticMethod {
    public static void main(String[] args) {
        Test.hello();
    }
}
