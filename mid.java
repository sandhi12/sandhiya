import java.io.*;
import java.util.*;
class mid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(n%2==0)
        {
            System.out.print((a[n/2]+a[(n-1)/2])/2);
        }
        else
        {
        System.out.print(a[n/2]);
        }
        
       
        
    } 
	
}










