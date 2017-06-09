import java.util.*;
public class tallest {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int a[];
	a=new int[50];
	for(int i=0;i<50;i++ )
		a[i]=s.nextInt();
	int k=s.nextInt();
	Arrays.sort(a);
	fifty(a);
	knum(a,k);
}
static void fifty(int b[])
{
	System.out.println("Fourth height");
	System.out.println(b[46]);
}
static void knum(int c[],int d)
{
	System.out.println("Requested position's height");
	System.out.println(c[50-d]);
}
}
