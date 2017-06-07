import java.util.*;
public class fact{
public static void main(String args[]){
double num,fact=1,i;
Scanner s=new Scanner(System.in);
num=s.nextDouble();
for(i=1;i<=num;i++)
{fact=fact*i;}
System.out.print(fact);
}}
