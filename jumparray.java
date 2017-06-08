package jump;
public class jumparray {

	public static void main(String[] args){
		int k,i;
		for(i=0;i<=args.length-2;i++)
		{
			k=Integer.parseInt(args[i]);
			if(i==args.length-1)
			{
				System.out.println("t");
				break;
			}
			i=i+k;
			System.out.println(i);
		}
		//System.out.println(i);
	
		System.out.print("f");

	}

}
