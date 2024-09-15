package dsa.d4;
class DecimalToBinary{
    public static void main(String[] args) {
        int decimal = 2;
        dectobin(decimal);
        bintodec("10");
    }

    private static void bintodec(String n) {
        // TODO Auto-generated method stub
       
        }
    }

    private static void dectobin(int decimal) {
        int ans=0,pow=1;
        while (decimal>0) {
           int remainder = decimal%2;
            decimal /=2;
            ans+=(pow*remainder);
            pow*=10;
        }
        System.out.println(ans);  
      }

}