import java.util.*;
class su
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int b=sc.nextInt();
        ///int n=b.length;
        int a[]=new int[k];
        int sum=0;
        for(int i=0;i<a.length;i++)
        
        {
          a[i]=sc.nextInt();  
        }
        for(int i=0;i<b;i++)
        {
            sum+=a[i];
        }
        System.out.print(sum);
        
        
    }
}
