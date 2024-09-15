package dsa.d3;

public class Functions {
    
    static void printSumofDigits(int digit)
    {
        int sum=0;
        while (digit>0) {
            int ld = digit%10;
            digit /= 10;
            sum += ld;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        printSumofDigits(145);
    }
}
