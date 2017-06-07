import java.util.*;
public class Reve {
	public static void main(String[] args) {
	int a,r=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	while(a!=0)
	{
		r*=10;
		r=r+(a%10);
		a/=10;
	}
System.out.println(r);
	}

}
