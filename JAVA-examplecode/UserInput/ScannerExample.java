import java.util.*;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.println("Nhap so nguyen: ");
        int num = sc.nextInt();

        System.out.println("Nhap so thuc: ");
        float decimal = sc.nextFloat();

        System.out.println("Chuoi vua nhap: " + str);
        System.out.println("So nguyen vua nhap: " + num);
        System.out.println("So thuc vua nhap: " + decimal);

        sc.close();
    }
}