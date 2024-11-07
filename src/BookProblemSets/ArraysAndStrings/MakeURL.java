package BookProblemSets.ArraysAndStrings;

public class MakeURL {
    public static void main(String[] args)
    {
        String phrase = "John Deer Association";

        System.out.println(urlify(phrase));
    }

    public static String urlify(String phrase)
    {
        int spaceCount = 0;

        // count the amount of spaces
        for (char c: phrase.toCharArray())
        {
            if (c == ' ')
            {
                spaceCount++;
            }
        }

        // Get phrase length (already accounts for spaces)
        // Then multiple amount of spaces by 2 (3 characters per space, 1 character is already included per in phrase length, so adding 2 per)
        int newLength = phrase.length() + (spaceCount * 2);
        String[] url = new String[newLength];
        int currentPos = 0;

        for (char n : phrase.toCharArray())
        {
            if (n == ' ')
            {
                url[currentPos] = "%";
                url[currentPos + 1] = "2";
                url[currentPos + 2] = "0";
                currentPos += 3;
            }
            else
            {
                url[currentPos] = phrase.valueOf(n);
                currentPos++;
            }
        }

        String newPhrase = "";

        for (String i : url)
        {
            newPhrase = newPhrase + i;
        }

        return newPhrase;
    }
}
