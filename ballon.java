import java.util.Scanner;

import javax.swing.colorchooser.ColorChooserComponentFactory;

class Solution {
    public int solution(String S) {
        // // write your code in Java SE 8
        int ilen = S.length();
        int bcount = 0,acount = 0, lcount = 0, ocount = 0, ncount = 0;

       

        for(int i = 0 ; i < S.length(); i++)
        {
            if(S.charAt(i) == 'b'){
                bcount++;
            }
            else if(S.charAt(i) == 'a')
            {
                acount++;
            }
            else if(S.charAt(i) == 'l'){
                lcount++;
            }
            else if(S.charAt(i) == 'o'){
                ocount++;
            }
            else if(S.charAt(i) == 'n'){
                ncount++;
            }
        }
        //divide since 2 occurance in 1 word
        lcount = lcount / 2;
        ocount = ocount / 2;
        
        return Math.min(bcount, Math.min(acount, Math.min(lcount, Math.min(ocount, ncount))));
    }
}

public class ballon {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter string:");
        String str = sc.nextLine();

        
        Solution sol1 = new Solution();
        int iRet = sol1.solution(str);
        System.out.println(iRet);
        
    }
}
