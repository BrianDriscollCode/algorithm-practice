package BookProblemSets.ArraysAndStrings;

import java.util.HashSet;

public class Palindrome {

    public static void main(String[] args)
    {
        String phrase = "racecar";

        System.out.println(isPalindrome(phrase));
    }

    public static boolean isPalindrome(String phrase)
    {
        int phraseLength = phrase.length();
        int reverseCounter = phraseLength - 1;

        for (char c: phrase.toCharArray())
        {
            if (phrase.charAt(reverseCounter) != c)
            {
                return false;
            }

            reverseCounter--;
        }

        return true;
    }
}
