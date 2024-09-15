package sample;
public class Reverse {
    
    static void str(String  s)
    {
        StringBuffer sb = new StringBuffer(s);
        char ar [] = s.toCharArray();
        int n = sb.length();
        StringBuffer ss = new StringBuffer();
        for(int i=n-1;i>0;i--)
        {
            if(ar[i]==' ')
            {
                ss.append(" ");
            }
            else
            {
                ss = ss.append(ar[i]);
            }

        }
        System.out.println(ss);

    }
    
    public static void main(String[] args) {
        String name ="dinesh dhayfule";
        str(name);
    }
}