package dsa.d1;
class Prime {

    static void prime(long n)
{ int flag =0;
    if(n==1) 
        {
            System.out.println("1 is neither prime nor composite");
            return;
        }

        int i=2;
        while(i<(n-1))
        {
            if(n%i==0)
            {
                System.err.println("non prime");
                flag=1;
                break;
            }
            else i++;
        }
        if (flag==0) System.out.println("prime");
    }
    public static void main(String ar[])
    {
        long [] array ={9,2, 3, 5, 7, 11, 130, 117, 119, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
       for (long arrr : array) {
        System.out.print(arrr+": ");
        prime(arrr);
       } 
    }
}