import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        long b = scn.nextLong();

        long nguyen = a / b;
        long du = a % b;

        System.out.print(nguyen + " " + du);
    }
}
