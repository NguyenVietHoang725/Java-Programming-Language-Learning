# `if` Statement - Câu lệnh `if`

---

# 1. Tổng quan

Câu lệnh if trong Java là một trong những câu lệnh ra quyết định đơn giản nhất. Nó được sử dụng để kiểm tra xem một khối lệnh hoặc một câu lệnh có được thực thi hay không, dựa trên điều kiện có đúng hay không. Nếu điều kiện đúng, khối lệnh sẽ được thực thi, nếu không thì sẽ bị bỏ qua.

Ví dụ:

```java
public class ifStatement {
    public static void main(String[] args) {
        int i = 10;
        boolean a = true;

        if (i < 15) {
            System.out.println("10 nho hon 15!");
        }

        if (a) {
            System.out.println("Gia tri cua a la true!");
        }

        System.out.println("Ben ngoai khoi lenh if!");
    }
}
```

Output:

```
10 nho hon 15!
Gia tri cua a la true!
Ben ngoai khoi lenh if!
```

---

# 2. Câu lệnh `if`

Cú pháp:

```java
if (condition) {
    // Các câu lệnh được thực thi khi
    // điều kiện đúng
}
```

Quy trình thực thi:

1. Dòng điều khiển đi vào khối `if`
2. Điều kiện được kiểm tra:
   - Nếu điều kiện đúng, thực hiện khối lệnh bên trong.
   - Nếu sai, bỏ qua khối lệnh `if`
3. Dòng điều khiển tiếp tục sau khối `if`

Lưu ý: Nếu không sử dụng dấu ngoặc nhọn `{}` trong câu lệnh `if`, chỉ câu lệnh ngay sau `if` sẽ được xem là thuộc khối `if`.

---

# 3. Câu lệnh `if-else`

Cú pháp:

```java
if (condition) {
    // Thực thi khi điều kiện đúng
} else {
    // Thực thi khi điều kiện sai
}
```

Quy trình thực thi:

1. Dòng điều khiển đi vào khối `if`
2. Điều kiện được kiểm tra:
   - Nếu điều kiện đúng, thực hiện khối lệnh bên trong `if`.
   - Nếu sai, thực hiện khối lệnh bên trong `else`
3. Dòng điều khiển tiếp tục sau khối `if-else`

Ví dụ:

```java
public class ifelseStatement {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("a la true");
        } else {
            System.out.println("a la false");
        }

        if (b) {
            System.out.println("b la true");
        } else {
            System.out.println("b la false");
        }
    }
}
```

Output:

```
a la true
b la false
```

---

## 4. Câu lệnh `if` lồng nhau

Cú pháp:

```java
if (condition1) {
    // Khối lệnh 1
    if (condition2) {
        // Khối lệnh 2
    }
}
```

Ví dụ:

```java
public class NestedIf {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Number is even");
            if (num % 3 == 0) {
                System.out.println("Number is divisible by 3");
            }
        } else {
            System.out.println("Number is odd");
            if (num % 5 == 0) {
                System.out.println("Number is divisible by 5");
            }
        }
    }
}
```

Output:

```
Number is even
```

---

# 5. Câu lệnh `if-else-if ladder`

Câu lệnh if-else-if ladder được sử dụng để kiểm tra nhiều điều kiện theo thứ tự. Nó cho phép chương trình kiểm tra từng điều kiện và thực thi khối mã tương ứng với điều kiện đầu tiên đúng. Nếu không có điều kiện nào đúng, một khối else tùy chọn sẽ được thực thi như một cơ chế dự phòng.

Cú pháp:

```java
if (condition_1) {
    // Khối lệnh 1
} else if (condition_2) {
    // Khối lệnh 2
} ... {

} else {
    // Khối lệnh else
}

```

Quy trình thực thi:

1. Bắt đầu tại khối if.
2. Kiểm tra điều kiện đầu tiên:
   - Nếu đúng, thực thi khối lệnh và thoát khỏi cấu trúc.
   - Nếu sai, kiểm tra điều kiện tiếp theo.
3. Quá trình kiểm tra tiếp tục đến khi:
   - Một điều kiện đúng và khối tương ứng được thực thi.
   - Không có điều kiện nào đúng, khối else sẽ được thực thi (nếu có).
4. Thoát khỏi cấu trúc.

Ví dụ:

```java
public class IfElseIfLadder {
    public static void main(String[] args) {
        int number = 10;

        if (number == 10) {
            System.out.println("Number is 10");
        } else if (number == 20) {
            System.out.println("Number is 20");
        } else {
            System.out.println("Number is not 10 or 20");
        }
    }
}
```

Output:

```
Number is 10
```
