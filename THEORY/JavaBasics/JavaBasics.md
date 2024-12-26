# SECTION 1: JAVA BASICS

---

# 1. Java "Hello World" Program

## 1.1. Chương trình Java "Hello World"

Để bắt đầu học Java, bạn có thể bắt đầu với chương trình đơn giản "`Hello World`". Đây là chương trình cơ bản giúp bạn hiểu cách tạo và chạy một chương trình Java.

Dưới đây là mã nguồn cho chương trình "Hello World" trong Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        // In ra màn hình dòng chữ "Hello World!"
        System.out.println("Hello World!");
    }
}
```

Giải thích mã nguồn:

1. `public class HelloWorld`: Đây là phần khai báo lớp (class) có tên là `HelloWorld`. Trong Java, mọi chương trình đều cần phải được đặt trong một lớp.
2. `public static void main(String[] args)`: Đây là phương thức `main`, phương thức chính mà Java bắt đầu chạy khi bạn khởi động chương trình.
   - Từ khóa `public` có nghĩa là phương thức có thể được truy cập từ bất kỳ đâu/
   - `static` có nghĩa là phương thức này không cần phải tạo đối tượng mới của lớp để gọi.
   - `void` có nghĩa là phương thức này không trả về giá trị gì.
   - `String[] args` là tham số nhận vào các đối số khi chạy chương trình (mặc dù trong trường hợp này không sử dụng đến).
3. `System.out.println("Hello, World!");`: Dòng này sẽ in ra màn hình dòng chữ "Hello, World!".

## 1.2. Các bước để triển khai một chương trình Java

Để triển khai một chương trình Java, chúng ta cần thực hiện các bước sau:

1. **Tạo chương trình (Creating the program)**

- Viết mã nguồn chương trình Java bằng trình soạn thảo văn bản (như Notepad, VS Code, IntelliJ IDEA).
- Lưu tệp với phần mở rộng `.java`. Ví dụ: `HelloWorld.java`.

2. **Biên dịch chương trình (Compiling the program)**

- Sử dụng trình biên dịch Java (`javac`) để biên dịch mã nguồn thành bytecode (`.class`).
- Thực hiện trên terminal/command prompt:
  ```
  javac HelloWorld.java
  ```
- Nếu không có lỗi, trình biên dịch sẽ tạo một tệp `HelloWorld.class` chứa bytecode của chương trình.

3. **Chạy chương trình (Running the program)**

- Để chạy chương trình, chúng ta cần dùng trình thông dịch Java (java) để thực thi bytecode.
  ```
  java HelloWorld
  ```
- Kết quả sẽ được in ra màn hình (trong trường hợp này là dòng "Hello, World!").
- Lưu ý: Khi chạy, bạn chỉ cần viết tên tệp lớp (không bao gồm phần mở rộng `.class`).

---

# 2. Java Identifiers

## 2.1. Định nghĩa

**Identifier** là `tên được đặt` cho các `thành phần` trong Java, chẳng hạn như: Biến (Variables), Lớp (Classes), Phương thức (Methods), Gói (Packages), Giao diện (Interfaces), ...

Mỗi **identifier** phải là `duy nhất` trong `phạm vi` của nó.

## 2.2. Ví dụ về Identifiers

```java
public class Test {
    public static void main(String[] args) {
        int a = 20;
    }
}
```

Trong đoạn mã trên, chúng ta có 5 Identifiers:

- Test: Tên lớp (Class Name).
- main: Tên phương thức (Method Name).
- String: Tên lớp định nghĩa sẵn (Predefined Class Name).
- args: Tên biến (Variables Name).
- a: Tên biến (Variables Name).

## 2.3. Quy tắc đặt tên Identifiers trong Java

Khi đặt tên **identifier**, cần tuân theo các quy tắc sau để tránh lỗi biên dịch:

1. **Ký tự được phép trong Identifier:**

- Các ký tự chữ và số (`[A-Z]`, `[a-z]`, `[0-9]`).
- Ký tự `$` (dấu đô la) và `_` (gạch dưới).
- Ví dụ hợp lệ: `myVariable`, `number_1`, `value$123`.
- Ví dụ không hợp lệ: `geek@` (chứa ký tự không hợp lệ `@`).

2. **Không được bắt đầu bằng chữ số ([0-9]):**

- Hợp lệ: `var123`, `value_1`.
- Không hợp lệ: `123var` (bắt đầu bằng chữ số).

3. **Phân biệt chữ hoa và chữ thường:**

- Java là ngôn ngữ `case-sensitive`, nghĩa là `MyVar` và `myvar` là hai identifier khác nhau.

4. **Không giới hạn độ dài của Identifier:**

- Có thể dài bất kỳ, nhưng nên giữ ở độ dài hợp lý (`4-15 ký tự`) để dễ đọc và bảo trì.

5. **Không sử dụng từ khóa dự trữ (Reserved Words):**

- Java có 53 từ khóa dự trữ, như `int`, `while`, `class`, không thể dùng làm **identifier**.
- Ví dụ không hợp lệ: `int while = 20;` (vì `while` là từ khóa).

---

# 3. Java Keywords

Java chứa một danh sách các **từ khóa** hoặc **từ dự trữ**, chúng được sử dụng để xác định hành động cụ thể trong chương trình. Các từ khóa này thường được làm nổi bật trong các IDE hoặc trình soạn thảo mã nguồn để phân biệt giữa từ linh hoạt và từ dự trữ.

| **Keyword**      | **Usage**                                                                                                    |
| ---------------- | ------------------------------------------------------------------------------------------------------------ |
| **abstract**     | Chỉ ra rằng một lớp hoặc phương thức sẽ được triển khai sau, trong một lớp con.                              |
| **assert**       | Đặt một biểu thức điều kiện trong chương trình Java để chỉ ra rằng biểu thức luôn đúng tại vị trí đó.        |
| **boolean**      | Kiểu dữ liệu có thể chỉ chứa giá trị `True` hoặc `False`.                                                    |
| **break**        | Câu lệnh điều khiển dùng để thoát khỏi các vòng lặp.                                                         |
| **byte**         | Kiểu dữ liệu có thể chứa các giá trị dữ liệu 8-bit.                                                          |
| **case**         | Dùng trong câu lệnh `switch` để đánh dấu các khối mã.                                                        |
| **catch**        | Bắt các ngoại lệ được sinh ra từ các câu lệnh `try`.                                                         |
| **char**         | Kiểu dữ liệu có thể chứa các ký tự Unicode 16-bit.                                                           |
| **class**        | Khai báo một lớp mới.                                                                                        |
| **continue**     | Gửi điều khiển quay lại vòng lặp.                                                                            |
| **default**      | Xác định khối mã mặc định trong câu lệnh `switch`.                                                           |
| **do**           | Bắt đầu một vòng lặp `do-while`.                                                                             |
| **double**       | Kiểu dữ liệu có thể chứa các số thực 64-bit.                                                                 |
| **else**         | Chỉ thị các nhánh thay thế trong câu lệnh `if`.                                                              |
| **enum**         | Từ khóa Java dùng để khai báo kiểu dữ liệu liệt kê. Các liệt kê kế thừa lớp cơ sở.                           |
| **extends**      | Chỉ ra rằng một lớp kế thừa từ một lớp hoặc giao diện khác.                                                  |
| **final**        | Chỉ ra rằng một biến giữ giá trị hằng hoặc một phương thức không thể bị ghi đè.                              |
| **finally**      | Chỉ ra một khối mã trong cấu trúc `try-catch` sẽ luôn được thực thi.                                         |
| **float**        | Kiểu dữ liệu có thể chứa các số thực 32-bit.                                                                 |
| **for**          | Dùng để bắt đầu một vòng lặp `for`.                                                                          |
| **if**           | Kiểm tra một biểu thức true/false và phân nhánh tương ứng.                                                   |
| **implements**   | Chỉ ra rằng một lớp thực hiện một giao diện.                                                                 |
| **import**       | Tham chiếu đến các lớp khác.                                                                                 |
| **instanceof**   | Kiểm tra xem một đối tượng có phải là thể hiện của một lớp hoặc giao diện cụ thể hay không.                  |
| **int**          | Kiểu dữ liệu có thể chứa các số nguyên 32-bit.                                                               |
| **interface**    | Khai báo một giao diện.                                                                                      |
| **long**         | Kiểu dữ liệu có thể chứa các số nguyên 64-bit.                                                               |
| **native**       | Chỉ ra rằng một phương thức được triển khai bằng mã gốc (như mã nền tảng).                                   |
| **new**          | Tạo đối tượng mới.                                                                                           |
| **null**         | Chỉ ra rằng một tham chiếu không trỏ tới bất kỳ đối tượng nào.                                               |
| **package**      | Khai báo một gói Java.                                                                                       |
| **private**      | Chỉ định một phương thức hoặc biến chỉ có thể được truy cập trong lớp mà nó được khai báo.                   |
| **protected**    | Chỉ định phương thức hoặc biến chỉ có thể được truy cập trong lớp, lớp con, hoặc các lớp trong cùng một gói. |
| **public**       | Chỉ định phương thức, lớp, giao diện hoặc biến có thể được truy cập từ bất kỳ đâu trong ứng dụng.            |
| **return**       | Trả về giá trị và chuyển điều khiển từ phương thức đã gọi.                                                   |
| **short**        | Kiểu dữ liệu có thể chứa các số nguyên 16-bit.                                                               |
| **static**       | Chỉ ra rằng một biến hoặc phương thức là phương thức lớp (không phụ thuộc vào đối tượng).                    |
| **strictfp**     | Từ khóa Java dùng để giới hạn độ chính xác và làm tròn trong các phép toán số học dấu chấm động.             |
| **super**        | Tham chiếu đến lớp cơ sở của một lớp (dùng trong phương thức hoặc hàm tạo lớp).                              |
| **switch**       | Câu lệnh thực thi mã dựa trên giá trị kiểm tra.                                                              |
| **synchronized** | Chỉ định các phần mã hoặc phương thức trong mã đa luồng.                                                     |
| **this**         | Tham chiếu đến đối tượng hiện tại trong phương thức hoặc hàm tạo lớp.                                        |
| **throw**        | Tạo một ngoại lệ.                                                                                            |
| **throws**       | Chỉ ra các ngoại lệ mà phương thức có thể ném ra.                                                            |
| **transient**    | Chỉ ra rằng một biến không phải là một phần của trạng thái bền vững của đối tượng.                           |
| **try**          | Bắt đầu một khối mã sẽ được kiểm tra ngoại lệ.                                                               |
| **void**         | Chỉ ra rằng một phương thức không trả về giá trị.                                                            |
| **volatile**     | Chỉ ra rằng một biến có thể thay đổi bất đồng bộ.                                                            |
| **while**        | Bắt đầu một vòng lặp `while`.                                                                                |
| **sealed**       | Từ khóa dùng để khai báo một lớp là "sealed", có nghĩa là nó giới hạn những lớp có thể kế thừa nó.           |
| **permits**      | Từ khóa dùng trong khai báo lớp sealed để chỉ định các lớp con được phép kế thừa nó.                         |

---

# 4. Java Data Types

Java là một ngôn ngữ lập trình `kiểu tĩnh` (statically typed) và `kiểu mạnh` (strongly typed). Điều này có nghĩa là mỗi loại dữ liệu trong Java (như số nguyên, ký tự, số thập lục phân, v.v.) đều được định nghĩa sẵn và các hằng số hay biến phải được khai báo theo một kiểu dữ liệu cụ thể.

Kiểu dữ liệu trong Java được chia thành 2 loại chính:

- **Kiểu dữ liệu nguyên thủy (Primitive Data Types)**: Bao gồm `boolean`, `char`, `int`, `short`, `byte`, `long`, `float`, và `double`.
- **Kiểu dữ liệu không nguyên thủy (Non-Primitive Data Types)**: Bao gồm `String`, `Array`, và các kiểu đối tượng khác.

![Java Data Types](../Images/Java-Data-Types.png)

## 4.1. Kiểu dữ liệu nguyên thủy (Primitive Data Types)

Đây là các kiểu dữ liệu cơ bản nhất trong Java, chỉ lưu trữ một giá trị đơn và không có các tính năng đặc biệt. Java có 8 kiểu dữ liệu nguyên thủy, được mô tả trong bảng dưới đây:

| Kiểu dữ liệu | Mô tả                               | Giá trị mặc định | Kích thước | Ví dụ                     | Phạm vi giá trị                                          |
| ------------ | ----------------------------------- | ---------------- | ---------- | ------------------------- | -------------------------------------------------------- |
| `boolean`    | Giá trị logic (`true` hoặc `false`) | `false`          | 8 bits     | `true`, `false`           | Không áp dụng                                            |
| `byte`       | Số nguyên 8-bit có dấu              | `0`              | 1 byte     | (không có)                | -128 đến 127                                             |
| `char`       | Ký tự Unicode                       | `\u0000`         | 2 bytes    | `'a'`, `'\\'`, `'\u0041'` | 0 đến 65,535 (giá trị Unicode)                           |
| `short`      | Số nguyên 16-bit có dấu             | 0                | 2 bytes    | (không có)                | -32,768 đến 32,767                                       |
| `int`        | Số nguyên 32-bit có dấu             | 0                | 4 bytes    | `-2`, `0`, `1`            | -2,147,483,648 đến 2,147,483,647                         |
| `long`       | Số nguyên 64-bit có dấu             | 0                | 8 bytes    | `-2L`, `0L`, `1L`         | -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807 |
| `float`      | Số thực 32-bit                      | 0.0f             | 4 bytes    | `3.14f`, `.1f`            | Độ chính xác ~7 chữ số thập phân                         |
| `double`     | Số thực 64-bit                      | 0.0d             | 8 bytes    | `3.14d`, `1e10`           | Độ chính xác ~16 chữ số thập phân                        |

**Lưu ý:**

- **Ký tự Unicode**: Trong Java, `char` sử dụng bộ mã Unicode để hỗ trợ đa ngôn ngữ, thay vì ASCII như C/C++. Vì vậy, `char` có kích thước 2 bytes.
- **float** và **double**: Được thiết kế cho các tính toán khoa học. Nếu yêu cầu độ chính xác cao, bạn nên sử dụng lớp `BigDecimal`.

## 4.2. Kiểu dữ liệu không nguyên thủy (Non-Primitive Data Types)

Trong Java, các **kiểu dữ liệu không nguyên thủy** (còn gọi là `kiểu tham chiếu`) không lưu trữ giá trị trực tiếp trong bộ nhớ mà lưu trữ địa chỉ bộ nhớ của giá trị. Các kiểu dữ liệu này bao gồm `chuỗi (String)`, `lớp (Class)`, `đối tượng (Object)`, `giao diện (Interface)`, và `mảng (Array)`.

1. **Chuỗi (String)**

Chuỗi trong Java là một tập hợp các ký tự. Điểm khác biệt giữa mảng ký tự và chuỗi là chuỗi được thiết kế để lưu trữ một dãy ký tự trong một biến duy nhất, trong khi mảng ký tự là tập hợp các ký tự rời rạc. Không giống như C/C++, chuỗi trong Java không được kết thúc bằng ký tự null.

**Cú pháp**:

```java
<String_Type> <string_variable> = "<sequence_of_string>";
```

**Ví dụ**:

```java
// Khai báo chuỗi không sử dụng toán tử new
String s = "GeeksforGeeks";

