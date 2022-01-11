// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class element {
    
//     private static int findElement(List<Integer> arr)
//     {
//         if (arr.size() == 1 || arr.size() == 2)
//         {
//             return -1;
//         }

//         int element = arr.get(0), maxx = arr.get(0), bit = -1, check = 0;
//         int idx = -1;

//         for(int i = 1; i < (arr.size() - 1);)
//         {
              
//             if (arr.get(i) < maxx && i < (arr.size() - 1))
//             {
//                 i++;
//                 bit = 0;
//             }
              
//             else
//             {
//                 if (arr.get(i) >= maxx)
//                 {
//                     element = arr.get(i);
//                     idx = i;
//                     check = 1;
//                     maxx = arr.get(i);
//                 }
//                 if (check == 1) 
//                 {
//                     i++;
//                 }
//                 bit = 1;
                   
//                 while (arr.get(i) >= element && i < (arr.size()- 1))
//                 {
//                     if (arr.get(i) > maxx)
//                     {
//                         maxx = arr.get(i);
//                     }
//                     i++;
//                 }
//                 check = 0;
//             }
//         }
          
       
//         if (element <= arr.get(arr.size() - 1)&& bit == 1)
//         {
//             return idx;
//         }
//         else
//         {
//             return -1;
//         }
       
//     }

//     private static List<Integer> getInput(){

//         Scanner sc = new Scanner(System.in);
//         Integer arrayLength = sc.nextInt();
//         List<Integer> intList = new ArrayList<Integer>();
//         for(int index = 0; index < arrayLength; index++)
//         {
//             intList.add(sc.nextInt());
//         }

//         return intList;
//     }

//     public static void main(String[] args)
//     {
//         List<Integer> intList = getInput();
//         System.out.println(findElement(intList));
//     }
// }

// class element{
      
//     static int findElement(int []a, int n)
//     {
          
//         // Base case
//         if (n == 1 || n == 2)
//         {
//             return -1;
//         }
          
//         // 1.element is the possible candidate for
//         // the solution of the problem. 
//         // 2.idx is the index of the possible
//         // candidate. 
//         // 3.maxx is the value which is maximum on the
//         // left side of the array. 
//         // 4.bit tell whether the loop is
//         // terminated from the if condition or from 
//         // the else condition when loop do not
//         // satisfied the condition.
//         // 5.check is the variable which tell whether the
//         // element is updated or not
//         int element = a[0], maxx = a[0],
//                 bit = -1, check = 0;
//         int idx = -1;
          
//         // The extreme two of the array can
//         // not be the solution. Therefore 
//         // iterate the loop from i = 1 to < n-1
//         for(int i = 1; i < (n - 1);)
//         {
              
//             // Here we find the possible candidate
//             // where Element with left side smaller
//             // and right side greater. When the if
//             // condition fail we check and update in
//             // else condition.
//             if (a[i] < maxx && i < (n - 1))
//             {
//                 i++;
//                 bit = 0;
//             }
              
//             // Here we update the possible element
//             // if the element is greater than the
//             // maxx (maximum element so far). In 
//             // while loop we sur-pass the value which
//             // is greater than the element
//             else
//             {
//                 if (a[i] >= maxx)
//                 {
//                     element = a[i];
//                     idx = i;
//                     check = 1;
//                     maxx = a[i];
//                 }
//                 if (check == 1) 
//                 {
//                     i++;
//                 }
//                 bit = 1;
                   
//                 while (a[i] >= element && i < (n - 1))
//                 {
//                     if (a[i] > maxx)
//                     {
//                         maxx = a[i];
//                     }
//                     i++;
//                 }
//                 check = 0;
//             }
//         }
          
//         // Checking for the last value and whether
//         // the loop is terminated from else or 
//         // if block.
//         if (element <= a[n - 1] && bit == 1)
//         {
//             return idx;
//         }
//         else
//         {
//             return -1;
//         }
              
//     }
      
//     // Driver code
//     public static void main(String []args)
//     {
//         int []arr = { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
//         int n = arr.length;
          
//         System.out.println("Index of the element is " + 
//                            findElement(arr, n));
//     }
//     }


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class element {

    public static void getResult(String number)
    {
        String test= "";
        String test2 = "";
        int j = number.length()-1;
        for(int i = 0 ; i < number.length();i++)
        {
            if(i % 2 != 0)
            {
                test = test + number.charAt(i);
            }
            else{
                test2 = test2 + number.charAt(i);
            }

        }

        System.out.println();
        System.out.println(test);
        System.out.println(test2);

        number = test2 + test;
        System.out.println(number);
    }
    public static void main(String arg[])

    {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++)
        {
            String number = sc.next();
            getResult(number);
        }
    }

}