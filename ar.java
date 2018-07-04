import java.io.*;
import java.util.*;
class ar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int s=0,w,r;
        for(int i=n;i<=k;i++)
        {
            s=0;
            r=i;
            while(r>0)
            {
                w=r%10;
                s=s+(w*w*w);
                r=r/10;
                
            }
        
            if(s==i)
            {
                System.out.print(s);
            }
    }
    
        
    } 
	
}










