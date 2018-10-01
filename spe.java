import java.util.*;
class spe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String k[]=s.split("\\.");
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                a++;
            }
            else if(Character.isLetter(s.charAt(i)))
            {
                b++;
            }
            else
            {
                c++;
            }
        }
            
        System.out.print(c);
        
    }
}



