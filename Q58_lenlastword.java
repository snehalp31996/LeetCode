import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        
        int iCnt = 0;
        s = s.trim();
        int iLen = (s.length() - 1);
        while(iLen >= 0)
        {
            if(s.charAt(iLen) != ' ')
            {
                iCnt++;
            }
            else{
                break;
            }
            iLen --;
        }
       
        

        return iCnt;
    }
}
public class Q58_lenlastword {
 
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        Solution sol8 = new Solution();

        int iRet = sol8.lengthOfLastWord(str);

        System.out.println("length of last world:"+iRet);
    }
}
