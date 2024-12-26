import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

        long sum = n * (n + 1) / 2;

        System.out.println(sum);
        scn.close();
    }
}
