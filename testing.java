import java.util.*;

class solution {
    boolean isPermutationofPalindrome(String str)
    {

        int[] table = buildCharFrequencyTable(str);
        return checkMaxOneOdd(table);
       

    }

    /* Count how many times each character appears. */
    int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1]; 
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x !=-1) { 
                table[x]++;
            }
        }
        return table;
    }
    /* Map each character to a number. a -> 0, b -> 1, c -> 2, etc. 21 * This is case insensitive. Non-letter characters map to -1. */
    int getCharNumber(Character c) {
        int a= Character.getNumericValue('a');
        System.out.println(a);
        int z = Character.getNumericValue('z');
        System.out.println(z);
        int val= Character.getNumericValue(c);
        System.out.println(val);
        if (a<= val && val<= z) {
            return val - a;
        }
        return -1;
    }

    /* Check that no more than one character has an odd count. */
    boolean checkMaxOneOdd(int[] table){

        boolean foundOdd= false;
        for (int count : table) {
            if (count% 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd= true;
            }
        }
        return true;
    }   
 
}

class testing{


    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        solution sol = new solution();

        boolean bRet = sol.isPermutationofPalindrome(str);

        if(bRet == true)
            System.out.println("permutation Palindrome");
        else
            System.out.println("No Permutatio Palindrome");
    

    }
}
 