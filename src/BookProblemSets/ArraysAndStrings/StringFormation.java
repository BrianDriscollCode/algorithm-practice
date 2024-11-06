package BookProblemSets.ArraysAndStrings;


import java.util.ArrayList;

public class StringFormation {
    public static void main(String[] args)
    {

    String sentence1 = "Hello there, ";
    String sentence2 = "my name";
    String[] combinedSentence = {sentence1, sentence2};

    String sentence3 = " is ";
    String sentence4 = "John.";
    String[] combinedSentence2 = {sentence3, sentence4};

    ArrayList<String> newSentence = merge(combinedSentence, combinedSentence2);

    for (String n : newSentence)
    {
        System.out.print(n);
    }

    }

    public static ArrayList<String> merge(String[] words, String[] more)
    {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }

    // Only resize once
    String joinWords(String[] words)
    {
        String sentence = "";
        for (String w : words)
        {
            sentence = sentence + w;
        }

        return sentence;
    }
}
