import java.util.Scanner;

class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int iasize = a.length() - 1;
        int ibsize = b.length() - 1;

        int carry = 0;

        while(iasize >= 0 || ibsize >= 0)
        {
            int iSum = carry;
            if(iasize >=0)
            {
                iSum +=a.charAt(iasize) - '0';
            }
            if(ibsize >= 0)
            {
                iSum += b.charAt(ibsize) - '0';
            }
            sb.append(iSum % 2);
            carry = iSum / 2;

            iasize --;
            ibsize --;

        }

        if(carry!= 0)
        sb.append(carry);

        return sb.reverse().toString();
        
    }
}

public class Q67_AddBinary {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter String 1:");
        String x = sc.nextLine();

        System.out.println("ENter string2:");
        String y = sc.nextLine();

        Solution sol9 = new Solution();

        String z = sol9.addBinary(x, y);
        System.out.println(z);
    }
}
