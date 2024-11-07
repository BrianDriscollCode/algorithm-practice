package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class KthToLastElement {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(returnKthToLastElement(2, list).val);
    }

    public static ListNode<Integer> returnKthToLastElement(int position, LinkedList<Integer> list)
    {
        int returnIndex = list.size() - position;
        if (returnIndex < 0)
        {
            return null;
        }

        ListNode<Integer> curr = list.getNode(0);

        int counter = 0;

        while (curr != null && counter < returnIndex)
        {
            curr = curr.next;
            counter += 1;
        }

        return curr;
    }

}
