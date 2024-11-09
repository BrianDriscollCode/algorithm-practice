package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class Palindrome {

    public static void main(String[] args)
    {
        LinkedList<Character> phrase1 = new LinkedList<>();
        LinkedList<Character> phrase2 = new LinkedList<>();

        phrase1.add('c');
        phrase1.add('i');
        phrase1.add('v');
        phrase1.add('i');
        phrase1.add('c');

        phrase2.add('c');
        phrase2.add('i');
        phrase2.add('v');
        phrase2.add('i');
        phrase2.add('c');


        System.out.println(isPalindrome(phrase1, phrase2));
    }

    public static boolean isPalindrome(LinkedList<Character> phrase1, LinkedList<Character> phrase2)
    {
        if (phrase1.size() != phrase2.size()) return false;

        int index = phrase1.size() - 1;
        ListNode<Character> curr1 = phrase1.getNode(index);
        ListNode<Character> curr2 = phrase2.getNode(0);

        while (curr1 != null && curr2 != null)
        {
            if (curr1.val != curr2.val) return false;
            index -= 1;
            curr1 = phrase1.getNode(index);
            curr2 = curr2.next;
        }

        return true;
    }
}
