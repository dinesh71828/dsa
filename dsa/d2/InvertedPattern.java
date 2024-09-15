public class InvertedPattern 
{
	
	public static void main(String[] args)
     {
		int n=4;
        char num='A';
		for (int i = 0; i < n; i++) 
        {
			for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print((num));
            }
            System.out.println();num++;
		}
	}
}


