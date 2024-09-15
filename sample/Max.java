class Max {
    public static void main(String[] args) {
        int [] arr ={121,10,50,4,5,90,111};
        // int [] ar=new int[5];
        System.out.println(max(arr,1,2,90));
    }

    static int max(int [] arr,int f,int l,int target)
    {
        int ret = 0;
        for(int i=f;i<=l;i++)
        {
            if(arr[i]==target)
                ret = i;
        }
        
        return ret;
    }
}