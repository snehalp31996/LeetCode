import java.util.Scanner;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for( char c: s.toCharArray())
        {
            if(c== '(' || c == '{' || c =='[')
            {
                stack.add(c);
            }
            else{
                 if(stack.isEmpty()){
                 return false;   
                 }
                 if(c == ')' && stack.peek()!='(')
                 {
                     return false;
                 }
                 if(c == '}' && stack.peek()!='{')
                 {
                     return false;
                 }
                 if(c == ']' && stack.peek()!='[')
                 {
                     return false;
                 }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
class Q20_ValidParanthesis {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
      
        boolean bRet = false;
        System.out.println("ENter String:");

        String str = sc.nextLine();
        
        Solution sol2 = new Solution();
        bRet = sol2.isValid(str);

        if(bRet == true)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
        
       
    }
}
