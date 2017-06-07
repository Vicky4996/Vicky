import java.util.*;
public class happy{
    public static void main(String args[])
    {
        int num,sum=0,i,j=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>0)
        {
            i=num%10;
            j=(i*i)+j;
           num/=10;
           if(num==0)
           {
               if(j%10==j)
               break;
               else{
                 num=j;
                j=0;}
                 
           }
        }
        if(j==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}
