package DataStructures;

import java.util.NoSuchElementException;

public class Queue<T> {

    public static class QueueNode<T>
    {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data)
        {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    //add
    public void add(T data)
    {
        QueueNode<T> newNode = new QueueNode<>(data);

        // set the last node's next position
        if (last != null)
        {
            last.next = newNode;
        }
        // added node should always be last
        last = newNode;

        if (first == null)
        {
            first = last;
        }

    }

    //remove
    public T remove()
    {
        if (first == null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;
        if (first == null)
        {
            last = null;
        }
        return data;
    }

    //peek
    public T peek()
    {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    //isEmpty
    public boolean isEmpty()
    {
        return first == null;
    }
}
