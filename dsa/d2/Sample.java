import java.util.Scanner;
class Sample {
    static void sc (char ch)
    {
        if(ch>='a' && ch<'z')
        {
            System.out.println("lowercase");
        }
        else if(ch>='A' && ch<'Z')
        {
            System.out.println("uppercase");
    }
    }

    static int sum(int n)
    {
        int sum = 0,i=0;
        while (i<=n) {
           if(i%3==0)
           {
             sum +=i;
            }
            i++;
        }
        return sum;
    }
    static int fact(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * fact(n - 1);
}
    public static void main(String[] args) {
        // Create a new Scanner object
        
        char ch [] ={'a','K','Z','S','s','D','W'};
        for (char c : ch) {
            sc(c);
        }
        
        System.err.println(sum(30));
        System.err.println(fact(5));

    }

  
}