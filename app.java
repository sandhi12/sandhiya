import java.util.*;
class app
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.append(".");
        System.out.print(s+sb);
        
    }
}



