import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5],i=0;
		for(i=0;i<5;i++)
		a[i]=s.nextInt();
		for(i=0;i<=a.length-2;)
		{
		    if(a[i]==0)
		    break;
		    i=i+a[i];
		}
		if(i<=a.length-1)
		{
		if(a[i]==a[a.length-1])
		System.out.print("y");
		else
		System.out.print("n");
		}
		else
		System.out.print("n");
		
	}
}
