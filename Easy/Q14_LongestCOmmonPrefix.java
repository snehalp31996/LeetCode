
import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        if(strs == null || strs.length == 0)
        {
            return result;
        }

        result = strs[0];
        for(int i = 1;i<strs.length;i++)
        {
            while(strs[i].indexOf(result) != 0){
                result = result.substring(0,result.length() - 1);
            }
        }
        return result;

    }
}

public class Q14_LongestCOmmonPrefix {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        System.out.print("ENter String:");
        for(int i = 0; i< str.length;i++)
        {
            str[i] = sc.nextLine();
        }

        
        Solution sol1 = new Solution();
        String sRet = sol1.longestCommonPrefix(str);

        
        System.out.println("Longest Common Prefix: "+sRet);
       
    }
    
}