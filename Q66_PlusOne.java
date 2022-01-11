import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        
     
        for(int i = digits.length -1 ; i>=0 ; i--)
        {
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }

            digits[i] = 0;
        }

        int new_num[] = new int[digits.length+1];
        new_num[0] = 1;
        return new_num;
    }
    
}
public class Q66_PlusOne {
 
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size:");
        int isize = sc.nextInt();
        int Num[] = new int[isize];

        System.out.println("ENter digits:");
        for(int i = 0; i< Num.length; i++)
        {
            Num[i] = sc.nextInt();
        }

        Solution sol9 = new Solution();
        int iRet[] = sol9.plusOne(Num);

        for(int i=0 ; i< iRet.length;i++)
        {
            System.out.println(iRet[i]);

        }
        
    }
}

// import java.util.Scanner;

// class Solution {
//     public int[] plusOne(int[] digits) {
        
//         int itemp = 0, iNo = 0, iCnt  = 0, iDigit = 0;
//         for(int i = 0; i<digits.length;i++)
//         {
//             itemp = (itemp * 10) + digits[i];
//         }
        
//         itemp = itemp + 1;
//         System.out.println(itemp);
//         iNo = itemp;

//         while(iNo != 0)
//         {
//             iDigit = iNo % 10;
//             iNo = iNo /10;
//             iCnt++;
//         }
//         System.out.println(iCnt);

//         for(int i = iCnt-1 ; i>=0 ; i--)
//         {
           
//             digits[i] = itemp % 10;
//             itemp = itemp /10;
//         }
        


//         return digits;
//     }
    
// }
// public class Q66_PlusOne {
 
//     public static void main(String arg[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size:");
//         int isize = sc.nextInt();
//         int Num[] = new int[isize];

//         System.out.println("ENter digits:");
//         for(int i = 0; i< Num.length; i++)
//         {
//             Num[i] = sc.nextInt();
//         }

//         Solution sol9 = new Solution();
//         int iRet[] = sol9.plusOne(Num);

//         for(int i=0 ; i< iRet.length;i++)
//         {
//             System.out.println(iRet[i]);

//         }
        
//     }
// }
