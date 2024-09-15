public class FlyodPattern {
    public static void main(String[] args) {
        int n = 4;
        int num =1;
        char ch ='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "+(num++));
                // System.out.print(" "+(ch++));
                
            }
            System.out.println();
        }
    }
}