// Khai báo chuỗi sử dụng toán tử new
String s1 = new String("GeeksforGeeks");
```

2. **Lớp (Class)**

Lớp là một bản thiết kế (blueprint) hoặc nguyên mẫu (prototype) được người dùng định nghĩa để tạo ra các đối tượng. Lớp biểu thị một tập hợp các thuộc tính (properties) và phương thức (methods) chung cho tất cả các đối tượng của cùng một loại.

**Thành phần của một lớp**:

- `Modifiers (Bộ sửa đổi)`: Lớp có thể là `public` hoặc có quyền truy cập mặc định.
- `Class name (Tên lớp)`: Nên bắt đầu bằng chữ cái viết hoa (theo quy ước).
- `Superclass (Lớp cha) (nếu có)`: Tên lớp cha được chỉ định sau từ khóa `extends`. Một lớp chỉ có thể kế thừa từ một lớp cha.
- `Interfaces (Giao diện) (nếu có)`: Danh sách các giao diện được cài đặt, ngăn cách bởi dấu phẩy, được khai báo sau từ khóa `implements`. Một lớp có thể cài đặt nhiều giao diện.
- `Body (Thân lớp)`: Được bao quanh bởi dấu ngoặc nhọn `{ }`.

3. **Đối tượng (Object)**

Đối tượng là đơn vị cơ bản của lập trình hướng đối tượng (OOP) và biểu diễn các thực thể trong đời sống thực. Mỗi chương trình Java thường tạo ra nhiều đối tượng, và các đối tượng tương tác với nhau thông qua các phương thức.

Thành phần của một đối tượng:

- **Trạng thái (State)**: Được biểu diễn bởi các thuộc tính (attributes) của đối tượng, phản ánh đặc điểm của đối tượng.
- **Hành vi (Behavior)**: Được biểu diễn bởi các phương thức (methods) của đối tượng, phản ánh cách đối tượng phản ứng với các đối tượng khác.
- **Danh tính (Identity)**: Cung cấp một tên duy nhất cho đối tượng, giúp nó có thể tương tác với các đối tượng khác.

4. **Giao diện (Interface)**

Giao diện là một bản thiết kế của lớp, chứa các phương thức và biến. Các phương thức trong giao diện mặc định là abstract (chỉ có khai báo, không có thân).

**Đặc điểm của giao diện:**

- Giao diện định nghĩa những gì một lớp phải làm, nhưng không định nghĩa cách làm.
- Nếu một lớp cài đặt giao diện nhưng không cung cấp thân cho tất cả các phương thức được khai báo trong giao diện, lớp đó phải được khai báo là abstract.
- Một ví dụ phổ biến trong thư viện Java là giao diện `Comparator`. Các lớp cài đặt giao diện này có thể được sử dụng để sắp xếp các tập hợp.

5. **Mảng (Array)**

Mảng là một nhóm các biến có cùng kiểu dữ liệu, được tham chiếu bằng một tên chung. Mảng trong Java có những đặc điểm khác biệt so với C/C++.

**Đặc điểm của mảng trong Java:**

- Tất cả các mảng đều được cấp phát động.
- Vì mảng là đối tượng trong Java, có thể tìm độ dài mảng bằng thuộc tính `length`.
- Một biến mảng có thể được khai báo như các biến khác, với `[]` sau kiểu dữ liệu.
- Các biến trong mảng được sắp xếp và có chỉ số bắt đầu từ `0`.
- Kích thước của mảng phải được chỉ định bằng giá trị kiểu `int`, không phải kiểu `long` hoặc `short`.

**Ví dụ:**

```java
int[] array = {1, 2, 3, 4, 5};
System.out.println("Độ dài mảng: " + array.length);
```

**Lưu ý:** Mảng trong Java triển khai các giao diện như `Cloneable` và `java.io.Serializable`.

---

# 5. Java Variables

**Biến** là các "container" dùng để lưu trữ giá trị dữ liệu hoặc có thể hiểu là tên của một vị trí trong bộ nhớ để lưu dữ liệu. Mỗi biến trong Java bao gồm:

- **Kiểu dữ liệu (Data Type)**: Xác định loại dữ liệu mà biến có thể lưu trữ (ví dụ: int, String, float, char...).
- **Tên biến (Variable Name)**: Dùng để nhận dạng biến duy nhất trong phạm vi của nó.
- **Giá trị (Value)**: Là dữ liệu được gán cho biến.

Có ba loại biến chính trong Java: **Biến cục bộ (Local Variable)**, **Biến thực thể (Instance Variable)** và **Biến tĩnh (Static Variable)**.

## 5.1. Cách khai báo biến trong Java

Cú pháp khai báo biến:

```java
<data_type> <variable_name> = <value>;
```

Ví dụ:

```java
int age = 27;           // Biển kiểu số nguyên có giá trị là 27
String name = "Harry";  // Biến kiểu chuỗi
```

## 5.2. Khởi tạo biến trong Java

Biến có thể được khởi tạo theo hai cách:

1. Gán giá trị trực tiếp:

```java
int x = 10;
char ch = 'A';
```

2. Gán giá trị thông qua đầu vào từ người dùng hoặc chương trình:

```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt(); // Gán giá trị do người dùng nhập
```

## 5.3. Các loại biến trong Java

### 5.3.1. Biến cục bộ (Local Variables)

- Được khai báo bên trong một phương thức, khối lệnh hoặc constructor.
- Chỉ tồn tại trong phạm vi của khối lệnh mà nó được khai báo.
- Bắt buộc phải khởi tạo trước khi sử dụng.

Ví dụ:

```java
public class Example {
    public static void main(String[] args) {
        int x = 10; // Biến cục bộ
        System.out.println("Giá trị của x: " + x);

        if (x > 5) {
            String message = "x lớn hơn 5"; // Biến cục bộ trong if
            System.out.println(message);
        }
        // System.out.println(message); // Lỗi: Không thể truy cập biến cục bộ ngoài phạm vi
    }
}
```

### 5.3.2. Biến Thực Thể (Instance Variables)

- Là biến không tĩnh được khai báo trong lớp nhưng bên ngoài mọi phương thức, constructor hoặc khối lệnh.
- Giá trị của biến thực thể được liên kết với từng đối tượng. Mỗi đối tượng có bản sao riêng của biến.
- Có thể sử dụng các từ khóa như public, private để xác định phạm vi truy cập.
- Nếu không khởi tạo, biến sẽ nhận giá trị mặc định tùy thuộc vào kiểu dữ liệu.

Ví dụ:

```java
public class Example {
    // Biến thực thể
    String name;
    int age;

