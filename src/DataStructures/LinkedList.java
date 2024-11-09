package DataStructures;

import java.util.ArrayList;

public class LinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;

    public LinkedList()
    {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public T get(int index)
    {
        ListNode<T> curr = this.head.next;
        int i = 0;

        while (curr != null)
        {
            if (i == index)
            {
                return curr.val;
            }

            i++;
            curr = curr.next;
        }

        return null;
    }

    public ListNode<T> getNode(int index)
    {
        ListNode<T> curr = this.head.next;
        int i = 0;

        while (curr != null)
        {
            if (i == index)
            {
                return curr;
            }

            i++;
            curr = curr.next;
        }

        return null;
    }

    public void add(T val)
    {
        ListNode<T> newNode = new ListNode(val);
        this.tail.next = newNode;
        this.tail = this.tail.next;
    }

    public void addNode(ListNode<T> node)
    {
        this.tail.next = node;
        this.tail = this.tail.next;
    }

    public void insertHead(T val)
    {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (newNode.next == null)
        {
            this.tail = newNode;
        }
    }

    public boolean removeNode(int index)
    {
        //               0        1      2
        // dummyNode -> node -> node -> node
        ListNode<T> curr = this.head;
        int i = 0;

        while (i < index && curr != null)
        {
            curr = curr.next;
            i++;
        }

        if (curr != null && curr.next != null)
        {
            if (curr.next == this.tail)
            {
                this.tail = curr;
            }

            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public int size()
    {
        int counter = 0;
        ListNode<Integer> curr = this.head.next;

        while (curr != null)
        {
            curr = curr.next;
            counter++;
        }

        return counter;
    }

    public ArrayList<T> getValues()
    {
        ArrayList<T> allValues = new ArrayList<>();

        ListNode<T> curr = this.head.next;

        while (curr != null)
        {
            allValues.add(curr.val);
            curr = curr.next;
        }


        return allValues;
    }

    public void printList()
    {
        ListNode<T> curr = this.head.next;

        boolean first = true;

        while (curr != null)
        {

            if (first)
            {

                System.out.print("[" + curr.val);
                first = false;
            }
            else
            {
                System.out.print(", " + curr.val);
            }

            curr = curr.next;
        }

        System.out.print("]");
    }
}
