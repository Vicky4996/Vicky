import java.util.*;
public class oddeven {
	public static void main(String[] args) {
int a[],i,j=0,k=0,e=0,o=0;
a=new int[args.length];
for(i=0;i<args.length;i++)
{
	a[i]=Integer.parseInt(args[i]);
}
for(i=0;i<args.length;i++)
{
	if(a[i]%2==0)
		{k++;
	e=a[i];}
	if(a[i]%2!=0)
	{j++;
	o=a[i];}
}
if(k==1)
{
	System.out.print(e);
	System.exit(0);
}
if(j==1)
{
	System.out.print(o);
	System.exit(0);
}
if(k>1||j>1)
{
	System.out.print("Not correct input");
}
}	}
