# 7. Java Operators

Toán tử Java là các ký hiệu đặc biệt thực hiện các phép toán trên biến hoặc giá trị. Chúng có thể được phân loại thành nhiều loại dựa trên chức năng của chúng. Những toán tử này đóng vai trò quan trọng trong việc thực hiện các phép toán số học, logic, quan hệ và phép toán bitwise, v.v.

## 7.1. Các loại toán tử trong Java

### 7.1.1. Arithmetic Operator - Toán tử số học

Toán tử số học được sử dụng để thực hiện các phép toán số học đơn giản trên các kiểu dữ liệu nguyên thủy và không nguyên thủy.

- `*` : Pháp nhân
- `/` : Phép chia
- `%` : Phép chia lấy dư
- `+` : Phép cộng
- `-` : Phép trừ

Ví dụ:

```java
class ArithmeticOperator {
    public static void main(String[] args) {
        // Arithmetic operators on integers
        int a = 10;
        int b = 3;

        // Arithmetic operators on String literals
        String n1 = "15";
        String n2 = "25";

        // Parsing String to integer
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a1 + b1 = " + (a1 + b1));
    }
}
```

Output:

```
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1
a1 + b1 = 40
```

### 7.1.2. Unary Operator - Toán tử một ngôi

Toán tử một ngôi chỉ cần một toán hạng. Chúng được sử dụng để tăng, giảm hoặc phủ định một giá trị.

Các toán tử đơn bao gồm:

- `+` : Chỉ ra giá trị dương (tự động chuyển đổi byte, char, hoặc short thành int)
- `-` : Phủ định giá trị
- `++` : Tăng một đơn vị
- `--` : Giảm một đơn vị
- `!` : Phủ định giá trị boolean

Ví dụ:

```java
public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
```

Output:

```
Postincrement : 10
Preincrement : 12
Postdecrement : 10
Predecrement : 8
```

### 7.1.3. Assigmment Operator - Toán tử gán

Toán tử gán = được sử dụng để gán một giá trị cho một biến. Toán tử này có tính liên kết từ phải sang trái, tức là giá trị bên phải sẽ được gán cho biến bên trái.

Toán tử gán có thể kết hợp với các toán tử khác để tạo thành các câu lệnh viết tắt, ví dụ:

- `+=` : Cộng và gán
- `-=` : Trừ và gán
- `*=` : Nhân và gán
- `/=` : Chia và gán
- `%=` : Lấy phần dư và gán

Ví dụ:

```java
public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 7;

        System.out.println("a += 2 : " + (a += 2));
        System.out.println("a -= 3 : " + (a -= 3));
        System.out.println("a *= 2 : " + (a *= 2));
        System.out.println("a /= 4 : " + (a /= 6));
        System.out.println("a %= 3 : " + (a %= 3));
    }
}
```

Output:

```
a += 2 : 9
a -= 3 : 6
a *= 2 : 12
a /= 4 : 2
a %= 3 : 2
```

### 7.1.4. Relational Operator - Toán tử quan hệ

Toán tử quan hệ được dùng để so sánh giá trị và trả về kết quả boolean.

- `==` : Bằng
- `!=` : Không bằng
- `<` : Nhỏ hơn
- `<=` : Nhỏ hơn hoặc bằng
- `>` : Lớn hơn
- `>=` : Lớn hơn hoặc bằng

Ví dụ:

```java
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 6;

        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a != c : " + (a != c));
    }
}
```

Output:

```
a > b : true
a < b : false
a >= b : true
a <= b : false
a == c : false
a != c : true
```

### 7.1.5. Logical Operator - Toán tử Logic

Các toán tử Logic là:

- `&&` (AND logic) : Trả vể `true` khi cả hai điều kiện đúng.
- `||` (OR logic) : Trả về `true` nếu ít nhất một điều kiện đúng.
- `!` (NOT logic) : Trả về `true` nếu điều kiện sai và ngược lại.

Ví dụ:

```java
public class LogicalOperator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
    }
}
```

Output:

```
x && y : false
x || y : true
!x : false
```

### 7.1.6. Ternary Operator - Toán tử ba ngôi

Toán tử ba ngôi là một dạng rút gọn của câu lệnh if-else. Nó bao gồm 3 toán hạng, đó là lý do tại sao nó được gọi là "ba ngôi."

Cú pháp:

```java
condition ? expression_if_true : expression_if_false
```

Cú pháp trên có nghĩa là nếu điều kiện có giá trị `true` thì sau đó thực thi câu lệnh sau dấu `?` và ngược lại sẽ thực thi câu lệnh sau dấu `:`

Ví dụ:

```java
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 30, result;

        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("The maximum value is: " + result);
    }
}
```

Output:

```
The maximum value is: 30
```

### 7.1.7. Bitwise Operator - Toán tử Bitwise
