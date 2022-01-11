import java.util.Scanner;

class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0, j =0;

        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        for(i = 0; i < nums.length;i++)
        {
            if(nums[i] != val)
            {
                
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
        
    }
}
public class Q27_RemoveElement {
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        int isize = 0, iRet = 0, iVal = 0;
        System.out.println("ENter size of array:");
        isize = sc.nextInt();
        int iNum[] = new int[isize];
        System. out.println("ENter Array:");
        for(int i = 0; i< iNum.length; i++)
        {
            iNum[i] = sc.nextInt();
        }
        System.out.println("ENter element to remove:");
        iVal = sc.nextInt();
        Solution sol5 = new Solution();

        iRet = sol5.removeElement(iNum,iVal);

        System.out.println("Array size :"+iRet);

    }
}
