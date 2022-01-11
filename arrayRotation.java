import java.util.Scanner;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if(A.length == K)
        {
            return A;
        }
        int ilen = A.length;
        int newarr[] = new int[ilen];
      
        while(K > 0)
        {
            for(int i = 0; i< (A.length -1);i++)
            {
                newarr[i+1] = A[i];
        
            }
            newarr[0] = A[A.length-1];
            for(int i = 0 ; i< A.length;i++)
            {
                A[i] = newarr[i];
            }
            K--;
        }
        for(int i = 0; i< newarr.length;i++)
        {
            System.out.println(newarr[i]);
        }
        
        return A;
    }
}
public class arrayRotation {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter size:");
        int isize = sc.nextInt();

        int[] arr = new int[isize];

        System.out.println("ENter rotation:");
        int num = sc.nextInt();
        System.out.println("ENter elements:");

        for(int i = 0;i< arr.length; i++)
        {
            arr[i] = sc.nextInt();

        }

        Solution sol1 = new Solution();
        sol1.solution(arr, num);
        
    }
}
