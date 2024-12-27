# 7. Java Operators

---

Toán tử Java là các ký hiệu đặc biệt thực hiện các phép toán trên biến hoặc giá trị. Chúng có thể được phân loại thành nhiều loại dựa trên chức năng của chúng. Những toán tử này đóng vai trò quan trọng trong việc thực hiện các phép toán số học, logic, quan hệ và phép toán bitwise, v.v.

---

- [7. Java Operators](#7-java-operators)
  - [7.1. Các loại toán tử trong Java](#71-các-loại-toán-tử-trong-java)
    - [7.1.1. Arithmetic Operator - Toán tử số học](#711-arithmetic-operator---toán-tử-số-học)
    - [7.1.2. Unary Operator - Toán tử một ngôi](#712-unary-operator---toán-tử-một-ngôi)
    - [7.1.3. Assigmment Operator - Toán tử gán](#713-assigmment-operator---toán-tử-gán)
    - [7.1.4. Relational Operator - Toán tử quan hệ](#714-relational-operator---toán-tử-quan-hệ)
    - [7.1.5. Logical Operator - Toán tử Logic](#715-logical-operator---toán-tử-logic)
    - [7.1.6. Ternary Operator - Toán tử ba ngôi](#716-ternary-operator---toán-tử-ba-ngôi)
    - [7.1.7. Bitwise Operator - Toán tử Bitwise](#717-bitwise-operator---toán-tử-bitwise)
    - [7.1.8. Shift Operator - Toán tử Shift](#718-shift-operator---toán-tử-shift)
    - [7.1.9. instanceof Operator - Toán tử instanceof](#719-instanceof-operator---toán-tử-instanceof)
  - [7.2. Thứ tự ưu tiên và Quy tắc kết hợp của toán tử trong Java](#72-thứ-tự-ưu-tiên-và-quy-tắc-kết-hợp-của-toán-tử-trong-java)
    - [7.2.1. Precedence (Thứ tự ưu tiên)](#721-precedence-thứ-tự-ưu-tiên)
    - [7.2.2. Asscociativity (Quy tắc kết hợp)](#722-asscociativity-quy-tắc-kết-hợp)
    - [7.2.3. Bảng thứ tự ưu tiên](#723-bảng-thứ-tự-ưu-tiên)

---

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

Toán tử bitwise được sử dụng để thao tác các bit riêng lẻ của một số và với bất kỳ loại số nguyên nào. Chúng được sử dụng khi thực hiện cập nhật và truy vấn các phép toán trong cây nhị phân chỉ mục.

- `&` (Phép AND theo bit) : trả về kết quả AND theo từng bit của các giá trị đầu vào.
- `|` (Phép OR theo bit) : trả về kết quả OR theo từng bit của các giá trị đầu vào.
- `^` (Phép XOR theo bit) : trả về kết quả XOR theo từng bit của các giá trị đầu vào.
- `~` (Phép bổ sung theo bit) : đảo ngược tất cả các bit (bổ sung của số một).

Ví dụ:

```java
public class BitwiseOperator {
    public static void main(String[] args) {
        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 2 : " + (e >> 1));
        System.out.println("e >>> 2 : " + (e >>> 1));
    }
}
```

Output:

```
d & e : 8
d | e : 14
d ^ e : 6
~d : -11
d << 2 : 40
e >> 2 : 6
e >>> 2 : 6
```

### 7.1.8. Shift Operator - Toán tử Shift

Toán tử Shift được sử dụng để dịch chuyển các bit của một số sang trái hoặc phải, từ đó nhân hoặc chia số đó cho hai. Chúng rất hữu ích khi cần thực hiện các phép nhân hoặc chia cho lũy thừa của hai.

Cú pháp:

```java
number shift_op number_of_places_to_shift;
```

- `number`: Số cần dịch chuyển (kiểu dữ liệu nguyên: int, long).
- `shift_op`: Toán tử dịch chuyển (<<, >>, >>>).
- `number_of_places_to_shift`: Số lượng bit cần dịch chuyển.

Các loại Toán tử Shift:

- `<<` : Left Shift - Dịch trái:
  - Dịch chuyển các bit sang trái, thêm các bit 0 vào bên phải.
  - Mỗi lần dịch sang trái tương ứng nhân số đó với $2^{number-of-places-to-shift}$
  - Ví dụ:
    ```java
    int num = 5; // 5 = 00000101 (nhị phân)
    int result = num << 2; // 20 = 00010100
    System.out.println(result); // Output: 20
    ```
- `>>` : Signed Right Shift - Dịch phải có dấu:
  - Dịch chuyển các bit sang phải, thêm các bit phụ thuộc vào dấu:
    - Nếu số là dương: thêm 0 vào bên trái.
    - Nếu số là âm: thêm 1 vào bên trái để duy trì dấu âm.
  - Mỗi lần dịch sang trái tương ứng chia số đó với $2^{number-of-places-to-shift}$
  - Ví dụ:
    ```java
    int num = -8; // -8 = 11111000 (nhị phân, dạng bù 2)
    int result = num >> 2; // -2 = 11111110
    System.out.println(result); // Output: -2
    ```
- `>>>` : Unsigned Right Shift - Dịch phải không dấu:
  - Dịch chuyển các bit sang phải, thêm các bit 0 vào bên trái bất kể dấu của số.
  - Không duy trì dấu âm.
  - Ví dụ:
    `` java
int num = -8; // -8 = 11111000 (nhị phân, dạng bù 2)
int result = num >>> 2; // 1073741822 (tất cả bit trái thành 0)
System.out.println(result); // Output: 1073741822`
 ``
    Lưu ý:
- Các toán tử dịch chuyển chỉ áp dụng được cho kiểu dữ liệu nguyên (`byte`, `short`, `int`, `long`).
- Số bit được dịch chuyển sẽ được tính toán modulo với số bit tối đa của kiểu dữ liệu đó (ví dụ: 32 đối với `int`).

Ví dụ:

```java
public class ShiftOperator {
    public static void main(String[] args) {
        int num = -8;

        int res1 = num << 2;
        int res2 = num >> 2;
        int res3 = num >>> 2;

        System.out.println("Left Shift: " + res1);
        System.out.println("Signed Right Shift: " + res2);
        System.out.println("Unsigned Right Shift: " + res3);
    }
}
```

Output:

```
Left Shift: -32
Signed Right Shift: -2
Unsigned Right Shift: 1073741822
```

### 7.1.9. instanceof Operator - Toán tử instanceof

Toán tử instanceof được sử dụng để kiểm tra kiểu dữ liệu của một đối tượng. Nó xác định xem một đối tượng có phải là một thể hiện của một lớp, lớp con, hoặc thực hiện một giao diện nào đó hay không.

Cú pháp chung:

```java
object instanceof class/subclass/interface
```

- `object`: Đối tượng cần kiểm tra.
- `class/subclass/interface`: Lớp, lớp con, hoặc giao diện cần kiểm tra.

Lưu ý:

- Toán tử trả về true nếu đối tượng thuộc loại kiểm tra hoặc là thể hiện của lớp kế thừa/giao diện liên quan.
- Trả về false nếu đối tượng không thuộc loại kiểm tra hoặc là null.

Lợi ích:

- Hữu ích trong kiểm tra kiểu đối tượng tại runtime.
- Được sử dụng trong đa hình (polymorphism) để đảm bảo rằng các phương thức chỉ hoạt động trên các kiểu đối tượng cụ thể.

Ví dụ:

```java
public class instanceofOperator {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Boy();

        // Kiểm tra obj1
        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person)); // true
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy)); // false
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface)); // false

        // Kiểm tra obj2
        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person)); // true
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy)); // true
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface)); // true
    }
}

// Classes and Interfaces used are declared here
class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
```

Output:

```
obj1 instanceof Person: true
obj1 instanceof Boy: false
obj1 instanceof MyInterface: false
obj2 instanceof Person: true
obj2 instanceof Boy: true
obj2 instanceof MyInterface: true
```

---

## 7.2. Thứ tự ưu tiên và Quy tắc kết hợp của toán tử trong Java

Trong Java, precedence (thứ tự ưu tiên) và associativity (quy tắc kết hợp) được sử dụng để xác định trình tự thực hiện khi một biểu thức chứa nhiều toán tử khác nhau. Những quy tắc này giúp đảm bảo rằng biểu thức được tính toán theo một trình tự rõ ràng và không gây nhầm lẫn.

### 7.2.1. Precedence (Thứ tự ưu tiên)

- Precedence quy định toán tử nào sẽ được đánh giá trước nếu có nhiều toán tử trong một biểu thức.
- Toán tử có mức ưu tiên cao hơn sẽ được thực thi trước toán tử có mức ưu tiên thấp hơn.

### 7.2.2. Asscociativity (Quy tắc kết hợp)

- Khi các toán tử có cùng mức ưu tiên xuất hiện trong biểu thức, associativity xác định thứ tự tính toán.
- Có hai loại associativity:
  - Left-to-Right (Trái sang Phải): Biểu thức được tính toán từ trái qua phải.
  - Right-to-Left (Phải sang Trái): Biểu thức được tính toán từ phải qua trái.

### 7.2.3. Bảng thứ tự ưu tiên

| **Precedence** | **Operator**                                                               | **Associativity** |
| -------------- | -------------------------------------------------------------------------- | ----------------- |
| 1 (Cao nhất)   | `()`, `[]`, `.`, `::` (method reference)                                   | Left-to-Right     |
| 2              | `++`, `--` (postfix)                                                       | Left-to-Right     |
| 3              | `++`, `--` (prefix), `+`, `-` (unary), `~`, `!`                            | Right-to-Left     |
| 4              | `*`, `/`, `%`                                                              | Left-to-Right     |
| 5              | `+`, `-`                                                                   | Left-to-Right     |
| 6              | `<<`, `>>`, `>>>`                                                          | Left-to-Right     |
| 7              | `<`, `<=`, `>`, `>=`, `instanceof`                                         | Left-to-Right     |
| 8              | `==`, `!=`                                                                 | Left-to-Right     |
| 9              | `&`                                                                        | Left-to-Right     |
| 10             | `^`                                                                        | Left-to-Right     |
| 11             | `\|`                                                                       | Left-to-Right     |
| 12             | `&&`                                                                       | Left-to-Right     |
| 13             | `\|\|`                                                                     | Left-to-Right     |
| 14             | `?:` (ternary)                                                             | Right-to-Left     |
| 15             | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `<<=`, `>>=`, `>>>=`, `&=`, `^=`, `\|=` | Right-to-Left     |
