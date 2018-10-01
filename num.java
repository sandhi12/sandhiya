import java.util.*;
class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String k[]=s.split("\\.");
        int count=0;
        String a="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
            a=a+Character.getNumericValue(s.charAt(i));
            count++;
            }
        }
        
        System.out.print(count);
        
    }
}

