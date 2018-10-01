import java.util.*;
class sp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String k[]=s.split("\\s");
        int count=0;
        String a="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            count++;
        }
        
        System.out.print(count);
        
    }
}
