package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

import java.util.HashSet;

public class Intersection {

    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(100);
        list1.add(6);

        ListNode<Integer> curr1 = list1.getNode(4);

        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.addNode(curr1);
        list2.add(5);
        list2.add(4);

        System.out.println(findIntersectingNode(list1, list2).val);
    }

    public static ListNode<Integer> findIntersectingNode(LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        HashSet<ListNode<Integer>> compareSet = new HashSet<>();
        ListNode<Integer> curr1 = list1.getNode(0);
        ListNode<Integer> curr2 = list2.getNode(0);

        while (curr1 != null)
        {
            compareSet.add(curr1);
            curr1 = curr1.next;
        }

        while (curr2 != null)
        {
            if (compareSet.contains(curr2)) return curr2;
            curr2 = curr2.next;
        }

        ListNode<Integer> randomNode = new ListNode<>(-1);
        return randomNode;
    }

}
