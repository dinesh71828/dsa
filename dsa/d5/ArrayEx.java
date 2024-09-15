package dsa.d5;

import java.util.HashSet;
import java.util.Set;

public class ArrayEx {
    
    static void addMul(int [] ar)
    {
        int add =0,mul=1;
        for(int i =0;i<ar.length;i++)
        {
            add += ar[i];
            mul *= ar[i];
        }
        System.out.println("Addition of array elements: "+add);
        System.out.println("Multiplication of array elements: "+mul);
    }

    static void unique(int arr[])
    {
         Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }

        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }

    }
    
    public static void main(String[] args) {
        int arr []={2,3,2,3,5};
        addMul(arr);
        unique(arr);
    }
}
