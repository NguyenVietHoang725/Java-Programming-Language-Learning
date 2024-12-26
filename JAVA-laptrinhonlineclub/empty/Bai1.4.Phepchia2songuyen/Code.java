import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        double res = a * 1.0 / b;
        System.out.printf("%.2f\n", res);
        scn.close();
    }
}
