abstract class AbstractMethod {
    abstract void check(String n);
}

public class CallAbstractMethod extends AbstractMethod {
    public static void main(String[] args) {
        CallAbstractMethod obj = new CallAbstractMethod();
        obj.check("Hello");
    }

    @Override
    void check(String n) {
        System.out.println(n);
    }
}