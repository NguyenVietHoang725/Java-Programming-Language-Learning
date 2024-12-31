# Static Methods vs. Instance Methods

---

# 1. Instance Methods (Phương thức thể hiện)

## 1.1. Định nghĩa

- `Instance methods` là các phương thức yêu cầu phải tạo đối tượng của lớp trước khi có thể gọi.
- Được sử dụng để truy cập và thao tác với dữ liệu hoặc hành vi của một đối tượng cụ thể.

## 1.2. Cách khai báo

```java
[modifier] [return_type] methodName([parameter_list]) {
    // Code cần thực thi
    return [value]; // Nếu có
}
```

- Kiểu trả về có thể là int, float, String, hoặc kiểu dữ liệu do người dùng định nghĩa.

## 1.3. Phân bổ bộ nhớ

- Instance methods được lưu trữ trong Permanent Generation (PermGen) trên heap (đối với Java 7). Từ Java 8 trở đi, PermGen được thay thế bằng Metaspace.
- Các tham số (arguments), biến cục bộ và giá trị trả về được lưu trữ trong stack.

## 1.4. Điểm quan trọng

- Thuộc về đối tượng: Instance methods thuộc về đối tượng của lớp chứ không thuộc về lớp.
- Được chia sẻ trong bộ nhớ: Các phương thức không được lưu riêng cho từng đối tượng mà dùng chung một vùng nhớ. Con trỏ this sẽ được truyền vào để xác định đối tượng.
- Có thể ghi đè (overridden): Được giải quyết bằng dynamic binding tại thời điểm chạy (runtime).

## 1.5. Ví dụ

---

# 2. Static Methods (Phương thức tĩnh)

## 2.1. Định nghĩa

- Static methods là các phương thức có thể được gọi mà không cần tạo đối tượng của lớp.
- Được gọi thông qua tên lớp hoặc tham chiếu đối tượng.

## 2.2. Cách khai báo

```java
[modifier] static [return_type] methodName([parameter_list]) {
    // Code cần thực thi
    return [value]; // Nếu có
}
```

- Phải có từ khóa static trong khai báo.
- Kiểu trả về có thể là int, float, String, hoặc kiểu dữ liệu do người dùng định nghĩa.

## 2.3. Phân bổ bộ nhớ

- Static methods được lưu trữ trong Permanent Generation (PermGen) trên heap (đối với Java 7). Từ Java 8 trở đi, chúng được lưu trong Metaspace.
- Tham số truyền vào và biến cục bộ được lưu trong stack.

## 2.4. Điểm quan trọng

- Thuộc về lớp: Static methods được liên kết với lớp, không phải đối tượng.
- Chia sẻ giữa các đối tượng: Static methods được thiết kế để dùng chung cho tất cả các đối tượng của lớp.
- Không thể ghi đè (overridden): Được giải quyết bằng static binding tại thời điểm biên dịch (compile-time). Tuy nhiên, có thể xảy ra Method Hiding khi phương thức static trong lớp con che khuất phương thức static trong lớp cha.

## 2.5. Ví dụ

---

# 3. So sánh Instance Methods và Static Methods

| Tiêu chí                    | Instance Methods                                           | Static Methods                                     |
| --------------------------- | ---------------------------------------------------------- | -------------------------------------------------- |
| Truy cập                    | Qua đối tượng.                                             | Qua tên lớp hoặc tham chiếu đối tượng.             |
| Ghi đè (Override)           | Thuộc về đối tượng.                                        | Thuộc về lớp.                                      |
| Truy cập biến & phương thức | Truy cập trực tiếp cả biến và phương thức static/instance. | Chỉ truy cập trực tiếp biến và phương thức static. |
| Sử dụng từ khoá `this`      | Có thể sử dụng từ khoá `this`                              | Không thể sử dụng từ khoá `this`                   |

---

# 4. Câu hỏi thường gặp

## 4.1. Nếu biến static tham chiếu đến một đối tượng thì sao ?

```java
static int i = 1;
static Object obj = new Object();
```

- Giá trị `i` được lưu trong PermGen (hoặc Metaspace từ Java 8).
- Tham chiếu `obj` cũng được lưu trong PermGen, nhưng đối tượng mà nó tham chiếu đến sẽ được lưu trong heap.

## 4.2. Khi nào nên sử dụng static methods ?

- Khi cần chia sẻ mã giữa tất cả các đối tượng của cùng một lớp.
- Khi truy cập các trường hoặc phương thức static của lớp.
