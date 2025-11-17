public class FibonacciCalculator {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            
            a = b;
            b = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("--- Testing the Fibonacci (fib) function ---");
        
        int n0 = 0;
        System.out.println("F(" + n0 + "): " + fib(n0));

        int n1 = 1;
        System.out.println("F(" + n1 + "): " + fib(n1));

        int n6 = 6;
        System.out.println("F(" + n6 + "): " + fib(n6));

        int n10 = 10;
        System.out.println("F(" + n10 + "): " + fib(n10));
        
        int n12 = 12;
        System.out.println("F(" + n12 + "): " + fib(n12));
    }
}
