import java.util.*;
class Solution {
    public int climbStairs(int n) {
        
        int cs[] = new int[n+1];
        cs[0] = 1;
        cs[1] = 1;
        for(int i = 2 ;i <=n ;i++)
        {
            cs[i] = cs[i - 1] + cs [i -2];

        }


        return cs[n];
    }
}
public class Q70_ClimbingStairs {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input:");
        int iNo = sc.nextInt();

        Solution sol11 = new Solution();

        int iRet = sol11.climbStairs(iNo);

        System.out.println(iRet);
    }
}
