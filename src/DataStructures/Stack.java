package DataStructures;

import java.util.EmptyStackException;

public class Stack<T> {

    private class StackNode<T>
    {
        private T data;
        private StackNode<T> next;

        public StackNode(T data)
        {
            this.data = data;
        }
    }

    private StackNode<T> top;

    //pop
    public T pop()
    {
        if (top == null) throw new EmptyStackException();

        StackNode<T> node = top;
        top = top.next;
        return node.data;
    }

    //push
    public void push(T data)
    {
        StackNode<T> newTop = new StackNode<>(data);
        newTop.next = top;
        top = newTop;
    }

    //peek
    public T peek()
    {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    //isEmpty
    public boolean isEmpty()
    {
        return top == null;
    }

    public void printStack()
    {
        StackNode<T> curr = top;
        System.out.print("Top");
        while (curr != null)
        {
            System.out.print("[");
            System.out.print(curr.data);
            System.out.print("]");

            if (curr.next != null)
            {
                System.out.print("<-");
            }

            curr = curr.next;
        }
        System.out.println("");
    }
}
