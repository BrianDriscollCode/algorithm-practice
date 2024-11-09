package BookProblemSets.LinkedLists;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class LoopDetection {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        ListNode<Integer> curr = list.getNode(7);
        ListNode<Integer> loopNode = list.getNode(4);

        curr.next = loopNode;

        curr = list.getNode(0);

        System.out.println(returnLoopNode(list).val);
    }

    public static ListNode<Integer> returnLoopNode(LinkedList<Integer> list)
    {
        ListNode<Integer> slowNode = list.getNode(0);
        ListNode<Integer> fastNode = list.getNode(0);

        do
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        while (slowNode != fastNode);

        fastNode = list.getNode(0);

        while (slowNode != fastNode)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }


        return slowNode;
    }
}
