public class square {
	public static void main(String args[])
	{int a[]=new int[8];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<8;i++)
	{
		a[i]=s.nextInt();
	}
	if((a[3]-a[1])==(a[4]-a[2]))
	{
		System.out.print("Square");
	}
	else
		{System.out.print("not a square");
	}
}
}
