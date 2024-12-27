# For Loop - Vòng lặp For

---

# 1. Khái niệm

Vòng lặp for trong Java là một cấu trúc điều khiển luồng cho phép lặp lại việc thực thi mã dựa trên một điều kiện cho trước. Nó thường được sử dụng để duyệt qua phạm vi giá trị, thực hiện mã nhiều lần hoặc xử lý mảng một cách hiệu quả.

---

# 2. Cách hoạt động cơ bản

Cấu trúc của vòng lặp for:

```java
for (initialization; condition; update) {
    // Khối lệnh cần thực hiện
}
```

Các bước thực thi:

1. Khởi tạo (`initialization`): Được thực hiện một lần khi vòng lặp bắt đầu.
2. Kiểm tra điều kiện (`condition`): Nếu đúng, chương trình thực thi thân vòng lặp; nếu sai, vòng lặp kết thúc.
3. Thực thi thân vòng lặp: Các câu lệnh bên trong vòng lặp sẽ được thực thi.
4. Cập nhật (`update`): Thực hiện sau mỗi lần lặp, thường dùng để tăng hoặc giảm biến điều khiển.
5. Lặp lại bước kiểm tra điều kiện cho đến khi điều kiện trả về false.

# 3. Ví dụ

```java
public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Finished");
    }
}
```

Output:

```
0
1
2
3
4
5
Finished
```

# 4. Vòng lặp lồng nhau (Nested For Loop)

Vòng lặp for lồng nhau là kỹ thuật sử dụng một vòng lặp bên trong một vòng lặp khác, thường được dùng để giải quyết các bài toán đa chiều.

```java
public class MatrixExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
```

Output:

```
(1,1) (1,2) (1,3)
(2,1) (2,2) (2,3)
(3,1) (3,2) (3,3)
```

# 5. Vòng lớp for-each

Vòng lặp for-each (giới thiệu từ Java 5) là cách đơn giản hóa để lặp qua các mảng và bộ sưu tập.

```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```

Output:

```
1 2 3 4 5
```

- Ưu điểm
  - Cú pháp gọn gàng, dễ đọc.
  - Phù hợp để duyệt qua toàn bộ mảng hoặc bộ sưu tập.
- Hạn chế
  - Không thể thay đổi trực tiếp phần tử mảng.
  - Không truy cập được chỉ số của phần tử.
  - Chỉ hỗ trợ duyệt theo thứ tự từ đầu đến cuối.
