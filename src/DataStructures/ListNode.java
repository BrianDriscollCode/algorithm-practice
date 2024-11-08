package DataStructures;

public class ListNode<T> {
    public T val;
    public ListNode next;

    public ListNode(T val)
    {
        this.val = val;
        this.next = null;
    }

    public ListNode(T val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
