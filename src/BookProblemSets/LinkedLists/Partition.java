package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class Partition {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        partitionList(list, 5).printList();
    }

    public static LinkedList<Integer> partitionList(LinkedList<Integer> list, int partitionNumber)
    {
        LinkedList<Integer> minList = new LinkedList<>();
        LinkedList<Integer> maxList = new LinkedList<>();

        ListNode<Integer> curr = list.getNode(0);

        while (curr != null)
        {
            if (curr.val < partitionNumber)
            {
                minList.add(curr.val);
            }
            else
            {
                maxList.add(curr.val);
            }

            curr = curr.next;
        }

        int lastPosition = minList.size() - 1;
        curr = minList.getNode(lastPosition);
        curr.next = maxList.getNode(0);

        return minList;
    }
}
