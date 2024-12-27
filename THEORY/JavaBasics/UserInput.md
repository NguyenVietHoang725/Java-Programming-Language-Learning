# User Input - Đọc dữ liệu đầu vào

---

Java cung cấp các công cụ xử lý I/O mạnh mẽ trong gói `java.io` và `java.util.` Hai cách phổ biến nhất để đọc dữ liệu đầu vào trong Java là sử dụng lớp `BufferedReader` và `Scanner`.

---

# 1. BufferedReader Class

Lớp **BufferedReader** được sử dụng để đọc chuỗi ký tự từ luồng đầu vào. Nó cho phép đọc dữ liệu theo từng dòng hoặc từng ký tự. **BufferedReader** thường được kết hợp với **InputStreamReader** để chuyển đổi luồng byte sang luồng ký tự.

Ưu điểm:

- Nhanh hơn Scanner vì không thực hiện nhiều bước xử lý.
- Hỗ trợ đọc dữ liệu lớn hơn nhờ bộ đệm.

Cú pháp:

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

Ví dụ:

```java
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
```

Output:

```
Nhap chuoi:
Hello
Nhap so nguyen:
72
Chuoi da nhap: Hello
So nguyen da nhap: 72
```

---

# 2. Scanner Class

Lớp **Scanner** được giới thiệu sau này trong Java và hỗ trợ đọc đầu vào từ nhiều nguồn khác nhau như bàn phím, file, chuỗi, v.v. **Scanner** cung cấp các phương thức trực tiếp để đọc nhiều kiểu dữ liệu khác nhau như `nextInt()`, `nextFloat()`, `nextLine()`...

Ưu điểm:

- Thân thiện với người dùng, dễ sử dụng.
- Không cần chuyển đổi kiểu dữ liệu (như Integer.parseInt() trong BufferedReader).

Cú pháp:

```java
Scanner sc = new Scanner(System.in);
```

Ví dụ:

```java
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
```

Output:

```
Nhap chuoi:
Hello
Nhap so nguyen:
72
Nhap so thuc:
12.5
Chuoi vua nhap: Hello
So nguyen vua nhap: 72
So thuc vua nhap: 12.5
```

# 3. So sánh giữa BufferedReader và Scanner

| Tiêu chí              | BufferedReader                             | Scanner                                       |
| --------------------- | ------------------------------------------ | --------------------------------------------- |
| Tốc độ                | Nhanh hơn vì không xử lý hậu kỳ            | Chậm hơn vì xử lý hậu kỳ (parsing)            |
| Đọc dữ liệu lớn       | Hiệu quả hơn cho dữ liệu lớn               | Không tối ưu cho dữ liệu lớn                  |
| Đa luồng              | Synchronized (an toàn với nhiều luồng)     | Không synchronized                            |
| Cú pháp               | Phức tạp hơn (cần chuyển đổi kiểu dữ liệu) | Dễ dùng hơn nhờ các phương thức như `nextInt` |
| Kích thước bộ nhớ đệm | Có thể tuỳ chỉnh kích thước bộ đệm         | Không hỗ trợ tuỳ chỉnh bộ đệm                 |
| Đọc chuỗi nhiều từ    | Sử dụng `readLine()` để đọc cả dòng        | Cần dùng `nextLine()` (sau khi đọc `next()`)  |
| Ứng dụng              | Phù hợp cho xử lý dữ liệu lơn, đa luồng    | Phù hợp cho chương trình nhỏ, dễ đọc đầu vào  |
