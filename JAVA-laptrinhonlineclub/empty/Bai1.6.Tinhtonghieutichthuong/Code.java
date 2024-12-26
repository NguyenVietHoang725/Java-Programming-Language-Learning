import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long a = scn.nextLong();
        long b = scn.nextLong();

        long tong = a + b;
        long hieu = a - b;
        long tich = a * b;
        double thuong = a * 1.0 / b;

        System.out.print(tong + " ");
        System.out.print(hieu + " ");
        System.out.print(tich + " ");
        System.out.printf("%.2f", thuong);

        scn.close();
    }
}
