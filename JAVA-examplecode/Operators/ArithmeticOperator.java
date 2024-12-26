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