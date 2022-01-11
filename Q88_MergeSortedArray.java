import java.util.Scanner;

import java.util.Scanner;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;

       while(p2 >= 0)
       {
            if(p1 >= 0 && nums1[p1] > nums2[p2])
            {
                nums1[i--] = nums1[p1--]; 
            }
            else{
                nums1[i--] = nums2[p2--];
            }
       }
        System.out.println("Array:");
        for(int x = 0; x < m+n ; x++)
        {
            System.out.println(nums1[x]);
        }
           
    }
}
public class Q88_MergeSortedArray {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter m:");
        int msize = sc.nextInt();
        System.out.println("ENter n:");
        int nsize = sc.nextInt();
        int num1[] = new int[msize + nsize];
        System.out.println("Enter array elements :");
        for(int i = 0; i< msize ;i++)
        {
            num1[i] = sc.nextInt();
        }
        

        int num2[] = new int[nsize];
        System.out.println("Enter array elements :");
        for(int i = 0; i< nsize ;i++)
        {
            num2[i] = sc.nextInt();
        }

        Solution sol13 = new Solution();

        sol13.merge(num1, msize, num2, nsize);
    }

}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = 0, j = 0, k = 0;

//         while( i < m && j < n)
//         {
//             if(nums1[i] <= nums2[j])
//             {
//                 nums1[k] = nums1[i];
//                 k++;
//                 i++;
//             }
//             if(nums1[i] > nums2[j])
//             {
//                 nums1[k] = nums2[j];
//                 k++;
//                 j++;

//             }
//         }

//         while(i < (m+n))
//         {
//             nums1[k] = nums2[j];
//             k++;
//             j++;
//             i++;

//         }
//         while(j < (m+n))
//         {
//             nums1[k] = nums1[i];
//             k++;
//             j++;
//             i++;

//         }
//         System.out.println("Array:");
//         for(int x = 0; x < m+n ; x++)
//         {
//             System.out.println(nums1[x]);
//         }
           
//     }
// }
// public class Q88_MergeSortedArray {
//     public static void main(String arg[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("ENter m:");
//         int msize = sc.nextInt();
//         System.out.println("ENter n:");
//         int nsize = sc.nextInt();
//         int num1[] = new int[msize + nsize];
//         System.out.println("Enter array elements :");
//         for(int i = 0; i< msize ;i++)
//         {
//             num1[i] = sc.nextInt();
//         }
        

//         int num2[] = new int[nsize];
//         System.out.println("Enter array elements :");
//         for(int i = 0; i< nsize ;i++)
//         {
//             num2[i] = sc.nextInt();
//         }

//         Solution sol13 = new Solution();

//         sol13.merge(num1, msize, num2, nsize);
//     }

// }
