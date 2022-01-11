import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0, j =0;

        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        for(i = 0; i < nums.length;i++)
        {
            if(nums[i] != nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
        
    }
}

public class Q26_RemDuplicateSortedArray {
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        int isize = 0, iRet = 0;
        System.out.println("ENter size of array:");
        isize = sc.nextInt();
        int iNum[] = new int[isize];
        System. out.println("ENter Array:");
        for(int i = 0; i< iNum.length; i++)
        {
            iNum[i] = sc.nextInt();
        }

        Solution sol4 = new Solution();

        iRet = sol4.removeDuplicates(iNum);

        System.out.println("Array size :"+iRet);

    }
}
