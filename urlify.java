import java.util.Scanner;

class solution{

    void replaceSpaces(String str, int trueLength){
        int spaceCount = 0, index = 0, i =0;
        for(i = 0; i < trueLength;i++)
        {
            if(str.charAt(i) == ' ')
            {
                spaceCount++;
            }
        }

        System.out.println(spaceCount);
        System.out.println(str.length());

        char[] str1 = str.toCharArray();

        index = trueLength + spaceCount*2;
        if(trueLength < str1.length)
        {
            System.out.println(trueLength);
            System.out.println(str1.length);
            str1[trueLength] = '\0';
        }

        for(i = trueLength -1 ; i>=0; i--)
        {
            if(str1[i] == ' ')
            {
                str1[index - 1] = '0';
                str1[index - 2] = '2';
                str1[index - 3] = '%';
                index = index - 3;
            }
            else
            {
                str1[index - 1] = str1[i];
                index --;
            }
        }
        System.out.println(str1.length);
        // for(i = 0 ; i< str1.length;i++)
        // {
        //     System.out.println(str1[i]);
        // }

    }
}
public class urlify {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter length:");
        int len = sc.nextInt();
        solution sol = new solution();

        sol.replaceSpaces(str,len);
        

    }
}
