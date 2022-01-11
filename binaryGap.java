
import java.util.*;

class Solution {
    public int solution(int N) {

        int dist = 0, maxdist = 0;

        String sbinary = Integer.toBinaryString(N);

        for(int i = 0; i< sbinary.length(); i++)
        {
            char s = sbinary.charAt(i);
            if(s == '1')
            {
                if(maxdist > dist)
                {
                    maxdist = dist;
                }
                dist = 0;

            }
            else
            {
                dist++;
            }
        }

        return maxdist;
    }
}

public class binaryGap {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter no:");
        int num = sc.nextInt();

        Solution sol1 = new Solution();
        int iRet = sol1.solution(num);
        System.out.println(iRet);

        
    }
}
