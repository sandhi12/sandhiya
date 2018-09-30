import java.util.*;
class pp1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k[]=s.split("\\s");
        int count=0;
        String a="";
        for(int i=0;i<k.length;i++)
        {
            a=String.valueOf(k[i].charAt(i));
            count++;
        }
        //count++;
        System.out.print(count);
        
    }
}
