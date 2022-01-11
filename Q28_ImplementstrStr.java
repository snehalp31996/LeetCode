import java.util.Scanner;

class Solution {
    public int strStr(String haystack, String needle) {

        if(needle == null || haystack == null)
        {
            return 0;
        }
        if(haystack.length() < needle.length())
        {
            return -1;
        }
      
        for(int i = 0 ; i <= (haystack.length() - needle.length()); i++)
        {
            int j = 0;
            for(j = 0; j < needle.length();j++)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    break;
                }
            }

            if(j == needle.length())
            {
                return i;
            }
        }

        return -1;
    }
}
public class Q28_ImplementstrStr {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("Enter str to search:");
        String search = sc.nextLine();

        Solution sol5 = new Solution();

        int iRet = sol5.strStr(str, search);
        
        System.out.println("Index:"+iRet);

    }
}
