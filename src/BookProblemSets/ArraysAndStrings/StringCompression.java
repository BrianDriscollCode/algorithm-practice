package BookProblemSets.ArraysAndStrings;

import java.util.ArrayList;

public class StringCompression {

    public static void main(String[] args)
    {
        String stringExample = "aabcccccaaa";

        System.out.println(compressString(stringExample));
    }

    public static String compressString(String stringExample)
    {
        boolean firstRun = false;
        char currentCharacter = 'a';
        int characterIndex = 0;
        String stringBuilder = "";


        for (char c: stringExample.toCharArray())
        {
            if (!firstRun)
            {
                currentCharacter = c;
                characterIndex++;
                firstRun = true;
            }
            else
            {
                if (currentCharacter == c)
                {
                    characterIndex++;
                }
                else
                {
                    stringBuilder = stringBuilder + currentCharacter + characterIndex;
                    currentCharacter = c;
                    characterIndex = 1;
                }
            }
        }
        stringBuilder = stringBuilder + currentCharacter + characterIndex;
        return stringBuilder;
    }

}
