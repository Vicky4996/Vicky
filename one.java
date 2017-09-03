import java.util.*;
public class one{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String[] st=s.nextLine().split(" ");
	List <String> al1=new ArrayList <String>(Arrays.asList(st));
	for(int i=0;i<al1.size();i++)
	{
		int k=Collections.frequency(al1, ((List<String>) al1).get(i));
		if(k==1)
			{System.out.print(((List<String>) al1).get(i));break;}
		if(i==al1.size()-1)
			System.out.print(-1);
	}
	
}
}
