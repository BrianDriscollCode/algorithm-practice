package BookProblemSets.ArraysAndStrings;

public class PermutationString {

    public static void main(String[] args)
    {
        String string1 = "test";
        String string2 = "testt";

        System.out.println(isPermutation(string1, string2));
    }

    public static boolean isPermutation(String string1, String string2)
    {
        if (string1.length() != string2.length()) return false;

        int store[] = new int[26];

        for (int i = 0; i < string1.length(); i++)
        {
            store[string1.charAt(i) - 'a']++;
            store[string2.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;
        return true;
    }

}
