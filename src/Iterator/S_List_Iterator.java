package Iterator;

import Structures.S_List;

import java.util.NoSuchElementException;

public class S_List_Iterator<T> implements Iterator<T>
{
    private int currentIndex;
    private S_List<T> list;

    public S_List_Iterator(S_List<T> list)
    {
        this.currentIndex=0;
        this.list=list;
    }

    @Override
    public boolean hasNext()
    {
        return currentIndex < this.list.getLength();
    }

    @Override
    public T getNext()
    {
        if(this.hasNext())
        {
            return this.list.get(currentIndex++);
        }

        throw new NoSuchElementException();
    }
}
