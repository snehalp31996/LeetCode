import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {

        int temp = x ,iDigit = 0, num2 = 0;

        if( x < 0)
        {
            return false;
        }

        while(temp !=0)
        {
            iDigit = temp % 10;
            num2 = (num2 * 10)+ iDigit;
            temp = temp / 10;
        }
        if(num2 == x)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}
public class Q9_palindrome {
 
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter no:");
        int num = sc.nextInt();

        Solution sol1 = new Solution();
        boolean bRet = sol1.isPalindrome(num);

        if(bRet == true)
        {
            System.out.println("NUmber is Palindrome");
        }
        else{
            System.out.println("NUmber is not Palindrome");
        }
    }
}
