import java.util.*;
public class repeatint{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a[],j;
j=s.nextInt();
a=new int[j];
for(int l=0;l<j;l++)
{a[l]=s.nextInt();}
int k=findUnique(a);
System.out.print(k);
}
public static int findUnique(int b[])
{Arrays.sort(b);

//System.out.println(b.length);
int d=0;
for(int i=0;i<b.length/2;i++)
{if(b[d]!=b[d+1])
return b[d];
d=d+2;
break;
}
return b[b.length-1];
}}
