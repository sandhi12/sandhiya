import java.io.*;
import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        k=n%4;
        if(k==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    } 
	
}






