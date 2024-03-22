package Structures;

import Iterator.S_List_Iterator;

public class S_List <T>
{

    private Node <T> head;
    private int length;

    public S_List()
    {
        this.head=null;
        this.length=0;
    }

    public int getLength()
    {
        return this.length;
    }

    public T get(int index)
    {
        Node<T> temp=this.head;

        while (temp!=null)
        {
            if(index--==0)
            {
                return temp.getValue();
            }
            temp=temp.getNext();
        }
        return null;
    }

    public void addLast(T value)
    {
        Node<T> temp = this.head;

        if(temp==null)
        {
            this.head=new Node<T>(value);
        }
        else
        {
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }

            temp.setNext(new Node<T>(value));
        }
        this.length++;
    }

    public void addFront(T value)
    {
        if(head==null)
        {
            this.head=new Node<T>(value);
        }
        else
        {
            Node<T> temp= new Node<>(value);
            temp.setNext(this.head);
            this.head=temp;
        }
        this.length++;
    }

    public void remove(int index)
    {
        if(index==0)
        {
            Node<T> temp=this.head.getNext();
            this.head.setNext(null);
            this.head=temp;
        }
        else
        {
            Node<T> temp=this.head;

            for(int i=0;i<index;i++)
            {
                temp=temp.getNext();
            }

            Node<T> temp1=temp.getNext().getNext();

            temp.getNext().setNext(null);
            temp.setNext(temp1);

        }
        this.length--;
    }

    public void insertList(S_List<T> annex)
    {
        S_List_Iterator<T> annex_iterator = new S_List_Iterator<T>(annex);

        while(annex_iterator.hasNext())
        {
            this.addLast(annex_iterator.getNext());
        }
    }

    public S_List<T> subList(int index, int size)
    {
        S_List_Iterator<T> iterator = new S_List_Iterator<T>(this);

        while(index--!=0)
        {
            iterator.getNext();
        }

        S_List<T> subList = new S_List<>();
        while(iterator.hasNext() && size-->0)
        {
            subList.addLast(iterator.getNext());
        }

        return subList;
    }

    public void invert()
    {
        S_List_Iterator<T> iterator= new S_List_Iterator<T>(this);

        for(int i= 0; i<this.length;i++)
        {
            T value=iterator.getNext();
            this.addFront(value);
            this.remove(i);
        }

    }




}
