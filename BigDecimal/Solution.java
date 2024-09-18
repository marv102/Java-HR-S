import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
class Solution{

    public static void main(String []args){

        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        s = Arrays.copyOf(s,n); // Handling null's from n+2

        for(int i=0;i<s.length-1;i++){
            for(int j=s.length-1;j>i;j--){
                BigDecimal bd1 = new BigDecimal(s[j]);
                BigDecimal bd2 = new BigDecimal(s[j-1]);
                if(bd1.compareTo(bd2)==1){
                    String aux = s[j-1];
                    s[j-1] = s[j];
                    s[j] = aux;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}