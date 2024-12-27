public class ShiftOperator {
    public static void main(String[] args) {
        int num = -8;

        int res1 = num << 2;
        int res2 = num >> 2;
        int res3 = num >>> 2;

        System.out.println("Left Shift: " + res1);
        System.out.println("Signed Right Shift: " + res2);
        System.out.println("Unsigned Right Shift: " + res3);
    }
}
