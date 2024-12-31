public class CallMethod {

    void hello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Tạo một đối tượng
        CallMethod obj = new CallMethod();

        // Gọi phương thức hello() của đối tượng obj
        obj.hello();
    }
}