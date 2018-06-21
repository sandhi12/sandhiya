import java.io.*;
import java.util.*;
class all
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       // String s=sc.nextLine();
        char s=sc.next().charAt(0);
        //String alp1={"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        if((s >='a'&& s <='z')||(s >='A' && s <='z'))
        {
            System.out.print("alphabet");
        }
        else
        {
            System.out.print("no");
        }
    } 
	
}





