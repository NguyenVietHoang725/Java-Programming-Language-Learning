import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nhap chuoi: ");
        String str = br.readLine();

        System.out.println("Nhap so nguyen: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Chuoi da nhap: " + str);
        System.out.println("So nguyen da nhap: " + num);
    }
}
