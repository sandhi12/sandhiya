import java.util.*;
class arm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,num,k;
        num=a;
        while(num!=0)
        {
            k=num%10;
            sum=sum+k*k*k;
            num=num/10;
        }
        if(sum==a)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
     
        
        
        
     



