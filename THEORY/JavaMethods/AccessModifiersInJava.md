# Access Modifiers

Access modifiers trong Java được sử dụng để kiểm soát phạm vi (scope) và khả năng truy cập (accessibility) của các lớp, phương thức, biến, hoặc thành viên dữ liệu trong chương trình. Java cung cấp 4 loại access modifiers chính:

1. Default – Không cần từ khóa.
2. Private – Từ khóa private.
3. Protected – Từ khóa protected.
4. Public – Từ khóa public.

---

# 1. Default Access Modifiers

- Phạm vi truy cập: Chỉ có thể truy cập trong cùng một package.
- Khi sử dụng: Khi không chỉ định bất kỳ access modifier nào, Java tự động sử dụng default access modifier.

Cú pháp tổng quát:

```java
class ClassName {
    // Phương thức hoặc biến với default access modifier
    void methodName() {
        // Code
    }
}
```

Ví dụ:

Trong cùng package:

```java
package p1;

class DefaultExample {
    void display() {
        System.out.println("Default Access Modifier");
    }
}

class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display(); // Hợp lệ
    }
}
```

Khác package:

```java
package p2;

import p1.*;

class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display(); // Lỗi biên dịch vì phạm vi bị giới hạn trong package p1
    }
}
```

---

# 2. Private Access Modifiers

- Phạm vi truy cập: Chỉ có thể truy cập bên trong lớp khai báo.
- Ứng dụng: Đảm bảo tính bảo mật cho dữ liệu (Encapsulation).

Cú pháp tổng quát:

```java
class ClassName {
    private dataType variableName;

    private void methodName() {
        // Code
    }
}
```

Ví dụ:

```java
class PrivateExample {
    private String message = "Private Access Modifier";

    private void display() {
        System.out.println(message);
    }

    public void show() {
        display(); // Có thể gọi từ bên trong lớp
    }
}

class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // obj.display(); // Lỗi biên dịch
        obj.show(); // Hợp lệ
    }
}
```

---

# 3. Protected Access Modifiers

- Phạm vi truy cập:
  - Trong cùng package.
  - Ngoài package nhưng thông qua kế thừa (subclass).
- Ứng dụng: Sử dụng khi muốn chia sẻ dữ liệu giữa lớp cha và lớp con.

Cú pháp tổng quát:

```java
class ParentClass {
    protected dataType variableName;

    protected void methodName() {
        // Code
    }
}
```

Ví dụ:

```java
package p1;

public class ParentClass {
    protected void display() {
        System.out.println("Protected Access Modifier");
    }
}

// Package khác
package p2;

import p1.*;

class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display(); // Hợp lệ do kế thừa
    }
}
```

---

# 4. Public Access Modifiers

- Phạm vi truy cập: Truy cập từ bất kỳ đâu, không bị giới hạn package.
- Ứng dụng: Sử dụng khi muốn chia sẻ dữ liệu và phương thức công khai.

Cú pháp tổng quát:

```java
public class ClassName {
    public dataType variableName;

    public void methodName() {
        // Code
    }
}
```

Ví dụ:

```java
package p1;

public class PublicExample {
    public void display() {
        System.out.println("Public Access Modifier");
    }
}

// Package khác
package p2;

import p1.*;

class TestPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display(); // Hợp lệ
    }
}
```

---

# 5. So sánh các Access Modifiers

| Modifier  | Trong cùng lớp | Trong cùng package | Từ lớp con khác package | Từ bất kỳ đâu |
| --------- | -------------- | ------------------ | ----------------------- | ------------- |
| Default   | Yes            | Yes                | No                      | No            |
| Private   | Yes            | No                 | No                      | No            |
| Protected | Yes            | Yes                | Yes (Thông qua kế thừa) | No            |
| Public    | Yes            | Yes                | Yes                     | Yes           |

---

# 6. Lưu ý quan trọng

1. Sử dụng hạn chế nhất:

- Sử dụng private cho dữ liệu nhạy cảm.
- Tránh sử dụng public nếu không cần thiết.

2. Kế thừa và bảo vệ:

- Dùng protected khi cần chia sẻ thông tin giữa lớp cha và lớp con.

3. Encapsulation:

- Kết hợp access modifier với getter và setter để quản lý truy cập.
