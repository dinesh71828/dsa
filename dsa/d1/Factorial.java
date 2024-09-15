package dsa.d1;

public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
