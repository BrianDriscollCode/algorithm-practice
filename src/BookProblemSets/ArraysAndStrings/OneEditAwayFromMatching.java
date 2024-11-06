package BookProblemSets.ArraysAndStrings;

import java.util.HashSet;

public class OneEditAwayFromMatching {

    public static void main(String[] args)
    {
        String word = "pale";
        String compareWord = "pake";

        System.out.println(isOneAway(word, compareWord));
    }

    public static String isOneAway(String word, String compareWord)
    {
        boolean isSameLength;

        if (word.length() != compareWord.length())
        {
            isSameLength = false;
            int difference = Math.abs(word.length() - compareWord.length());

            if (difference > 1)
            {
                return "Not within 1 edit.";
            }
        }
        else
        {
            isSameLength = true;
        }

        HashSet<Character> compareSet = new HashSet<>();
        String longerWord;
        String shorterWord;

        //Not same length
        if (!isSameLength)
        {
            if (word.length() > compareWord.length())
            {
                longerWord = word;
                shorterWord = compareWord;
            }
            else
            {
                longerWord = compareWord;
                shorterWord = word;
            }

            for (char c: longerWord.toCharArray())
            {
                compareSet.add(c);
            }

            for (char a: shorterWord.toCharArray())
            {
                if (compareSet.contains(a))
                {
                    compareSet.remove(a);
                }
            }

            if (compareSet.size() > 1)
            {
                return "Not Within 1 Edit";
            }

            if (compareSet.size() == 0)
            {
                return "zero edits needed";
            }
        }
        //Same Length
        else
        {
            for (char c: word.toCharArray())
            {
                compareSet.add(c);
            }

            for (char a: compareWord.toCharArray())
            {
                if (compareSet.contains(a))
                {
                    compareSet.remove(a);
                }
            }

            if (compareSet.size() > 1)
            {
                return "Not Within 1 Edit";
            }

            if (compareSet.size() == 0)
            {
                return "zero edits needed";
            }
        }

        return "Within 1 edit";
    }
}
