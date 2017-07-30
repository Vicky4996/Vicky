import java.util.*;

public class leastno {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String[] st=s.next().split("");
	Arrays.sort(st);
	String res=Arrays.toString(st).replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","").replaceAll(" ","");
	System.out.print(res.substring(0,res.length()-n));
	}

}
