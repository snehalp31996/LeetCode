import java.util.Arrays;
import java.util.Scanner;
// class solution{
//     public boolean isPermutation(String s1, String s2)
//     {

//         if(s1.length() != s2.length())
//         {
//             return false;
//         }

//         s1 = s1.replaceAll("\\s", "");
//         s2 = s2.replaceAll("\\s", "");
//         return sort(s1).equals(sort(s2));
        
//     }

//     private String sort(String s)
//     {
//         char[] data = s.toCharArray();

//         Arrays.sort(data);
//         return new String(data);
//     }
// }

class solution{

    boolean isPermutation(String s, String t) {

        if (s.length() != t.length()) {
        return false;
        }
        int[] letters = new int[128]; 
        
        
        char[] s_array = s.toCharArray();
        // for( int ch = 0; ch < s_array.length;ch++)
        // {
        //     System.out.println(s_array[ch]);
        // }
        for (char c : s_array) { 
            letters[c]++;
            // System.out.println(letters[c]);
        }
        // for( int ch = 0; ch < letters.length;ch++)
        // {
        //     System.out.println(letters[ch]);
        // }
        for (int i= 0; i < t.length(); i++) 
        { 
            int c= (int) t.charAt(i); 
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}

public class permutation {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1 :");
        String str1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String str2 = sc.nextLine();

        solution sol = new solution();
        boolean bRet = sol.isPermutation(str1, str2);
        if(bRet == true)
        System.out.println("permutation");
        else
        System.out.println("No Permutation");
    }
}
