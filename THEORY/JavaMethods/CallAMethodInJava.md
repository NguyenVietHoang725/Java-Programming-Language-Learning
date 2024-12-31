# Gọi Phương thức trong Java như thế nào ?

---

# 1. Gọi Phương Thức Do Người Dùng Định Nghĩa (User-Defined Methods)

Phương thức do người dùng định nghĩa là một tập hợp các câu lệnh thực hiện một nhiệm vụ cụ thể. Những phương thức này giúp tái sử dụng mã và tổ chức chương trình một cách hiệu quả.

Ví dụ:

```java
public class CallMethod {

    void hello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Tạo một đối tượng
        CallMethod obj = new CallMethod();

        // Gọi phương thức hello() của đối tượng obj
        obj.hello();
    }
}
```

Output:

```
Hello World
```

Lưu ý: Phương thức không tĩnh (non-static) chỉ có thể được gọi thông qua một đối tượng của lớp.

---

# 2. Gọi Phương Thức Trừu Tượng (Abstract Methods)

Phương thức trừu tượng được khai báo trong lớp trừu tượng và phải được triển khai (override) trong lớp con.

Ví dụ:

```java
abstract class AbstractMethod {
    abstract void check(String n);
}

public class CallAbstractMethod extends AbstractMethod {
    public static void main(String[] args) {
        CallAbstractMethod obj = new CallAbstractMethod();
        obj.check("Hello");
    }

    @Override
    void check(String n) {
        System.out.println(n);
    }
}
```

Output:

```
Hello
```

Giải thích: Phương thức check() được khai báo trong lớp trừu tượng AbstractMethod và được triển khai trong lớp con CallAbstractMethod. Phương thức này in chuỗi "Hello" khi được gọi.

---

# 3. Gọi Phương Thức Định Nghĩa Sẵn (Predefined Methods)

Java cung cấp các phương thức định nghĩa sẵn trong thư viện chuẩn, ví dụ: phương thức `hashCode()` từ lớp `Object`.

Ví dụ:

```java
public class CallPredefinedMethods {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp
        CallPredefinedMethods ob = new CallPredefinedMethods();

        // Gọi phương thức hashCode()
        System.out.println(ob.hashCode());
    }
}
```

Output:

```
1159190947
```

Giải thích: Phương thức `hashCode()` được kế thừa từ lớp `Object`, trả về một mã băm duy nhất cho đối tượng `CallPredefinedMethods`.

---

# 4. Gọi Phương Thức Tĩnh (Static Methods)

Phương thức tĩnh thuộc về lớp và có thể được gọi mà không cần tạo đối tượng.

Ví dụ:

```java
class Test {
    // Phương thức tĩnh
    static void hello() {
        System.out.println("Hello World!");
    }
}

public class CallStaticMethod {
    public static void main(String[] args) {
        Test.hello();
    }
}
```

Output:

```
Hello World!
```

Giải thích: Trong ví dụ trên, phương thức tĩnh `hello()` được gọi từ lớp Test mà không cần tạo một đối tượng. Phương thức này in ra "Hello".
