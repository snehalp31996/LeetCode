import java.util.*;
class Solution {
    public int mySqrt(int x) 
    {

        int istart = 1;
        int iend = x;
        int ians = 0;

        if(x == 0 || x == 1)
        {
            return x;
        }
        while(istart <= iend)
        {
            int imid = (istart + iend)/2;

            if(imid * imid == x)
            {
                return imid;
            }
            if( imid > x/imid)
            {
                iend = imid - 1;
            }
            if(imid < x/imid)
            {
                istart = imid + 1;
                ians = imid;
            }
        }
        return ians;
    }
}
// class Solution {
//     public int mySqrt(int x) 
//     {

//         int istart = 1;
//         int iend = x;
//         int ians = 0;

//         if(x == 0 || x == 1)
//         {
//             return x;
//         }
//         while(istart <= iend)
//         {
//             int imid = (istart + iend)/2;

//             if(imid * imid == x)
//             {
//                 return imid;
//             }
//             if( imid * imid > x)
//             {
//                 iend = imid - 1;
//             }
//             if(imid * imid < x)
//             {
//                 istart = imid + 1;
//                 ians = imid;
//             }
//         }
//         return ians;
//     }
// }
public class Q69_SquareRoot {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        Solution sol11 = new Solution();

        int iRet = sol11.mySqrt(num);

        System.out.println(iRet);
    }
}
