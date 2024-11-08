package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

// solution for same length lists only
public class SumLists {

    public static void main(String[] args)
    {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // 913
        list1.add(1);
        list1.add(0);
        list1.add(3);

        // 457
        list2.add(3);
        list2.add(5);
        list2.add(7);

        reverseLinkedList(lineUpPositions(list1, list2)).printList();

    }

    public static LinkedList<Integer> lineUpPositions(LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        int list1Length = 0;
        int list2Length = 0;

        ListNode<Integer> currL1 = list1.getNode(0);
        ListNode<Integer> currL2 = list2.getNode(0);

        while (currL1 != null)
        {
            list1Length += 1;
            currL1 = currL1.next;
        }

        while (currL2 != null)
        {
            list2Length += 1;
            currL2 = currL2.next;
        }

        int posL1 = list1Length - 1;
        int posL2 = list2Length - 1;
        currL1 = list1.getNode(0);
        currL2 = list2.getNode(0);

        int result;
        int remainder = 0;

        if (posL1 > posL2)
        {
            result = addNodes(currL1, currL2, posL1, posL2, remainder);
        }
        else {
            result = addNodes(currL2, currL1, posL2, posL1, remainder);
        }

        LinkedList<Integer> finalList = new LinkedList<>();

        if (result > 9)
        {
            finalList.add(result - 10);
            remainder = result - 9;
        }
        else
        {
            finalList.add(result);
            remainder = 0;
        }

        posL1 -= 1;
        posL2 -= 1;
        currL1 = list1.getNode(0);
        currL2 = list2.getNode(0);

        while (posL1 != -1 && posL2 != -1)
        {
            result = addNodes(currL1, currL2, posL1, posL2, remainder);
            if (result > 9)
            {
                finalList.add(result - 10);
                remainder = 1;
            }
            else
            {
                finalList.add(result);
                remainder = 0;
            }

            posL1 -= 1;
            posL2 -= 1;
            currL1 = list1.getNode(0);
            currL2 = list2.getNode(0);

            if (posL1 <= -1 && posL2 <= -1 && remainder > 0)
            {
                finalList.add(remainder);
            }
        }

        return finalList;
    }

    public static int addNodes(ListNode<Integer> currL1, ListNode<Integer> currL2, int posL1, int posL2, int remainder)
    {
        int index = 0;

        while (index < posL1)
        {
            if (currL1.next != null) currL1 = currL1.next;
            if (currL2.next != null) currL2 = currL2.next;
            index += 1;
        }

        return currL1.val + currL2.val + remainder;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list)
    {
        int length = -1;
        ListNode<Integer> curr = list.getNode(0);

        while (curr != null)
        {
            curr = curr.next;
            length += 1;
        }

        LinkedList<Integer> finalList = new LinkedList<>();

        while (length >= 0)
        {
            finalList.add(list.get(length));
            length -= 1;
        }

        return finalList;
    }
}
