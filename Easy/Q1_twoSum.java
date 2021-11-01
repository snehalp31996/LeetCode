import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> storednumbers = new HashMap<>();
        for (int i = 0; i<nums.length; i++)
        {
            int num2 = target  - nums[i];
            if(storednumbers.containsKey(num2))
            {
                return new int[] {i,storednumbers.get(num2)};
            }

            storednumbers.put(nums[i], i);
        }

        return new int[] {-1,-1};
    }
}

public class Q1_twoSum {
    public static void main(String arg[])
    {
        int[] numbers =  new int[] {2,7,11,15};
        int  target = 9;
        Solution sol = new Solution();
        int[] iRet = sol.twoSum(numbers, target);
        System.out.print(iRet[0] + " " + iRet[1]);

    }
}
