import java.io.*;
import java.util.*;
class inti
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int sum=0,i=1;
        while(i<=n)
        {
        sum=sum+i;
        i++;
        }
        System.out.println(sum);
        
    } 
}