    public static void main(String[] args) {
        Example obj = new Example();
        obj.name = "John";
        obj.age = 25;
        System.out.println("Tên: " + obj.name);
        System.out.println("Tuổi: " + obj.age);
    }
}
```

### 5.3.3. Biến Tĩnh (Static Variables)

- Là biến được khai báo với từ khóa static.
- Có duy nhất một bản sao của biến cho tất cả các đối tượng của lớp.
- Được tạo khi chương trình bắt đầu và bị hủy khi chương trình kết thúc.
- Có thể truy cập trực tiếp thông qua tên lớp mà không cần tạo đối tượng.

Ví dụ:

```java
public class Example {
    // Biến tĩnh
    static String platform = "Java Programming";

    public static void main(String[] args) {
        System.out.println("Nền tảng: " + Example.platform);
    }
}
```

### 5.3.4. So sánh Instance Variable và Static Variable

| Tiêu chí        | Instance Variable                                      | Static Variable                                          |
| --------------- | ------------------------------------------------------ | -------------------------------------------------------- |
| Phạm vi lưu trữ | Gắn với từng đối tượng, mỗi đối tượng có bản sao riêng | Có một bản sao duy nhất, dùng chung cho tất cả đối tượng |
| Khởi tạo        | Khi tạo đối tượng                                      | Khi chương trình bắt đầu                                 |
| Hủy             | Khi đối tượng bị hủy                                   | Khi chương trình kết thúc                                |
| Truy cập        | Qua đối tượng                                          | Trực tiếp qua tên lớp                                    |
| Ứng dụng        | Lưu dữ liệu cụ thể của từng đối tượng                  | Chia sẻ dữ liệu chung giữa các đối tượng                 |

---

# 6. Scope of Variables in Java

Phạm vi của biến là phần chương trình mà biến có thể được truy cập. Tương tự như C/C++, trong Java, tất cả các định danh đều có phạm vi tĩnh (lexically scoped), tức là phạm vi của biến được xác định trong quá trình biên dịch và không phụ thuộc vào ngăn xếp lệnh gọi hàm.

Trong Java, các chương trình được tổ chức dưới dạng các lớp (class), và mỗi lớp thuộc về một gói (package). Quy tắc về phạm vi biến trong Java được chia thành ba loại chính:

## 6.1. Biến thành viên (Member Variables - Class Level Scope)

### 6.1.1. Định nghĩa

Biến thành viên được khai báo bên trong lớp (ngoài mọi phương thức, khối lệnh hoặc hàm khởi tạo). Những biến này có thể được truy cập trực tiếp trong toàn bộ lớp.

### 6.1.2. Đặc điểm

- Biến thành viên có thể sử dụng bất kỳ nơi nào trong lớp.
- Có thể khai báo ở bất kỳ vị trí nào trong lớp, nhưng không được khai báo bên trong phương thức.
- Phạm vi của biến không bị ảnh hưởng bởi các bộ sửa đổi (modifier) trong nội bộ lớp, nhưng khi truy cập từ bên ngoài lớp, chúng tuân theo quy tắc sau:
  | Modifier | Package | Subclass | World |
  |----------|---------|----------|-------|
  | public | Yes | Yes | Yes |
  | protected | Yes | Yes | No |
  | Default | Yes | No | No |
  | private | No | No | No |

### 6.1.3. Ví dụ

```java
public class Test {
    // Biến thành viên
    int a;
    private String b;
    char c;

