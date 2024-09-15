import java.util.Vector;

public class LinearSearchVector {
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		v.add(10);		
		for (Integer integer : v) {
			System.out.print(integer+" ");
		}
		search(v,10);
	}
	
	 static void search(Vector<Integer> v, int target) {
        boolean tg=false;
        int at=0;
		for (int i=0;i<v.size();i++) {
                if(target==v.elementAt(i)) {
                tg=true;      
                at=i;  
                }                
            }
            if (tg!=false) {
                System.out.println("\ntarget: "+v.elementAt(at)+" found at: "+(at+1));
            }
            else
            {
                System.out.println("\ntarget not found");
            }
}
}



