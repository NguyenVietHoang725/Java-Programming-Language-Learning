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

