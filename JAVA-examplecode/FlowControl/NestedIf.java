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
