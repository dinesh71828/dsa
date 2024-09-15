package sample;
class Input{
    void print(int [] ar)
    {
        int d=0;
        String days [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<ar.length;i++)
        {
            if(d==7) d=0;
            System.out.println(days[d++]+": " + ar[i]);
        }
    }
    public static void main(String[] args) {
        Input in = new Input();
        int[] days = {15, 20, 18, 25, 30, 10, 12,20,30,40,50};
        in.print(days);
    }
}