    void method1() {
        // Code
    }
    int method2() {
        // Code
        return 0;
    }
}
```

## 6.2. Biến Cục bộ (Local Variables - Method Level Scope)

### 6.2.1. Định nghĩa

Biến cục bộ được khai báo bên trong phương thức, khối lệnh hoặc hàm khởi tạo. Chúng chỉ tồn tại trong phạm vi khối hoặc phương thức mà chúng được khai báo.

### 6.2.2. Đặc điểm

- Không thể truy cập biến cục bộ từ bên ngoài phương thức.
- Biến cục bộ sẽ bị hủy sau khi phương thức kết thúc.
- Cần khởi tạo biến trước khi sử dụng.

### 6.2.3. Ví dụ

```java
public class Test {
    void method1() {
        // Biến cục bộ
        int x = 10;
        System.out.println(x);
    }
}
```

Lưu ý: Khi biến cục bộ trùng tên với biến thành viên, từ khóa this được sử dụng để phân biệt.
Ví dụ với tham số truyền vào:

```java
class Test {
    private int x;
    public void setX(int x) {
        this.x = x;  // "this.x" tham chiếu đến biến thành viên
    }
}
```

## 6.3. Biến Vòng lặp (Loop Variables - Block Scope)

### 6.3.1. Định nghĩa

Biến được khai báo trong một cặp dấu ngoặc nhọn {} chỉ có phạm vi trong khối đó. Sau khi khối kết thúc, biến sẽ không còn tồn tại.

### 6.3.2. Ví dụ

```java
public class Test {
    public static void main(String[] args) {
        {
            int x = 10;  // Phạm vi trong ngoặc {}
            System.out.println(x);
        }
        // System.out.println(x); // Lỗi: Biến "x" không tồn tại ở đây
    }
}
```

Vòng lặp for:

```java
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // Lỗi: "i" không tồn tại ngoài vòng lặp
    }
}
```

## 6.4. Lưu ý quan trọng

1. Dấu ngoặc nhọn {} xác định phạm vi:

- Bất kỳ biến nào khai báo trong cặp ngoặc nhọn chỉ tồn tại trong cặp ngoặc đó.

2. Phạm vi biến trong lớp:

- Biến được khai báo trong lớp ngoài các phương thức có thể được sử dụng bởi tất cả các phương thức trong lớp đó.

3. Từ khóa this:

- Được dùng để tham chiếu đến biến thành viên khi có biến cục bộ trùng tên.

4. Biến vòng lặp và phạm vi bên ngoài:

- Nếu muốn sử dụng giá trị của biến sau khi vòng lặp kết thúc, cần khai báo biến đó bên ngoài vòng lặp.

---

# 7. Java Operators

Toán tử Java là các ký hiệu đặc biệt thực hiện các phép toán trên biến hoặc giá trị. Chúng có thể được phân loại thành nhiều loại dựa trên chức năng của chúng. Những toán tử này đóng vai trò quan trọng trong việc thực hiện các phép toán số học, logic, quan hệ và phép toán bitwise, v.v.

## 7.1. Các loại toán tử trong Java

### 7.1.1. Arithmetic Operations - Toán tử số học

Toán tử số học được sử dụng để thực hiện các phép toán số học đơn giản trên các kiểu dữ liệu nguyên thủy và không nguyên thủy.

- `*` : Pháp nhân
- `/` : Phép chia
- `%` : Phép chia lấy dư
- `+` : Phép cộng
- `-` : Phép trừ

Ví dụ:
