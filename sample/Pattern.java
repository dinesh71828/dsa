package sample;
class Pattern {
    public static void main(String[] args) {
        String st ="";
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<1;j++)
            {
                st+=i;//num print
                // st+="*";//star print
                System.out.println(st);
            }
        }
    }
}