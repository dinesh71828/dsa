import java.util.Scanner;

class SumOfDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = 30;

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers divisible by 3 from 1 to " + N + " is: " + sum);
    }
}