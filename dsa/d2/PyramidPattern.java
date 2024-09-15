
public class PyramidPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            int num=1;
            for (int j = 0; j<n-i; j++) {
               System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((num));
                num++;
            }
            for (int j = i; j>0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
