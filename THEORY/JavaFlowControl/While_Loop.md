# While Loop - Vòng lặp While

---

# 1. Vòng lặp `while` trong Java

Vòng lặp while là một câu lệnh điều khiển luồng dùng để thực thi một khối lệnh lặp lại liên tục cho đến khi điều kiện xác định trả về giá trị false. Khi điều kiện không còn đúng, chương trình sẽ tiếp tục thực thi từ dòng lệnh ngay sau vòng lặp.

Cú pháp:

```java
while (condition) {
    // Các câu lệnh cần thực thi
}
```

Lưu ý: Nếu không có dấu {} sau câu lệnh while, chỉ câu lệnh đầu tiên ngay sau while được coi là thuộc vòng lặp.

Các thành phần của vòng lặp while

- Biểu thức kiểm tra: Điều kiện được kiểm tra trước mỗi lần lặp. Nếu điều kiện trả về true, vòng lặp thực thi. Nếu false, vòng lặp kết thúc. Ví dụ: i <= 5.

- Biểu thức cập nhật: Sau mỗi lần lặp, biểu thức này sẽ thay đổi giá trị của biến điều khiển. Ví dụ: i++.

Quy trình thực thi của vòng lặp while

1. Kiểm tra điều kiện.
2. Nếu điều kiện đúng, thực thi các câu lệnh trong thân vòng lặp.
3. Cập nhật giá trị biến điều khiển.
4. Quay lại bước 1 cho đến khi điều kiện sai.

Ví dụ:

```java
public class WhileExample {
    public static void main(String[] args) {
        int i = 1;

        while (i < 6) {
            System.out.println("Number: " + i);
            i++;
        }
    }
}
```

Output:

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

---

# 2. Vòng lặp `do-while` trong Java

Khác với vòng lặp while, vòng lặp do-while luôn thực thi ít nhất một lần trước khi kiểm tra điều kiện.

Cú pháp:

```java
do {
    // Các câu lệnh cần thực thi
} while (condition);
```

Ví dụ:

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int num = 6;

        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}
```

Output:

```
6
```
