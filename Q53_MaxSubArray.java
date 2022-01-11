import java.util.Scanner;
// Input: nums = [5,4,-1,7,8]
// Output: 23
class Solution {
    public int maxSubArray(int[] nums) {

        int iCurrentSum = 0;
        // int iMaxSum = nums[0];
        int iMaxSum = Integer.MIN_VALUE;


        for(int i = 0; i< nums.length; i++)
        {
            iCurrentSum = Math.max(nums[i], iCurrentSum + nums[i]);
            iMaxSum = Math.max(iMaxSum,iCurrentSum);
        }

        return iMaxSum;
        
    }
}
public class Q53_MaxSubArray {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i< Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }

        
        Solution sol7 = new Solution();
        int iRet = sol7.maxSubArray(Arr);

        System.out.println("Maximum Subarray sum: "+iRet);
    }
}
