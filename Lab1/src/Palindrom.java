import java.util.Scanner;
public class Palindrom 
{
    public static void main(String[] args)
    {
        while(true)       
        {
        	Scanner scan = new Scanner(System.in);
            String s = scan.next();
            System.out.println(s + " : " + Boolean.toString(isPalindrome(s)));         
        }
    }

    //
    public static String reverseString(String s) 
    {
    	// ������������ �������� � �������� �������
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            res += s.charAt(i);
        }
        return res;
    }
   
    public static boolean isPalindrome(String s) 
    {
    	// ������������ �������� � �������� �������
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            res += s.charAt(i);
        }
        
        //�������� �� �������������� 
        if (res.equals(reverseString(res))) 
        {
            return true;
        } 	
        	else
        	{
            return false;
        	}
    }
}
