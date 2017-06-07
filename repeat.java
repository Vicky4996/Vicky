import java.util.*;
public class repeat{
    public static void main(String args[]){
        int a[],N,i,j,f=0;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        a=new int[N];
        for(i=0;i<N;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<N-1;i++){
            if(a[i]!=a[i+1])
            {
            	f=1;
            	System.out.print(a[i]);
            	break;
            }i++;
        }if(f==0)
            System.out.print("No Single element present");
    }
}
