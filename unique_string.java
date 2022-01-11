import java.util.Scanner;
import java.util.*;
// class solution{
//     public boolean uniqueString(String str)
//     {
//         boolean flag = true;
//         for(int i = 0; i< str.length(); i++)
//         {
//             for(int j= i; j < str.length();j++)
//             {
//                 if(str.charAt(i) == str.charAt(j))
//                 {
//                     flag = false;
//                     break;
//                 }

//             }
//         }
//         return flag;
//     }
// }

class solution{
    public boolean uniqueString(String str)
    {
        if(str.length() > 128)
        {
            return false;
        }
        boolean[] barray = new boolean[128];
        
        for(int i = 0; i<str.length(); i++)
        {
            int val = str.charAt(i);

            if(barray[val]== true)
            {
                return false;
            }

            barray[val] = true;
        }
        return true;
        
    }
}

public class unique_string {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        solution sol = new solution();

        boolean bRet = sol.uniqueString(str);

        if(bRet == true)
            System.out.println("Unique");
        else
            System.out.println("Not Unique");
    }
}
