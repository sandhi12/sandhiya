import java.util.*;
class pp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=s.replaceAll(" ","");
        int count=0;
        String a="";
        for(int i=0;i<k.length();i++)
        {
            a=a+String.valueOf(k.charAt(i));
            count++;
        }
        System.out.print(count);
        
    }
}
