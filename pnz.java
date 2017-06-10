import java.util.Scanner;
public class pnz{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int k=s.nextInt();
if(k>0)
{System.out.print("POSITIVE");System.exit(0);}
if(k<0)
{System.out.print("NEGATIVE");System.exit(0);}
if(k==0)
{System.out.print("ZERO");System.exit(0);}
  System.out.print("Invalid Input");
}}
