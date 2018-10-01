import java.io.*;
import java.util.*;
class day
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="saturday";
        String b="sunday";
        if((s.contains(a))||(s.contains(b)))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}








