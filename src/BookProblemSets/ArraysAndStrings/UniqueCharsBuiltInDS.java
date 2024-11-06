package BookProblemSets.ArraysAndStrings;

import java.util.HashSet;

public class UniqueCharsBuiltInDS {
    public static void main(String[] args)
    {

        String compareString = "tes";

        boolean isUnique = isAllCharsUnique(compareString);

        System.out.println(isUnique);
    }

    public static boolean isAllCharsUnique(String compareString)
    {
        HashSet<Character> storedCharacters = new HashSet<>();

        for (int i = 0; i < compareString.length(); i++)
        {
            char compareChar = compareString.charAt(i);

            if (storedCharacters.contains(compareChar))
            {
                return false;
            }
            else
            {
                storedCharacters.add(compareChar);
            }
        }

        return true;
    }
}
