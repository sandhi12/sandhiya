import java.io.*;
import java.util.*;
class odd
{
    public static void main(String args[])
    {
        //float avg=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a+1;i<b;i++)
        if(i%2==0)
        {
            System.out.print(" ");
        }
        else
        {
            System.out.print(i);
        }
        
    }
}


