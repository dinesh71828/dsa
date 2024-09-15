public class TrianglePattern {
    public static void main(String[] args) {
        int n=8;
        char ch ='A';
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j>0; j--) {
                
                // System.out.print("*");
                System.out.print(" "+(i+1));
                // System.out.print(ch);
                // System.out.print(" "+j);
            }
                ch++;
            System.out.println();
        }
    }
}
