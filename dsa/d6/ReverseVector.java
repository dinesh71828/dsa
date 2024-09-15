import java.util.Vector;
import java.util.Scanner;
public class ReverseVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer> vec = new Vector<Integer>();
        System.out.println("enter size of vector:\n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            vec.add(temp);
        }
        reverse(vec);
    }

    private static void reverse(Vector<Integer> vec) {
         int n = vec.size();
         for (int i = n; i >0 ; i--) {
             System.out.println(vec.elementAt(i));
         }
         
    }
}
