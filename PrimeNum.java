import java.util.Scanner;
class PrimeNum
{
   public static void main (String[] args)
   {		
       int i =0,flag=0;
       int num =0;
      Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1=s.nextInt();
       for (i = n; i <= n1; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	    flag++;
	  }	
       }	
       System.out.println("No.Prime numbers from "+n+" to "+n1+" are : "+flag);
   }
}
