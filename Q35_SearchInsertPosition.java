import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int iCnt = 0;

        for(int i = 0; i< nums.length; i++)
        {
            if(target <= nums[i] )
            {
                iCnt = i;
                break;
            }
            System.out.println(iCnt);
            if(target > nums[nums.length - 1])
            {
                iCnt = i+1;
                
            }
        }
        
        return iCnt;
    }
}
public class Q35_SearchInsertPosition {
 
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int Arr[] = new int[4];

        System.out.println("ENter array elements:");

        for(int i = 0; i< Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to search:");

        int index = sc.nextInt();
        Solution sol6 = new Solution();
        int iRet = sol6.searchInsert(Arr, index);

        System.out.println("Index place : "+iRet);

    }
}
