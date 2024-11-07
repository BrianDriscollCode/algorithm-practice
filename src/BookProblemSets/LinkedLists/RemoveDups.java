package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class RemoveDups {

    public static void main(String[] args)
    {

        LinkedList<Character> list = new LinkedList<>();

        list.add('a');
        list.add('b');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('e');
        list.add('e');
        list.add('e');
        list.add('e');
        list.add('e');
        list.add('f');
        list.add('f');
        list.add('g');

        ListNode<Character> currentNode = list.getNode(0);

        while (currentNode != null && currentNode.next != null)
        {
            if (currentNode.val == currentNode.next.val)
            {
                currentNode.next = currentNode.next.next;
            }
            else
            {
                currentNode = currentNode.next;
            }


        }

        list.printList();

    }
}
