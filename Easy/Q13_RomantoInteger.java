import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
       
        Map<Character, Integer> numbermap =  new HashMap<>();
        numbermap.put('I',1);
        numbermap.put('V',5);
        numbermap.put('X',10);
        numbermap.put('L',50);
        numbermap.put('C',100);
        numbermap.put('D',500);
        numbermap.put('M',1000);

        int iCount = 0;

        for(int i = 0; i< s.length(); i++)
        {
            if(i > 0 && numbermap.get(s.charAt(i)) > numbermap.get(s.charAt(i-1)))
            {
                iCount += numbermap.get(s.charAt(i)) - 2 * numbermap.get(s.charAt(i-1));
            }
            else
            {
                iCount += numbermap.get(s.charAt(i));
            }
        }
        return iCount;
    }
}
public class Q13_RomantoInteger {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter String:");
        String str = sc.nextLine();

        Solution sol1 = new Solution();
        int iRet = sol1.romanToInt(str);

        
        System.out.println("Roman"+str+" to Number is :"+iRet);
        
    }
}
