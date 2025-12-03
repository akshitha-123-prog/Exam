public class Factorial {
    public static int compute(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            return fact;
        } else {
            
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + compute(num));
    }
}