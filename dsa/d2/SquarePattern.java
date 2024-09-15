public class SquarePattern {
    static void print(int n )
    {
        for(int i=0;i<n;i++)
        {
            char ch ='A';
            for (int j = 1; j <=n; j++) {
                // System.out.print(" "+j);
                // System.out.print("* ");
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void printContinue(int n)
    {
        // char num ='A';
        int num =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // print(26);
        printContinue(5);
    }
}
