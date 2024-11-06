package BookProblemSets.ArraysAndStrings;

public class UniqueCharsNoBuiltInDS {
    public static void main(String[] args)
    {
        String compareString = "tes";

        boolean isUnique = isAllCharsUnique(compareString);

        System.out.println(isUnique);

    }

    public static boolean isAllCharsUnique(String compareString)
    {

        for (int i = 0; i < compareString.length(); i++)
        {
            char current = compareString.charAt(i);

            for (int n = i + 1; n < compareString.length(); n++)
            {
                char comparator = compareString.charAt(n);

                if (current == comparator)
                {
                    return false;
                }
            }
        }

        return true;

    }
}
