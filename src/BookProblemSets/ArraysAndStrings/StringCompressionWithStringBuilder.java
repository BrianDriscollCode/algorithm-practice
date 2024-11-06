package BookProblemSets.ArraysAndStrings;


import java.util.ArrayList;

public class StringCompressionWithStringBuilder {

    public static void main(String[] args)
    {
        String stringExample = "aabcccccaaa";

        System.out.println(compressString(stringExample));
    }

    public static String compressString(String stringExample)
    {
        char currentCharacter = stringExample.charAt(0);
        int characterCounter = 1;
        StringBuilder stringBuilder = new StringBuilder();


        for (char c: stringExample.toCharArray())
        {
            if (currentCharacter == c)
            {
                characterCounter++;
            }
            else
            {
                stringBuilder.append(currentCharacter);
                stringBuilder.append(characterCounter);
                currentCharacter = c;
                characterCounter = 1;
            }
        }
        stringBuilder.append(currentCharacter);
        stringBuilder.append(characterCounter);
        return stringBuilder.toString();
    }

}
