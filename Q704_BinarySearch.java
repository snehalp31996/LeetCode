import java.util.Scanner;

class Solution {
    public int search(int[] nums, int target) {
        
        int istart = 0;
        int iend = nums.length - 1;
        
        int index = 0;

        while( istart <= iend){
            int mid = (istart +iend)/2;
            if(target == nums[mid])
            {
                return mid;
            }
             if(target > nums[mid])
            {
                istart = mid + 1;
            }
            else{
                iend = mid - 1;
            }

        }
        
        return -1;
    }
}
			
class Q704_BinarySearch {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter size:");
        int iSize = sc.nextInt();
        int arr[] = new int[iSize];
   
        System.out.println("Enter array:");
        for(int i = 0; i< iSize; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int iTarget = sc.nextInt();
        Solution sol10 = new Solution();
        int iRet = sol10.search(arr, iTarget);
        if(iRet == -1)
        {
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index = "+iRet);
        }
        
    }
}
