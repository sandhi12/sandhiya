import java.io.*;
import java.util.*;
class abcd
{
    public static void main(String args[])
    {
  
    boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);

	char ch=scanner.next().charAt(0); 
	
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : //isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println("vowel");
	}
	else {
	   
		System.out.println("consonant");
	  
        }
   }
}



