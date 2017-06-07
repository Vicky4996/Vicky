import java.io.*;
import java.util.*;
public class anagram
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,f1=0,f2=0;
        String s1,s2;       
         s1=s.nextLine();
         s2=s.nextLine();   
        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        for(i=0;i<ch1.length;i++)
        {f1++;}
            for(j=0;j<ch2.length;j++)
            {
                if(ch2[j]!=' ')
                {
                    f2++;
                }
            }
        if(f1==f2)
            System.out.print("True");
        else
            System.out.print("False"); 
    }
}
