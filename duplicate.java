import java.util.*;
public class duplicate{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String string = s.nextLine();
	char[] c = string.toCharArray();
	Set set=new HashSet();
	StringBuilder sb = new StringBuilder();
	for (char ch : c) {
		if (!set.contains(ch)) {
		    set.add(ch);
		    sb.append(ch);
		}
	}
	String f=sb.toString();
	if(string.length()!=f.length())
	{
		System.out.println(f);
	}
	else
		System.out.print("NO DUPLICATES");
    }

}
