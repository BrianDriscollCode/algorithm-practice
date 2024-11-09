package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class SumLists {

    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // 617
        list1.add(7);
        list1.add(1);
        list1.add(6);
        list1.add(2);

        // 295
        list2.add(5);
        list2.add(9);
        list2.add(6);

        addLists(list1, list2);
    }

    public static LinkedList<Integer> addLists(LinkedList<Integer> list1, LinkedList<Integer> list2)
    {

        LinkedList<Integer> finalList = new LinkedList<>();
        ListNode<Integer> curr1 = list1.getNode(0);
        ListNode<Integer> curr2 = list2.getNode(0);

        int result;
        int carry = 0;

        while (curr1 != null || curr2 != null)
        {
            if (curr1 == null)
            {
                result = curr2.val + carry;
                curr2 = curr2.next;
                carry = 0;
            }
            else if (curr2 == null)
            {
                result = curr1.val + carry;
                curr1 = curr1.next;
                carry = 0;
            }
            else
            {
                result = curr1.val + curr2.val + carry;
                curr1 = curr1.next;
                curr2 = curr2.next;
            }

            if (result > 9)
            {
                result = result - 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            finalList.add(result);
        }

        finalList.printList();
        return finalList;

    }
}
