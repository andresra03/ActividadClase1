package Structures;

public class Node <T>
{

    private T value;
    private Node<T> next;

    public  Node()
    {
        this.value=null;
        this.next=null;
    }

    public Node (T value)
    {
        this.value=value;
        this.next=null;
    }

    public void setValue(T value)
    {
        this.value=value;
    }

    public T getValue()
    {
        return this.value;
    }

    public void setNext(Node<T> next)
    {
        this.next=next;
    }

    public Node<T> getNext()
    {
        return this.next;
    }
}

