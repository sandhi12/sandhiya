import java.io.*;
import java.util.*;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,k,s;
        s=a;
        
            while(a!=0)
            {
            k=a%10;
            sum=sum*10+k;
            a=a/10;
        }
        if(s==sum)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}

