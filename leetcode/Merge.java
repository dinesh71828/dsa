class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int merge [] = new int[m+n];
        for(int i=0;i<m;i++)
        {
            merge[i] = nums1[i];
        }
    }
     public static int mySqrt(int x) {
        double a =(double)x;
        double sq = Math.sqrt(a);
        return  int(Math.round(sq));

    }
    public static void main(String[] args) 
    {
        // merge()
        mySqrt(16);
    }
}